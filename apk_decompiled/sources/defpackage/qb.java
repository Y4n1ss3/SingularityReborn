package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class qb extends x {
    public static final Object[] g = new Object[0];
    public int d;
    public Object[] e;
    public int f;

    public qb(int i) {
        this.e = new Object[16];
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.f = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.b(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        b(size() + 1);
        int h = h(this.d + i);
        if (i < ((size() + 1) >> 1)) {
            int length = h == 0 ? this.e.length - 1 : h - 1;
            int i2 = this.d;
            int length2 = i2 == 0 ? this.e.length - 1 : i2 - 1;
            Object[] objArr = this.e;
            if (length >= i2) {
                objArr[length2] = objArr[i2];
                ac.Q(objArr, objArr, i2, i2 + 1, length + 1);
            } else {
                ac.Q(objArr, objArr, i2 - 1, i2, objArr.length);
                Object[] objArr2 = this.e;
                objArr2[objArr2.length - 1] = objArr2[0];
                ac.Q(objArr2, objArr2, 0, 1, length + 1);
            }
            this.e[length] = obj;
            this.d = length2;
        } else {
            int h2 = h(size() + this.d);
            Object[] objArr3 = this.e;
            if (h < h2) {
                ac.Q(objArr3, objArr3, h + 1, h, h2);
            } else {
                ac.Q(objArr3, objArr3, 1, 0, h2);
                Object[] objArr4 = this.e;
                objArr4[0] = objArr4[objArr4.length - 1];
                ac.Q(objArr4, objArr4, h + 1, h, objArr4.length - 1);
            }
            this.e[h] = obj;
        }
        this.f = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.b(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        i();
        b(collection.size() + size());
        int h = h(size() + this.d);
        int h2 = h(this.d + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = h2 + size2;
            Object[] objArr = this.e;
            if (h2 < h) {
                int i3 = size2 + h;
                if (i3 <= objArr.length) {
                    ac.Q(objArr, objArr, i2, h2, h);
                } else if (i2 >= objArr.length) {
                    ac.Q(objArr, objArr, i2 - objArr.length, h2, h);
                } else {
                    int length = h - (i3 - objArr.length);
                    ac.Q(objArr, objArr, 0, length, h);
                    Object[] objArr2 = this.e;
                    ac.Q(objArr2, objArr2, i2, h2, length);
                }
            } else {
                ac.Q(objArr, objArr, size2, 0, h);
                Object[] objArr3 = this.e;
                if (i2 >= objArr3.length) {
                    ac.Q(objArr3, objArr3, i2 - objArr3.length, h2, objArr3.length);
                } else {
                    ac.Q(objArr3, objArr3, 0, objArr3.length - size2, objArr3.length);
                    Object[] objArr4 = this.e;
                    ac.Q(objArr4, objArr4, i2, h2, objArr4.length - size2);
                }
            }
            a(h2, collection);
            return true;
        }
        int i4 = this.d;
        int i5 = i4 - size2;
        Object[] objArr5 = this.e;
        if (h2 < i4) {
            ac.Q(objArr5, objArr5, i5, i4, objArr5.length);
            Object[] objArr6 = this.e;
            if (size2 >= h2) {
                ac.Q(objArr6, objArr6, objArr6.length - size2, 0, h2);
            } else {
                ac.Q(objArr6, objArr6, objArr6.length - size2, 0, size2);
                Object[] objArr7 = this.e;
                ac.Q(objArr7, objArr7, 0, size2, h2);
            }
        } else if (i5 >= 0) {
            ac.Q(objArr5, objArr5, i5, i4, h2);
        } else {
            i5 += objArr5.length;
            int i6 = h2 - i4;
            int length2 = objArr5.length - i5;
            if (length2 >= i6) {
                ac.Q(objArr5, objArr5, i5, i4, h2);
            } else {
                ac.Q(objArr5, objArr5, i5, i4, i4 + length2);
                Object[] objArr8 = this.e;
                ac.Q(objArr8, objArr8, 0, this.d + length2, h2);
            }
        }
        this.d = i5;
        a(f(h2 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        b(size() + 1);
        int i = this.d;
        if (i == 0) {
            i = this.e.length;
        }
        int i2 = i - 1;
        this.d = i2;
        this.e[i2] = obj;
        this.f = size() + 1;
    }

    public final void addLast(Object obj) {
        i();
        b(size() + 1);
        this.e[h(size() + this.d)] = obj;
        this.f = size() + 1;
    }

    public final void b(int i) {
        if (i < 0) {
            o.f("Deque is too big.");
            return;
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == g) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
            return;
        }
        p pVar = t.Companion;
        int length = objArr.length;
        pVar.getClass();
        Object[] objArr2 = new Object[p.d(length, i)];
        Object[] objArr3 = this.e;
        ac.Q(objArr3, objArr2, 0, this.d, objArr3.length);
        Object[] objArr4 = this.e;
        int length2 = objArr4.length;
        int i2 = this.d;
        ac.Q(objArr4, objArr2, length2 - i2, 0, i2);
        this.d = 0;
        this.e = objArr2;
    }

    public final Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.e[this.d];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.d, h(size() + this.d));
        }
        this.d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        if (i == this.e.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.e[h((size() - 1) + this.d)];
    }

    public final int f(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[this.d];
    }

    public final void g(int i, int i2) {
        Object[] objArr = this.e;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.e, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.a(i, size);
        return this.e[h(this.d + i)];
    }

    @Override // defpackage.x
    public final int getSize() {
        return this.f;
    }

    public final int h(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int h = h(size() + this.d);
        int i2 = this.d;
        if (i2 < h) {
            while (i2 < h) {
                if (q10.b(obj, this.e[i2])) {
                    i = this.d;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < h) {
            return -1;
        }
        int length = this.e.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < h; i3++) {
                    if (q10.b(obj, this.e[i3])) {
                        i2 = i3 + this.e.length;
                        i = this.d;
                    }
                }
                return -1;
            }
            if (q10.b(obj, this.e[i2])) {
                i = this.d;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[h((size() - 1) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int h = h(size() + this.d);
        int i2 = this.d;
        if (i2 < h) {
            length = h - 1;
            if (i2 <= length) {
                while (!q10.b(obj, this.e[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
            return -1;
        }
        if (i2 > h) {
            while (true) {
                h--;
                Object[] objArr = this.e;
                if (-1 >= h) {
                    length = objArr.length - 1;
                    int i3 = this.d;
                    if (i3 <= length) {
                        while (!q10.b(obj, this.e[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.d;
                    }
                } else if (q10.b(obj, objArr[h])) {
                    length = h + this.e.length;
                    i = this.d;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int h2 = h(size() + this.d);
            int i = this.d;
            if (i < h2) {
                h = i;
                while (true) {
                    objArr = this.e;
                    if (i >= h2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.e[h] = obj;
                        h++;
                    }
                    i++;
                }
                Arrays.fill(objArr, h, h2, (Object) null);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[h] = obj3;
                        h = d(h);
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(h - this.d);
            }
        }
        return z;
    }

    @Override // defpackage.x
    public final Object removeAt(int i) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.a(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int h = h(this.d + i);
        Object obj = this.e[h];
        int size2 = size() >> 1;
        int i2 = this.d;
        if (i < size2) {
            Object[] objArr = this.e;
            if (h >= i2) {
                ac.Q(objArr, objArr, i2 + 1, i2, h);
            } else {
                ac.Q(objArr, objArr, 1, 0, h);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.d;
                ac.Q(objArr2, objArr2, i3 + 1, i3, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i4 = this.d;
            objArr3[i4] = null;
            this.d = d(i4);
        } else {
            int h2 = h((size() - 1) + i2);
            Object[] objArr4 = this.e;
            if (h <= h2) {
                ac.Q(objArr4, objArr4, h, h + 1, h2 + 1);
            } else {
                ac.Q(objArr4, objArr4, h, h + 1, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                ac.Q(objArr5, objArr5, 0, 1, h2 + 1);
            }
            this.e[h2] = null;
        }
        this.f = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = d(i);
        this.f = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h = h((size() - 1) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[h];
        objArr[h] = null;
        this.f = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.c(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        i();
        int size2 = size() - i2;
        int i4 = this.d;
        int i5 = this.d;
        if (i < size2) {
            int h = h((i - 1) + i4);
            int h2 = h((i2 - 1) + i5);
            while (i > 0) {
                int i6 = h + 1;
                int min = Math.min(i, Math.min(i6, h2 + 1));
                Object[] objArr = this.e;
                int i7 = h2 - min;
                int i8 = h - min;
                ac.Q(objArr, objArr, i7 + 1, i8 + 1, i6);
                h = f(i8);
                h2 = f(i7);
                i -= min;
            }
            int h3 = h(this.d + i3);
            g(this.d, h3);
            this.d = h3;
        } else {
            int h4 = h(i4 + i2);
            int h5 = h(i5 + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(size3, Math.min(objArr2.length - h4, objArr2.length - h5));
                Object[] objArr3 = this.e;
                int i9 = h4 + i2;
                ac.Q(objArr3, objArr3, h5, h4, i9);
                h4 = h(i9);
                h5 = h(h5 + i2);
            }
            int h6 = h(size() + this.d);
            g(f(h6 - i3), h6);
        }
        this.f = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int h2 = h(size() + this.d);
            int i = this.d;
            if (i < h2) {
                h = i;
                while (true) {
                    objArr = this.e;
                    if (i >= h2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.e[h] = obj;
                        h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, h, h2, (Object) null);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.e[h] = obj3;
                        h = d(h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(h - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.a(i, size);
        int h = h(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int h = h(size() + this.d);
        int i = this.d;
        if (i < h) {
            ac.U(this.e, objArr, i, h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            ac.Q(objArr2, objArr, 0, this.d, objArr2.length);
            Object[] objArr3 = this.e;
            ac.Q(objArr3, objArr, objArr3.length - this.d, 0, h);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public qb() {
        this.e = g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        i();
        b(collection.size() + size());
        a(h(size() + this.d), collection);
        return true;
    }
}
