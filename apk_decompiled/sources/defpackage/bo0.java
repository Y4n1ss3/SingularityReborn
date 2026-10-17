package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bo0 extends co0 implements Iterator, hm, n20 {
    public int d;
    public Object e;
    public hm f;

    @Override // defpackage.co0
    public final void a(hm hmVar, Object obj) {
        this.e = obj;
        this.d = 3;
        this.f = hmVar;
        hmVar.getClass();
    }

    public final RuntimeException b() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return st.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            hm hmVar = this.f;
            hmVar.getClass();
            this.f = null;
            hmVar.resumeWith(w01.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            o.q();
            return null;
        }
        if (i == 2) {
            this.d = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        p10.Q(obj);
        this.d = 4;
    }
}
