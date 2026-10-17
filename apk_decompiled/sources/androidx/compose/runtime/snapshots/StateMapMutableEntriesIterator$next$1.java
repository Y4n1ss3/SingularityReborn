package androidx.compose.runtime.snapshots;

import defpackage.o;
import defpackage.p20;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, p20 {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        current.getClass();
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        current2.getClass();
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime() != ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            o.a();
            return null;
        }
        V value = getValue();
        stateMapMutableEntriesIterator.getMap().put(getKey(), v);
        setValue((StateMapMutableEntriesIterator$next$1<K, V>) v);
        return value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }
}
