package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ll extends of {
    public final mf s;

    public ll(int i, mf mfVar) {
        super(i);
        this.s = mfVar;
        if (mfVar == mf.d) {
            o.h("This implementation does not support suspension for senders, use ", ki0.a(of.class).b(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        o.c(j50.i(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(Object obj, boolean z) {
        mf mfVar = this.s;
        mf mfVar2 = mf.f;
        w01 w01Var = w01.a;
        if (mfVar == mfVar2) {
            Object m = super.m(obj);
            return (!(m instanceof jh) || (m instanceof ih)) ? m : w01Var;
        }
        Object obj2 = qf.d;
        kh khVar = (kh) dc.a.getObjectVolatile(this, of.q);
        while (true) {
            long andIncrement = of.e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean t = t(andIncrement, false);
            int i = qf.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (khVar.d != j3) {
                kh h = h(j3, khVar);
                if (h != null) {
                    khVar = h;
                } else if (t) {
                    return new ih(p());
                }
            }
            int F = F(khVar, i2, obj, j, obj2, t);
            if (F == 0) {
                khVar.a();
                return w01Var;
            }
            if (F == 1) {
                break;
            }
            if (F != 2) {
                if (F == 3) {
                    o.f("unexpected");
                    return null;
                }
                if (F == 4) {
                    if (j < o()) {
                        khVar.a();
                    }
                    return new ih(p());
                }
                if (F == 5) {
                    khVar.a();
                }
            } else {
                if (t) {
                    khVar.h();
                    return new ih(p());
                }
                f21 f21Var = obj2 instanceof f21 ? (f21) obj2 : null;
                if (f21Var != null) {
                    f21Var.a(khVar, i2 + i);
                }
                d((khVar.d * j2) + i2);
            }
        }
    }

    @Override // defpackage.of, defpackage.yn0
    public final Object j(hm hmVar, Object obj) {
        if (I(obj, true) instanceof ih) {
            throw p();
        }
        return w01.a;
    }

    @Override // defpackage.of, defpackage.yn0
    public final Object m(Object obj) {
        return I(obj, false);
    }

    @Override // defpackage.of
    public final boolean w() {
        return this.s == mf.e;
    }
}
