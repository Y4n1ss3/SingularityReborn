package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class va0 implements List, o20 {
    public final xa0 d;

    public va0(xa0 xa0Var) {
        this.d = xa0Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        xa0 xa0Var = this.d;
        if (i < 0 || i > (i2 = xa0Var.b)) {
            xa0Var.o(i);
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = xa0Var.a;
        if (objArr.length < i3) {
            xa0Var.n(i3, objArr);
        }
        Object[] objArr2 = xa0Var.a;
        int i4 = xa0Var.b;
        if (i != i4) {
            ac.Q(objArr2, objArr2, i + 1, i, i4);
        }
        objArr2[i] = obj;
        xa0Var.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        xa0 xa0Var = this.d;
        if (i < 0 || i > xa0Var.b) {
            xa0Var.o(i);
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + xa0Var.b;
        Object[] objArr = xa0Var.a;
        if (objArr.length < size) {
            xa0Var.n(size, objArr);
        }
        Object[] objArr2 = xa0Var.a;
        if (i != xa0Var.b) {
            ac.Q(objArr2, objArr2, collection.size() + i, i, xa0Var.b);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                y80.V();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        xa0Var.b = collection.size() + xa0Var.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.c(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.d.c(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dd0.a(this, i);
        return this.d.b(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.c(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ua0(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        xa0 xa0Var = this.d;
        Object[] objArr = xa0Var.a;
        int i = xa0Var.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ua0(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        dd0.a(this, i);
        return this.d.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        xa0 xa0Var = this.d;
        int i = xa0Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xa0Var.k(it.next());
        }
        return i != xa0Var.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        xa0 xa0Var = this.d;
        int i = xa0Var.b;
        Object[] objArr = xa0Var.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                xa0Var.l(i2);
            }
        }
        return i != xa0Var.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        dd0.a(this, i);
        xa0 xa0Var = this.d;
        if (i < 0 || i >= xa0Var.b) {
            xa0Var.f(i);
            throw null;
        }
        Object[] objArr = xa0Var.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        dd0.b(this, i, i2);
        return new wa0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return d41.K(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ua0(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d41.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.d.g(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        xa0 xa0Var = this.d;
        int i = xa0Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xa0Var.g(it.next());
        }
        return i != xa0Var.b;
    }
}
