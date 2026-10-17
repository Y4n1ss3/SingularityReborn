package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Shell.GetShellCallback, Shell.ResultCallback {
    public final /* synthetic */ PendingJob a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Shell.ResultCallback c;

    public /* synthetic */ c(PendingJob pendingJob, Executor executor, Shell.ResultCallback resultCallback) {
        this.a = pendingJob;
        this.b = executor;
        this.c = resultCallback;
    }

    @Override // com.topjohnwu.superuser.Shell.ResultCallback
    public void onResult(Shell.Result result) {
        this.a.lambda$submit$0(this.b, this.c, result);
    }

    @Override // com.topjohnwu.superuser.Shell.GetShellCallback
    public void onShell(Shell shell) {
        this.a.lambda$submit$1(this.b, this.c, shell);
    }
}
