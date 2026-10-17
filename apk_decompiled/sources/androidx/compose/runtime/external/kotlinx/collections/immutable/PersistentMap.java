package androidx.compose.runtime.external.kotlinx.collections.immutable;

import defpackage.q20;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Builder<K, V> extends Map<K, V>, q20 {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k, V v);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k, V v);
}
