package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import defpackage.a21;
import defpackage.ac;
import defpackage.ao0;
import defpackage.dj;
import defpackage.ds0;
import defpackage.er;
import defpackage.ky;
import defpackage.p80;
import defpackage.xe0;
import defpackage.yi;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionsKt {
    @er
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(xe0... xe0VarArr) {
        return persistentHashMapOf((xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length));
    }

    @er
    public static final <E> PersistentSet<E> immutableHashSetOf(E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @er
    public static final <E> PersistentList<E> immutableListOf(E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @er
    public static final <K, V> PersistentMap<K, V> immutableMapOf(xe0... xe0VarArr) {
        return persistentMapOf((xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length));
    }

    @er
    public static final <E> PersistentSet<E> immutableSetOf(E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> PersistentSet<E> intersect(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        builder.getClass();
        iterable.getClass();
        builder.retainAll(iterable instanceof Collection ? (Collection) iterable : yi.I0(iterable));
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.i0(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> mutate(PersistentMap<? extends K, ? extends V> persistentMap, ky kyVar) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kyVar.invoke(builder2);
        return builder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(xe0... xe0VarArr) {
        PersistentHashMap<K, V> emptyOf$runtime = PersistentHashMap.Companion.emptyOf$runtime();
        emptyOf$runtime.getClass();
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime.builder2();
        p80.O(builder2, xe0VarArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf(E... eArr) {
        return PersistentHashSet.Companion.emptyOf$runtime().addAll((Collection) ac.K(eArr));
    }

    public static final <E> PersistentList<E> persistentListOf(E... eArr) {
        return UtilsKt.persistentVectorOf().addAll((Collection) ac.K(eArr));
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf(xe0... xe0VarArr) {
        PersistentOrderedMap<K, V> emptyOf$runtime = PersistentOrderedMap.Companion.emptyOf$runtime();
        emptyOf$runtime.getClass();
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime.builder2();
        p80.O(builder2, xe0VarArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> persistentSetOf(E... eArr) {
        return PersistentOrderedSet.Companion.emptyOf$runtime().addAll((Collection) ac.K(eArr));
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.d0(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, ao0 ao0Var) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        builder2.getClass();
        ao0Var.getClass();
        Iterator it = ao0Var.iterator();
        while (it.hasNext()) {
            xe0 xe0Var = (xe0) it.next();
            builder2.put((Object) xe0Var.d, (Object) xe0Var.e);
        }
        return builder2.build2();
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap = map instanceof ImmutableMap ? (ImmutableMap) map : null;
        if (immutableMap != null) {
            return immutableMap;
        }
        PersistentMap.Builder builder = map instanceof PersistentMap.Builder ? (PersistentMap.Builder) map : null;
        PersistentMap<K, V> build2 = builder != null ? builder.build2() : null;
        return build2 != null ? build2 : persistentMapOf().putAll((Map) map);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        PersistentSet build = builder != null ? builder.build() : null;
        return build != null ? build : plus(persistentSetOf(), (Iterable) iterable);
    }

    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
        PersistentHashMap<K, V> build2 = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        return build2 != null ? build2 : PersistentHashMap.Companion.emptyOf$runtime().putAll((Map) map);
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return build != null ? build : plus(PersistentHashSet.Companion.emptyOf$runtime(), (Iterable) iterable);
    }

    public static final <T> PersistentList<T> toPersistentList(Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> build = builder != null ? builder.build() : null;
        return build == null ? plus(persistentListOf(), (Iterable) iterable) : build;
    }

    public static final <K, V> PersistentMap<K, V> toPersistentMap(Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap = map instanceof PersistentOrderedMap ? (PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof PersistentOrderedMapBuilder ? (PersistentOrderedMapBuilder) map : null;
        PersistentMap<K, V> build2 = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build2() : null;
        return build2 == null ? PersistentOrderedMap.Companion.emptyOf$runtime().putAll((Map) map) : build2;
    }

    public static final <T> PersistentSet<T> toPersistentSet(Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime(), (Iterable) iterable) : build;
    }

    @er
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @er
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <T> PersistentList<T> mutate(PersistentList<? extends T> persistentList, ky kyVar) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        kyVar.invoke(builder);
        return builder.build();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime();
    }

    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime();
    }

    public static final <T> PersistentSet<T> mutate(PersistentSet<? extends T> persistentSet, ky kyVar) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        kyVar.invoke(builder);
        return builder.build();
    }

    public static final <T> ImmutableList<T> toImmutableList(ao0 ao0Var) {
        return toPersistentList(ao0Var);
    }

    public static final ImmutableList<Character> toImmutableList(CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.remove((PersistentCollection<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.add((PersistentCollection<? extends E>) e);
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.j0(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.e0(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, ao0 ao0Var) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.h0(builder, ao0Var);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, ao0 ao0Var) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        dj.c0(builder, ao0Var);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E e) {
        return persistentList.remove((PersistentList<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E e) {
        return persistentList.add((PersistentList<? extends E>) e);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.i0(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.d0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.remove((PersistentSet<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.add((PersistentSet<? extends E>) e);
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.i0(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.d0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K k) {
        persistentMap.getClass();
        return persistentMap.remove((PersistentMap<? extends K, ? extends V>) k);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, xe0 xe0Var) {
        persistentMap.getClass();
        return persistentMap.put((PersistentMap<? extends K, ? extends V>) xe0Var.d, (a21) xe0Var.e);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.j0(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> intersect(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, ao0 ao0Var) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.h0(builder, ao0Var);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends xe0> iterable) {
        return putAll(persistentMap, iterable);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(ao0 ao0Var) {
        return toPersistentSet(ao0Var);
    }

    public static final <T> PersistentList<T> toPersistentList(ao0 ao0Var) {
        return plus(persistentListOf(), ao0Var);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, xe0[] xe0VarArr) {
        return putAll(persistentMap, xe0VarArr);
    }

    public static final PersistentSet<Character> toImmutableSet(CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    public static final PersistentList<Character> toPersistentList(CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        ds0.D0(charSequence, builder);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, ao0 ao0Var) {
        return putAll(persistentMap, ao0Var);
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends xe0> iterable) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        p80.N(builder2, iterable);
        return builder2.build2();
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(ao0 ao0Var) {
        return plus(persistentHashSetOf(), ao0Var);
    }

    public static final <T> PersistentSet<T> toPersistentSet(ao0 ao0Var) {
        return plus(persistentSetOf(), ao0Var);
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.j0(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    public static final PersistentSet<Character> toPersistentHashSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        ds0.D0(charSequence, builder);
        return builder.build();
    }

    public static final PersistentSet<Character> toPersistentSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        ds0.D0(charSequence, builder);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.e0(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, xe0[] xe0VarArr) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        p80.O(builder2, xe0VarArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, ao0 ao0Var) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.h0(builder, ao0Var);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, ao0 ao0Var) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        dj.c0(builder, ao0Var);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        persistentMap.getClass();
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends K> iterable) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        dj.i0(builder2.keySet(), iterable);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.e0(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K[] kArr) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        dj.j0(builder2.keySet(), kArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, ao0 ao0Var) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        dj.c0(builder, ao0Var);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, ao0 ao0Var) {
        persistentMap.getClass();
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        dj.h0(builder2.keySet(), ao0Var);
        return builder2.build2();
    }
}
