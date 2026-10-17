package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class wa0 implements List, o20 {
    public final List d;
    public final int e;
    public int f;

    public wa0(List list, int i, int i2) {
        this.d = list;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i + this.e, obj);
        this.f++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        this.d.addAll(i + this.e, collection);
        this.f = collection.size() + this.f;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f - 1;
        int i2 = this.e;
        if (i2 <= i) {
            while (true) {
                this.d.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        for (int i2 = this.e; i2 < i; i2++) {
            if (q10.b(this.d.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dd0.a(this, i);
        return this.d.get(i + this.e);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f;
        int i2 = this.e;
        for (int i3 = i2; i3 < i; i3++) {
            if (q10.b(this.d.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f == this.e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ua0(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f - 1;
        int i2 = this.e;
        if (i2 > i) {
            return -1;
        }
        while (!q10.b(this.d.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ua0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f;
        for (int i2 = this.e; i2 < i; i2++) {
            List list = this.d;
            if (q10.b(list.get(i2), obj)) {
                list.remove(i2);
                this.f--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int i = this.f;
        int i2 = i - 1;
        int i3 = this.e;
        if (i3 <= i2) {
            while (true) {
                List list = this.d;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.f--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.f;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        dd0.a(this, i);
        return this.d.set(i + this.e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f - this.e;
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
    public final boolean add(Object obj) {
        int i = this.f;
        this.f = i + 1;
        this.d.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.d.addAll(this.f, collection);
        this.f = collection.size() + this.f;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        dd0.a(this, i);
        this.f--;
        return this.d.remove(i + this.e);
    }
}
