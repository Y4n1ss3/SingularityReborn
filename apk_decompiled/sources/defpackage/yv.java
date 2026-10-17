package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yv extends yf0 {
    public static final yv c = new yv(cw.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        xv xvVar = (xv) obj;
        xvVar.getClass();
        float l = d41Var.l();
        xvVar.b(xvVar.d() + 1);
        float[] fArr = xvVar.a;
        int i2 = xvVar.b;
        xvVar.b = i2 + 1;
        fArr[i2] = l;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        xv xvVar = new xv();
        xvVar.a = fArr;
        xvVar.b = fArr.length;
        xvVar.b(10);
        return xvVar;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new float[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        uk0Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.f(f);
        }
    }
}
