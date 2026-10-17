package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ob0 extends vn0 implements lb0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(ob0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long i = dc.a.objectFieldOffset(ob0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = q10.g;

    public final boolean c() {
        return Math.max(dc.a.getIntVolatile(this, vn0.e), 0) == 0;
    }

    public final Object d(hm hmVar) {
        boolean e = e();
        w01 w01Var = w01.a;
        if (!e) {
            gg w = y80.w(d41.C(hmVar));
            try {
                a(new nb0(this, w));
                Object s = w.s();
                vn vnVar = vn.d;
                if (s != vnVar) {
                    s = w01Var;
                }
                if (s == vnVar) {
                    return s;
                }
            } catch (Throwable th) {
                w.A();
                throw th;
            }
        }
        return w01Var;
    }

    public final boolean e() {
        ob0 ob0Var;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = vn0.e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > 1) {
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    long j2 = vn0.e;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    if (intVolatile2 <= 1) {
                        ob0Var = this;
                        break;
                    }
                    ob0 ob0Var2 = this;
                    ob0Var = ob0Var2;
                    if (unsafe2.compareAndSwapInt(ob0Var2, j2, intVolatile2, 1)) {
                        break;
                    }
                    this = ob0Var;
                }
            } else {
                ob0Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(ob0Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(ob0Var, i, (Object) null);
                    return true;
                }
            }
            this = ob0Var;
        }
    }

    public final void f(Object obj) {
        while (this.c()) {
            Unsafe unsafe = dc.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ox oxVar = q10.g;
            if (objectVolatile != oxVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    ob0 ob0Var = this;
                    if (unsafe2.compareAndSwapObject(ob0Var, i, objectVolatile, oxVar)) {
                        ob0Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(ob0Var, j) != objectVolatile) {
                            this = ob0Var;
                            break;
                        }
                        this = ob0Var;
                    }
                }
            }
        }
        o.f("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + cq.r(this) + "[isLocked=" + c() + ",owner=" + dc.a.getObjectVolatile(this, i) + ']';
    }
}
