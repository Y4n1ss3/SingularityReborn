package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tn implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(tn.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(tn.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(tn.class, "_isTerminated$volatile");
    public static final ox n = new ox("NOT_IN_STACK", 4);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final ez h;
    public final ez i;
    public final xi0 j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public tn(int i, int i2, long j, String str) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            o.c(j50.i(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            o.k(" should be greater than or equals to core pool size ", i2, i, "Max pool size ");
            throw null;
        }
        if (i2 > 2097150) {
            o.c(j50.i(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.h = new ez();
        this.i = new ez();
        this.j = new xi0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(tn tnVar, Runnable runnable, int i) {
        tnVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.j) {
            try {
                if (m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.j.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                rn rnVar = new rn(this, i3);
                this.j.c(i3, rnVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                rnVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        lt0 mt0Var;
        sn snVar;
        nt0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof lt0) {
            mt0Var = (lt0) runnable;
            mt0Var.d = nanoTime;
            mt0Var.e = z;
        } else {
            mt0Var = new mt0(runnable, nanoTime, z);
        }
        boolean z3 = mt0Var.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        rn rnVar = currentThread instanceof rn ? (rn) currentThread : null;
        if (rnVar == null || rnVar.k != this) {
            rnVar = null;
        }
        if (rnVar != null && (snVar = rnVar.f) != sn.h && (mt0Var.e || snVar != sn.e)) {
            rnVar.j = true;
            a41 a41Var = rnVar.d;
            if (z2) {
                mt0Var = a41Var.a(mt0Var);
            } else {
                a41Var.getClass();
                lt0 lt0Var = (lt0) dc.a.getAndSetObject(a41Var, a41.f, mt0Var);
                mt0Var = lt0Var == null ? null : a41Var.a(lt0Var);
            }
        }
        if (mt0Var != null) {
            if (!(mt0Var.e ? this.i.a(mt0Var) : this.h.a(mt0Var))) {
                throw new RejectedExecutionException(this.g + " was terminated");
            }
        }
        boolean z4 = z2 && rnVar != null;
        if (z3) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        lt0 lt0Var;
        if (m.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            rn rnVar = currentThread instanceof rn ? (rn) currentThread : null;
            if (rnVar == null || rnVar.k != this) {
                rnVar = null;
            }
            synchronized (this.j) {
                i = (int) (l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.j.b(i2);
                    b.getClass();
                    rn rnVar2 = (rn) b;
                    if (rnVar2 != rnVar) {
                        while (rnVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(rnVar2);
                            rnVar2.join(10000L);
                        }
                        a41 a41Var = rnVar2.d;
                        ez ezVar = this.i;
                        a41Var.getClass();
                        lt0 lt0Var2 = (lt0) dc.a.getAndSetObject(a41Var, a41.f, (Object) null);
                        if (lt0Var2 != null) {
                            ezVar.a(lt0Var2);
                        }
                        while (true) {
                            lt0 c = a41Var.c();
                            if (c == null) {
                                break;
                            } else {
                                ezVar.a(c);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.i.b();
            this.h.b();
            while (true) {
                if (rnVar != null) {
                    lt0Var = rnVar.a(true);
                }
                lt0Var = (lt0) this.h.d();
                if (lt0Var == null && (lt0Var = (lt0) this.i.d()) == null) {
                    break;
                }
                try {
                    lt0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (rnVar != null) {
                rnVar.h(sn.h);
            }
            k.set(this, 0L);
            l.set(this, 0L);
        }
    }

    public final void d(rn rnVar, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = k;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = rnVar.c();
                    while (true) {
                        if (c == n) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        rn rnVar2 = (rn) c;
                        int b = rnVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = rnVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                tn tnVar = this;
                if (atomicLongFieldUpdater.compareAndSet(tnVar, j, j3)) {
                    return;
                } else {
                    this = tnVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        tn tnVar;
        ox oxVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = k;
            long j = atomicLongFieldUpdater.get(this);
            rn rnVar = (rn) this.j.b((int) (2097151 & j));
            if (rnVar == null) {
                rnVar = null;
                tnVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = rnVar.c();
                while (true) {
                    oxVar = n;
                    if (c == oxVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    rn rnVar2 = (rn) c;
                    i = rnVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = rnVar2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    tn tnVar2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(tnVar2, j, j2 | i);
                    tnVar = tnVar2;
                    if (compareAndSet) {
                        rnVar.g(oxVar);
                    }
                    this = tnVar;
                } else {
                    continue;
                }
            }
            if (rnVar == null) {
                return false;
            }
            if (rn.l.compareAndSet(rnVar, -1, 0)) {
                LockSupport.unpark(rnVar);
                return true;
            }
            this = tnVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        xi0 xi0Var = this.j;
        int a = xi0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            rn rnVar = (rn) xi0Var.b(i6);
            if (rnVar != null) {
                a41 a41Var = rnVar.d;
                a41Var.getClass();
                Object objectVolatile = dc.a.getObjectVolatile(a41Var, a41.f);
                int b = a41Var.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = rnVar.f.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        o.n();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(cq.r(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.d;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
