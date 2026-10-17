package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.n20;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, n20 {
    public static final int $stable = 8;
    private final PersistentHashMapBuilderBaseIterator<K, V, Map.Entry<K, V>> base;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeMutableEntriesIterator(this);
        }
        this.base = new PersistentHashMapBuilderBaseIterator<>(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.base.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.base.remove();
    }

    public final void setValue(K k, V v) {
        this.base.setValue(k, v);
    }
}
