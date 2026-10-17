package defpackage;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rn extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(rn.class, "workerCtl$volatile");
    public static final /* synthetic */ long m = dc.a.objectFieldOffset(rn.class.getDeclaredField("workerCtl$volatile"));
    public final a41 d;
    public final ji0 e;
    public sn f;
    public long g;
    public long h;
    public int i;
    private volatile int indexInArray;
    public boolean j;
    public final /* synthetic */ tn k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public rn(tn tnVar, int i) {
        this.k = tnVar;
        setDaemon(true);
        setContextClassLoader(tn.class.getClassLoader());
        this.d = new a41();
        this.e = new ji0();
        this.f = sn.g;
        this.nextParkedWorker = tn.n;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final lt0 a(boolean z) {
        lt0 e;
        lt0 e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        sn snVar = this.f;
        tn tnVar = this.k;
        lt0 lt0Var = null;
        a41 a41Var = this.d;
        sn snVar2 = sn.d;
        if (snVar != snVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = tn.l;
            do {
                j = atomicLongFieldUpdater.get(tnVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    a41Var.getClass();
                    long j2 = a41.f;
                    loop1: while (true) {
                        unsafe = dc.a;
                        lt0 lt0Var2 = (lt0) unsafe.getObjectVolatile(a41Var, j2);
                        if (lt0Var2 != null && lt0Var2.e) {
                            do {
                                unsafe2 = dc.a;
                                if (unsafe2.compareAndSwapObject(a41Var, a41.f, lt0Var2, (Object) null)) {
                                    lt0Var = lt0Var2;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(a41Var, j2) == lt0Var2);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(a41Var, a41.e);
                    int intVolatile2 = unsafe.getIntVolatile(a41Var, a41.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || dc.a.getIntVolatile(a41Var, a41.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        lt0 d = a41Var.d(intVolatile2, true);
                        if (d != null) {
                            lt0Var = d;
                            break;
                        }
                    }
                    if (lt0Var != null) {
                        return lt0Var;
                    }
                    lt0 lt0Var3 = (lt0) tnVar.i.d();
                    return lt0Var3 == null ? i(1) : lt0Var3;
                }
            } while (!tn.l.compareAndSet(tnVar, j, j - 4398046511104L));
            this.f = snVar2;
        }
        if (z) {
            boolean z2 = d(tnVar.d * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            a41Var.getClass();
            lt0 lt0Var4 = (lt0) dc.a.getAndSetObject(a41Var, a41.f, (Object) null);
            if (lt0Var4 == null) {
                lt0Var4 = a41Var.c();
            }
            if (lt0Var4 != null) {
                return lt0Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            lt0 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final lt0 e() {
        int d = d(2);
        tn tnVar = this.k;
        ez ezVar = tnVar.i;
        ez ezVar2 = tnVar.h;
        if (d == 0) {
            lt0 lt0Var = (lt0) ezVar2.d();
            return lt0Var != null ? lt0Var : (lt0) ezVar.d();
        }
        lt0 lt0Var2 = (lt0) ezVar.d();
        return lt0Var2 != null ? lt0Var2 : (lt0) ezVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(sn snVar) {
        sn snVar2 = this.f;
        boolean z = snVar2 == sn.d;
        if (z) {
            tn.l.addAndGet(this.k, 4398046511104L);
        }
        if (snVar2 != snVar) {
            this.f = snVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lt0 i(int i) {
        int i2;
        long j;
        lt0 lt0Var;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = tn.l;
        tn tnVar = this.k;
        int i4 = (int) (atomicLongFieldUpdater.get(tnVar) & 2097151);
        lt0 lt0Var2 = null;
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        int i5 = 0;
        long j4 = SnapshotId_jvmKt.SnapshotIdMax;
        while (i5 < i4) {
            d++;
            if (d > i4) {
                d = 1;
            }
            rn rnVar = (rn) tnVar.j.b(d);
            if (rnVar == null || rnVar == this) {
                i2 = i4;
            } else {
                a41 a41Var = rnVar.d;
                if (i3 == 3) {
                    lt0Var = a41Var.c();
                    i2 = i4;
                    j = 0;
                } else {
                    a41Var.getClass();
                    Unsafe unsafe2 = dc.a;
                    int intVolatile = unsafe2.getIntVolatile(a41Var, a41.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(a41Var, a41.g);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (dc.a.getIntVolatile(a41Var, a41.d) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        lt0 d2 = a41Var.d(intVolatile, z);
                        if (d2 != null) {
                            lt0Var = d2;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    lt0Var = lt0Var2;
                }
                ji0 ji0Var = this.e;
                if (lt0Var == null) {
                    j2 = -1;
                    long j5 = a41.f;
                    while (true) {
                        lt0 lt0Var3 = (lt0) dc.a.getObjectVolatile(a41Var, j5);
                        if (lt0Var3 == null) {
                            break;
                        }
                        if (((lt0Var3.e ? 1 : 2) & i) == 0) {
                            break;
                        }
                        nt0.f.getClass();
                        a41 a41Var2 = a41Var;
                        long nanoTime = System.nanoTime() - lt0Var3.d;
                        long j6 = nt0.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = dc.a;
                            if (unsafe.compareAndSwapObject(a41Var2, a41.f, lt0Var3, (Object) null)) {
                                ji0Var.d = lt0Var3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(a41Var2, j5) == lt0Var3);
                        a41Var = a41Var2;
                    }
                } else {
                    ji0Var.d = lt0Var;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    lt0 lt0Var4 = (lt0) ji0Var.d;
                    ji0Var.d = null;
                    return lt0Var4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            lt0Var2 = null;
        }
        if (j4 == SnapshotId_jvmKt.SnapshotIdMax) {
            j4 = 0;
        }
        this.h = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sn snVar;
        loop0: while (true) {
            boolean z = false;
            while (tn.m.get(this.k) == 0) {
                sn snVar2 = this.f;
                sn snVar3 = sn.h;
                if (snVar2 == snVar3) {
                    break loop0;
                }
                lt0 a = a(this.j);
                if (a != null) {
                    this.h = 0L;
                    tn tnVar = this.k;
                    this.g = 0L;
                    if (this.f == sn.f) {
                        this.f = sn.e;
                    }
                    if (a.e) {
                        if (h(sn.e) && !tnVar.f() && !tnVar.e(tn.l.get(tnVar))) {
                            tnVar.f();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        tn.l.addAndGet(tnVar, -2097152L);
                        if (this.f != snVar3) {
                            this.f = sn.g;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.j = false;
                    if (this.h == 0) {
                        Object obj = this.nextParkedWorker;
                        ox oxVar = tn.n;
                        if (obj != oxVar) {
                            int i = -1;
                            dc.a.putIntVolatile(this, m, -1);
                            while (this.nextParkedWorker != tn.n) {
                                Unsafe unsafe = dc.a;
                                long j = m;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    tn tnVar2 = this.k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tn.m;
                                    if (atomicIntegerFieldUpdater.get(tnVar2) != 0) {
                                        break;
                                    }
                                    sn snVar4 = this.f;
                                    sn snVar5 = sn.h;
                                    if (snVar4 == snVar5) {
                                        break;
                                    }
                                    h(sn.f);
                                    Thread.interrupted();
                                    if (this.g == 0) {
                                        snVar = snVar5;
                                        this.g = System.nanoTime() + this.k.f;
                                    } else {
                                        snVar = snVar5;
                                    }
                                    LockSupport.parkNanos(this.k.f);
                                    if (System.nanoTime() - this.g >= 0) {
                                        this.g = 0L;
                                        tn tnVar3 = this.k;
                                        synchronized (tnVar3.j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater.get(tnVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = tn.l;
                                                    if (((int) (atomicLongFieldUpdater.get(tnVar3) & 2097151)) > tnVar3.d) {
                                                        if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            f(0);
                                                            tnVar3.d(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(tnVar3) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Object b = tnVar3.j.b(andDecrement);
                                                                b.getClass();
                                                                rn rnVar = (rn) b;
                                                                tnVar3.j.c(i2, rnVar);
                                                                rnVar.f(i2);
                                                                tnVar3.d(rnVar, andDecrement, i2);
                                                            }
                                                            tnVar3.j.c(andDecrement, null);
                                                            this.f = snVar;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    i = -1;
                                }
                            }
                        } else {
                            tn tnVar4 = this.k;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = tn.k;
                            if (this.nextParkedWorker == oxVar) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(tnVar4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = tnVar4.j.b((int) (j2 & 2097151));
                                    tn tnVar5 = tnVar4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(tnVar5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    tnVar4 = tnVar5;
                                }
                            }
                        }
                    } else if (z) {
                        h(sn.f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.h);
                        this.h = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(sn.h);
    }
}
