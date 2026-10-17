package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import defpackage.zf;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MainShell {
    private static boolean isInitMain;
    private static BuilderImpl mainBuilder;
    private static final ShellImpl[] mainShell = new ShellImpl[1];

    private MainShell() {
    }

    public static synchronized ShellImpl get() {
        ShellImpl cached;
        synchronized (MainShell.class) {
            try {
                cached = getCached();
                if (cached == null) {
                    isInitMain = true;
                    BuilderImpl builderImpl = mainBuilder;
                    if (builderImpl == null) {
                        builderImpl = new BuilderImpl();
                        mainBuilder = builderImpl;
                    }
                    cached = builderImpl.build();
                    isInitMain = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cached;
    }

    public static ShellImpl getCached() {
        ShellImpl shellImpl;
        ShellImpl[] shellImplArr = mainShell;
        synchronized (shellImplArr) {
            try {
                shellImpl = shellImplArr[0];
                if (shellImpl != null && shellImpl.getStatus() < 0) {
                    shellImplArr[0] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return shellImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$1(Executor executor, Shell.GetShellCallback getShellCallback) {
        try {
            returnShell(get(), executor, getShellCallback);
        } catch (NoShellException unused) {
        }
    }

    public static Shell.Job newJob(boolean z, InputStream inputStream) {
        return new PendingJob(z).add(inputStream);
    }

    private static void returnShell(Shell shell, Executor executor, Shell.GetShellCallback getShellCallback) {
        if (executor == null) {
            getShellCallback.onShell(shell);
        } else {
            executor.execute(new zf(1, getShellCallback, shell));
        }
    }

    public static synchronized void setBuilder(Shell.Builder builder) {
        synchronized (MainShell.class) {
            if (isInitMain || getCached() != null) {
                throw new IllegalStateException("The main shell was already created");
            }
            mainBuilder = (BuilderImpl) builder;
        }
    }

    public static synchronized void setCached(ShellImpl shellImpl) {
        synchronized (MainShell.class) {
            if (isInitMain) {
                ShellImpl[] shellImplArr = mainShell;
                synchronized (shellImplArr) {
                    shellImplArr[0] = shellImpl;
                }
            }
        }
    }

    public static Shell.Job newJob(boolean z, String... strArr) {
        return new PendingJob(z).add(strArr);
    }

    public static void get(Executor executor, Shell.GetShellCallback getShellCallback) {
        ShellImpl cached = getCached();
        if (cached != null) {
            returnShell(cached, executor, getShellCallback);
        } else {
            Shell.EXECUTOR.execute(new zf(2, executor, getShellCallback));
        }
    }
}
