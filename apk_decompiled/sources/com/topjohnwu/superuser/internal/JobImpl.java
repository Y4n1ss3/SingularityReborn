package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.StreamGobbler;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class JobImpl extends Shell.Job implements Shell.Task, Closeable {
    static final byte[] END_CMD;
    static final String END_UUID;
    private static final List<String> UNSET_ERR = new ArrayList(0);
    static final int UUID_LEN = 36;
    protected List<String> out;
    protected ShellImpl shell;
    private final List<ShellInputSource> sources = new ArrayList();
    private final ResultImpl result = new ResultImpl();
    protected List<String> err = UNSET_ERR;

    static {
        String uuid = UUID.randomUUID().toString();
        END_UUID = uuid;
        END_CMD = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(StandardCharsets.UTF_8);
    }

    public JobImpl(ShellImpl shellImpl) {
        this.shell = shellImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResultImpl exec0() {
        List<String> list = this.err;
        boolean z = list == UNSET_ERR;
        ResultImpl resultImpl = this.result;
        List<String> list2 = this.out;
        resultImpl.out = list2;
        if (z) {
            list = null;
        }
        resultImpl.err = list;
        if (z && this.shell.redirect) {
            resultImpl.err = list2;
            list = list2;
        }
        if (list2 != null && list2 == list && !Utils.isSynchronized(list2)) {
            List<String> synchronizedList = Collections.synchronizedList(this.result.out);
            ResultImpl resultImpl2 = this.result;
            resultImpl2.out = synchronizedList;
            resultImpl2.err = synchronizedList;
        }
        try {
            try {
                this.shell.execTask(this);
                close();
                ResultImpl resultImpl3 = this.result;
                resultImpl3.out = this.out;
                resultImpl3.err = z ? null : this.err;
                return resultImpl3;
            } catch (IOException e) {
                if (e instanceof ShellTerminatedException) {
                    ResultImpl resultImpl4 = ResultImpl.SHELL_ERR;
                    close();
                    ResultImpl resultImpl5 = this.result;
                    resultImpl5.out = this.out;
                    resultImpl5.err = z ? null : this.err;
                    return resultImpl4;
                }
                Utils.err(e);
                ResultImpl resultImpl6 = ResultImpl.INSTANCE;
                close();
                ResultImpl resultImpl7 = this.result;
                resultImpl7.out = this.out;
                resultImpl7.err = z ? null : this.err;
                return resultImpl6;
            }
        } catch (Throwable th) {
            close();
            ResultImpl resultImpl8 = this.result;
            resultImpl8.out = this.out;
            resultImpl8.err = z ? null : this.err;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submit$0(Executor executor, Shell.ResultCallback resultCallback) {
        exec0().callback(executor, resultCallback);
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.sources.add(new CommandSource(strArr));
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<ShellInputSource> it = this.sources.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Future<Shell.Result> enqueue() {
        FutureTask futureTask = new FutureTask(new b(this, 0));
        this.shell.executor.execute(futureTask);
        return futureTask;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        return exec0();
    }

    @Override // com.topjohnwu.superuser.Shell.Task
    public void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        Future submit = Shell.EXECUTOR.submit(new StreamGobbler.OUT(inputStream, this.result.out));
        Future submit2 = Shell.EXECUTOR.submit(new StreamGobbler.ERR(inputStream2, this.result.err));
        Iterator<ShellInputSource> it = this.sources.iterator();
        while (it.hasNext()) {
            it.next().serve(outputStream);
        }
        outputStream.write(END_CMD);
        outputStream.flush();
        try {
            this.result.code = ((Integer) submit.get()).intValue();
            submit2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public void submit(final Executor executor, final Shell.ResultCallback resultCallback) {
        this.shell.executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                JobImpl.this.lambda$submit$0(executor, resultCallback);
            }
        });
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> list, List<String> list2) {
        this.out = list;
        this.err = list2;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> list) {
        this.out = list;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(InputStream inputStream) {
        if (inputStream != null) {
            this.sources.add(new InputStreamSource(inputStream));
        }
        return this;
    }

    public JobImpl() {
    }
}
