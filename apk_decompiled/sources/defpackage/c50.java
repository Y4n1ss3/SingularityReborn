package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c50 extends mn implements yq {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c50.class, "runningWorkers$volatile");
    public static final /* synthetic */ long k = dc.a.objectFieldOffset(c50.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ yq d;
    public final mn e;
    public final int f;
    public final String g;
    public final e60 h;
    public final Object i;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public c50(mn mnVar, int i, String str) {
        yq yqVar = mnVar instanceof yq ? (yq) mnVar : null;
        this.d = yqVar == null ? fq.a : yqVar;
        this.e = mnVar;
        this.f = i;
        this.g = str;
        this.h = new e60();
        this.i = new Object();
    }

    @Override // defpackage.yq
    public final qr c(long j2, Runnable runnable, kn knVar) {
        return this.d.c(j2, runnable, knVar);
    }

    @Override // defpackage.yq
    public final void d(long j2, gg ggVar) {
        this.d.d(j2, ggVar);
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        Runnable g;
        this.h.a(runnable);
        if (dc.a.getIntVolatile(this, k) >= this.f || !i() || (g = g()) == null) {
            return;
        }
        this.e.dispatch(this, new z3(this, g));
    }

    @Override // defpackage.mn
    public final void dispatchYield(kn knVar, Runnable runnable) {
        Runnable g;
        this.h.a(runnable);
        if (dc.a.getIntVolatile(this, k) >= this.f || !i() || (g = g()) == null) {
            return;
        }
        this.e.dispatchYield(this, new z3(this, g));
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean i() {
        synchronized (this.i) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            if (dc.a.getIntVolatile(this, k) >= this.f) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        cq.e(i);
        return i >= this.f ? str != null ? new pb0(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.mn
    public final String toString() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(".limitedParallelism(");
        return fc.e(sb, this.f, ')');
    }
}
