package defpackage;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class of implements zg {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(of.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = dc.a;
        r = unsafe.objectFieldOffset(of.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(of.class, "receivers$volatile");
        p = unsafe.objectFieldOffset(of.class.getDeclaredField("receivers$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(of.class, "bufferEnd$volatile");
        k = unsafe.objectFieldOffset(of.class.getDeclaredField("bufferEnd$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(of.class, "completedExpandBuffersAndPauseFlag$volatile");
        n = unsafe.objectFieldOffset(of.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        q = unsafe.objectFieldOffset(of.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(of.class, Object.class, "receiveSegment$volatile");
        o = unsafe.objectFieldOffset(of.class.getDeclaredField("receiveSegment$volatile"));
        l = unsafe.objectFieldOffset(of.class.getDeclaredField("bufferEndSegment$volatile"));
        j = unsafe.objectFieldOffset(of.class.getDeclaredField("_closeCause$volatile"));
        m = unsafe.objectFieldOffset(of.class.getDeclaredField("closeHandler$volatile"));
    }

    public of(int i2) {
        this.d = i2;
        if (i2 < 0) {
            o.c(j50.i(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        kh khVar = qf.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : SnapshotId_jvmKt.SnapshotIdMax : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = k();
        kh khVar2 = new kh(0L, null, this, 3);
        this.sendSegment$volatile = khVar2;
        this.receiveSegment$volatile = khVar2;
        if (x()) {
            khVar2 = qf.a;
            khVar2.getClass();
        }
        this.bufferEndSegment$volatile = khVar2;
        this._closeCause$volatile = qf.s;
    }

    public static boolean D(Object obj) {
        if (!(obj instanceof fg)) {
            o.p(obj, "Unexpected waiter: ");
            return false;
        }
        fg fgVar = (fg) obj;
        kh khVar = qf.a;
        ox c = fgVar.c(w01.a, null);
        if (c == null) {
            return false;
        }
        fgVar.o(c);
        return true;
    }

    public final void A(Object obj, gg ggVar) {
        ggVar.resumeWith(new jj0(p()));
    }

    public final void B(f21 f21Var, boolean z) {
        if (f21Var instanceof fg) {
            ((hm) f21Var).resumeWith(new jj0(z ? n() : p()));
            return;
        }
        if (!(f21Var instanceof nf)) {
            o.p(f21Var, "Unexpected waiter: ");
            return;
        }
        nf nfVar = (nf) f21Var;
        gg ggVar = nfVar.e;
        ggVar.getClass();
        nfVar.e = null;
        nfVar.d = qf.l;
        Throwable l2 = nfVar.f.l();
        if (l2 == null) {
            ggVar.resumeWith(Boolean.FALSE);
        } else {
            ggVar.resumeWith(new jj0(l2));
        }
    }

    public final boolean C(Object obj, Object obj2) {
        if (!(obj instanceof nf)) {
            if (!(obj instanceof fg)) {
                o.p(obj, "Unexpected receiver type: ");
                return false;
            }
            fg fgVar = (fg) obj;
            kh khVar = qf.a;
            ox c = fgVar.c(obj2, null);
            if (c == null) {
                return false;
            }
            fgVar.o(c);
            return true;
        }
        nf nfVar = (nf) obj;
        gg ggVar = nfVar.e;
        ggVar.getClass();
        nfVar.e = null;
        nfVar.d = obj2;
        Boolean bool = Boolean.TRUE;
        kh khVar2 = qf.a;
        ox c2 = ggVar.c(bool, null);
        if (c2 == null) {
            return false;
        }
        ggVar.o(c2);
        return true;
    }

    public final Object E(kh khVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = khVar.h;
        Object k2 = khVar.k(i2);
        long j3 = r;
        if (k2 == null) {
            if (j2 >= (dc.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return qf.n;
                }
                if (khVar.j(i2, k2, obj)) {
                    e();
                    return qf.m;
                }
            }
        } else if (k2 == qf.d && khVar.j(i2, k2, qf.i)) {
            e();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            khVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = khVar.k(i2);
            if (k3 == null || k3 == qf.e) {
                if (j2 < (dc.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (khVar.j(i2, k3, qf.h)) {
                        e();
                        return qf.o;
                    }
                } else {
                    if (obj == null) {
                        return qf.n;
                    }
                    if (khVar.j(i2, k3, obj)) {
                        e();
                        return qf.m;
                    }
                }
            } else if (k3 != qf.d) {
                ox oxVar = qf.j;
                if (k3 == oxVar) {
                    return qf.o;
                }
                if (k3 == qf.h) {
                    return qf.o;
                }
                if (k3 == qf.l) {
                    e();
                    return qf.o;
                }
                if (k3 != qf.g && khVar.j(i2, k3, qf.f)) {
                    boolean z = k3 instanceof g21;
                    if (z) {
                        k3 = ((g21) k3).a;
                    }
                    if (D(k3)) {
                        khVar.n(i2, qf.i);
                        e();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        khVar.m(i2, null);
                        return obj3;
                    }
                    khVar.n(i2, oxVar);
                    khVar.h();
                    if (z) {
                        e();
                    }
                    return qf.o;
                }
            } else if (khVar.j(i2, k3, qf.i)) {
                e();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                khVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int F(kh khVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        khVar.m(i2, obj);
        if (z) {
            return G(khVar, i2, obj, j2, obj2, z);
        }
        Object k2 = khVar.k(i2);
        if (k2 == null) {
            if (a(j2)) {
                if (khVar.j(i2, null, qf.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (khVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof f21) {
            khVar.m(i2, null);
            if (C(k2, obj)) {
                khVar.n(i2, qf.i);
                return 0;
            }
            ox oxVar = qf.k;
            if (khVar.h.getAndSet((i2 * 2) + 1, oxVar) == oxVar) {
                return 5;
            }
            khVar.l(i2, true);
            return 5;
        }
        return G(khVar, i2, obj, j2, obj2, z);
    }

    public final int G(kh khVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = khVar.k(i2);
            if (k2 == null) {
                if (!a(j2) || z) {
                    if (z) {
                        if (khVar.j(i2, null, qf.j)) {
                            khVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (khVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (khVar.j(i2, null, qf.d)) {
                    break;
                }
            } else {
                if (k2 != qf.e) {
                    ox oxVar = qf.k;
                    if (k2 == oxVar) {
                        khVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == qf.h) {
                        khVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == qf.l) {
                        khVar.m(i2, null);
                        v();
                        return 4;
                    }
                    khVar.m(i2, null);
                    if (k2 instanceof g21) {
                        k2 = ((g21) k2).a;
                    }
                    if (C(k2, obj)) {
                        khVar.n(i2, qf.i);
                        return 0;
                    }
                    if (khVar.h.getAndSet((i2 * 2) + 1, oxVar) != oxVar) {
                        khVar.l(i2, true);
                    }
                    return 5;
                }
                if (khVar.j(i2, k2, qf.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void H(long j2) {
        of ofVar = this;
        if (ofVar.x()) {
            return;
        }
        while (ofVar.k() <= j2) {
            ofVar = this;
        }
        int i2 = qf.c;
        int i3 = 0;
        while (true) {
            long j3 = n;
            if (i3 < i2) {
                long k2 = ofVar.k();
                if (k2 == (dc.a.getLongVolatile(ofVar, j3) & 4611686018427387903L) && k2 == ofVar.k()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = dc.a;
                    long longVolatile = unsafe.getLongVolatile(ofVar, j3);
                    if (unsafe.compareAndSwapLong(ofVar, n, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        ofVar = this;
                    }
                }
                while (true) {
                    long k3 = ofVar.k();
                    Unsafe unsafe2 = dc.a;
                    long longVolatile2 = unsafe2.getLongVolatile(ofVar, j3);
                    long j4 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (k3 == j4 && k3 == ofVar.k()) {
                        break;
                    }
                    if (z) {
                        ofVar = this;
                    } else {
                        ofVar = this;
                        unsafe2.compareAndSwapLong(ofVar, n, longVolatile2, j4 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = dc.a;
                    long longVolatile3 = unsafe3.getLongVolatile(ofVar, j3);
                    if (unsafe3.compareAndSwapLong(ofVar, n, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        ofVar = this;
                    }
                }
            }
        }
    }

    public final boolean a(long j2) {
        return j2 < k() || j2 < o() + ((long) this.d);
    }

    public final boolean b(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        of ofVar = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = dc.a;
                long j5 = r;
                long longVolatile3 = unsafe4.getLongVolatile(ofVar, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                kh khVar = qf.a;
                if (unsafe4.compareAndSwapLong(ofVar, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                ofVar = this;
            }
        }
        ox oxVar = qf.s;
        while (true) {
            Unsafe unsafe5 = dc.a;
            long j6 = j;
            if (unsafe5.compareAndSwapObject(this, j6, oxVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != oxVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = dc.a;
                j4 = r;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = dc.a;
                j2 = r;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        v();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = dc.a;
                long j7 = m;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                ox oxVar2 = objectVolatile == null ? qf.q : qf.r;
                do {
                    unsafe2 = dc.a;
                    if (unsafe2.compareAndSwapObject(this, m, objectVolatile, oxVar2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                p01.f(1, objectVolatile);
                ((ky) objectVolatile).invoke(l());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (defpackage.kh) ((defpackage.kl) defpackage.dc.a.getObjectVolatile(r0, defpackage.kl.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kh c(long j2) {
        kl klVar;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = dc.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, l);
        kh khVar = (kh) unsafe2.getObjectVolatile(this, q);
        if (khVar.d > ((kh) objectVolatile).d) {
            objectVolatile = khVar;
        }
        kh khVar2 = (kh) unsafe2.getObjectVolatile(this, o);
        if (khVar2.d > ((kh) objectVolatile).d) {
            objectVolatile = khVar2;
        }
        kl klVar2 = (kl) objectVolatile;
        loop0: while (true) {
            klVar = klVar2;
            while (true) {
                int i2 = kl.c;
                klVar.getClass();
                Object objectVolatile2 = dc.a.getObjectVolatile(klVar, kl.a);
                ox oxVar = cq.b;
                if (objectVolatile2 == oxVar) {
                    break loop0;
                }
                klVar2 = (kl) objectVolatile2;
                if (klVar2 == null) {
                    do {
                        unsafe = dc.a;
                        j4 = kl.a;
                        if (unsafe.compareAndSwapObject(klVar, j4, (Object) null, oxVar)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(klVar, j4) == null);
                }
            }
        }
        kh khVar3 = (kh) klVar;
        if (w()) {
            kh khVar4 = khVar3;
            loop3: do {
                int i3 = qf.b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j3 = (khVar4.d * qf.b) + i3;
                    if (j3 < o()) {
                        break loop3;
                    }
                    while (true) {
                        Object k2 = khVar4.k(i3);
                        if (k2 != null && k2 != qf.e) {
                            if (k2 == qf.d) {
                                break loop3;
                            }
                        } else {
                            if (khVar4.j(i3, k2, qf.l)) {
                                khVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (khVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                d(j3);
            }
        }
        Object obj = null;
        loop6: for (kh khVar5 = khVar3; khVar5 != null; khVar5 = (kh) ((kl) dc.a.getObjectVolatile(khVar5, kl.b))) {
            for (int i4 = qf.b - 1; -1 < i4; i4--) {
                if ((khVar5.d * qf.b) + i4 < j2) {
                    break loop6;
                }
                while (true) {
                    Object k3 = khVar5.k(i4);
                    if (k3 != null && k3 != qf.e) {
                        if (!(k3 instanceof g21)) {
                            if (!(k3 instanceof f21)) {
                                break;
                            }
                            if (khVar5.j(i4, k3, qf.l)) {
                                obj = p01.x(obj, k3);
                                khVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (khVar5.j(i4, k3, qf.l)) {
                                obj = p01.x(obj, ((g21) k3).a);
                                khVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (khVar5.j(i4, k3, qf.l)) {
                            khVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                B((f21) obj, true);
                return khVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                B((f21) arrayList.get(size), true);
            }
        }
        return khVar3;
    }

    @Override // defpackage.zg
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        b(cancellationException, true);
    }

    public final void d(long j2) {
        kh khVar = (kh) dc.a.getObjectVolatile(this, o);
        while (true) {
            Unsafe unsafe = dc.a;
            long j3 = p;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(this.d + longVolatile, this.k())) {
                return;
            }
            of ofVar = this;
            if (unsafe.compareAndSwapLong(ofVar, j3, longVolatile, 1 + longVolatile)) {
                long j4 = qf.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (khVar.d != j5) {
                    kh f2 = ofVar.f(j5, khVar);
                    if (f2 != null) {
                        khVar = f2;
                    }
                }
                kh khVar2 = khVar;
                if (ofVar.E(khVar2, i2, longVolatile, null) != qf.o) {
                    khVar2.a();
                } else if (longVolatile < ofVar.q()) {
                    khVar2.a();
                }
                this = ofVar;
                khVar = khVar2;
            }
            this = ofVar;
        }
    }

    public final void e() {
        Object o2;
        Unsafe unsafe;
        if (x()) {
            return;
        }
        Unsafe unsafe2 = dc.a;
        long j2 = l;
        kh khVar = (kh) unsafe2.getObjectVolatile(this, j2);
        loop0: while (true) {
            long andIncrement = g.getAndIncrement(this);
            long j3 = andIncrement / qf.b;
            if (q() <= andIncrement) {
                if (khVar.d < j3 && khVar.b() != null) {
                    y(j3, khVar);
                }
                r(1L);
                return;
            }
            if (khVar.d != j3) {
                pf pfVar = pf.d;
                while (true) {
                    o2 = cq.o(khVar, j3, pfVar);
                    if (!d41.D(o2)) {
                        dn0 z = d41.z(o2);
                        while (true) {
                            dn0 dn0Var = (dn0) dc.a.getObjectVolatile(this, j2);
                            if (dn0Var.d >= z.d) {
                                break;
                            }
                            if (!z.i()) {
                                break;
                            }
                            do {
                                unsafe = dc.a;
                                if (unsafe.compareAndSwapObject(this, l, dn0Var, z)) {
                                    if (dn0Var.e()) {
                                        dn0Var.d();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == dn0Var);
                            if (z.e()) {
                                z.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                kh khVar2 = null;
                if (d41.D(o2)) {
                    v();
                    y(j3, khVar);
                    r(1L);
                } else {
                    kh khVar3 = (kh) d41.z(o2);
                    long j4 = khVar3.d;
                    if (j4 > j3) {
                        long j5 = qf.b * j4;
                        if (dc.a.compareAndSwapLong(this, k, 1 + andIncrement, j5)) {
                            r(j5 - andIncrement);
                        } else {
                            r(1L);
                        }
                    } else {
                        khVar2 = khVar3;
                    }
                }
                if (khVar2 == null) {
                    continue;
                } else {
                    khVar = khVar2;
                }
            }
            int i2 = (int) (andIncrement % qf.b);
            Object k2 = khVar.k(i2);
            boolean z2 = k2 instanceof f21;
            long j6 = p;
            if (!z2 || andIncrement < dc.a.getLongVolatile(this, j6) || !khVar.j(i2, k2, qf.g)) {
                while (true) {
                    Object k3 = khVar.k(i2);
                    if (!(k3 instanceof f21)) {
                        if (k3 != qf.j) {
                            if (k3 != null) {
                                if (k3 == qf.d || k3 == qf.h || k3 == qf.i || k3 == qf.k || k3 == qf.l) {
                                    break loop0;
                                } else if (k3 != qf.f) {
                                    o.p(k3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (khVar.j(i2, k3, qf.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < dc.a.getLongVolatile(this, j6)) {
                        if (khVar.j(i2, k3, new g21((f21) k3))) {
                            break loop0;
                        }
                    } else if (khVar.j(i2, k3, qf.g)) {
                        if (D(k3)) {
                            khVar.n(i2, qf.d);
                            break;
                        } else {
                            khVar.n(i2, qf.j);
                            khVar.h();
                        }
                    }
                }
            } else if (D(k2)) {
                khVar.n(i2, qf.d);
                break;
            } else {
                khVar.n(i2, qf.j);
                khVar.h();
                r(1L);
            }
        }
        r(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.e() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kh f(long j2, kh khVar) {
        Object o2;
        kh khVar2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        kh khVar3 = qf.a;
        pf pfVar = pf.d;
        loop0: while (true) {
            o2 = cq.o(khVar, j2, pfVar);
            if (!d41.D(o2)) {
                dn0 z = d41.z(o2);
                while (true) {
                    Unsafe unsafe3 = dc.a;
                    long j4 = o;
                    dn0 dn0Var = (dn0) unsafe3.getObjectVolatile(this, j4);
                    if (dn0Var.d >= z.d) {
                        break loop0;
                    }
                    if (!z.i()) {
                        break;
                    }
                    do {
                        unsafe2 = dc.a;
                        if (unsafe2.compareAndSwapObject(this, o, dn0Var, z)) {
                            if (dn0Var.e()) {
                                dn0Var.d();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == dn0Var);
                    if (z.e()) {
                        z.d();
                    }
                }
            } else {
                break;
            }
        }
        if (d41.D(o2)) {
            v();
            if (khVar.d * qf.b < q()) {
                khVar.a();
                return null;
            }
        } else {
            kh khVar4 = (kh) d41.z(o2);
            long j5 = khVar4.d;
            if (!x() && j2 <= k() / qf.b) {
                while (true) {
                    Unsafe unsafe4 = dc.a;
                    long j6 = l;
                    dn0 dn0Var2 = (dn0) unsafe4.getObjectVolatile(this, j6);
                    if (dn0Var2.d >= j5 || !khVar4.i()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = dc.a;
                        khVar2 = khVar4;
                        if (unsafe5.compareAndSwapObject(this, l, dn0Var2, khVar4)) {
                            if (dn0Var2.e()) {
                                dn0Var2.d();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j6) != dn0Var2) {
                                break;
                            }
                            khVar4 = khVar2;
                        }
                    }
                    khVar4 = khVar2;
                }
            }
            khVar2 = khVar4;
            if (j5 <= j2) {
                return khVar2;
            }
            long j7 = j5 * qf.b;
            do {
                unsafe = dc.a;
                j3 = p;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * qf.b < q()) {
                khVar2.a();
            }
        }
        return null;
    }

    @Override // defpackage.zg
    public final Object g() {
        kh khVar;
        of ofVar;
        int i2;
        jh jhVar = p01.a;
        Unsafe unsafe = dc.a;
        long longVolatile = unsafe.getLongVolatile(this, p);
        long longVolatile2 = unsafe.getLongVolatile(this, r);
        if (t(longVolatile2, true)) {
            return new ih(l());
        }
        if (longVolatile >= (longVolatile2 & 1152921504606846975L)) {
            return jhVar;
        }
        Object obj = qf.k;
        kh khVar2 = (kh) unsafe.getObjectVolatile(this, o);
        while (!this.u()) {
            long andIncrement = f.getAndIncrement(this);
            long j2 = qf.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (khVar2.d != j3) {
                kh f2 = this.f(j3, khVar2);
                if (f2 == null) {
                    continue;
                } else {
                    khVar = f2;
                    i2 = i3;
                    ofVar = this;
                }
            } else {
                khVar = khVar2;
                ofVar = this;
                i2 = i3;
            }
            Object E = ofVar.E(khVar, i2, andIncrement, obj);
            khVar2 = khVar;
            if (E == qf.m) {
                f21 f21Var = obj instanceof f21 ? (f21) obj : null;
                if (f21Var != null) {
                    f21Var.a(khVar2, i2);
                }
                ofVar.H(andIncrement);
                khVar2.h();
                return jhVar;
            }
            if (E != qf.o) {
                if (E != qf.n) {
                    khVar2.a();
                    return E;
                }
                o.f("unexpected");
                return null;
            }
            if (andIncrement < ofVar.q()) {
                khVar2.a();
            }
            this = ofVar;
        }
        return new ih(this.l());
    }

    public final kh h(long j2, kh khVar) {
        Object o2;
        kh khVar2;
        long j3;
        Unsafe unsafe;
        of ofVar = this;
        kh khVar3 = qf.a;
        pf pfVar = pf.d;
        loop0: while (true) {
            o2 = cq.o(khVar, j2, pfVar);
            if (!d41.D(o2)) {
                dn0 z = d41.z(o2);
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    long j4 = q;
                    dn0 dn0Var = (dn0) unsafe2.getObjectVolatile(ofVar, j4);
                    if (dn0Var.d >= z.d) {
                        break loop0;
                    }
                    if (!z.i()) {
                        break;
                    }
                    do {
                        unsafe = dc.a;
                        if (unsafe.compareAndSwapObject(ofVar, q, dn0Var, z)) {
                            if (dn0Var.e()) {
                                dn0Var.d();
                            }
                        }
                    } while (unsafe.getObjectVolatile(ofVar, j4) == dn0Var);
                    if (z.e()) {
                        z.d();
                    }
                }
            } else {
                break;
            }
        }
        kh khVar4 = null;
        if (d41.D(o2)) {
            ofVar.v();
            if (khVar.d * qf.b >= ofVar.o()) {
                return null;
            }
            khVar.a();
            return null;
        }
        kh khVar5 = (kh) d41.z(o2);
        long j5 = khVar5.d;
        if (j5 <= j2) {
            return khVar5;
        }
        long j6 = j5 * qf.b;
        while (true) {
            Unsafe unsafe3 = dc.a;
            long j7 = r;
            long longVolatile = unsafe3.getLongVolatile(ofVar, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                khVar2 = khVar4;
                j3 = j5;
                break;
            }
            khVar2 = khVar4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(ofVar, j7, longVolatile, j8 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            ofVar = this;
            khVar4 = khVar2;
            j5 = j3;
        }
        if (j3 * qf.b >= o()) {
            return khVar2;
        }
        khVar5.a();
        return khVar2;
    }

    @Override // defpackage.zg
    public final Object i(hm hmVar) {
        kh khVar;
        Throwable th;
        kh khVar2;
        Unsafe unsafe = dc.a;
        long j2 = o;
        kh khVar3 = (kh) unsafe.getObjectVolatile(this, j2);
        while (!this.u()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = qf.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (khVar3.d != j4) {
                kh f2 = this.f(j4, khVar3);
                if (f2 == null) {
                    continue;
                } else {
                    khVar = f2;
                }
            } else {
                khVar = khVar3;
            }
            of ofVar = this;
            Object E = ofVar.E(khVar, i2, andIncrement, null);
            ox oxVar = qf.m;
            if (E == oxVar) {
                o.f("unexpected");
                return null;
            }
            ox oxVar2 = qf.o;
            if (E == oxVar2) {
                if (andIncrement < ofVar.q()) {
                    khVar.a();
                }
                this = ofVar;
                khVar3 = khVar;
            } else {
                if (E != qf.n) {
                    khVar.a();
                    return E;
                }
                gg w = y80.w(d41.C(hmVar));
                try {
                    Object E2 = ofVar.E(khVar, i2, andIncrement, w);
                    if (E2 == oxVar) {
                        w.a(khVar, i2);
                    } else {
                        if (E2 == oxVar2) {
                            if (andIncrement < ofVar.q()) {
                                khVar.a();
                            }
                            kh khVar4 = (kh) dc.a.getObjectVolatile(ofVar, j2);
                            while (true) {
                                if (ofVar.u()) {
                                    w.resumeWith(new jj0(ofVar.n()));
                                    break;
                                }
                                gg ggVar = w;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(ofVar);
                                    long j5 = qf.b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (khVar4.d != j6) {
                                        try {
                                            kh f3 = ofVar.f(j6, khVar4);
                                            if (f3 == null) {
                                                w = ggVar;
                                            } else {
                                                khVar2 = f3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            w = ggVar;
                                            w.A();
                                            throw th;
                                        }
                                    } else {
                                        khVar2 = khVar4;
                                    }
                                    of ofVar2 = ofVar;
                                    E2 = ofVar2.E(khVar2, i3, andIncrement2, ggVar);
                                    ofVar = ofVar2;
                                    kh khVar5 = khVar2;
                                    w = ggVar;
                                    if (E2 == qf.m) {
                                        w.a(khVar5, i3);
                                        break;
                                    }
                                    if (E2 == qf.o) {
                                        if (andIncrement2 < ofVar.q()) {
                                            khVar5.a();
                                        }
                                        khVar4 = khVar5;
                                    } else {
                                        if (E2 == qf.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        khVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    w = ggVar;
                                    th = th;
                                    w.A();
                                    throw th;
                                }
                            }
                        } else {
                            khVar.a();
                        }
                        w.k(E2, null);
                    }
                    return w.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable n2 = this.n();
        int i4 = qr0.a;
        throw n2;
    }

    @Override // defpackage.zg
    public final nf iterator() {
        return new nf(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // defpackage.yn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(hm hmVar, Object obj) {
        Object obj2;
        Object obj3;
        Object s;
        Object obj4;
        String str;
        int i2;
        of ofVar = this;
        Unsafe unsafe = dc.a;
        long j2 = q;
        kh khVar = (kh) unsafe.getObjectVolatile(ofVar, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(ofVar);
            long j3 = andIncrement & 1152921504606846975L;
            boolean t = ofVar.t(andIncrement, false);
            int i3 = qf.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = khVar.d;
            Object obj5 = vn.d;
            obj2 = w01.a;
            if (j6 != j5) {
                kh h2 = ofVar.h(j5, khVar);
                if (h2 != null) {
                    khVar = h2;
                } else if (t) {
                    Object z = z(hmVar, obj);
                    if (z == obj5) {
                        return z;
                    }
                }
            }
            int F = ofVar.F(khVar, i4, obj, j3, null, t);
            if (F == 0) {
                khVar.a();
                return obj2;
            }
            if (F == 1) {
                break;
            }
            if (F != 2) {
                if (F == 3) {
                    gg w = y80.w(d41.C(hmVar));
                    try {
                        int F2 = F(khVar, i4, obj, j3, w, false);
                        if (F2 != 0) {
                            if (F2 == 1) {
                                obj3 = obj5;
                                w.resumeWith(obj2);
                            } else if (F2 != 2) {
                                if (F2 != 4) {
                                    String str2 = "unexpected";
                                    if (F2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    khVar.a();
                                    kh khVar2 = (kh) dc.a.getObjectVolatile(this, j2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j7 = andIncrement2 & 1152921504606846975L;
                                        boolean t2 = t(andIncrement2, false);
                                        int i5 = qf.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j8 = i5;
                                        obj3 = obj5;
                                        long j9 = j7 / j8;
                                        int i6 = (int) (j7 % j8);
                                        if (khVar2.d != j9) {
                                            kh h3 = h(j9, khVar2);
                                            if (h3 != null) {
                                                str = str2;
                                                i2 = i6;
                                                khVar2 = h3;
                                            } else {
                                                if (t2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            }
                                        } else {
                                            str = str2;
                                            i2 = i6;
                                        }
                                        int F3 = F(khVar2, i2, obj, j7, w, t2);
                                        if (F3 == 0) {
                                            khVar2.a();
                                            break;
                                        }
                                        if (F3 == 1) {
                                            break;
                                        }
                                        if (F3 != 2) {
                                            if (F3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (F3 != 4) {
                                                if (F3 == 5) {
                                                    khVar2.a();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j7 < o()) {
                                                khVar2.a();
                                            }
                                        } else if (t2) {
                                            khVar2.h();
                                        } else {
                                            w.a(khVar2, i2 + i5);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j3 < o()) {
                                        khVar.a();
                                    }
                                }
                                A(obj, w);
                            } else {
                                obj3 = obj5;
                                w.a(khVar, i4 + i3);
                            }
                            s = w.s();
                            obj4 = obj3;
                            if (s != obj4) {
                                s = obj2;
                            }
                            if (s != obj4) {
                                return s;
                            }
                        } else {
                            obj3 = obj5;
                            khVar.a();
                        }
                        w.resumeWith(obj2);
                        s = w.s();
                        obj4 = obj3;
                        if (s != obj4) {
                        }
                        if (s != obj4) {
                            break;
                        }
                    } catch (Throwable th) {
                        w.A();
                        throw th;
                    }
                } else if (F != 4) {
                    if (F == 5) {
                        khVar.a();
                    }
                    ofVar = this;
                } else {
                    if (j3 < o()) {
                        khVar.a();
                    }
                    Object z2 = z(hmVar, obj);
                    if (z2 == obj5) {
                        return z2;
                    }
                }
            } else if (t) {
                khVar.h();
                Object z3 = z(hmVar, obj);
                if (z3 == obj5) {
                    return z3;
                }
            }
        }
        return obj2;
    }

    public final long k() {
        return dc.a.getLongVolatile(this, k);
    }

    public final Throwable l() {
        return (Throwable) dc.a.getObjectVolatile(this, j);
    }

    @Override // defpackage.yn0
    public Object m(Object obj) {
        of ofVar = this;
        jh jhVar = p01.a;
        Unsafe unsafe = dc.a;
        long j2 = 1152921504606846975L;
        if (ofVar.t(unsafe.getLongVolatile(ofVar, r), false) ? false : !ofVar.a(r2 & 1152921504606846975L)) {
            return jhVar;
        }
        Object obj2 = qf.j;
        kh khVar = (kh) unsafe.getObjectVolatile(ofVar, q);
        while (true) {
            long andIncrement = e.getAndIncrement(ofVar);
            long j3 = andIncrement & j2;
            boolean t = ofVar.t(andIncrement, false);
            int i2 = qf.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (khVar.d != j5) {
                kh h2 = ofVar.h(j5, khVar);
                if (h2 != null) {
                    khVar = h2;
                } else {
                    if (t) {
                        return new ih(ofVar.p());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int F = ofVar.F(khVar, i3, obj, j3, obj2, t);
            w01 w01Var = w01.a;
            if (F == 0) {
                khVar.a();
                return w01Var;
            }
            if (F == 1) {
                return w01Var;
            }
            if (F == 2) {
                if (t) {
                    khVar.h();
                    return new ih(p());
                }
                f21 f21Var = obj2 instanceof f21 ? (f21) obj2 : null;
                if (f21Var != null) {
                    f21Var.a(khVar, i3 + i2);
                }
                khVar.h();
                return jhVar;
            }
            if (F == 3) {
                o.f("unexpected");
                return null;
            }
            if (F == 4) {
                if (j3 < o()) {
                    khVar.a();
                }
                return new ih(p());
            }
            if (F == 5) {
                khVar.a();
            }
            j2 = 1152921504606846975L;
            ofVar = this;
        }
    }

    public final Throwable n() {
        Throwable l2 = l();
        return l2 == null ? new vi("Channel was closed") : l2;
    }

    public final long o() {
        return dc.a.getLongVolatile(this, p);
    }

    public final Throwable p() {
        Throwable l2 = l();
        return l2 == null ? new wi("Channel was closed") : l2;
    }

    public final long q() {
        return dc.a.getLongVolatile(this, r) & 1152921504606846975L;
    }

    public final void r(long j2) {
        if ((h.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((dc.a.getLongVolatile(this, n) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (defpackage.kh) ((defpackage.kl) defpackage.dc.a.getObjectVolatile(r12, defpackage.kl.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                c(j2 & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = dc.a;
                        long j3 = o;
                        kh khVar = (kh) unsafe.getObjectVolatile(this, j3);
                        long o2 = o();
                        if (q() <= o2) {
                            break;
                        }
                        long j4 = qf.b;
                        long j5 = o2 / j4;
                        if (khVar.d != j5 && (khVar = f(j5, khVar)) == null) {
                            if (((kh) unsafe.getObjectVolatile(this, j3)).d < j5) {
                                break;
                            }
                        } else {
                            khVar.a();
                            int i3 = (int) (o2 % j4);
                            while (true) {
                                Object k2 = khVar.k(i3);
                                if (k2 == null || k2 == qf.e) {
                                    if (khVar.j(i3, k2, qf.h)) {
                                        e();
                                        break;
                                    }
                                } else {
                                    if (k2 == qf.d) {
                                        break;
                                    }
                                    if (k2 != qf.j) {
                                        if (k2 != qf.l) {
                                            if (k2 != qf.i) {
                                                if (k2 != qf.h) {
                                                    if (k2 == qf.g) {
                                                        break;
                                                    }
                                                    if (k2 != qf.f && o2 == o()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            dc.a.compareAndSwapLong(this, p, o2, o2 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(j50.h(i2, "unexpected close status: ").toString());
                }
                kh c = c(j2 & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i4 = qf.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (c.d * qf.b) + i4;
                        while (true) {
                            Object k3 = c.k(i4);
                            if (k3 == qf.i) {
                                break loop0;
                            }
                            if (k3 == qf.d) {
                                if (j6 < o()) {
                                    break loop0;
                                }
                                if (c.j(i4, k3, qf.l)) {
                                    c.m(i4, null);
                                    c.h();
                                    break;
                                }
                            } else if (k3 != qf.e && k3 != null) {
                                if (!(k3 instanceof f21) && !(k3 instanceof g21)) {
                                    ox oxVar = qf.g;
                                    if (k3 == oxVar || k3 == qf.f) {
                                        break loop0;
                                    }
                                    if (k3 != oxVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < o()) {
                                        break loop0;
                                    }
                                    f21 f21Var = k3 instanceof g21 ? ((g21) k3).a : (f21) k3;
                                    if (c.j(i4, k3, qf.l)) {
                                        obj = p01.x(obj, f21Var);
                                        c.m(i4, null);
                                        c.h();
                                        break;
                                    }
                                }
                            } else if (c.j(i4, k3, qf.l)) {
                                c.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (c != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            B((f21) arrayList.get(size), false);
                        }
                    } else {
                        B((f21) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        r3 = (defpackage.kh) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = dc.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, r) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        int i2 = 0;
        List E = y80.E(unsafe.getObjectVolatile(this, o), unsafe.getObjectVolatile(this, q), unsafe.getObjectVolatile(this, l));
        ArrayList arrayList = new ArrayList();
        for (Object obj : E) {
            if (((kh) obj) != qf.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            o.q();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((kh) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((kh) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        kh khVar = (kh) next;
        long o2 = o();
        long q2 = q();
        loop2: while (true) {
            int i3 = qf.b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (khVar.d * qf.b) + i4;
                if (j4 >= q2 && j4 >= o2) {
                    break loop2;
                }
                Object k2 = khVar.k(i4);
                Object obj2 = khVar.h.get(i4 * 2);
                if (k2 instanceof fg) {
                    str = (j4 >= o2 || j4 < q2) ? (j4 >= q2 || j4 < o2) ? "cont" : "send" : "receive";
                } else if (k2 instanceof g21) {
                    str = "EB(" + k2 + ')';
                } else if (q10.b(k2, qf.f) || q10.b(k2, qf.g)) {
                    str = "resuming_sender";
                } else {
                    if (k2 != null && !k2.equals(qf.e) && !k2.equals(qf.i) && !k2.equals(qf.h) && !k2.equals(qf.k) && !k2.equals(qf.j) && !k2.equals(qf.l)) {
                        str = k2.toString();
                    }
                    i4++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (ds0.o0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return t(dc.a.getLongVolatile(this, r), true);
    }

    public final boolean v() {
        return t(dc.a.getLongVolatile(this, r), false);
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long k2 = k();
        return k2 == 0 || k2 == SnapshotId_jvmKt.SnapshotIdMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.e() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j2, kh khVar) {
        of ofVar;
        kh khVar2;
        kh khVar3;
        while (khVar.d < j2 && (khVar3 = (kh) khVar.b()) != null) {
            khVar = khVar3;
        }
        while (true) {
            kh khVar4 = khVar;
            while (khVar4.c() && (khVar2 = (kh) khVar4.b()) != null) {
                khVar4 = khVar2;
            }
            while (true) {
                Unsafe unsafe = dc.a;
                long j3 = l;
                dn0 dn0Var = (dn0) unsafe.getObjectVolatile(this, j3);
                if (dn0Var.d >= khVar4.d) {
                    return;
                }
                if (!khVar4.i()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    ofVar = this;
                    if (unsafe2.compareAndSwapObject(ofVar, l, dn0Var, khVar4)) {
                        if (dn0Var.e()) {
                            dn0Var.d();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(ofVar, j3) != dn0Var) {
                        break;
                    } else {
                        this = ofVar;
                    }
                }
                this = ofVar;
            }
            khVar = khVar4;
        }
    }

    public final Object z(hm hmVar, Object obj) {
        gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        ggVar.resumeWith(new jj0(p()));
        Object s = ggVar.s();
        return s == vn.d ? s : w01.a;
    }
}
