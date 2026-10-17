package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g0 extends p10 {
    @Override // defpackage.p10
    public final void B(h0 h0Var, h0 h0Var2) {
        h0Var.b = h0Var2;
    }

    @Override // defpackage.p10
    public final void C(h0 h0Var, Thread thread) {
        h0Var.a = thread;
    }

    @Override // defpackage.p10
    public final boolean i(i0 i0Var, e0 e0Var) {
        e0 e0Var2 = e0.b;
        synchronized (i0Var) {
            try {
                if (i0Var.e != e0Var) {
                    return false;
                }
                i0Var.e = e0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p10
    public final boolean j(i0 i0Var, Object obj, Object obj2) {
        synchronized (i0Var) {
            try {
                if (i0Var.d != obj) {
                    return false;
                }
                i0Var.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p10
    public final boolean k(i0 i0Var, h0 h0Var, h0 h0Var2) {
        synchronized (i0Var) {
            try {
                if (i0Var.f != h0Var) {
                    return false;
                }
                i0Var.f = h0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
