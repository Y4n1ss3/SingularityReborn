package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class q00 implements Iterator, n20 {
    public final /* synthetic */ int d = 0;
    public int e;
    public final Iterator f;

    public q00(kt0 kt0Var) {
        this.e = kt0Var.b;
        this.f = kt0Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.f.hasNext();
            default:
                return this.e > 0 && this.f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                int i = this.e;
                this.e = i + 1;
                if (i >= 0) {
                    return new p00(i, this.f.next());
                }
                y80.V();
                throw null;
            default:
                int i2 = this.e;
                if (i2 != 0) {
                    this.e = i2 - 1;
                    return this.f.next();
                }
                o.q();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q00(Iterator it) {
        it.getClass();
        this.f = it;
    }
}
