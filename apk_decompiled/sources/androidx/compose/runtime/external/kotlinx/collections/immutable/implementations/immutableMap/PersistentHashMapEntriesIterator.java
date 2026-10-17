package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashMapEntriesIterator<K, V> extends PersistentHashMapBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PersistentHashMapEntriesIterator(TrieNode<K, V> trieNode) {
        super(trieNode, r1);
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeEntriesIterator();
        }
    }
}
