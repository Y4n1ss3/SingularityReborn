package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import defpackage.n20;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, n20 {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return new MutableMapEntry(this.internal.getBuilder$runtime().getHashMapBuilder$runtime(), this.internal.getLastIteratedKey$runtime(), this.internal.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }
}
