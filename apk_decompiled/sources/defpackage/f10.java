package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class f10 {
    public static final ma0 a = new ma0(0);

    public static final ma0 a(int... iArr) {
        ma0 ma0Var = new ma0(iArr.length);
        int i = ma0Var.b;
        if (i < 0) {
            throw new IndexOutOfBoundsException("");
        }
        if (iArr.length == 0) {
            return ma0Var;
        }
        ma0Var.f(iArr.length + i);
        int[] iArr2 = ma0Var.a;
        int i2 = ma0Var.b;
        if (i != i2) {
            ac.O(iArr2, iArr2, iArr.length + i, i, i2);
        }
        ac.S(iArr, iArr2, i, 0, 12);
        ma0Var.b += iArr.length;
        return ma0Var;
    }
}
