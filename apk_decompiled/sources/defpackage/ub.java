package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ub implements Iterator, n20 {
    public int d;
    public int e;
    public boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ub(yb ybVar, int i) {
        this(ybVar.f);
        this.g = i;
        switch (i) {
            case 1:
                this.h = ybVar;
                this(ybVar.f);
                break;
            default:
                this.h = ybVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            o.q();
            return null;
        }
        int i = this.e;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                e = ((yb) obj).e(i);
                break;
            case 1:
                e = ((yb) obj).h(i);
                break;
            default:
                e = ((zb) obj).e[i];
                break;
        }
        this.e++;
        this.f = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            o.f("Call next() before removing an element.");
            return;
        }
        int i = this.e - 1;
        this.e = i;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                ((yb) obj).f(i);
                break;
            case 1:
                ((yb) obj).f(i);
                break;
            default:
                ((zb) obj).a(i);
                break;
        }
        this.d--;
        this.f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ub(zb zbVar) {
        this(zbVar.f);
        this.g = 2;
        this.h = zbVar;
    }

    public ub(int i) {
        this.d = i;
    }
}
