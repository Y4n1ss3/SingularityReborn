package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import defpackage.dj;
import defpackage.dq;
import defpackage.k0;
import defpackage.ky;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashSet<E> extends k0 implements PersistentSet<E> {
    private final TrieNode<E> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime(), 0);

    public PersistentHashSet(TrieNode<E> trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> add(E e) {
        TrieNode<E> add = this.node.add(e != null ? e.hashCode() : 0, e, 0);
        return this.node == add ? this : new PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime();
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> collection) {
        return collection instanceof PersistentHashSet ? this.node.containsAll(((PersistentHashSet) collection).node, 0) : collection instanceof PersistentHashSetBuilder ? this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime(), 0) : super.containsAll(collection);
    }

    public final TrieNode<E> getNode$runtime() {
        return this.node;
    }

    @Override // defpackage.i
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> remove(E e) {
        TrieNode<E> remove = this.node.remove(e != null ? e.hashCode() : 0, e, 0);
        return this.node == remove ? this : new PersistentHashSet(remove, size() - 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(ky kyVar) {
        PersistentSet.Builder<E> builder = builder();
        builder.getClass();
        kyVar.getClass();
        dj.f0(builder, kyVar);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final <E> PersistentSet<E> emptyOf$runtime() {
            return PersistentHashSet.EMPTY;
        }

        private Companion() {
        }
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentHashSet<E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentHashSet<E>) obj);
    }
}
