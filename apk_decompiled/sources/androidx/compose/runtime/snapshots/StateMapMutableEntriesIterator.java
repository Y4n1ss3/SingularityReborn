package androidx.compose.runtime.snapshots;

import defpackage.n20;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, n20 {
    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
