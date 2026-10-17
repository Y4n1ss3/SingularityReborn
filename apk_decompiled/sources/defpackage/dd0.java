package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class dd0 {
    public static final Object[] a = new Object[0];
    public static final xa0 b = new xa0(0);

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(j50.i(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
