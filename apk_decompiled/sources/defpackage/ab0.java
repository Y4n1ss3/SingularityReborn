package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ab0 implements t20, Set, n20 {
    public final ya0 d;
    public final ya0 e;

    public ab0(ya0 ya0Var) {
        ya0Var.getClass();
        this.d = ya0Var;
        this.e = ya0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ya0 ya0Var = this.e;
        ya0Var.getClass();
        int i = ya0Var.g;
        for (Object obj : collection) {
            int d = ya0Var.d(obj);
            ya0Var.b[d] = obj;
            long[] jArr = ya0Var.c;
            int i2 = ya0Var.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            ya0Var.d = d;
            if (ya0Var.e == Integer.MAX_VALUE) {
                ya0Var.e = d;
            }
        }
        return i != ya0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ab0.class != obj.getClass()) {
            return false;
        }
        return q10.b(this.d, ((ab0) obj).d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dz(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        ya0 ya0Var = this.e;
        ya0Var.getClass();
        int i3 = ya0Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = ya0Var.f;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = ya0Var.a;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (q10.b(ya0Var.b[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                ya0Var.h(i2);
            }
        }
        return i3 != ya0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.e.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return d41.K(this, objArr);
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return d41.J(this);
    }
}
