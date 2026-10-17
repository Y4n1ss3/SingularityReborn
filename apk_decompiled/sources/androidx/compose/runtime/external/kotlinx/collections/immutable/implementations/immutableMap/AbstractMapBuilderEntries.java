package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.z;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends z {
    public static final int $stable = 8;

    public final boolean contains(E e) {
        if ((e != null ? e : null) == null) {
            return false;
        }
        return containsEntry(e);
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    public final boolean remove(E e) {
        if ((e != null ? e : null) == null) {
            return false;
        }
        return removeEntry(e);
    }

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }
}
