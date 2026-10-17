package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, n20 {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.internal.next();
        return (K) this.internal.getLastIteratedKey$runtime();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }
}
