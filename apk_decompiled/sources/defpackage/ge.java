package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ge extends yf0 {
    public static final ge c = new ge(he.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        fe feVar = (fe) obj;
        feVar.getClass();
        boolean h = d41Var.h();
        feVar.b(feVar.d() + 1);
        boolean[] zArr = feVar.a;
        int i2 = feVar.b;
        feVar.b = i2 + 1;
        zArr[i2] = h;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        fe feVar = new fe();
        feVar.a = zArr;
        feVar.b = zArr.length;
        feVar.b(10);
        return feVar;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new boolean[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        uk0Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.b(z);
        }
    }
}
