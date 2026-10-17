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
public final class l50 extends x implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int f;
    public final l50 g;
    public final m50 h;

    public l50(Object[] objArr, int i, int i2, l50 l50Var, m50 m50Var) {
        int i3;
        objArr.getClass();
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.g = l50Var;
        this.h = m50Var;
        i3 = ((AbstractList) m50Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        e();
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.b(i, i2);
        c(this.e + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        e();
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.b(i, i2);
        int size = collection.size();
        b(collection, this.e + i, size);
        return size > 0;
    }

    public final void b(Collection collection, int i, int i2) {
        ((AbstractList) this).modCount++;
        m50 m50Var = this.h;
        l50 l50Var = this.g;
        if (l50Var != null) {
            l50Var.b(collection, i, i2);
        } else {
            m50 m50Var2 = m50.g;
            m50Var.b(collection, i, i2);
        }
        this.d = m50Var.d;
        this.f += i2;
    }

    public final void c(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m50 m50Var = this.h;
        l50 l50Var = this.g;
        if (l50Var != null) {
            l50Var.c(i, obj);
        } else {
            m50 m50Var2 = m50.g;
            m50Var.c(i, obj);
        }
        this.d = m50Var.d;
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        d();
        g(this.e, this.f);
    }

    public final void d() {
        int i;
        i = ((AbstractList) this.h).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        o.a();
    }

    public final void e() {
        if (this.h.f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        d();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (q10.b(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        Object f;
        ((AbstractList) this).modCount++;
        l50 l50Var = this.g;
        if (l50Var != null) {
            f = l50Var.f(i);
        } else {
            m50 m50Var = m50.g;
            f = this.h.f(i);
        }
        this.f--;
        return f;
    }

    public final void g(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        l50 l50Var = this.g;
        if (l50Var != null) {
            l50Var.g(i, i2);
        } else {
            m50 m50Var = m50.g;
            this.h.g(i, i2);
        }
        this.f -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.a(i, i2);
        return this.d[this.e + i];
    }

    @Override // defpackage.x
    public final int getSize() {
        d();
        return this.f;
    }

    public final int h(int i, int i2, Collection collection, boolean z) {
        int h;
        l50 l50Var = this.g;
        if (l50Var != null) {
            h = l50Var.h(i, i2, collection, z);
        } else {
            m50 m50Var = m50.g;
            h = this.h.h(i, i2, collection, z);
        }
        if (h > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= h;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.e + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        d();
        for (int i = 0; i < this.f; i++) {
            if (q10.b(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        d();
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        for (int i = this.f - 1; i >= 0; i--) {
            if (q10.b(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.b(i, i2);
        return new k50(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
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
        e();
        d();
        return h(this.e, this.f, collection, false) > 0;
    }

    @Override // defpackage.x
    public final Object removeAt(int i) {
        e();
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.a(i, i2);
        return f(this.e + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        e();
        d();
        return h(this.e, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        d();
        p pVar = t.Companion;
        int i2 = this.f;
        pVar.getClass();
        p.a(i, i2);
        Object[] objArr = this.d;
        int i3 = this.e + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p pVar = t.Companion;
        int i3 = this.f;
        pVar.getClass();
        p.c(i, i2, i3);
        return new l50(this.d, this.e + i, i2 - i, this, this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        d();
        int length = objArr.length;
        int i = this.f;
        Object[] objArr2 = this.d;
        int i2 = this.e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ac.Q(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return p10.P(this.d, this.e, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        d();
        c(this.e + this.f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        e();
        d();
        int size = collection.size();
        b(collection, this.e + this.f, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        d();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = this.e;
        return ac.V(objArr, i2, i + i2);
    }
}
