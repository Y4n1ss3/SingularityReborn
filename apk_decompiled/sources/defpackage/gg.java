package defpackage;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class gg extends mr implements fg, wn, f21 {
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final hm g;
    public final kn h;

    static {
        Unsafe unsafe = dc.a;
        i = unsafe.objectFieldOffset(gg.class.getDeclaredField("_decisionAndIndex$volatile"));
        k = unsafe.objectFieldOffset(gg.class.getDeclaredField("_state$volatile"));
        j = unsafe.objectFieldOffset(gg.class.getDeclaredField("_parentHandle$volatile"));
    }

    public gg(int i2, hm hmVar) {
        super(i2);
        this.g = hmVar;
        this.h = hmVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = r1.a;
    }

    public static Object D(vc0 vc0Var, Object obj, int i2, ny nyVar) {
        if (obj instanceof sj) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (nyVar != null || (vc0Var instanceof dg)) {
            return new qj(obj, vc0Var instanceof dg ? (dg) vc0Var : null, nyVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(vc0 vc0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + vc0Var + ", already has " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.p();
        r9.l(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        gg ggVar;
        Unsafe unsafe;
        hm hmVar = this.g;
        Throwable th = null;
        kr krVar = hmVar instanceof kr ? (kr) hmVar : null;
        if (krVar == null) {
            return;
        }
        long j2 = kr.k;
        loop0: while (true) {
            Object objectVolatile = dc.a.getObjectVolatile(krVar, j2);
            ox oxVar = q10.f;
            if (objectVolatile != oxVar) {
                ggVar = this;
                if (!(objectVolatile instanceof Throwable)) {
                    o.p(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = dc.a;
                    if (unsafe.compareAndSwapObject(krVar, kr.k, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(krVar, j2) == objectVolatile);
                o.m("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = dc.a;
                gg ggVar2 = this;
                ggVar = ggVar2;
                if (unsafe2.compareAndSwapObject(krVar, kr.k, oxVar, ggVar2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(krVar, j2) != oxVar) {
                    break;
                } else {
                    this = ggVar;
                }
            }
            this = ggVar;
        }
    }

    public final void B(Object obj, int i2, ny nyVar) {
        gg ggVar;
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof vc0)) {
                gg ggVar2 = this;
                if (objectVolatile instanceof hg) {
                    hg hgVar = (hg) objectVolatile;
                    if (unsafe.compareAndSwapInt(hgVar, hg.c, 0, 1)) {
                        if (nyVar != null) {
                            ggVar2.m(nyVar, hgVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                o.p(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object D = D((vc0) objectVolatile, obj, i2, nyVar);
            while (true) {
                Unsafe unsafe2 = dc.a;
                ggVar = this;
                if (unsafe2.compareAndSwapObject(ggVar, k, objectVolatile, D)) {
                    if (!ggVar.x()) {
                        ggVar.p();
                    }
                    ggVar.q(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(ggVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = ggVar;
                }
            }
            this = ggVar;
        }
    }

    public final void C(mn mnVar) {
        hm hmVar = this.g;
        kr krVar = hmVar instanceof kr ? (kr) hmVar : null;
        B(w01.a, (krVar != null ? krVar.g : null) == mnVar ? 4 : this.f, null);
    }

    @Override // defpackage.f21
    public final void a(dn0 dn0Var, int i2) {
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = i;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if ((intVolatile & 536870911) != 536870911) {
                o.f("invokeOnCancellation should be called at most once");
                return;
            }
            gg ggVar = this;
            if (unsafe.compareAndSwapInt(ggVar, j2, intVolatile, ((intVolatile >> 29) << 29) + i2)) {
                ggVar.w(dn0Var);
                return;
            }
            this = ggVar;
        }
    }

    @Override // defpackage.mr
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        gg ggVar;
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof vc0) {
                o.f("Not completed");
                return;
            }
            if (objectVolatile instanceof sj) {
                return;
            }
            if (objectVolatile instanceof qj) {
                qj qjVar = (qj) objectVolatile;
                if (qjVar.e != null) {
                    o.f("Must be called at most once");
                    return;
                }
                qj a = qj.a(qjVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = dc.a;
                    gg ggVar2 = this;
                    if (unsafe2.compareAndSwapObject(ggVar2, k, objectVolatile, a)) {
                        dg dgVar = qjVar.b;
                        if (dgVar != null) {
                            ggVar2.j(dgVar, cancellationException);
                        }
                        ny nyVar = qjVar.c;
                        if (nyVar != null) {
                            ggVar2.m(nyVar, cancellationException, qjVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ggVar2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ggVar = ggVar2;
                        break;
                    }
                    this = ggVar2;
                }
            } else {
                gg ggVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                qj qjVar2 = new qj(objectVolatile, (dg) null, (ny) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    qj qjVar3 = qjVar2;
                    Unsafe unsafe3 = dc.a;
                    ggVar = ggVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(ggVar, k, objectVolatile, qjVar3);
                    qjVar2 = qjVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ggVar, j2) != objectVolatile) {
                        break;
                    } else {
                        ggVar3 = ggVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ggVar;
        }
    }

    @Override // defpackage.fg
    public final ox c(Object obj, ny nyVar) {
        gg ggVar;
        ox oxVar = y80.b;
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof vc0)) {
                return null;
            }
            Object D = D((vc0) objectVolatile, obj, this.f, nyVar);
            while (true) {
                Unsafe unsafe2 = dc.a;
                ggVar = this;
                if (unsafe2.compareAndSwapObject(ggVar, k, objectVolatile, D)) {
                    if (!ggVar.x()) {
                        ggVar.p();
                    }
                    return oxVar;
                }
                if (unsafe2.getObjectVolatile(ggVar, j2) != objectVolatile) {
                    break;
                }
                this = ggVar;
            }
            this = ggVar;
        }
    }

    @Override // defpackage.fg
    public final void d(ky kyVar) {
        w(new dg(kyVar, 0));
    }

    @Override // defpackage.mr
    public final hm e() {
        return this.g;
    }

    @Override // defpackage.mr
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f != null) {
            return f;
        }
        return null;
    }

    @Override // defpackage.mr
    public final Object g(Object obj) {
        return obj instanceof qj ? ((qj) obj).a : obj;
    }

    @Override // defpackage.wn
    public final wn getCallerFrame() {
        hm hmVar = this.g;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return this.h;
    }

    @Override // defpackage.mr
    public final Object i() {
        return t();
    }

    @Override // defpackage.fg
    public final boolean isActive() {
        return t() instanceof vc0;
    }

    public final void j(dg dgVar, Throwable th) {
        try {
            switch (dgVar.a) {
                case 0:
                    ((ky) dgVar.b).invoke(th);
                    break;
                default:
                    ((qr) dgVar.b).dispose();
                    break;
            }
        } catch (Throwable th2) {
            cq.u(this.h, new tj("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.fg
    public final void k(Object obj, ny nyVar) {
        B(obj, this.f, nyVar);
    }

    @Override // defpackage.fg
    public final boolean l(Throwable th) {
        gg ggVar;
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof vc0)) {
                return false;
            }
            hg hgVar = new hg(this, th, (objectVolatile instanceof dg) || (objectVolatile instanceof dn0));
            while (true) {
                Unsafe unsafe2 = dc.a;
                ggVar = this;
                if (unsafe2.compareAndSwapObject(ggVar, k, objectVolatile, hgVar)) {
                    vc0 vc0Var = (vc0) objectVolatile;
                    if (vc0Var instanceof dg) {
                        ggVar.j((dg) objectVolatile, th);
                    } else if (vc0Var instanceof dn0) {
                        ggVar.n((dn0) objectVolatile, th);
                    }
                    if (!ggVar.x()) {
                        ggVar.p();
                    }
                    ggVar.q(ggVar.f);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ggVar, j2) != objectVolatile) {
                    break;
                }
                this = ggVar;
            }
            this = ggVar;
        }
    }

    public final void m(ny nyVar, Throwable th, Object obj) {
        kn knVar = this.h;
        try {
            nyVar.invoke(th, obj, knVar);
        } catch (Throwable th2) {
            cq.u(knVar, new tj("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(dn0 dn0Var, Throwable th) {
        kn knVar = this.h;
        int intVolatile = dc.a.getIntVolatile(this, i) & 536870911;
        if (intVolatile == 536870911) {
            o.f("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            dn0Var.g(intVolatile, knVar);
        } catch (Throwable th2) {
            cq.u(knVar, new tj("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.fg
    public final void o(Object obj) {
        q(this.f);
    }

    public final void p() {
        Unsafe unsafe = dc.a;
        long j2 = j;
        qr qrVar = (qr) unsafe.getObjectVolatile(this, j2);
        if (qrVar == null) {
            return;
        }
        qrVar.dispose();
        unsafe.putObjectVolatile(this, j2, tc0.d);
    }

    public final void q(int i2) {
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = i;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i3 = intVolatile >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    o.f("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                hm hmVar = this.g;
                if (!z && (hmVar instanceof kr)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i4 = this.f;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        kr krVar = (kr) hmVar;
                        mn mnVar = krVar.g;
                        kn context = krVar.h.getContext();
                        if (mnVar.isDispatchNeeded(context)) {
                            mnVar.dispatch(context, this);
                            return;
                        }
                        du a = xu0.a();
                        if (a.d >= 4294967296L) {
                            a.i(this);
                            return;
                        }
                        a.j(true);
                        try {
                            p01.A(this, hmVar, true);
                            do {
                            } while (a.l());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                p01.A(this, hmVar, z);
                return;
            }
            gg ggVar = this;
            if (unsafe.compareAndSwapInt(ggVar, j2, intVolatile, GroupFlagsKt.IsSubcompositionContextFlag + (536870911 & intVolatile))) {
                return;
            } else {
                this = ggVar;
            }
        }
    }

    public Throwable r(i20 i20Var) {
        return i20Var.f();
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        Throwable a = kj0.a(obj);
        if (a != null) {
            obj = new sj(a, false);
        }
        B(obj, this.f, null);
    }

    public final Object s() {
        z10 z10Var;
        boolean x = x();
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = i;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    o.f("Already suspended");
                    return null;
                }
                if (x) {
                    this.A();
                }
                Object t = this.t();
                if (t instanceof sj) {
                    throw ((sj) t).a;
                }
                int i3 = this.f;
                if ((i3 != 1 && i3 != 2) || (z10Var = (z10) this.h.get(ts.l)) == null || z10Var.isActive()) {
                    return this.g(t);
                }
                CancellationException f = z10Var.f();
                this.b(f);
                throw f;
            }
            gg ggVar = this;
            if (unsafe.compareAndSwapInt(ggVar, j2, intVolatile, GroupFlagsKt.HasMovableContentFlag + (536870911 & intVolatile))) {
                if (((qr) unsafe.getObjectVolatile(ggVar, j)) == null) {
                    ggVar.v();
                }
                if (x) {
                    ggVar.A();
                }
                return vn.d;
            }
            this = ggVar;
        }
    }

    public final Object t() {
        return dc.a.getObjectVolatile(this, k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(z());
        sb.append('(');
        sb.append(cq.H(this.g));
        sb.append("){");
        Object t = t();
        sb.append(t instanceof vc0 ? "Active" : t instanceof hg ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(cq.r(this));
        return sb.toString();
    }

    public final void u() {
        qr v = v();
        if (v == null || (t() instanceof vc0)) {
            return;
        }
        v.dispose();
        dc.a.putObjectVolatile(this, j, tc0.d);
    }

    public final qr v() {
        z10 z10Var = (z10) this.h.get(ts.l);
        if (z10Var == null) {
            return null;
        }
        qr w = cq.w(z10Var, true, new xh(this));
        while (true) {
            Unsafe unsafe = dc.a;
            long j2 = j;
            gg ggVar = this;
            if (!unsafe.compareAndSwapObject(ggVar, j2, (Object) null, w) && unsafe.getObjectVolatile(ggVar, j2) == null) {
                this = ggVar;
            }
        }
        return w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        y(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(vc0 vc0Var) {
        vc0 vc0Var2;
        gg ggVar;
        gg ggVar2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = dc.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof r1) {
                while (true) {
                    Unsafe unsafe3 = dc.a;
                    gg ggVar3 = this;
                    vc0 vc0Var3 = vc0Var;
                    ggVar = ggVar3;
                    vc0Var2 = vc0Var3;
                    if (unsafe3.compareAndSwapObject(ggVar3, k, objectVolatile, vc0Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ggVar, j2) != objectVolatile) {
                        break;
                    }
                    this = ggVar;
                    vc0Var = vc0Var2;
                }
            } else {
                vc0Var2 = vc0Var;
                ggVar = this;
                if ((objectVolatile instanceof dg) || (objectVolatile instanceof dn0)) {
                    break;
                }
                if (objectVolatile instanceof sj) {
                    sj sjVar = (sj) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(sjVar, sj.b, 0, 1)) {
                        y(vc0Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof hg) {
                        Throwable th = sjVar.a;
                        if (vc0Var2 instanceof dg) {
                            ggVar.j((dg) vc0Var2, th);
                            return;
                        } else {
                            ggVar.n((dn0) vc0Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof qj) {
                    qj qjVar = (qj) objectVolatile;
                    if (qjVar.b != null) {
                        y(vc0Var2, objectVolatile);
                        throw null;
                    }
                    if (vc0Var2 instanceof dn0) {
                        return;
                    }
                    dg dgVar = (dg) vc0Var2;
                    Throwable th2 = qjVar.e;
                    if (th2 != null) {
                        ggVar.j(dgVar, th2);
                        return;
                    }
                    qj a = qj.a(qjVar, dgVar, null, 29);
                    do {
                        unsafe = dc.a;
                        if (unsafe.compareAndSwapObject(ggVar, k, objectVolatile, a)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ggVar, j2) == objectVolatile);
                } else {
                    if (vc0Var2 instanceof dn0) {
                        return;
                    }
                    qj qjVar2 = new qj(objectVolatile, (dg) vc0Var2, (ny) null, (Throwable) null, 28);
                    while (true) {
                        qj qjVar3 = qjVar2;
                        Unsafe unsafe4 = dc.a;
                        ggVar2 = ggVar;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(ggVar2, k, objectVolatile, qjVar3);
                        qjVar2 = qjVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(ggVar2, j2) != objectVolatile) {
                            break;
                        } else {
                            ggVar = ggVar2;
                        }
                    }
                    this = ggVar2;
                    vc0Var = vc0Var2;
                }
            }
            ggVar2 = ggVar;
            this = ggVar2;
            vc0Var = vc0Var2;
        }
    }

    public final boolean x() {
        if (this.f == 2) {
            return dc.a.getObjectVolatile((kr) this.g, kr.k) != null;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
