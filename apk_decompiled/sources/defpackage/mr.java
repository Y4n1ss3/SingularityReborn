package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class mr extends lt0 {
    public int f;

    public mr(int i) {
        super(0L, false);
        this.f = i;
    }

    public abstract hm e();

    public Throwable f(Object obj) {
        sj sjVar = obj instanceof sj ? (sj) obj : null;
        if (sjVar != null) {
            return sjVar.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        cq.u(e().getContext(), new yn("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.z10) r5.get(defpackage.ts.l);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            hm e = e();
            e.getClass();
            kr krVar = (kr) e;
            hm hmVar = krVar.h;
            Object obj = krVar.j;
            kn context = hmVar.getContext();
            Object X = y80.X(context, obj);
            z10 z10Var = null;
            u01 G = X != y80.i ? p01.G(hmVar, context, X) : null;
            try {
                kn context2 = hmVar.getContext();
                Object i = i();
                Throwable f = f(i);
                if (f == null) {
                    int i2 = this.f;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                }
                if (z10Var != null && !z10Var.isActive()) {
                    CancellationException f2 = z10Var.f();
                    b(f2);
                    hmVar.resumeWith(p10.p(f2));
                } else if (f != null) {
                    hmVar.resumeWith(new jj0(f));
                } else {
                    hmVar.resumeWith(g(i));
                }
                if (G != null && !G.a0()) {
                    return;
                }
                y80.N(context, X);
            } catch (Throwable th) {
                if (G == null || G.a0()) {
                    y80.N(context, X);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
