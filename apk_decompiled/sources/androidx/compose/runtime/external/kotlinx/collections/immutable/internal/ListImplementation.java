package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import defpackage.j50;
import defpackage.o;
import defpackage.q10;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListImplementation {
    public static final int $stable = 0;
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    public static final void checkElementIndex$runtime(int i, int i2) {
        if (i < 0 || i >= i2) {
            o.o(", size: ", i, i2, "index: ");
        }
    }

    public static final void checkPositionIndex$runtime(int i, int i2) {
        if (i < 0 || i > i2) {
            o.o(", size: ", i, i2, "index: ");
        }
    }

    public static final void checkRangeIndexes$runtime(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            o.i(j50.j("fromIndex: ", i, ", toIndex: ", i2, ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            o.d(" > toIndex: ", i, i2, "fromIndex: ");
        }
    }

    public static final boolean orderedEquals$runtime(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!q10.b(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final int orderedHashCode$runtime(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }
}
