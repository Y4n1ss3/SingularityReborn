package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class i20 implements z10 {
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = dc.a;
        e = unsafe.objectFieldOffset(i20.class.getDeclaredField("_state$volatile"));
        d = unsafe.objectFieldOffset(i20.class.getDeclaredField("_parentHandle$volatile"));
    }

    public i20(boolean z) {
        this._state$volatile = z ? d41.h : d41.g;
    }

    public static zh N(d60 d60Var) {
        while (d60Var.i()) {
            d60Var = d60Var.h();
        }
        while (true) {
            d60Var = d60Var.g();
            if (!d60Var.i()) {
                if (d60Var instanceof zh) {
                    return (zh) d60Var;
                }
                if (d60Var instanceof rc0) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (!(obj instanceof g20)) {
            return obj instanceof n00 ? ((n00) obj).isActive() ? "Active" : "New" : obj instanceof sj ? "Cancelled" : "Completed";
        }
        g20 g20Var = (g20) obj;
        return g20Var.d() ? "Cancelling" : g20Var.e() ? "Completing" : "Active";
    }

    public final Throwable A(g20 g20Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (g20Var.d()) {
                return new a20(v(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof pv0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof pv0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof oj;
    }

    public final rc0 D(n00 n00Var) {
        rc0 b = n00Var.b();
        if (b != null) {
            return b;
        }
        if (n00Var instanceof pt) {
            return new rc0();
        }
        if (n00Var instanceof d20) {
            S((d20) n00Var);
            return null;
        }
        o.p(n00Var, "State should have list: ");
        return null;
    }

    public final Object E() {
        return dc.a.getObjectVolatile(this, e);
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(z10 z10Var) {
        long j = d;
        tc0 tc0Var = tc0.d;
        if (z10Var == null) {
            dc.a.putObjectVolatile(this, j, tc0Var);
            return;
        }
        z10Var.start();
        yh b = z10Var.b(this);
        Unsafe unsafe = dc.a;
        unsafe.putObjectVolatile(this, j, b);
        if (E() instanceof n00) {
            return;
        }
        b.dispose();
        unsafe.putObjectVolatile(this, j, tc0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qr I(boolean z, d20 d20Var) {
        i20 i20Var;
        d20 d20Var2;
        tc0 tc0Var;
        boolean c;
        d20Var.g = this;
        loop0: while (true) {
            Object E = this.E();
            if (E instanceof pt) {
                pt ptVar = (pt) E;
                if (ptVar.d) {
                    while (true) {
                        Unsafe unsafe = dc.a;
                        long j = e;
                        i20Var = this;
                        d20Var2 = d20Var;
                        if (unsafe.compareAndSwapObject(i20Var, j, E, d20Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(i20Var, j) != E) {
                            break;
                        }
                        this = i20Var;
                        d20Var = d20Var2;
                    }
                } else {
                    i20Var = this;
                    d20Var2 = d20Var;
                    i20Var.R(ptVar);
                }
                this = i20Var;
                d20Var = d20Var2;
            } else {
                i20Var = this;
                d20Var2 = d20Var;
                boolean z2 = E instanceof n00;
                tc0Var = tc0.d;
                if (z2) {
                    n00 n00Var = (n00) E;
                    rc0 b = n00Var.b();
                    if (b == null) {
                        i20Var.S((d20) E);
                    } else {
                        if (d20Var2.k()) {
                            g20 g20Var = n00Var instanceof g20 ? (g20) n00Var : null;
                            Throwable c2 = g20Var != null ? g20Var.c() : null;
                            if (c2 == null) {
                                c = b.c(d20Var2, 5);
                            } else if (z) {
                                d20Var2.l(c2);
                                return tc0Var;
                            }
                        } else {
                            c = b.c(d20Var2, 1);
                        }
                        if (c) {
                            break;
                        }
                    }
                    this = i20Var;
                    d20Var = d20Var2;
                } else if (z) {
                    Object E2 = i20Var.E();
                    sj sjVar = E2 instanceof sj ? (sj) E2 : null;
                    d20Var2.l(sjVar != null ? sjVar.a : null);
                }
            }
        }
        return tc0Var;
    }

    public boolean J() {
        return this instanceof de;
    }

    public final boolean K(Object obj) {
        Object V;
        do {
            V = V(E(), obj);
            if (V == d41.b) {
                return false;
            }
            if (V == d41.c) {
                return true;
            }
        } while (V == d41.d);
        p(V);
        return true;
    }

    public final Object L(Object obj) {
        Object V;
        do {
            V = V(E(), obj);
            if (V == d41.b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                sj sjVar = obj instanceof sj ? (sj) obj : null;
                throw new IllegalStateException(str, sjVar != null ? sjVar.a : null);
            }
        } while (V == d41.d);
        return V;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    public final void O(rc0 rc0Var, Throwable th) {
        rc0Var.c(new n50(4), 4);
        Object f = rc0Var.f();
        f.getClass();
        tj tjVar = null;
        for (d60 d60Var = (d60) f; !d60Var.equals(rc0Var); d60Var = d60Var.g()) {
            if ((d60Var instanceof d20) && ((d20) d60Var).k()) {
                try {
                    ((d20) d60Var).l(th);
                } catch (Throwable th2) {
                    if (tjVar != null) {
                        d41.c(tjVar, th2);
                    } else {
                        tjVar = new tj("Exception in completion handler " + d60Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tjVar != null) {
            G(tjVar);
        }
        u(th);
    }

    public final void R(pt ptVar) {
        rc0 rc0Var = new rc0();
        Object m00Var = ptVar.d ? rc0Var : new m00(rc0Var);
        while (true) {
            Unsafe unsafe = dc.a;
            long j = e;
            i20 i20Var = this;
            pt ptVar2 = ptVar;
            if (unsafe.compareAndSwapObject(i20Var, j, ptVar2, m00Var) || unsafe.getObjectVolatile(i20Var, j) != ptVar2) {
                return;
            }
            this = i20Var;
            ptVar = ptVar2;
        }
    }

    public final void S(d20 d20Var) {
        d20 d20Var2;
        i20 i20Var;
        rc0 rc0Var = new rc0();
        Unsafe unsafe = dc.a;
        unsafe.putObjectVolatile(rc0Var, d60.e, d20Var);
        long j = d60.d;
        unsafe.putObjectVolatile(rc0Var, j, d20Var);
        loop0: while (true) {
            if (d20Var.f() != d20Var) {
                d20Var2 = d20Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = dc.a;
                d20Var2 = d20Var;
                if (unsafe2.compareAndSwapObject(d20Var2, d60.d, d20Var, rc0Var)) {
                    rc0Var.e(d20Var2);
                    break loop0;
                }
                i20Var = this;
                d20Var = d20Var2;
                if (unsafe2.getObjectVolatile(d20Var2, j) != d20Var2) {
                    break;
                } else {
                    this = i20Var;
                }
            }
            this = i20Var;
        }
        d60 g = d20Var2.g();
        while (true) {
            Unsafe unsafe3 = dc.a;
            long j2 = e;
            i20 i20Var2 = this;
            if (unsafe3.compareAndSwapObject(i20Var2, j2, d20Var2, g) || unsafe3.getObjectVolatile(i20Var2, j2) != d20Var2) {
                return;
            } else {
                this = i20Var2;
            }
        }
    }

    public final int T(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof pt;
        long j = e;
        if (z) {
            if (((pt) obj).d) {
                return 0;
            }
            pt ptVar = d41.h;
            do {
                unsafe2 = dc.a;
                if (unsafe2.compareAndSwapObject(this, e, obj, ptVar)) {
                    Q();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof m00)) {
            return 0;
        }
        rc0 rc0Var = ((m00) obj).d;
        do {
            unsafe = dc.a;
            if (unsafe.compareAndSwapObject(this, e, obj, rc0Var)) {
                Q();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object V(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof n00)) {
            return d41.b;
        }
        if ((!(obj instanceof pt) && !(obj instanceof d20)) || (obj instanceof zh) || (obj2 instanceof sj)) {
            i20 i20Var = this;
            n00 n00Var = (n00) obj;
            rc0 D = i20Var.D(n00Var);
            if (D == null) {
                return d41.d;
            }
            g20 g20Var = n00Var instanceof g20 ? (g20) n00Var : null;
            if (g20Var == null) {
                g20Var = new g20(D, null);
            }
            g20 g20Var2 = g20Var;
            synchronized (g20Var2) {
                if (g20Var2.e()) {
                    return d41.b;
                }
                dc.a.putIntVolatile(g20Var2, g20.f, 1);
                if (g20Var2 != n00Var) {
                    do {
                        unsafe = dc.a;
                        j = e;
                        i20 i20Var2 = i20Var;
                        i20Var = i20Var2;
                        if (unsafe.compareAndSwapObject(i20Var2, j, n00Var, g20Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(i20Var, j) == n00Var);
                    return d41.d;
                }
                boolean d2 = g20Var2.d();
                sj sjVar = obj2 instanceof sj ? (sj) obj2 : null;
                if (sjVar != null) {
                    g20Var2.a(sjVar.a);
                }
                Throwable c = d2 ? null : g20Var2.c();
                if (c != null) {
                    i20Var.O(D, c);
                }
                zh N = N(D);
                if (N != null && i20Var.W(g20Var2, N, obj2)) {
                    return d41.c;
                }
                D.c(new n50(2), 2);
                zh N2 = N(D);
                return (N2 == null || !i20Var.W(g20Var2, N2, obj2)) ? i20Var.z(g20Var2, obj2) : d41.c;
            }
        }
        n00 n00Var2 = (n00) obj;
        Object o00Var = obj2 instanceof n00 ? new o00((n00) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = dc.a;
            long j2 = e;
            i20 i20Var3 = this;
            if (unsafe2.compareAndSwapObject(i20Var3, j2, n00Var2, o00Var)) {
                i20Var3.P(obj2);
                i20Var3.x(n00Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(i20Var3, j2) != n00Var2) {
                return d41.d;
            }
            this = i20Var3;
        }
    }

    public final boolean W(g20 g20Var, zh zhVar, Object obj) {
        while (cq.w(zhVar.h, false, new f20(this, g20Var, zhVar, obj)) == tc0.d) {
            zhVar = N(zhVar);
            if (zhVar == null) {
                return false;
            }
        }
        return true;
    }

    public Object a(jo joVar) {
        return r(joVar);
    }

    @Override // defpackage.z10
    public final yh b(i20 i20Var) {
        i20 i20Var2;
        zh zhVar = new zh(i20Var);
        zhVar.g = this;
        loop0: while (true) {
            Object E = this.E();
            if (E instanceof pt) {
                pt ptVar = (pt) E;
                if (ptVar.d) {
                    while (true) {
                        Unsafe unsafe = dc.a;
                        long j = e;
                        i20Var2 = this;
                        if (unsafe.compareAndSwapObject(i20Var2, j, E, zhVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(i20Var2, j) != E) {
                            break;
                        }
                        this = i20Var2;
                    }
                } else {
                    i20Var2 = this;
                    i20Var2.R(ptVar);
                }
                this = i20Var2;
            } else {
                i20Var2 = this;
                boolean z = E instanceof n00;
                tc0 tc0Var = tc0.d;
                if (!z) {
                    Object E2 = i20Var2.E();
                    sj sjVar = E2 instanceof sj ? (sj) E2 : null;
                    zhVar.l(sjVar != null ? sjVar.a : null);
                    return tc0Var;
                }
                rc0 b = ((n00) E).b();
                if (b == null) {
                    i20Var2.S((d20) E);
                    this = i20Var2;
                } else if (!b.c(zhVar, 7)) {
                    boolean c = b.c(zhVar, 3);
                    Object E3 = i20Var2.E();
                    if (E3 instanceof g20) {
                        r0 = ((g20) E3).c();
                    } else {
                        sj sjVar2 = E3 instanceof sj ? (sj) E3 : null;
                        if (sjVar2 != null) {
                            r0 = sjVar2.a;
                        }
                    }
                    zhVar.l(r0);
                    if (c) {
                        break loop0;
                    }
                    return tc0Var;
                }
            }
        }
        return zhVar;
    }

    @Override // defpackage.z10, defpackage.zg
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a20(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // defpackage.z10
    public final qr e(boolean z, boolean z2, c20 c20Var) {
        return I(z2, z ? new v10(c20Var) : new w10(c20Var));
    }

    @Override // defpackage.z10
    public final CancellationException f() {
        CancellationException cancellationException;
        Object E = E();
        if (E instanceof g20) {
            Throwable c = ((g20) E).c();
            if (c == null) {
                o.p(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new a20(concat, c, this) : cancellationException;
        }
        if (E instanceof n00) {
            o.p(this, "Job is still new or active: ");
            return null;
        }
        if (!(E instanceof sj)) {
            return new a20(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((sj) E).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new a20(v(), th, this) : cancellationException;
    }

    @Override // defpackage.kn
    public final Object fold(Object obj, my myVar) {
        return myVar.invoke(obj, this);
    }

    @Override // defpackage.kn
    public final in get(jn jnVar) {
        return y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public final jn getKey() {
        return ts.l;
    }

    @Override // defpackage.z10
    public final qr h(ky kyVar) {
        return I(true, new w10(kyVar));
    }

    @Override // defpackage.z10
    public boolean isActive() {
        Object E = E();
        return (E instanceof n00) && ((n00) E).isActive();
    }

    @Override // defpackage.kn
    public final kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // defpackage.z10
    public final Object n(im imVar) {
        Object E;
        w01 w01Var;
        do {
            E = E();
            boolean z = E instanceof n00;
            w01Var = w01.a;
            if (!z) {
                cq.l(imVar.getContext());
                return w01Var;
            }
        } while (T(E) < 0);
        gg ggVar = new gg(1, d41.C(imVar));
        ggVar.u();
        ggVar.w(new dg(cq.w(this, true, new mj0(ggVar)), 1));
        Object s = ggVar.s();
        vn vnVar = vn.d;
        if (s != vnVar) {
            s = w01Var;
        }
        return s == vnVar ? s : w01Var;
    }

    @Override // defpackage.kn
    public final kn plus(kn knVar) {
        return y80.I(this, knVar);
    }

    public void q(Object obj) {
        p(obj);
    }

    public final Object r(hm hmVar) {
        Object E;
        do {
            E = E();
            if (!(E instanceof n00)) {
                if (E instanceof sj) {
                    throw ((sj) E).a;
                }
                return d41.N(E);
            }
        } while (T(E) < 0);
        e20 e20Var = new e20(d41.C(hmVar), this);
        e20Var.u();
        e20Var.w(new dg(cq.w(this, true, new lj0(e20Var)), 1));
        return e20Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == defpackage.d41.c) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Object obj) {
        i20 i20Var;
        ox oxVar;
        Object obj2;
        Object obj3 = d41.b;
        if (C()) {
            do {
                Object E = E();
                if (!(E instanceof n00) || ((E instanceof g20) && ((g20) E).e())) {
                    obj3 = d41.b;
                    break;
                }
                obj3 = V(E, new sj(y(obj), false));
            } while (obj3 == d41.d);
        }
        if (obj3 == d41.b) {
            Throwable th = null;
            loop1: while (true) {
                Object E2 = this.E();
                if (!(E2 instanceof g20)) {
                    if (!(E2 instanceof n00)) {
                        i20Var = this;
                        obj2 = d41.e;
                        break;
                    }
                    if (th == null) {
                        th = this.y(obj);
                    }
                    n00 n00Var = (n00) E2;
                    if (n00Var.isActive()) {
                        rc0 D = this.D(n00Var);
                        if (D == null) {
                            i20Var = this;
                        } else {
                            g20 g20Var = new g20(D, th);
                            while (true) {
                                Unsafe unsafe = dc.a;
                                long j = e;
                                i20Var = this;
                                if (unsafe.compareAndSwapObject(i20Var, j, n00Var, g20Var)) {
                                    i20Var.O(D, th);
                                    obj2 = d41.b;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(i20Var, j) != n00Var) {
                                    break;
                                }
                                this = i20Var;
                            }
                        }
                        this = i20Var;
                    } else {
                        i20Var = this;
                        obj2 = i20Var.V(E2, new sj(th, false));
                        if (obj2 == d41.b) {
                            o.p(E2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != d41.d) {
                            break;
                        }
                        this = i20Var;
                    }
                } else {
                    synchronized (E2) {
                        if (dc.a.getObjectVolatile((g20) E2, g20.e) == d41.f) {
                            oxVar = d41.e;
                        } else {
                            boolean d2 = ((g20) E2).d();
                            if (th == null) {
                                th = this.y(obj);
                            }
                            ((g20) E2).a(th);
                            Throwable c = d2 ? null : ((g20) E2).c();
                            if (c != null) {
                                this.O(((g20) E2).d, c);
                            }
                            oxVar = d41.b;
                        }
                    }
                    i20Var = this;
                    obj3 = oxVar;
                }
            }
            obj3 = obj2;
        } else {
            i20Var = this;
        }
        if (obj3 != d41.b && obj3 != d41.c) {
            if (obj3 == d41.e) {
                return false;
            }
            i20Var.p(obj3);
            return true;
        }
        return true;
    }

    @Override // defpackage.z10
    public final boolean start() {
        int T;
        do {
            T = T(E());
            if (T == 0) {
                return false;
            }
        } while (T != 1);
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        return (M() + '{' + U(E()) + '}') + '@' + cq.r(this);
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        yh yhVar = (yh) dc.a.getObjectVolatile(this, d);
        return (yhVar == null || yhVar == tc0.d) ? z : yhVar.a(th) || z;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    public final void x(n00 n00Var, Object obj) {
        Unsafe unsafe = dc.a;
        long j = d;
        yh yhVar = (yh) unsafe.getObjectVolatile(this, j);
        if (yhVar != null) {
            yhVar.dispose();
            unsafe.putObjectVolatile(this, j, tc0.d);
        }
        tj tjVar = null;
        sj sjVar = obj instanceof sj ? (sj) obj : null;
        Throwable th = sjVar != null ? sjVar.a : null;
        if (n00Var instanceof d20) {
            try {
                ((d20) n00Var).l(th);
                return;
            } catch (Throwable th2) {
                G(new tj("Exception in completion handler " + n00Var + " for " + this, th2));
                return;
            }
        }
        rc0 b = n00Var.b();
        if (b != null) {
            b.c(new n50(1), 1);
            Object f = b.f();
            f.getClass();
            for (d60 d60Var = (d60) f; !d60Var.equals(b); d60Var = d60Var.g()) {
                if (d60Var instanceof d20) {
                    try {
                        ((d20) d60Var).l(th);
                    } catch (Throwable th3) {
                        if (tjVar != null) {
                            d41.c(tjVar, th3);
                        } else {
                            tjVar = new tj("Exception in completion handler " + d60Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (tjVar != null) {
                G(tjVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        i20 i20Var = (i20) obj;
        Object E = i20Var.E();
        if (E instanceof g20) {
            cancellationException = ((g20) E).c();
        } else if (E instanceof sj) {
            cancellationException = ((sj) E).a;
        } else {
            if (E instanceof n00) {
                o.p(E, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new a20("Parent job is ".concat(U(E)), cancellationException, i20Var) : cancellationException2;
    }

    public final Object z(g20 g20Var, Object obj) {
        g20 g20Var2;
        Throwable th;
        Throwable A;
        i20 i20Var;
        g20 g20Var3;
        sj sjVar = obj instanceof sj ? (sj) obj : null;
        Throwable th2 = sjVar != null ? sjVar.a : null;
        synchronized (g20Var) {
            try {
                g20Var.d();
                ArrayList f = g20Var.f(th2);
                A = A(g20Var, f);
                if (A != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != A && th3 != A && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    d41.c(A, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        g20Var2 = g20Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                g20Var2 = g20Var;
                th = th5;
            }
        }
        if (A != null && A != th2) {
            obj = new sj(A, false);
        }
        if (A != null && (u(A) || F(A))) {
            obj.getClass();
            dc.a.compareAndSwapInt((sj) obj, sj.b, 0, 1);
        }
        P(obj);
        Object o00Var = obj instanceof n00 ? new o00((n00) obj) : obj;
        while (true) {
            Unsafe unsafe = dc.a;
            long j = e;
            i20Var = this;
            g20Var3 = g20Var;
            if (!unsafe.compareAndSwapObject(i20Var, j, g20Var3, o00Var) && unsafe.getObjectVolatile(i20Var, j) == g20Var3) {
                this = i20Var;
                g20Var = g20Var3;
            }
        }
        i20Var.x(g20Var3, obj);
        return obj;
    }

    public void Q() {
    }

    public void G(tj tjVar) {
        throw tjVar;
    }

    public void P(Object obj) {
    }

    public void p(Object obj) {
    }
}
