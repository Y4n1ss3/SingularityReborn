package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class d60 {
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = dc.a;
        d = unsafe.objectFieldOffset(d60.class.getDeclaredField("_next$volatile"));
        e = unsafe.objectFieldOffset(d60.class.getDeclaredField("_prev$volatile"));
        f = unsafe.objectFieldOffset(d60.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(d60 d60Var, int i) {
        d60 d60Var2;
        d60 d60Var3;
        while (true) {
            d60 h = this.h();
            if (h instanceof n50) {
                return (((n50) h).g & i) == 0 && h.c(d60Var, i);
            }
            Unsafe unsafe = dc.a;
            unsafe.putObjectVolatile(d60Var, e, h);
            long j = d;
            unsafe.putObjectVolatile(d60Var, j, this);
            while (true) {
                Unsafe unsafe2 = dc.a;
                d60Var2 = this;
                d60Var3 = d60Var;
                if (unsafe2.compareAndSwapObject(h, d, d60Var2, d60Var3)) {
                    d60Var3.e(d60Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != d60Var2) {
                    break;
                }
                this = d60Var2;
                d60Var = d60Var3;
            }
            this = d60Var2;
            d60Var = d60Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d60 d() {
        d60 d60Var;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = dc.a;
            long j = e;
            d60 d60Var2 = (d60) unsafe2.getObjectVolatile(this, j);
            d60 d60Var3 = null;
            d60 d60Var4 = d60Var2;
            while (d60Var4 != null) {
                Unsafe unsafe3 = dc.a;
                long j2 = d;
                Object objectVolatile = unsafe3.getObjectVolatile(d60Var4, j2);
                if (objectVolatile != this) {
                    d60 d60Var5 = d60Var2;
                    d60Var = this;
                    if (d60Var.i()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof pi0)) {
                        objectVolatile.getClass();
                        d60Var3 = d60Var4;
                        d60Var4 = (d60) objectVolatile;
                    } else if (d60Var3 != null) {
                        d60 d60Var6 = ((pi0) objectVolatile).a;
                        do {
                            d60 d60Var7 = d60Var4;
                            unsafe = dc.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(d60Var3, d, d60Var7, d60Var6);
                            d60Var4 = d60Var7;
                            if (compareAndSwapObject) {
                                this = d60Var;
                                d60Var4 = d60Var3;
                                d60Var2 = d60Var5;
                                d60Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(d60Var3, j2) == d60Var4);
                    } else {
                        if (d60Var4 == null) {
                            throw new ClassCastException();
                        }
                        d60Var4 = (d60) unsafe3.getObjectVolatile(d60Var4, j);
                    }
                    this = d60Var;
                    d60Var2 = d60Var5;
                } else {
                    if (d60Var2 == d60Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = dc.a;
                        d60 d60Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(d60Var8, e, d60Var2, d60Var4);
                        d60 d60Var9 = d60Var2;
                        d60Var = d60Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(d60Var, j) != d60Var9) {
                            break;
                        }
                        this = d60Var;
                        d60Var2 = d60Var9;
                    }
                }
                this = d60Var;
            }
            throw new ClassCastException();
        }
    }

    public final void e(d60 d60Var) {
        d60 d60Var2;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = e;
            d60 d60Var3 = (d60) unsafe.getObjectVolatile(d60Var, j);
            if (this.f() != d60Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = dc.a;
                d60Var2 = this;
                d60 d60Var4 = d60Var;
                if (unsafe2.compareAndSwapObject(d60Var4, e, d60Var3, d60Var2)) {
                    if (d60Var2.i()) {
                        d60Var4.d();
                        return;
                    }
                    return;
                } else {
                    d60Var = d60Var4;
                    if (unsafe2.getObjectVolatile(d60Var4, j) != d60Var3) {
                        break;
                    } else {
                        this = d60Var2;
                    }
                }
            }
            this = d60Var2;
        }
    }

    public final Object f() {
        return dc.a.getObjectVolatile(this, d);
    }

    public final d60 g() {
        Object f2 = f();
        pi0 pi0Var = f2 instanceof pi0 ? (pi0) f2 : null;
        if (pi0Var != null) {
            return pi0Var.a;
        }
        f2.getClass();
        return (d60) f2;
    }

    public final d60 h() {
        d60 d2 = d();
        if (d2 != null) {
            return d2;
        }
        Unsafe unsafe = dc.a;
        long j = e;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            d60 d60Var = (d60) objectVolatile;
            if (!d60Var.i()) {
                return d60Var;
            }
            objectVolatile = dc.a.getObjectVolatile(d60Var, j);
        }
    }

    public boolean i() {
        return f() instanceof pi0;
    }

    public String toString() {
        return new c60(this, cq.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + cq.r(this);
    }
}
