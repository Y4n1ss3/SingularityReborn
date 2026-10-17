package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import defpackage.ac;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t, int i) {
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.hashes[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    WeakReference<T> weakReference = this.values[i4];
                    return t == (weakReference != null ? weakReference.get() : null) ? i4 : findExactIndex(i4, t, i);
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private final int findExactIndex(int i, T t, int i2) {
        int i3 = i - 1;
        while (true) {
            if (-1 >= i3 || this.hashes[i3] != i2) {
                break;
            }
            WeakReference<T> weakReference = this.values[i3];
            if ((weakReference != null ? weakReference.get() : null) == t) {
                return i3;
            }
            i3--;
        }
        int i4 = this.size;
        for (int i5 = i + 1; i5 < i4; i5++) {
            if (this.hashes[i5] != i2) {
                return -(i5 + 1);
            }
            WeakReference<T> weakReference2 = this.values[i5];
            if ((weakReference2 != null ? weakReference2.get() : null) == t) {
                return i5;
            }
        }
        return -(this.size + 1);
    }

    public final boolean add(T t) {
        int i;
        int i2 = this.size;
        int identityHashCode = System_jvmKt.identityHashCode(t);
        if (i2 > 0) {
            i = find(t, identityHashCode);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr2, i5, i2 - i3);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i3);
            ac.O(this.hashes, iArr, i5, i3, i2);
            ac.S(this.hashes, iArr, 0, i3, 6);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i6 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr, i6, i2 - i3);
            int[] iArr2 = this.hashes;
            ac.O(iArr2, iArr2, i6, i3, i2);
        }
        this.values[i3] = new WeakReference<>(t);
        this.hashes[i3] = identityHashCode;
        this.size++;
        return true;
    }

    public final int[] getHashes$runtime() {
        return this.hashes;
    }

    public final int getSize$runtime() {
        return this.size;
    }

    public final WeakReference<T>[] getValues$runtime() {
        return this.values;
    }

    public final boolean isValid$runtime() {
        WeakReference<T> weakReference;
        int i = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i > length) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i4 < i2 || (weakReference = weakReferenceArr[i3]) == null) {
                return false;
            }
            T t = weakReference.get();
            if (t != null && i4 != System_jvmKt.identityHashCode(t)) {
                return false;
            }
            i3++;
            i2 = i4;
        }
        while (i < length) {
            if (iArr[i] != 0 || weakReferenceArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void removeIf(ky kyVar) {
        int size$runtime = getSize$runtime();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size$runtime) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime()[i];
            T t = weakReference != null ? weakReference.get() : null;
            if (t != null && !((Boolean) kyVar.invoke(t)).booleanValue()) {
                if (i2 != i) {
                    getValues$runtime()[i2] = weakReference;
                    getHashes$runtime()[i2] = getHashes$runtime()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime; i3++) {
            getValues$runtime()[i3] = null;
            getHashes$runtime()[i3] = 0;
        }
        if (i2 != size$runtime) {
            setSize$runtime(i2);
        }
    }

    public final void setHashes$runtime(int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime(int i) {
        this.size = i;
    }

    public final void setValues$runtime(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
