package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderKeysIterator<K, V> extends PersistentHashMapBuilderBaseIterator<K, V, K> {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PersistentHashMapBuilderKeysIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        super(persistentHashMapBuilder, r1);
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeKeysIterator();
        }
    }
}
