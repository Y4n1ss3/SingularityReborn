package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rz extends mn implements yq {
    public final Handler d;
    public final String e;
    public final boolean f;
    public final rz g;

    public rz(Handler handler, String str, boolean z) {
        this.d = handler;
        this.e = str;
        this.f = z;
        this.g = z ? this : new rz(handler, str, true);
    }

    @Override // defpackage.yq
    public final qr c(long j, final Runnable runnable, kn knVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.d.postDelayed(runnable, j)) {
            return new qr() { // from class: qz
                @Override // defpackage.qr
                public final void dispose() {
                    rz.this.d.removeCallbacks(runnable);
                }
            };
        }
        g(knVar, runnable);
        return tc0.d;
    }

    @Override // defpackage.yq
    public final void d(long j, gg ggVar) {
        z3 z3Var = new z3(2, ggVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.d.postDelayed(z3Var, j)) {
            ggVar.d(new g(21, this, z3Var));
        } else {
            g(ggVar.h, z3Var);
        }
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        if (this.d.post(runnable)) {
            return;
        }
        g(knVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return rzVar.d == this.d && rzVar.f == this.f;
    }

    public final void g(kn knVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        z10 z10Var = (z10) knVar.get(ts.l);
        if (z10Var != null) {
            z10Var.cancel(cancellationException);
        }
        nq nqVar = nr.a;
        hq.d.dispatch(knVar, runnable);
    }

    public final int hashCode() {
        return (this.f ? 1231 : 1237) ^ System.identityHashCode(this.d);
    }

    @Override // defpackage.mn
    public final boolean isDispatchNeeded(kn knVar) {
        return (this.f && q10.b(Looper.myLooper(), this.d.getLooper())) ? false : true;
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        cq.e(i);
        return str != null ? new pb0(this, str) : this;
    }

    @Override // defpackage.mn
    public final String toString() {
        rz rzVar;
        String str;
        nq nqVar = nr.a;
        rz rzVar2 = f80.a;
        if (this == rzVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                rzVar = rzVar2.g;
            } catch (UnsupportedOperationException unused) {
                rzVar = null;
            }
            str = this == rzVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.e;
        if (str2 == null) {
            str2 = this.d.toString();
        }
        if (!this.f) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public rz(Handler handler) {
        this(handler, null, false);
    }
}
