package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class dn0 extends kl implements vc0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dn0.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = dc.a.objectFieldOffset(dn0.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public dn0(long j, dn0 dn0Var, int i) {
        super(dn0Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.kl
    public final boolean c() {
        return dc.a.getIntVolatile(this, f) == f() && b() != null;
    }

    public final boolean e() {
        return e.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, kn knVar);

    public final void h() {
        if (e.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        while (true) {
            Unsafe unsafe = dc.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.f() && this.b() != null) {
                return false;
            }
            dn0 dn0Var = this;
            if (unsafe.compareAndSwapInt(dn0Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = dn0Var;
        }
    }
}
