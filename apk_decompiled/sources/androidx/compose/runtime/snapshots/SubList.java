package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import defpackage.d10;
import defpackage.d41;
import defpackage.hi0;
import defpackage.o;
import defpackage.o20;
import defpackage.q10;
import defpackage.y80;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, o20 {
    public static final int $stable = 8;
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.parentList = snapshotStateList;
        this.offset = i;
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
        this.size = i2 - i;
    }

    private final void validateModification() {
        if (SnapshotStateListKt.getStructure(this.parentList) == this.structure) {
            return;
        }
        o.a();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        validateModification();
        this.parentList.add(size() + this.offset, t);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        validateModification();
        boolean addAll = this.parentList.addAll(i + this.offset, collection);
        if (addAll) {
            this.size = collection.size() + size();
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public T get(int i) {
        validateModification();
        SnapshotStateListKt.validateRange(i, size());
        return this.parentList.get(this.offset + i);
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i = this.offset;
        Iterator<T> it = y80.W(i, size() + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((d10) it).nextInt();
            if (q10.b(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = size() + this.offset;
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!q10.b(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        validateModification();
        hi0 hi0Var = new hi0();
        hi0Var.d = i - 1;
        return new SubList$listIterator$1(hi0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public T removeAt(int i) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i);
        this.size = size() - 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int retainAllInRange$runtime = snapshotStateList.retainAllInRange$runtime(collection, i, size() + i);
        if (retainAllInRange$runtime > 0) {
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
            this.size = size() - retainAllInRange$runtime;
        }
        return retainAllInRange$runtime > 0;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        SnapshotStateListKt.validateRange(i, size());
        validateModification();
        T t2 = this.parentList.set(i + this.offset, t);
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i3 = this.offset;
        return new SubList(snapshotStateList, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        validateModification();
        this.parentList.add(this.offset + i, t);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
