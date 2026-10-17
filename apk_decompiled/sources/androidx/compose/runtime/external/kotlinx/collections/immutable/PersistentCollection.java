package androidx.compose.runtime.external.kotlinx.collections.immutable;

import defpackage.ky;
import defpackage.o20;
import java.util.Collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Builder<E> extends Collection<E>, o20 {
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    PersistentCollection<E> add(E e);

    @Override // java.util.Collection
    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.Collection
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    PersistentCollection<E> remove(E e);

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    PersistentCollection<E> removeAll(ky kyVar);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}
