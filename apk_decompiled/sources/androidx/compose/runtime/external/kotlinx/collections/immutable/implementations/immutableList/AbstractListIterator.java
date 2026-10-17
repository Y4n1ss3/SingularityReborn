package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.n20;
import defpackage.o;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AbstractListIterator<E> implements ListIterator<E>, n20 {
    public static final int $stable = 8;
    private int index;
    private int size;

    public AbstractListIterator(int i, int i2) {
        this.index = i;
        this.size = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime() {
        if (hasNext()) {
            return;
        }
        o.q();
    }

    public final void checkHasPrevious$runtime() {
        if (hasPrevious()) {
            return;
        }
        o.q();
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }
}
