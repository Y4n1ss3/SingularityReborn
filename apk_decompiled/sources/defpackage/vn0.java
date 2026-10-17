package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class vn0 {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final x6 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = dc.a;
        f = unsafe.objectFieldOffset(vn0.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(vn0.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(vn0.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(vn0.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(vn0.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(vn0.class.getDeclaredField("_availablePermits$volatile"));
    }

    public vn0() {
        xn0 xn0Var = new xn0(0L, null, 2);
        this.head$volatile = xn0Var;
        this.tail$volatile = xn0Var;
        this._availablePermits$volatile = 1;
        this.a = new x6(this, 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r5.e() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nb0 nb0Var) {
        Object o;
        long j;
        vn0 vn0Var = this;
        while (true) {
            int andDecrement = d.getAndDecrement(vn0Var);
            if (andDecrement <= 1) {
                ny nyVar = vn0Var.a;
                Object obj = w01.a;
                if (andDecrement > 0) {
                    nb0Var.k(obj, nyVar);
                    return;
                }
                Unsafe unsafe = dc.a;
                long j2 = g;
                xn0 xn0Var = (xn0) unsafe.getObjectVolatile(vn0Var, j2);
                long andIncrement = c.getAndIncrement(vn0Var);
                tn0 tn0Var = tn0.d;
                long j3 = andIncrement / wn0.f;
                while (true) {
                    o = cq.o(xn0Var, j3, tn0Var);
                    if (d41.D(o)) {
                        break;
                    }
                    dn0 z = d41.z(o);
                    while (true) {
                        dn0 dn0Var = (dn0) dc.a.getObjectVolatile(vn0Var, j2);
                        if (dn0Var.d >= z.d) {
                            vn0Var = this;
                            break;
                        }
                        if (!z.i()) {
                            break;
                        }
                        while (true) {
                            Unsafe unsafe2 = dc.a;
                            j = j3;
                            vn0Var = this;
                            if (unsafe2.compareAndSwapObject(vn0Var, g, dn0Var, z)) {
                                if (dn0Var.e()) {
                                    dn0Var.d();
                                }
                            } else if (unsafe2.getObjectVolatile(vn0Var, j2) != dn0Var) {
                                break;
                            } else {
                                j3 = j;
                            }
                        }
                        j3 = j;
                    }
                    vn0Var = this;
                }
                xn0 xn0Var2 = (xn0) d41.z(o);
                AtomicReferenceArray atomicReferenceArray = xn0Var2.g;
                int i = (int) (andIncrement % wn0.f);
                while (!atomicReferenceArray.compareAndSet(i, null, nb0Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        ox oxVar = wn0.b;
                        ox oxVar2 = wn0.c;
                        while (!atomicReferenceArray.compareAndSet(i, oxVar, oxVar2)) {
                            if (atomicReferenceArray.get(i) != oxVar) {
                                break;
                            }
                        }
                        nb0Var.k(obj, nyVar);
                        return;
                    }
                }
                nb0Var.a(xn0Var2, i);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r5.e() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object o;
        boolean z;
        boolean z2;
        long j;
        long j2;
        vn0 vn0Var = this;
        do {
            int andIncrement = d.getAndIncrement(vn0Var);
            boolean z3 = true;
            if (andIncrement >= 1) {
                while (true) {
                    Unsafe unsafe = dc.a;
                    long j3 = e;
                    int intVolatile = unsafe.getIntVolatile(vn0Var, j3);
                    if (intVolatile <= 1 || unsafe.compareAndSwapInt(vn0Var, j3, intVolatile, 1)) {
                        break;
                    } else {
                        vn0Var = this;
                    }
                }
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = dc.a;
            long j4 = f;
            xn0 xn0Var = (xn0) unsafe2.getObjectVolatile(vn0Var, j4);
            long andIncrement2 = b.getAndIncrement(vn0Var);
            long j5 = andIncrement2 / wn0.f;
            un0 un0Var = un0.d;
            while (true) {
                o = cq.o(xn0Var, j5, un0Var);
                if (d41.D(o)) {
                    z = z3;
                    break;
                }
                dn0 z4 = d41.z(o);
                while (true) {
                    dn0 dn0Var = (dn0) dc.a.getObjectVolatile(vn0Var, j4);
                    z = z3;
                    j = j4;
                    if (dn0Var.d >= z4.d) {
                        break;
                    }
                    if (!z4.i()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = dc.a;
                        if (!unsafe3.compareAndSwapObject(vn0Var, f, dn0Var, z4)) {
                            j2 = j;
                            if (unsafe3.getObjectVolatile(vn0Var, j2) != dn0Var) {
                                break;
                            } else {
                                j = j2;
                            }
                        } else if (dn0Var.e()) {
                            dn0Var.d();
                        }
                    }
                    j4 = j2;
                    z3 = z;
                }
                z3 = z;
                j4 = j;
            }
            xn0 xn0Var2 = (xn0) d41.z(o);
            AtomicReferenceArray atomicReferenceArray = xn0Var2.g;
            xn0Var2.a();
            boolean z5 = false;
            if (xn0Var2.d <= j5) {
                int i = (int) (andIncrement2 % wn0.f);
                Object andSet = atomicReferenceArray.getAndSet(i, wn0.b);
                if (andSet == null) {
                    int i2 = wn0.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (atomicReferenceArray.get(i) != wn0.c) {
                        }
                    }
                    ox oxVar = wn0.b;
                    ox oxVar2 = wn0.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, oxVar, oxVar2)) {
                            if (atomicReferenceArray.get(i) != oxVar) {
                                break;
                            }
                        } else {
                            z5 = z;
                            break;
                        }
                    }
                    z2 = !z5;
                } else if (andSet != wn0.e) {
                    if (!(andSet instanceof fg)) {
                        o.p(andSet, "unexpected: ");
                        return;
                    }
                    fg fgVar = (fg) andSet;
                    ox c2 = fgVar.c(w01.a, vn0Var.a);
                    if (c2 != null) {
                        fgVar.o(c2);
                    }
                }
                z2 = z;
                break;
            }
            z2 = false;
        } while (!z2);
    }
}
