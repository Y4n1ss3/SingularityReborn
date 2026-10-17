package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import defpackage.w;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends w implements Collection<V> {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.builder = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    @Override // defpackage.w
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}
