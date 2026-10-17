package defpackage;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class iu extends du implements yq {
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ int k = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = dc.a;
        j = unsafe.objectFieldOffset(iu.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(iu.class.getDeclaredField("_delayed$volatile"));
        i = unsafe.objectFieldOffset(iu.class.getDeclaredField("_isCompleted$volatile"));
    }

    public qr c(long j2, Runnable runnable, kn knVar) {
        return fq.a.c(j2, runnable, knVar);
    }

    @Override // defpackage.yq
    public final void d(long j2, gg ggVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? SnapshotId_jvmKt.SnapshotIdMax : AnimationKt.MillisToNanos * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            eu euVar = new eu(this, j3 + nanoTime, ggVar);
            t(nanoTime, euVar);
            ggVar.w(new dg(euVar, 1));
        }
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        m(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.du
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        Unsafe unsafe;
        iu iuVar;
        Unsafe unsafe2;
        Runnable runnable;
        gu guVar;
        ox oxVar = y80.d;
        long j2 = j;
        if (!l()) {
            o();
            loop0: while (true) {
                unsafe = dc.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                if (objectVolatile == null) {
                    iuVar = this;
                    break;
                }
                if (objectVolatile instanceof g60) {
                    g60 g60Var = (g60) objectVolatile;
                    Object d = g60Var.d();
                    if (d != g60.e) {
                        Runnable runnable2 = (Runnable) d;
                        iuVar = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    g60 c = g60Var.c();
                    while (true) {
                        Unsafe unsafe3 = dc.a;
                        iuVar = this;
                        if (!unsafe3.compareAndSwapObject(iuVar, j, objectVolatile, c) && unsafe3.getObjectVolatile(iuVar, j2) == objectVolatile) {
                            this = iuVar;
                        }
                    }
                    this = iuVar;
                } else {
                    iuVar = this;
                    if (objectVolatile == oxVar) {
                        break;
                    }
                    do {
                        unsafe2 = dc.a;
                        if (unsafe2.compareAndSwapObject(iuVar, j, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(iuVar, j2) == objectVolatile);
                    this = iuVar;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            qb qbVar = iuVar.f;
            if (((qbVar == null || qbVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(iuVar, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof g60) {
                        long longVolatile = unsafe2.getLongVolatile((g60) objectVolatile2, g60.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == oxVar) {
                        return SnapshotId_jvmKt.SnapshotIdMax;
                    }
                }
                hu huVar = (hu) unsafe.getObjectVolatile(iuVar, h);
                if (huVar != null) {
                    synchronized (huVar) {
                        gu[] guVarArr = huVar.a;
                        guVar = guVarArr != null ? guVarArr[0] : null;
                    }
                    if (guVar != null) {
                        long nanoTime = guVar.d - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return SnapshotId_jvmKt.SnapshotIdMax;
            }
        }
        return 0L;
    }

    public void m(Runnable runnable) {
        o();
        if (!p(runnable)) {
            eq.l.m(runnable);
            return;
        }
        Thread q = q();
        if (Thread.currentThread() != q) {
            LockSupport.unpark(q);
        }
    }

    public final void o() {
        gu guVar;
        hu huVar = (hu) dc.a.getObjectVolatile(this, h);
        if (huVar == null || huVar.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (huVar) {
                try {
                    gu[] guVarArr = huVar.a;
                    gu guVar2 = guVarArr != null ? guVarArr[0] : null;
                    if (guVar2 != null) {
                        guVar = ((nanoTime - guVar2.d) > 0L ? 1 : ((nanoTime - guVar2.d) == 0L ? 0 : -1)) >= 0 ? p(guVar2) : false ? huVar.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (guVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(Runnable runnable) {
        iu iuVar;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = dc.a;
            long j2 = j;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j2);
            if (unsafe3.getIntVolatile(this, i) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = dc.a;
                    iu iuVar2 = this;
                    runnable2 = runnable;
                    iuVar = iuVar2;
                    if (unsafe4.compareAndSwapObject(iuVar2, j, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(iuVar, j2) != null) {
                        break;
                    }
                    this = iuVar;
                    runnable = runnable2;
                }
                this = iuVar;
                runnable = runnable2;
            } else {
                iuVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof g60) {
                    g60 g60Var = (g60) objectVolatile;
                    int a = g60Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        g60 c = g60Var.c();
                        do {
                            unsafe2 = dc.a;
                            if (unsafe2.compareAndSwapObject(iuVar, j, objectVolatile, c)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(iuVar, j2) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = iuVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == y80.d) {
                        break;
                    }
                    g60 g60Var2 = new g60(8, true);
                    g60Var2.a((Runnable) objectVolatile);
                    g60Var2.a(runnable2);
                    do {
                        unsafe = dc.a;
                        if (unsafe.compareAndSwapObject(iuVar, j, objectVolatile, g60Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(iuVar, j2) == objectVolatile);
                    this = iuVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public abstract Thread q();

    public final boolean r() {
        qb qbVar = this.f;
        if (qbVar != null ? qbVar.isEmpty() : true) {
            Unsafe unsafe = dc.a;
            hu huVar = (hu) unsafe.getObjectVolatile(this, h);
            if (huVar != null && huVar.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                if (objectVolatile instanceof g60) {
                    long longVolatile = unsafe.getLongVolatile((g60) objectVolatile, g60.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == y80.d) {
                }
            }
            return true;
        }
        return false;
    }

    public void s(long j2, gu guVar) {
        eq.l.t(j2, guVar);
    }

    @Override // defpackage.du
    public void shutdown() {
        ox oxVar;
        Unsafe unsafe;
        gu c;
        xu0.a.set(null);
        dc.a.putIntVolatile(this, i, 1);
        ox oxVar2 = y80.d;
        long j2 = j;
        loop0: while (true) {
            Object objectVolatile = dc.a.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    oxVar = oxVar2;
                    if (unsafe2.compareAndSwapObject(this, j, (Object) null, oxVar2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    } else {
                        oxVar2 = oxVar;
                    }
                }
                oxVar2 = oxVar;
            } else {
                oxVar = oxVar2;
                if (objectVolatile instanceof g60) {
                    ((g60) objectVolatile).b();
                    break;
                }
                if (objectVolatile == oxVar) {
                    break;
                }
                g60 g60Var = new g60(8, true);
                g60Var.a((Runnable) objectVolatile);
                do {
                    unsafe = dc.a;
                    if (unsafe.compareAndSwapObject(this, j, objectVolatile, g60Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                oxVar2 = oxVar;
            }
        }
        while (k() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            hu huVar = (hu) dc.a.getObjectVolatile(this, h);
            if (huVar == null) {
                return;
            }
            synchronized (huVar) {
                c = huVar.b() > 0 ? huVar.c(0) : null;
            }
            if (c == null) {
                return;
            } else {
                s(nanoTime, c);
            }
        }
    }

    public final void t(long j2, gu guVar) {
        iu iuVar;
        int b;
        Unsafe unsafe;
        Thread q;
        long j3 = h;
        Unsafe unsafe2 = dc.a;
        if (unsafe2.getIntVolatile(this, i) != 0) {
            iuVar = this;
            b = 1;
        } else {
            hu huVar = (hu) unsafe2.getObjectVolatile(this, j3);
            if (huVar == null) {
                hu huVar2 = new hu();
                huVar2.c = j2;
                while (true) {
                    unsafe = dc.a;
                    iuVar = this;
                    if (!unsafe.compareAndSwapObject(iuVar, h, (Object) null, huVar2) && unsafe.getObjectVolatile(iuVar, j3) == null) {
                        this = iuVar;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(iuVar, j3);
                objectVolatile.getClass();
                huVar = (hu) objectVolatile;
                unsafe2 = unsafe;
            } else {
                iuVar = this;
            }
            b = guVar.b(j2, huVar, iuVar);
        }
        if (b != 0) {
            if (b == 1) {
                iuVar.s(j2, guVar);
                return;
            } else {
                if (b == 2) {
                    return;
                }
                o.f("unexpected result");
                return;
            }
        }
        hu huVar3 = (hu) unsafe2.getObjectVolatile(iuVar, j3);
        if (huVar3 != null) {
            synchronized (huVar3) {
                gu[] guVarArr = huVar3.a;
                r12 = guVarArr != null ? guVarArr[0] : null;
            }
        }
        if (r12 != guVar || Thread.currentThread() == (q = iuVar.q())) {
            return;
        }
        LockSupport.unpark(q);
    }
}
