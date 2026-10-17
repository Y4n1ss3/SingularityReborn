package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class e60 {
    public static final /* synthetic */ long a = dc.a.objectFieldOffset(e60.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new g60(8, false);

    public final boolean a(Runnable runnable) {
        e60 e60Var;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = a;
            g60 g60Var = (g60) unsafe.getObjectVolatile(this, j);
            int a2 = g60Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                g60 c = g60Var.c();
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    e60Var = this;
                    if (!unsafe2.compareAndSwapObject(e60Var, a, g60Var, c) && unsafe2.getObjectVolatile(e60Var, j) == g60Var) {
                        this = e60Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                e60Var = this;
            }
            this = e60Var;
        }
    }

    public final void b() {
        e60 e60Var;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = a;
            g60 g60Var = (g60) unsafe.getObjectVolatile(this, j);
            if (g60Var.b()) {
                return;
            }
            g60 c = g60Var.c();
            while (true) {
                e60Var = this;
                if (!dc.a.compareAndSwapObject(e60Var, a, g60Var, c) && dc.a.getObjectVolatile(e60Var, j) == g60Var) {
                    this = e60Var;
                }
            }
            this = e60Var;
        }
    }

    public final int c() {
        g60 g60Var = (g60) dc.a.getObjectVolatile(this, a);
        g60Var.getClass();
        long longVolatile = dc.a.getLongVolatile(g60Var, g60.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        e60 e60Var;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = a;
            g60 g60Var = (g60) unsafe.getObjectVolatile(this, j);
            Object d = g60Var.d();
            if (d != g60.e) {
                return d;
            }
            g60 c = g60Var.c();
            while (true) {
                e60Var = this;
                if (!dc.a.compareAndSwapObject(e60Var, a, g60Var, c) && dc.a.getObjectVolatile(e60Var, j) == g60Var) {
                    this = e60Var;
                }
            }
            this = e60Var;
        }
    }
}
