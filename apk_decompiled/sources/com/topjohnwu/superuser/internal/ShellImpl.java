package com.topjohnwu.superuser.internal;

import android.text.TextUtils;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ShellUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class ShellImpl extends Shell {
    private final NoCloseInputStream STDERR;
    private final NoCloseOutputStream STDIN;
    private final NoCloseInputStream STDOUT;
    final ExecutorService executor;
    private final Process proc;
    final boolean redirect;
    private int status;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class NoCloseOutputStream extends FilterOutputStream {
        public NoCloseOutputStream(OutputStream outputStream) {
            super(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ((FilterOutputStream) this).out.flush();
        }

        public void close0() {
            super.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }

    public ShellImpl(BuilderImpl builderImpl, Process process) {
        this.status = -1;
        this.redirect = builderImpl.hasFlags(8);
        this.proc = process;
        this.STDIN = new NoCloseOutputStream(process.getOutputStream());
        this.STDOUT = new NoCloseInputStream(process.getInputStream());
        this.STDERR = new NoCloseInputStream(process.getErrorStream());
        SerialExecutorService serialExecutorService = new SerialExecutorService();
        this.executor = serialExecutorService;
        try {
            try {
                this.status = ((Integer) serialExecutorService.submit(new b(this, 1)).get(builderImpl.timeout, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException e) {
                throw new IOException("Shell check interrupted", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof IOException)) {
                    throw new IOException("Unknown ExecutionException", cause);
                }
                throw ((IOException) cause);
            } catch (TimeoutException e3) {
                throw new IOException("Shell check timeout", e3);
            }
        } catch (IOException e4) {
            this.executor.shutdownNow();
            release();
            throw e4;
        }
    }

    private void release() {
        this.status = -1;
        try {
            this.STDIN.close0();
        } catch (IOException unused) {
        }
        try {
            this.STDERR.close0();
        } catch (IOException unused2) {
        }
        try {
            this.STDOUT.close0();
        } catch (IOException unused3) {
        }
        this.proc.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer shellCheck() {
        int i;
        try {
            this.proc.exitValue();
            throw new IOException("Created process has terminated");
        } catch (IllegalThreadStateException unused) {
            ShellUtils.cleanInputStream(this.STDOUT);
            ShellUtils.cleanInputStream(this.STDERR);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.STDOUT));
            try {
                NoCloseOutputStream noCloseOutputStream = this.STDIN;
                Charset charset = StandardCharsets.UTF_8;
                noCloseOutputStream.write("echo SHELL_TEST\n".getBytes(charset));
                this.STDIN.flush();
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine) || !readLine.contains("SHELL_TEST")) {
                    throw new IOException("Created process is not a shell");
                }
                this.STDIN.write("id\n".getBytes(charset));
                this.STDIN.flush();
                String readLine2 = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine2) || !readLine2.contains("uid=0")) {
                    i = 0;
                } else {
                    i = 1;
                    Utils.setConfirmedRootState(true);
                    String escapedString = ShellUtils.escapedString(System.getProperty("user.dir"));
                    this.STDIN.write(("cd " + escapedString + "\n").getBytes(charset));
                    this.STDIN.flush();
                }
                bufferedReader.close();
                return Integer.valueOf(i);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.status < 0) {
            return;
        }
        this.executor.shutdownNow();
        release();
    }

    @Override // com.topjohnwu.superuser.Shell
    public synchronized void execTask(Shell.Task task) {
        if (this.status < 0) {
            throw new ShellTerminatedException();
        }
        ShellUtils.cleanInputStream(this.STDOUT);
        ShellUtils.cleanInputStream(this.STDERR);
        try {
            this.STDIN.write(10);
            this.STDIN.flush();
            task.run(this.STDIN, this.STDOUT, this.STDERR);
        } catch (IOException unused) {
            release();
            throw new ShellTerminatedException();
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public int getStatus() {
        return this.status;
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean isAlive() {
        if (this.status < 0) {
            return false;
        }
        try {
            this.proc.exitValue();
            return false;
        } catch (IllegalThreadStateException unused) {
            return true;
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public Shell.Job newJob() {
        return new JobImpl(this);
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean waitAndClose(long j, TimeUnit timeUnit) {
        if (this.status < 0) {
            return true;
        }
        this.executor.shutdown();
        if (this.executor.awaitTermination(j, timeUnit)) {
            release();
            return true;
        }
        this.status = -1;
        return false;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class NoCloseInputStream extends FilterInputStream {
        public NoCloseInputStream(InputStream inputStream) {
            super(inputStream);
        }

        public void close0() {
            ((FilterInputStream) this).in.close();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
