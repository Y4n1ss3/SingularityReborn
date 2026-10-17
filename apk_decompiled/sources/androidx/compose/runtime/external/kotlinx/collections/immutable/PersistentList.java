package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import defpackage.ky;
import defpackage.o20;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, o20 {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentList<E> build();
    }

    @Override // java.util.List
    PersistentList<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> add(E e);

    @Override // java.util.List
    PersistentList<E> addAll(int i, Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> addAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> clear();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> remove(E e);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(ky kyVar);

    PersistentList<E> removeAt(int i);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> retainAll(Collection<? extends E> collection);

    @Override // java.util.List
    PersistentList<E> set(int i, E e);
}
