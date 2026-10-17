package androidx.compose.runtime.collection;

import defpackage.j50;
import defpackage.ky;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final <T> MutableVector<T> MutableVector(int i) {
        q10.G();
        throw null;
    }

    public static MutableVector MutableVector$default(int i, int i2, Object obj) {
        q10.G();
        throw null;
    }

    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throwListIndexOutOfBoundsException(i, size);
        }
    }

    public static final void checkSubIndex(List<?> list, int i, int i2) {
        if (i > i2) {
            throwReversedIndicesException(i, i2);
        }
        if (i < 0) {
            throwNegativeIndexException(i);
        }
        if (i2 > list.size()) {
            throwOutOfRangeException(i2, list.size());
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    private static final void throwListIndexOutOfBoundsException(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void throwNegativeIndexException(int i) {
        throw new IndexOutOfBoundsException(j50.i(i, "fromIndex (", ") is less than 0."));
    }

    private static final void throwOutOfRangeException(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void throwReversedIndicesException(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    public static final <T> MutableVector<T> MutableVector(int i, ky kyVar) {
        q10.G();
        throw null;
    }

    public static final <T> MutableVector<T> mutableVectorOf() {
        q10.G();
        throw null;
    }
}
