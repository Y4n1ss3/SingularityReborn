package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ai0 implements ur0, iw, yy {
    public final /* synthetic */ wr0 d;

    public ai0(wr0 wr0Var) {
        this.d = wr0Var;
    }

    @Override // defpackage.yy
    public final iw c(kn knVar, int i, mf mfVar) {
        return ((((i < 0 || i >= 2) && i != -2) || mfVar != mf.e) && !((i == 0 || i == -3) && mfVar == mf.d)) ? new dh(this, knVar, i, mfVar) : this;
    }

    @Override // defpackage.iw
    public final Object collect(jw jwVar, hm hmVar) {
        this.d.collect(jwVar, hmVar);
        return vn.d;
    }

    @Override // defpackage.ur0
    public final Object getValue() {
        return this.d.getValue();
    }
}
