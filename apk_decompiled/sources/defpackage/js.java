package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class js extends yf0 {
    public static final js c = new js(ks.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        is isVar = (is) obj;
        isVar.getClass();
        double j = d41Var.j();
        isVar.b(isVar.d() + 1);
        double[] dArr = isVar.a;
        int i2 = isVar.b;
        isVar.b = i2 + 1;
        dArr[i2] = j;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        is isVar = new is();
        isVar.a = dArr;
        isVar.b = dArr.length;
        isVar.b(10);
        return isVar;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new double[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        uk0Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.d(d);
        }
    }
}
