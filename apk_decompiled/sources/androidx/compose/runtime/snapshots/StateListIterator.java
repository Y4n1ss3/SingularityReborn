package androidx.compose.runtime.snapshots;

import defpackage.n20;
import defpackage.o;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, n20 {
    public static final int $stable = 8;
    private int index;
    private int lastRequested = -1;
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i) {
        this.list = snapshotStateList;
        this.index = i - 1;
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
    }

    private final void validateModification() {
        if (SnapshotStateListKt.getStructure(this.list) == this.structure) {
            return;
        }
        o.a();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        validateModification();
        this.list.add(this.index + 1, t);
        this.lastRequested = -1;
        this.index++;
        this.structure = SnapshotStateListKt.getStructure(this.list);
    }

    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i = this.index + 1;
        this.lastRequested = i;
        SnapshotStateListKt.validateRange(i, this.list.size());
        T t = this.list.get(i);
        this.index = i;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i = this.index;
        this.lastRequested = i;
        this.index--;
        return this.list.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.lastRequested);
        this.index--;
        this.lastRequested = -1;
        this.structure = SnapshotStateListKt.getStructure(this.list);
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        validateModification();
        int i = this.lastRequested;
        if (i >= 0) {
            this.list.set(i, t);
            this.structure = SnapshotStateListKt.getStructure(this.list);
        } else {
            SnapshotStateListKt.invalidIteratorSet();
            o.j();
        }
    }
}
