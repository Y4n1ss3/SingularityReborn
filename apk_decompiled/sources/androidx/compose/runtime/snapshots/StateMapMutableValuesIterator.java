package androidx.compose.runtime.snapshots;

import defpackage.n20;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, n20 {
    public StateMapMutableValuesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> next = getNext();
        if (next == null) {
            throw new IllegalStateException();
        }
        advance();
        return next.getValue();
    }
}
