package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import defpackage.k0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapEntries<K, V> extends k0 implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapEntries(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        if (entry == null) {
            return false;
        }
        V v = this.map.get(entry.getKey());
        return v != null ? v.equals(entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
    }

    @Override // defpackage.i
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapEntriesIterator(this.map);
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }
}
