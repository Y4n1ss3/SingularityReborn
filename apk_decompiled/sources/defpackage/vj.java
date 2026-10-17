package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class vj implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ vu0 e;

    public /* synthetic */ vj(vu0 vu0Var, int i) {
        this.d = i;
        this.e = vu0Var;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        vu0 vu0Var = this.e;
        switch (i) {
            case 0:
                vu0Var.reportFullyDrawn();
                return null;
            default:
                return y80.x(vu0Var);
        }
    }
}
