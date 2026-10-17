package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNodeKeysIterator<K, V> extends TrieNodeBaseIterator<K, V, K> {
    public static final int $stable = 8;

    @Override // java.util.Iterator
    public K next() {
        CommonFunctionsKt.m4094assert(hasNextKey());
        setIndex(getIndex() + 2);
        return (K) getBuffer()[getIndex() - 2];
    }
}
