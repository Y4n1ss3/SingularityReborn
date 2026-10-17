package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class pd0 implements eg {
    public final hd0 d;
    public final /* synthetic */ rd0 e;

    public pd0(rd0 rd0Var, hd0 hd0Var) {
        hd0Var.getClass();
        this.e = rd0Var;
        this.d = hd0Var;
    }

    @Override // defpackage.eg
    public final void cancel() {
        rd0 rd0Var = this.e;
        qb qbVar = rd0Var.b;
        hd0 hd0Var = this.d;
        qbVar.remove(hd0Var);
        if (q10.b(rd0Var.c, hd0Var)) {
            hd0Var.handleOnBackCancelled();
            rd0Var.c = null;
        }
        hd0Var.removeCancellable(this);
        iy enabledChangedCallback$activity_release = hd0Var.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        hd0Var.setEnabledChangedCallback$activity_release(null);
    }
}
