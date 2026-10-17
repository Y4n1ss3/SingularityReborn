package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class d20 extends d60 implements qr, n00 {
    public i20 g;

    @Override // defpackage.n00
    public final rc0 b() {
        return null;
    }

    @Override // defpackage.qr
    public final void dispose() {
        d20 d20Var;
        Unsafe unsafe;
        long j;
        i20 j2 = j();
        while (true) {
            Object E = j2.E();
            if (E instanceof d20) {
                if (E != this) {
                    return;
                }
                pt ptVar = d41.h;
                do {
                    unsafe = dc.a;
                    j = i20.e;
                    if (unsafe.compareAndSwapObject(j2, j, E, ptVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == E);
            } else {
                if (!(E instanceof n00) || ((n00) E).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof pi0) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    d60 d60Var = (d60) f;
                    Unsafe unsafe2 = dc.a;
                    long j3 = d60.f;
                    pi0 pi0Var = (pi0) unsafe2.getObjectVolatile(d60Var, j3);
                    if (pi0Var == null) {
                        pi0Var = new pi0(d60Var);
                        unsafe2.putObjectVolatile(d60Var, j3, pi0Var);
                    }
                    pi0 pi0Var2 = pi0Var;
                    while (true) {
                        Unsafe unsafe3 = dc.a;
                        long j4 = d60.d;
                        d20Var = this;
                        if (unsafe3.compareAndSwapObject(d20Var, j4, f, pi0Var2)) {
                            d60Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(d20Var, j4) != f) {
                            break;
                        } else {
                            this = d20Var;
                        }
                    }
                    this = d20Var;
                }
            }
        }
    }

    public z10 getParent() {
        return j();
    }

    @Override // defpackage.n00
    public final boolean isActive() {
        return true;
    }

    public final i20 j() {
        i20 i20Var = this.g;
        if (i20Var != null) {
            return i20Var;
        }
        q10.H("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.d60
    public final String toString() {
        return getClass().getSimpleName() + '@' + cq.r(this) + "[job@" + cq.r(j()) + ']';
    }
}
