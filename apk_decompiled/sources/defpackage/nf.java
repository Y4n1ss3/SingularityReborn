package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nf implements f21 {
    public Object d = qf.p;
    public gg e;
    public final /* synthetic */ of f;

    public nf(of ofVar) {
        this.f = ofVar;
    }

    @Override // defpackage.f21
    public final void a(dn0 dn0Var, int i) {
        gg ggVar = this.e;
        if (ggVar != null) {
            ggVar.a(dn0Var, i);
        }
    }

    public final Object b(im imVar) {
        kh khVar;
        kh khVar2;
        Object obj = this.d;
        boolean z = true;
        if (obj == qf.p || obj == qf.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = of.i;
            of ofVar = this.f;
            kh khVar3 = (kh) atomicReferenceFieldUpdater.get(ofVar);
            while (true) {
                if (ofVar.u()) {
                    this.d = qf.l;
                    Throwable l = ofVar.l();
                    if (l != null) {
                        int i = qr0.a;
                        throw l;
                    }
                    z = false;
                } else {
                    long andIncrement = of.f.getAndIncrement(ofVar);
                    long j = qf.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (khVar3.d != j2) {
                        kh f = ofVar.f(j2, khVar3);
                        if (f == null) {
                            continue;
                        } else {
                            khVar = f;
                        }
                    } else {
                        khVar = khVar3;
                    }
                    Object E = ofVar.E(khVar, i2, andIncrement, null);
                    ox oxVar = qf.m;
                    if (E == oxVar) {
                        o.f("unreachable");
                        return null;
                    }
                    ox oxVar2 = qf.o;
                    if (E == oxVar2) {
                        if (andIncrement < ofVar.q()) {
                            khVar.a();
                        }
                        khVar3 = khVar;
                    } else {
                        if (E == qf.n) {
                            gg w = y80.w(d41.C(imVar));
                            try {
                                this.e = w;
                                Object E2 = ofVar.E(khVar, i2, andIncrement, this);
                                if (E2 == oxVar) {
                                    a(khVar, i2);
                                } else {
                                    if (E2 == oxVar2) {
                                        if (andIncrement < ofVar.q()) {
                                            khVar.a();
                                        }
                                        kh khVar4 = (kh) of.i.get(ofVar);
                                        while (true) {
                                            if (ofVar.u()) {
                                                gg ggVar = this.e;
                                                ggVar.getClass();
                                                this.e = null;
                                                this.d = qf.l;
                                                Throwable l2 = ofVar.l();
                                                if (l2 == null) {
                                                    ggVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    ggVar.resumeWith(new jj0(l2));
                                                }
                                            } else {
                                                long andIncrement2 = of.f.getAndIncrement(ofVar);
                                                long j3 = qf.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (khVar4.d != j4) {
                                                    kh f2 = ofVar.f(j4, khVar4);
                                                    if (f2 != null) {
                                                        khVar2 = f2;
                                                    }
                                                } else {
                                                    khVar2 = khVar4;
                                                }
                                                Object E3 = ofVar.E(khVar2, i3, andIncrement2, this);
                                                kh khVar5 = khVar2;
                                                if (E3 == qf.m) {
                                                    a(khVar5, i3);
                                                    break;
                                                }
                                                if (E3 == qf.o) {
                                                    if (andIncrement2 < ofVar.q()) {
                                                        khVar5.a();
                                                    }
                                                    khVar4 = khVar5;
                                                } else {
                                                    if (E3 == qf.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    khVar5.a();
                                                    this.d = E3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        khVar.a();
                                        this.d = E2;
                                        this.e = null;
                                    }
                                    w.k(Boolean.TRUE, null);
                                }
                                return w.s();
                            } catch (Throwable th) {
                                w.A();
                                throw th;
                            }
                        }
                        khVar.a();
                        this.d = E;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.d;
        ox oxVar = qf.p;
        if (obj == oxVar) {
            o.f("`hasNext()` has not been invoked");
            return null;
        }
        this.d = oxVar;
        if (obj != qf.l) {
            return obj;
        }
        Throwable n = this.f.n();
        int i = qr0.a;
        throw n;
    }
}
