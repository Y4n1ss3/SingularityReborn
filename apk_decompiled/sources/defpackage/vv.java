package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vv implements Iterator, n20 {
    public final Iterator d;
    public int e = -1;
    public Object f;
    public final /* synthetic */ wv g;

    public vv(wv wvVar) {
        this.g = wvVar;
        this.d = wvVar.a.iterator();
    }

    public final void a() {
        Object next;
        wv wvVar;
        do {
            Iterator it = this.d;
            if (!it.hasNext()) {
                this.e = 0;
                return;
            } else {
                next = it.next();
                wvVar = this.g;
            }
        } while (((Boolean) wvVar.c.invoke(next)).booleanValue() != wvVar.b);
        this.f = next;
        this.e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == -1) {
            a();
        }
        return this.e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e == -1) {
            a();
        }
        if (this.e == 0) {
            o.q();
            return null;
        }
        Object obj = this.f;
        this.f = null;
        this.e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
