package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z00 extends yf0 {
    public static final z00 c = new z00(l10.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        y00 y00Var = (y00) obj;
        y00Var.getClass();
        int m = d41Var.m();
        y00Var.b(y00Var.d() + 1);
        int[] iArr = y00Var.a;
        int i2 = y00Var.b;
        y00Var.b = i2 + 1;
        iArr[i2] = m;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        y00 y00Var = new y00();
        y00Var.a = iArr;
        y00Var.b = iArr.length;
        y00Var.b(10);
        return y00Var;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new int[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        uk0Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.g(i3);
        }
    }
}
