package androidx.compose.runtime.external.kotlinx.collections.immutable;

import defpackage.n20;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, n20 {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
