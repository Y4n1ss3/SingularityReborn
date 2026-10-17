package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import defpackage.k0;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapKeys<K, V> extends k0 implements ImmutableSet<K> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapKeys(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.i
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentOrderedMapKeysIterator(this.map);
    }
}
