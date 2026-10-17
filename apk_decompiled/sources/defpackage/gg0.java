package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gg0 extends k implements zg, yn0 {
    public final of g;

    public gg0(kn knVar, of ofVar) {
        super(knVar, true);
        this.g = ofVar;
    }

    @Override // defpackage.k
    public final void X(Throwable th, boolean z) {
        if (this.g.b(th, false) || z) {
            return;
        }
        cq.u(this.f, th);
    }

    @Override // defpackage.k
    public final void Y(Object obj) {
        cq.g(this.g);
    }

    public final void a0(ab abVar) {
        Unsafe unsafe;
        Unsafe unsafe2;
        of ofVar = this.g;
        ofVar.getClass();
        long j = of.m;
        do {
            unsafe = dc.a;
            if (unsafe.compareAndSwapObject(ofVar, of.m, (Object) null, abVar)) {
                return;
            }
        } while (unsafe.getObjectVolatile(ofVar, j) == null);
        while (true) {
            Object objectVolatile = dc.a.getObjectVolatile(ofVar, j);
            ox oxVar = qf.q;
            if (objectVolatile != oxVar) {
                if (objectVolatile == qf.r) {
                    o.f("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    o.p(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            ox oxVar2 = qf.r;
            do {
                unsafe2 = dc.a;
                if (unsafe2.compareAndSwapObject(ofVar, of.m, oxVar, oxVar2)) {
                    abVar.invoke(ofVar.l());
                    return;
                }
            } while (unsafe2.getObjectVolatile(ofVar, j) == oxVar);
        }
    }

    @Override // defpackage.i20, defpackage.z10, defpackage.zg
    public final void cancel(CancellationException cancellationException) {
        Object E = E();
        if (E instanceof sj) {
            return;
        }
        if ((E instanceof g20) && ((g20) E).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a20(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // defpackage.zg
    public final Object g() {
        return this.g.g();
    }

    @Override // defpackage.zg
    public final Object i(hm hmVar) {
        return this.g.i(hmVar);
    }

    @Override // defpackage.zg
    public final nf iterator() {
        of ofVar = this.g;
        ofVar.getClass();
        return new nf(ofVar);
    }

    @Override // defpackage.yn0
    public final Object j(hm hmVar, Object obj) {
        return this.g.j(hmVar, obj);
    }

    @Override // defpackage.yn0
    public final Object m(Object obj) {
        return this.g.m(obj);
    }

    @Override // defpackage.i20
    public final void t(CancellationException cancellationException) {
        this.g.b(cancellationException, true);
        s(cancellationException);
    }
}
