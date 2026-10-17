package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.p20;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, p20 {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k, V v) {
        super(k, v);
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        setValue((MutableMapEntry<K, V>) v);
        this.parentIterator.setValue(getKey(), v);
        return value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }
}
