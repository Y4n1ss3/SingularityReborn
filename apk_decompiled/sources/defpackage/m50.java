package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class m50 extends x implements RandomAccess, Serializable {
    public static final m50 g;
    public Object[] d;
    public int e;
    public boolean f;

    static {
        m50 m50Var = new m50(0);
        m50Var.f = true;
        g = m50Var;
    }

    public m50(int i) {
        if (i >= 0) {
            this.d = new Object[i];
        } else {
            o.m("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d();
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.b(i, i2);
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        d();
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.b(i, i2);
        int size = collection.size();
        b(collection, i, size);
        return size > 0;
    }

    public final void b(Collection collection, int i, int i2) {
        ((AbstractList) this).modCount++;
        e(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.d[i + i3] = it.next();
        }
    }

    public final void c(int i, Object obj) {
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        g(0, this.e);
    }

    public final void d() {
        if (this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(int i, int i2) {
        int i3 = this.e + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.d;
        if (i3 > objArr.length) {
            p pVar = t.Companion;
            int length = objArr.length;
            pVar.getClass();
            int d = p.d(length, i3);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            objArr = Arrays.copyOf(objArr2, d);
            this.d = objArr;
        }
        ac.Q(objArr, objArr, i + i2, i, this.e);
        this.e += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (q10.b(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        ac.Q(objArr, objArr, i, i + 1, this.e);
        Object[] objArr2 = this.d;
        int i2 = this.e - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.e--;
        return obj;
    }

    public final void g(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.d;
        ac.Q(objArr, objArr, i, i + i2, this.e);
        Object[] objArr2 = this.d;
        int i3 = this.e;
        p10.J(objArr2, i3 - i2, i3);
        this.e -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.a(i, i2);
        return this.d[i];
    }

    @Override // defpackage.x
    public final int getSize() {
        return this.e;
    }

    public final int h(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.d;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.d;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ac.Q(objArr, objArr, i + i4, i2 + i, this.e);
        Object[] objArr3 = this.d;
        int i7 = this.e;
        p10.J(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.e -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.d;
        int i = this.e;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.e; i++) {
            if (q10.b(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.e - 1; i >= 0; i--) {
            if (q10.b(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.b(i, i2);
        return new k50(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        d();
        return h(0, this.e, collection, false) > 0;
    }

    @Override // defpackage.x
    public final Object removeAt(int i) {
        d();
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.a(i, i2);
        return f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        d();
        return h(0, this.e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        p pVar = t.Companion;
        int i2 = this.e;
        pVar.getClass();
        p.a(i, i2);
        Object[] objArr = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p pVar = t.Companion;
        int i3 = this.e;
        pVar.getClass();
        p.c(i, i2, i3);
        return new l50(this.d, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.e;
        Object[] objArr2 = this.d;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ac.Q(objArr2, objArr, 0, 0, i);
        int i2 = this.e;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p10.P(this.d, 0, this.e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.e;
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.d[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        d();
        int size = collection.size();
        b(collection, this.e, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ac.V(this.d, 0, this.e);
    }
}
