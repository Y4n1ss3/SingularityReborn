package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class p {
    public static void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            o.o(", size: ", i, i2, "index: ");
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            o.o(", size: ", i, i2, "index: ");
        }
    }

    public static void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            o.i(j50.j("fromIndex: ", i, ", toIndex: ", i2, ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            o.d(" > toIndex: ", i, i2, "fromIndex: ");
        }
    }

    public static int d(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }
}
