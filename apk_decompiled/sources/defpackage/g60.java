package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g60 {
    public static final ox e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = dc.a;
        f = unsafe.objectFieldOffset(g60.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(g60.class.getDeclaredField("_state$volatile"));
        e = new ox("REMOVE_FROZEN", 4);
    }

    public g60(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            o.f("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        o.f("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        g60 g60Var = this;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(g60Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = g60Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = g60Var.b;
            AtomicReferenceArray atomicReferenceArray = g60Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(g60Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    g60 g60Var2 = this;
                    while ((dc.a.getLongVolatile(g60Var2, j) & 1152921504606846976L) != 0) {
                        g60Var2 = g60Var2.c();
                        AtomicReferenceArray atomicReferenceArray2 = g60Var2.d;
                        int i4 = g60Var2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof f60) && ((f60) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            g60Var2 = null;
                        }
                        if (g60Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                g60Var = this;
            } else {
                int i5 = g60Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = dc.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            g60 g60Var = this;
            if (dc.a.compareAndSwapLong(g60Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = g60Var;
        }
    }

    public final g60 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = dc.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = dc.a;
            long j3 = f;
            g60 g60Var = (g60) unsafe3.getObjectVolatile(this, j3);
            if (g60Var != null) {
                return g60Var;
            }
            g60 g60Var2 = new g60(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new f60(i);
                }
                g60Var2.d.set(g60Var2.c & i, obj);
                i++;
            }
            dc.a.putLongVolatile(g60Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = dc.a;
                if (unsafe.compareAndSwapObject(this, f, (Object) null, g60Var2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        g60 g60Var = this;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(g60Var, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = g60Var.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = g60Var.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = g60Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof f60) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(g60Var, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                g60Var = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = dc.a;
                        long j3 = g;
                        long longVolatile2 = unsafe2.getLongVolatile(g60Var, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            g60Var = g60Var.c();
                        } else {
                            if (unsafe2.compareAndSwapLong(g60Var, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                g60Var.d.set(g60Var.c & i5, null);
                                g60Var = null;
                            } else {
                                continue;
                            }
                        }
                        if (g60Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
