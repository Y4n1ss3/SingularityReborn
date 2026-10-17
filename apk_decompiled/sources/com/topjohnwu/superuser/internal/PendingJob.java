package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class PendingJob extends JobImpl {
    private final boolean isSU;
    private boolean retry = true;

    public PendingJob(boolean z) {
        this.isSU = z;
        to(NOPList.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submit$0(Executor executor, Shell.ResultCallback resultCallback, Shell.Result result) {
        if (this.retry && result == ResultImpl.SHELL_ERR) {
            this.retry = false;
            submit(executor, resultCallback);
        } else if (resultCallback != null) {
            resultCallback.onResult(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submit$1(Executor executor, Shell.ResultCallback resultCallback, Shell shell) {
        if (this.isSU && !shell.isRoot()) {
            close();
            ResultImpl.INSTANCE.callback(executor, resultCallback);
        } else {
            if (this.out instanceof NOPList) {
                this.out = resultCallback == null ? null : new ArrayList();
            }
            this.shell = (ShellImpl) shell;
            super.submit(executor, new c(this, executor, resultCallback));
        }
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        try {
            ShellImpl shellImpl = MainShell.get();
            this.shell = shellImpl;
            if (this.isSU && !shellImpl.isRoot()) {
                close();
                return ResultImpl.INSTANCE;
            }
            if (this.out instanceof NOPList) {
                this.out = new ArrayList();
            }
            Shell.Result exec = super.exec();
            if (!this.retry || exec != ResultImpl.SHELL_ERR) {
                return exec;
            }
            this.retry = false;
            return exec();
        } catch (NoShellException unused) {
            close();
            return ResultImpl.INSTANCE;
        }
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public void submit(Executor executor, Shell.ResultCallback resultCallback) {
        MainShell.get(null, new c(this, executor, resultCallback));
    }
}
