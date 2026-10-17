package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, n20 {
    public static final int $stable = 8;
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.internal = new PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey$runtime(), persistentOrderedMap.getHashMap$runtime());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k = (K) this.internal.getNextKey$runtime();
        this.internal.next();
        return k;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
