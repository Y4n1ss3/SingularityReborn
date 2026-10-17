package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import defpackage.p20;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, p20 {
    private LinkedValue<V> links;
    private final Map<K, LinkedValue<V>> mutableMap;

    public MutableMapEntry(Map<K, LinkedValue<V>> map, K k, LinkedValue<V> linkedValue) {
        super(k, linkedValue.getValue());
        this.mutableMap = map;
        this.links = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.links.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v) {
        V value = this.links.getValue();
        this.links = this.links.withValue(v);
        this.mutableMap.put(getKey(), this.links);
        return value;
    }
}
