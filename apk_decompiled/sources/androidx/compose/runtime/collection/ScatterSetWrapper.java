package androidx.compose.runtime.collection;

import defpackage.d41;
import defpackage.n20;
import defpackage.p10;
import defpackage.rl0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScatterSetWrapper<T> implements Set<T>, n20 {
    public static final int $stable = 8;
    private final rl0 set;

    public ScatterSetWrapper(rl0 rl0Var) {
        this.set = rl0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.set.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.set.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final rl0 getSet$runtime() {
        return this.set;
    }

    public int getSize() {
        return this.set.d;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.set.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return p10.y(new ScatterSetWrapper$iterator$1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }
}
