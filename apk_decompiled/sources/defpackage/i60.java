package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class i60 extends yf0 {
    public static final i60 c = new i60(p60.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        h60 h60Var = (h60) obj;
        h60Var.getClass();
        long n = d41Var.n();
        h60Var.b(h60Var.d() + 1);
        long[] jArr = h60Var.a;
        int i2 = h60Var.b;
        h60Var.b = i2 + 1;
        jArr[i2] = n;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        h60 h60Var = new h60();
        h60Var.a = jArr;
        h60Var.b = jArr.length;
        h60Var.b(10);
        return h60Var;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new long[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        uk0Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.h(j);
        }
    }
}
