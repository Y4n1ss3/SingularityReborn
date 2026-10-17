package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ox implements kt {
    public static final ox c;
    public static final ox d;
    public static final ox e;
    public static final ox f;
    public static final ox g;
    public static final ox h;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new ox("VERTICAL", i);
        d = new ox("HORIZONTAL", i);
        int i2 = 1;
        e = new ox("FLAT", i2);
        f = new ox("HALF_OPENED", i2);
        int i3 = 2;
        g = new ox("FOLD", i3);
        h = new ox("HINGE", i3);
    }

    public /* synthetic */ ox(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.kt
    public boolean b(CharSequence charSequence, int i, int i2, r01 r01Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        r01Var.c = (r01Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
                return str;
            case 3:
            default:
                return super.toString();
            case 4:
                return c21.a(new StringBuilder("<"), str, '>');
        }
    }

    @Override // defpackage.kt
    public Object a() {
        return this;
    }
}
