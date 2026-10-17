package androidx.compose.runtime.snapshots;

import defpackage.hi0;
import defpackage.n20;
import defpackage.tj;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, n20 {
    final /* synthetic */ hi0 $current;
    final /* synthetic */ SubList<T> this$0;

    public SubList$listIterator$1(hi0 hi0Var, SubList<T> subList) {
        this.$current = hi0Var;
        this.this$0 = subList;
    }

    @Override // java.util.ListIterator
    public Void add(T t) {
        SnapshotStateListKt.modificationError();
        throw new tj();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$current.d < this.this$0.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$current.d >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i = this.$current.d + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.d = i;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.d + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i = this.$current.d;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.d = i - 1;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.d;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new tj();
    }

    @Override // java.util.ListIterator
    public Void set(T t) {
        SnapshotStateListKt.modificationError();
        throw new tj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }
}
