package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class xb implements Collection {
    public final /* synthetic */ yb d;

    public xb(yb ybVar) {
        this.d = ybVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ub(this.d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        yb ybVar = this.d;
        int a = ybVar.a(obj);
        if (a < 0) {
            return false;
        }
        ybVar.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        yb ybVar = this.d;
        int i = ybVar.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(ybVar.h(i2))) {
                ybVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        yb ybVar = this.d;
        int i = ybVar.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(ybVar.h(i2))) {
                ybVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        yb ybVar = this.d;
        int i = ybVar.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ybVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        yb ybVar = this.d;
        int i = ybVar.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ybVar.h(i2);
        }
        return objArr;
    }
}
