package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.dq;
import defpackage.z;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashSetBuilder<E> extends z implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private int modCount;
    private TrieNode<E> node;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private PersistentHashSet<E> set;
    private int size;

    public PersistentHashSetBuilder(PersistentHashSet<E> persistentHashSet) {
        this.set = persistentHashSet;
        this.node = this.set.getNode$runtime();
        this.size = this.set.size();
    }

    @Override // defpackage.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        int size = size();
        this.node = this.node.mutableAdd(e != null ? e.hashCode() : 0, e, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        dq dqVar = null;
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, dqVar);
        int size = size();
        TrieNode<E> mutableAddAll = this.node.mutableAddAll(persistentHashSet.getNode$runtime(), 0, deltaCounter, this);
        int size2 = (collection.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            this.node = mutableAddAll;
            setSize(size2);
        }
        return size != size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        TrieNode<E> eMPTY$runtime = TrieNode.Companion.getEMPTY$runtime();
        eMPTY$runtime.getClass();
        this.node = eMPTY$runtime;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return collection instanceof PersistentHashSet ? this.node.containsAll(((PersistentHashSet) collection).getNode$runtime(), 0) : collection instanceof PersistentHashSetBuilder ? this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0) : super.containsAll(collection);
    }

    public final int getModCount$runtime() {
        return this.modCount;
    }

    public final TrieNode<E> getNode$runtime() {
        return this.node;
    }

    public final MutabilityOwnership getOwnership$runtime() {
        return this.ownership;
    }

    @Override // defpackage.z
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.node = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        dq dqVar = null;
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, dqVar);
        int size = size();
        Object mutableRemoveAll = this.node.mutableRemoveAll(persistentHashSet.getNode$runtime(), 0, deltaCounter, this);
        int count = size - deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            mutableRemoveAll.getClass();
            this.node = (TrieNode) mutableRemoveAll;
            setSize(count);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        dq dqVar = null;
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, dqVar);
        int size = size();
        Object mutableRetainAll = this.node.mutableRetainAll(persistentHashSet.getNode$runtime(), 0, deltaCounter, this);
        int count = deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            mutableRetainAll.getClass();
            this.node = (TrieNode) mutableRetainAll;
            setSize(count);
        }
        return size != size();
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }
}
