package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class od0 implements w40, eg {
    public final s40 d;
    public final hd0 e;
    public pd0 f;
    public final /* synthetic */ rd0 g;

    public od0(rd0 rd0Var, s40 s40Var, hd0 hd0Var) {
        hd0Var.getClass();
        this.g = rd0Var;
        this.d = s40Var;
        this.e = hd0Var;
        s40Var.a(this);
    }

    @Override // defpackage.eg
    public final void cancel() {
        this.d.b(this);
        this.e.removeCancellable(this);
        pd0 pd0Var = this.f;
        if (pd0Var != null) {
            pd0Var.cancel();
        }
        this.f = null;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        if (q40Var == q40.ON_START) {
            hd0 hd0Var = this.e;
            hd0Var.getClass();
            rd0 rd0Var = this.g;
            rd0Var.b.addLast(hd0Var);
            pd0 pd0Var = new pd0(rd0Var, hd0Var);
            hd0Var.addCancellable(pd0Var);
            rd0Var.d();
            hd0Var.setEnabledChangedCallback$activity_release(new qd0(0, rd0Var, rd0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
            this.f = pd0Var;
            return;
        }
        if (q40Var != q40.ON_STOP) {
            if (q40Var == q40.ON_DESTROY) {
                cancel();
            }
        } else {
            pd0 pd0Var2 = this.f;
            if (pd0Var2 != null) {
                pd0Var2.cancel();
            }
        }
    }
}
