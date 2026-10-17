package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import defpackage.a0;
import defpackage.ky;
import defpackage.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends t implements PersistentList<E> {
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$0(Collection collection, Object obj) {
        return !collection.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.t, java.util.List
    public ListIterator<E> listIterator() {
        return (ListIterator<E>) listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Collection<? extends E> collection) {
        return removeAll((ky) new a0(1, collection));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> retainAll(Collection<? extends E> collection) {
        return removeAll((ky) new a0(0, collection));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override // defpackage.t, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public ImmutableList<E> subList(int i, int i2) {
        return super.subList(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i, Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i, collection);
        return builder.build();
    }
}
