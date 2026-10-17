package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class n implements Iterator, n20 {
    public int d;
    public Object e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 0) {
            this.d = 3;
            a();
            return this.d == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        o.m("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 1) {
            this.d = 0;
            return this.e;
        }
        if (i != 2) {
            this.d = 3;
            a();
            if (this.d == 1) {
                this.d = 0;
                return this.e;
            }
        }
        o.q();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
