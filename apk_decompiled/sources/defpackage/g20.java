package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g20 implements n00 {
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final rc0 d;

    static {
        Unsafe unsafe = dc.a;
        f = unsafe.objectFieldOffset(g20.class.getDeclaredField("_isCompleting$volatile"));
        g = unsafe.objectFieldOffset(g20.class.getDeclaredField("_rootCause$volatile"));
        e = unsafe.objectFieldOffset(g20.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public g20(rc0 rc0Var, Throwable th) {
        this.d = rc0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            dc.a.putObjectVolatile(this, g, th);
            return;
        }
        if (th == c) {
            return;
        }
        Unsafe unsafe = dc.a;
        long j = e;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                o.p(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // defpackage.n00
    public final rc0 b() {
        return this.d;
    }

    public final Throwable c() {
        return (Throwable) dc.a.getObjectVolatile(this, g);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return dc.a.getIntVolatile(this, f) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = dc.a;
        long j = e;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                o.p(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, d41.f);
        return arrayList;
    }

    @Override // defpackage.n00
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + dc.a.getObjectVolatile(this, e) + ", list=" + this.d + ']';
    }
}
