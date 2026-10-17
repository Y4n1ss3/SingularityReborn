package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wr0 extends l0 implements kb0, iw, yy {
    public static final /* synthetic */ long i = dc.a.objectFieldOffset(wr0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int h;

    public wr0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.jb0
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.jb0
    public final boolean b(Object obj) {
        i(obj);
        return true;
    }

    @Override // defpackage.yy
    public final iw c(kn knVar, int i2, mf mfVar) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || mfVar != mf.e) && !((i2 == 0 || i2 == -3) && mfVar == mf.d)) ? new dh(this, knVar, i2, mfVar) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r13.equals(r15) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (r9 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [xr0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xr0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xr0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [xr0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(jw jwVar, hm hmVar) {
        vr0 vr0Var;
        ?? r1;
        wr0 wr0Var;
        jw jwVar2;
        z10 z10Var;
        Object obj;
        Object andSet;
        try {
            if (hmVar instanceof vr0) {
                vr0Var = (vr0) hmVar;
                int i2 = vr0Var.k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vr0Var.k = i2 - Integer.MIN_VALUE;
                    Object obj2 = vr0Var.i;
                    r1 = vr0Var.k;
                    vn vnVar = vn.d;
                    if (r1 != 0) {
                        p10.Q(obj2);
                        r1 = (xr0) d();
                    } else if (r1 == 1) {
                        r1 = vr0Var.f;
                        jwVar = vr0Var.e;
                        this = vr0Var.d;
                        try {
                            p10.Q(obj2);
                            r1 = r1;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.g(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = vr0Var.h;
                        z10Var = vr0Var.g;
                        xr0 xr0Var = vr0Var.f;
                        jwVar2 = vr0Var.e;
                        wr0Var = vr0Var.d;
                        p10.Q(obj2);
                        r1 = xr0Var;
                        AtomicReference atomicReference = r1.a;
                        ox oxVar = p10.i;
                        andSet = atomicReference.getAndSet(oxVar);
                        andSet.getClass();
                        if (andSet == p10.j) {
                        }
                        if (wr0Var != null) {
                        }
                    } else {
                        if (r1 != 3) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = vr0Var.h;
                        z10Var = vr0Var.g;
                        r1 = vr0Var.f;
                        jwVar2 = vr0Var.e;
                        wr0Var = vr0Var.d;
                        p10.Q(obj2);
                        if (wr0Var != null) {
                            Object objectVolatile = dc.a.getObjectVolatile(wr0Var, i);
                            if (z10Var != null && !z10Var.isActive()) {
                                throw z10Var.f();
                            }
                            Object obj3 = objectVolatile == y80.e ? null : objectVolatile;
                            vr0Var.d = wr0Var;
                            vr0Var.e = jwVar2;
                            vr0Var.f = r1;
                            vr0Var.g = z10Var;
                            vr0Var.h = objectVolatile;
                            vr0Var.k = 2;
                            if (jwVar2.emit(obj3, vr0Var) == vnVar) {
                                return vnVar;
                            }
                            obj = objectVolatile;
                            r1 = r1;
                            AtomicReference atomicReference2 = r1.a;
                            ox oxVar2 = p10.i;
                            andSet = atomicReference2.getAndSet(oxVar2);
                            andSet.getClass();
                            if (andSet == p10.j) {
                                vr0Var.d = wr0Var;
                                vr0Var.e = jwVar2;
                                vr0Var.f = r1;
                                vr0Var.g = z10Var;
                                vr0Var.h = obj;
                                vr0Var.k = 3;
                                w01 w01Var = w01.a;
                                gg ggVar = new gg(1, d41.C(vr0Var));
                                ggVar.u();
                                AtomicReference atomicReference3 = r1.a;
                                while (true) {
                                    if (atomicReference3.compareAndSet(oxVar2, ggVar)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != oxVar2) {
                                        ggVar.resumeWith(w01Var);
                                        break;
                                    }
                                }
                                Object s = ggVar.s();
                                if (s == vnVar) {
                                }
                            }
                            if (wr0Var != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                    wr0Var = this;
                    jwVar2 = jwVar;
                    z10Var = (z10) vr0Var.getContext().get(ts.l);
                    obj = null;
                    if (wr0Var != null) {
                    }
                }
            }
            if (r1 != 0) {
            }
            wr0Var = this;
            jwVar2 = jwVar;
            z10Var = (z10) vr0Var.getContext().get(ts.l);
            obj = null;
            if (wr0Var != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        vr0Var = new vr0(this, hmVar);
        Object obj22 = vr0Var.i;
        r1 = vr0Var.k;
        vn vnVar2 = vn.d;
    }

    @Override // defpackage.l0
    public final m0 e() {
        return new xr0();
    }

    @Override // defpackage.jb0, defpackage.jw
    public final Object emit(Object obj, hm hmVar) {
        i(obj);
        return w01.a;
    }

    @Override // defpackage.l0
    public final m0[] f() {
        return new xr0[2];
    }

    @Override // defpackage.ur0
    public final Object getValue() {
        ox oxVar = y80.e;
        Object objectVolatile = dc.a.getObjectVolatile(this, i);
        if (objectVolatile == oxVar) {
            return null;
        }
        return objectVolatile;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = y80.e;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i2;
        m0[] m0VarArr;
        ox oxVar;
        synchronized (this) {
            Unsafe unsafe = dc.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !q10.b(objectVolatile, obj)) {
                return false;
            }
            if (q10.b(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i3 = this.h;
            if ((i3 & 1) != 0) {
                this.h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.h = i4;
            m0[] m0VarArr2 = this.d;
            while (true) {
                xr0[] xr0VarArr = (xr0[]) m0VarArr2;
                if (xr0VarArr != null) {
                    for (xr0 xr0Var : xr0VarArr) {
                        if (xr0Var != null) {
                            AtomicReference atomicReference = xr0Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (oxVar = p10.j)) {
                                    ox oxVar2 = p10.i;
                                    if (obj3 != oxVar2) {
                                        while (!atomicReference.compareAndSet(obj3, oxVar2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((gg) obj3).resumeWith(w01.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, oxVar)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.h;
                    if (i2 == i4) {
                        this.h = i4 + 1;
                        return true;
                    }
                    m0VarArr = this.d;
                }
                m0VarArr2 = m0VarArr;
                i4 = i2;
            }
        }
    }
}
