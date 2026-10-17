package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mh extends yf0 {
    public static final mh c = new mh(qh.a);

    @Override // defpackage.xi
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.xi
    public final void j(d41 d41Var, int i, Object obj) {
        lh lhVar = (lh) obj;
        lhVar.getClass();
        char i2 = d41Var.i();
        lhVar.b(lhVar.d() + 1);
        char[] cArr = lhVar.a;
        int i3 = lhVar.b;
        lhVar.b = i3 + 1;
        cArr[i3] = i2;
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        lh lhVar = new lh();
        lhVar.a = cArr;
        lhVar.b = cArr.length;
        lhVar.b(10);
        return lhVar;
    }

    @Override // defpackage.yf0
    public final Object m() {
        return new char[0];
    }

    @Override // defpackage.yf0
    public final void n(uk0 uk0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        uk0Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            uk0Var.e(this.b, i2);
            uk0Var.c(c2);
        }
    }
}
