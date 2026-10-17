package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class k extends i20 implements hm, un {
    public final kn f;

    public k(kn knVar, boolean z) {
        super(z);
        H((z10) knVar.get(ts.l));
        this.f = knVar.plus(this);
    }

    @Override // defpackage.i20
    public final void G(tj tjVar) {
        cq.u(this.f, tjVar);
    }

    @Override // defpackage.i20
    public final void P(Object obj) {
        if (!(obj instanceof sj)) {
            Y(obj);
        } else {
            sj sjVar = (sj) obj;
            X(sjVar.a, dc.a.getIntVolatile(sjVar, sj.b) != 0);
        }
    }

    public final void Z(xn xnVar, k kVar, my myVar) {
        Object invoke;
        int ordinal = xnVar.ordinal();
        w01 w01Var = w01.a;
        if (ordinal == 0) {
            try {
                q10.B(d41.C(d41.g(kVar, this, myVar)), w01Var);
                return;
            } finally {
                resumeWith(new jj0(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                myVar.getClass();
                d41.C(d41.g(kVar, this, myVar)).resumeWith(w01Var);
                return;
            }
            if (ordinal != 3) {
                o.n();
                return;
            }
            try {
                kn knVar = this.f;
                Object X = y80.X(knVar, null);
                try {
                    if (myVar instanceof mc) {
                        p01.f(2, myVar);
                        invoke = myVar.invoke(kVar, this);
                    } else {
                        invoke = d41.S(myVar, kVar, this);
                    }
                    y80.N(knVar, X);
                    if (invoke != vn.d) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    y80.N(knVar, X);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return this.f;
    }

    @Override // defpackage.un
    public final kn getCoroutineContext() {
        return this.f;
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        Throwable a = kj0.a(obj);
        if (a != null) {
            obj = new sj(a, false);
        }
        Object L = L(obj);
        if (L == d41.c) {
            return;
        }
        q(L);
    }

    @Override // defpackage.i20
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void Y(Object obj) {
    }

    public void X(Throwable th, boolean z) {
    }
}
