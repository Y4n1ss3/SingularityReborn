package defpackage;

import androidx.compose.ui.graphics.Fields;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a41 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(Fields.SpotShadowColor);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = dc.a;
        f = unsafe.objectFieldOffset(a41.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(a41.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(a41.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(a41.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(a41.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(a41.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final lt0 a(lt0 lt0Var) {
        if (b() == 127) {
            return lt0Var;
        }
        if (lt0Var.e) {
            c.incrementAndGet(this);
        }
        int intVolatile = dc.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, lt0Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return dc.a.getIntVolatile(this, g) - dc.a.getIntVolatile(this, e);
    }

    public final lt0 c() {
        lt0 lt0Var;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            a41 a41Var = this;
            if (unsafe.compareAndSwapInt(a41Var, j, intVolatile, intVolatile + 1) && (lt0Var = (lt0) a41Var.a.getAndSet(i, null)) != null) {
                if (lt0Var.e) {
                    c.decrementAndGet(a41Var);
                }
                return lt0Var;
            }
            this = a41Var;
        }
    }

    public final lt0 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        lt0 lt0Var = (lt0) atomicReferenceArray.get(i2);
        if (lt0Var != null && lt0Var.e == z) {
            while (!atomicReferenceArray.compareAndSet(i2, lt0Var, null)) {
                if (atomicReferenceArray.get(i2) != lt0Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return lt0Var;
        }
        return null;
    }
}
