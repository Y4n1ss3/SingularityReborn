package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class kl {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = dc.a;
        a = unsafe.objectFieldOffset(kl.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(kl.class.getDeclaredField("_prev$volatile"));
    }

    public kl(dn0 dn0Var) {
        this._prev$volatile = dn0Var;
    }

    public final void a() {
        dc.a.putObjectVolatile(this, b, (Object) null);
    }

    public final kl b() {
        Object objectVolatile = dc.a.getObjectVolatile(this, a);
        if (objectVolatile == cq.b) {
            return null;
        }
        return (kl) objectVolatile;
    }

    public abstract boolean c();

    public final void d() {
        kl klVar;
        Unsafe unsafe;
        if (b() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = dc.a;
            long j = b;
            kl klVar2 = (kl) unsafe2.getObjectVolatile(this, j);
            while (klVar2 != null && klVar2.c()) {
                klVar2 = (kl) dc.a.getObjectVolatile(klVar2, j);
            }
            kl b2 = b();
            b2.getClass();
            do {
                klVar = b2;
                if (!klVar.c()) {
                    break;
                } else {
                    b2 = klVar.b();
                }
            } while (b2 != null);
            while (true) {
                Object objectVolatile = dc.a.getObjectVolatile(klVar, j);
                kl klVar3 = ((kl) objectVolatile) == null ? null : klVar2;
                do {
                    unsafe = dc.a;
                    if (unsafe.compareAndSwapObject(klVar, b, objectVolatile, klVar3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(klVar, j) == objectVolatile);
            }
            if (klVar2 != null) {
                unsafe.putObjectVolatile(klVar2, a, klVar);
            }
            if (!klVar.c() || klVar.b() == null) {
                if (klVar2 == null || !klVar2.c()) {
                    return;
                }
            }
        }
    }
}
