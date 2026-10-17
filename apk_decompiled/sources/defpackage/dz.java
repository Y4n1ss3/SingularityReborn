package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dz implements Iterator, n20 {
    public final /* synthetic */ int d = 1;
    public int e = -1;
    public Object f;
    public final /* synthetic */ Object g;

    public dz(ib0 ib0Var) {
        this.g = ib0Var;
        this.f = p10.y(new hb0(ib0Var, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.e;
        br brVar = (br) this.g;
        if (i == -2) {
            invoke = ((iy) brVar.b).invoke();
        } else {
            ky kyVar = (ky) brVar.c;
            Object obj = this.f;
            obj.getClass();
            invoke = kyVar.invoke(obj);
        }
        this.f = invoke;
        this.e = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 1) {
                }
                break;
        }
        return ((bo0) this.f).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    o.q();
                    break;
                } else {
                    Object obj = this.f;
                    obj.getClass();
                    this.e = -1;
                    break;
                }
        }
        return ((bo0) this.f).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        Object obj = this.g;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.e;
                if (i2 != -1) {
                    ((ab0) obj).e.h(i2);
                    this.e = -1;
                    return;
                }
                return;
            default:
                int i3 = this.e;
                if (i3 != -1) {
                    ((ib0) obj).e.n(i3);
                    this.e = -1;
                    return;
                }
                return;
        }
    }

    public dz(br brVar) {
        this.g = brVar;
    }

    public dz(ab0 ab0Var) {
        this.g = ab0Var;
        this.f = p10.y(new za0(ab0Var, this, null));
    }
}
