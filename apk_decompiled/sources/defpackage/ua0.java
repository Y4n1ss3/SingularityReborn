package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ua0 implements ListIterator, n20 {
    public final List d;
    public int e;

    public ua0(List list, int i) {
        this.d = list;
        this.e = i - 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e + 1;
        this.e = i;
        this.d.add(i, obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e + 1;
        this.e = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        this.e = i - 1;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.d.remove(this.e);
        this.e--;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.d.set(this.e, obj);
    }
}
