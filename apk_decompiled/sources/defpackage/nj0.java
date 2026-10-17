package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nj0 implements ListIterator, n20 {
    public final ListIterator d;
    public final /* synthetic */ s80 e;

    public nj0(s80 s80Var, int i) {
        this.e = s80Var;
        List list = (List) s80Var.e;
        if (i >= 0 && i <= s80Var.size()) {
            this.d = list.listIterator(s80Var.size() - i);
            return;
        }
        StringBuilder f = kp0.f(i, "Position index ", " must be in range [");
        f.append(new k10(0, s80Var.size(), 1));
        f.append("].");
        throw new IndexOutOfBoundsException(f.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.d.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.e.size() - 1) - this.d.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.d.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.e.size() - 1) - this.d.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
