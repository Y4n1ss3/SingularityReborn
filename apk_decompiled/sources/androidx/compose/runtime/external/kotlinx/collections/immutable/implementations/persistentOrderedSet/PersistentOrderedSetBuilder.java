package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.z;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedSetBuilder<E> extends z implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private Object firstElement;
    private final PersistentHashMapBuilder<E, Links> hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet<E> persistentOrderedSet) {
        this.set = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement$runtime();
        this.lastElement = this.set.getLastElement$runtime();
        this.hashMapBuilder = this.set.getHashMap$runtime().builder2();
    }

    @Override // defpackage.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.hashMapBuilder.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = e;
            this.lastElement = e;
            this.hashMapBuilder.put(e, new Links());
            return true;
        }
        Links links = this.hashMapBuilder.get(this.lastElement);
        links.getClass();
        this.hashMapBuilder.put(this.lastElement, links.withNext(e));
        this.hashMapBuilder.put(e, new Links(this.lastElement));
        this.lastElement = e;
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> build2 = this.hashMapBuilder.build2();
        if (build2 == this.set.getHashMap$runtime()) {
            CommonFunctionsKt.m4094assert(this.firstElement == this.set.getFirstElement$runtime());
            CommonFunctionsKt.m4094assert(this.lastElement == this.set.getLastElement$runtime());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, build2);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    public final Object getFirstElement$runtime() {
        return this.firstElement;
    }

    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime() {
        return this.hashMapBuilder;
    }

    @Override // defpackage.z
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Links remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            Links links = this.hashMapBuilder.get(remove.getPrevious());
            links.getClass();
            this.hashMapBuilder.put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (!remove.getHasNext()) {
            this.lastElement = remove.getPrevious();
            return true;
        }
        Links links2 = this.hashMapBuilder.get(remove.getNext());
        links2.getClass();
        this.hashMapBuilder.put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
        return true;
    }

    public final void setFirstElement$runtime(Object obj) {
        this.firstElement = obj;
    }
}
