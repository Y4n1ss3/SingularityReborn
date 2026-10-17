package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lt implements kt {
    public final int a;
    public int b = -1;
    public int c = -1;

    public lt(int i) {
        this.a = i;
    }

    @Override // defpackage.kt
    public final boolean b(CharSequence charSequence, int i, int i2, r01 r01Var) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.kt
    public final Object a() {
        return this;
    }
}
