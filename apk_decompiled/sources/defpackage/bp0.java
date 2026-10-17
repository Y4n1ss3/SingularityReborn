package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class bp0 extends l0 implements jb0, iw, yy {
    public final int h;
    public final int i;
    public final mf j;
    public Object[] k;
    public long l;
    public long m;
    public int n;
    public int o;

    public bp0(int i, int i2, mf mfVar) {
        this.h = i;
        this.i = i2;
        this.j = mfVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bp0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [jw] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [m0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [cp0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [cp0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(bp0 bp0Var, jw jwVar, hm hmVar) {
        ap0 ap0Var;
        int i;
        ?? r4;
        jw jwVar2;
        z10 z10Var;
        z10 z10Var2;
        jw jwVar3;
        Object s;
        ox oxVar;
        vn vnVar;
        cp0 cp0Var;
        try {
            if (hmVar instanceof ap0) {
                ap0Var = (ap0) hmVar;
                int i2 = ap0Var.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ap0Var.j = i2 - Integer.MIN_VALUE;
                    Object obj = ap0Var.h;
                    i = ap0Var.j;
                    if (i != 0) {
                        p10.Q(obj);
                        jwVar2 = jwVar;
                        jwVar = (cp0) bp0Var.d();
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                z10Var2 = ap0Var.g;
                                cp0 cp0Var2 = ap0Var.f;
                                jwVar3 = ap0Var.e;
                                bp0 bp0Var2 = ap0Var.d;
                                p10.Q(obj);
                                r4 = bp0Var2;
                                jwVar = cp0Var2;
                                do {
                                    s = r4.s(jwVar);
                                    oxVar = p01.e;
                                    vnVar = vn.d;
                                    if (s == oxVar) {
                                    }
                                } while (r4.i(jwVar, ap0Var) != vnVar);
                                return;
                            }
                            if (i != 3) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            z10Var2 = ap0Var.g;
                            cp0 cp0Var3 = ap0Var.f;
                            jwVar3 = ap0Var.e;
                            bp0 bp0Var3 = ap0Var.d;
                            p10.Q(obj);
                            bp0 bp0Var4 = bp0Var3;
                            cp0 cp0Var4 = cp0Var3;
                            jwVar2 = jwVar3;
                            z10Var = z10Var2;
                            bp0Var = bp0Var4;
                            cp0Var = cp0Var4;
                            r4 = bp0Var;
                            z10Var2 = z10Var;
                            jwVar3 = jwVar2;
                            jwVar = cp0Var;
                            do {
                                s = r4.s(jwVar);
                                oxVar = p01.e;
                                vnVar = vn.d;
                                if (s == oxVar) {
                                    if (z10Var2 != null && !z10Var2.isActive()) {
                                        throw z10Var2.f();
                                    }
                                    ap0Var.d = r4;
                                    ap0Var.e = jwVar3;
                                    ap0Var.f = jwVar;
                                    ap0Var.g = z10Var2;
                                    ap0Var.j = 3;
                                    bp0Var4 = r4;
                                    cp0Var4 = jwVar;
                                    if (jwVar3.emit(s, ap0Var) == vnVar) {
                                        return;
                                    }
                                    jwVar2 = jwVar3;
                                    z10Var = z10Var2;
                                    bp0Var = bp0Var4;
                                    cp0Var = cp0Var4;
                                    r4 = bp0Var;
                                    z10Var2 = z10Var;
                                    jwVar3 = jwVar2;
                                    jwVar = cp0Var;
                                    s = r4.s(jwVar);
                                    oxVar = p01.e;
                                    vnVar = vn.d;
                                    if (s == oxVar) {
                                        ap0Var.d = r4;
                                        ap0Var.e = jwVar3;
                                        ap0Var.f = jwVar;
                                        ap0Var.g = z10Var2;
                                        ap0Var.j = 2;
                                    }
                                }
                            } while (r4.i(jwVar, ap0Var) != vnVar);
                            return;
                        }
                        jwVar = ap0Var.f;
                        jw jwVar4 = ap0Var.e;
                        bp0 bp0Var5 = ap0Var.d;
                        try {
                            p10.Q(obj);
                            jwVar2 = jwVar4;
                            bp0Var = bp0Var5;
                            jwVar = jwVar;
                        } catch (Throwable th) {
                            th = th;
                            r4 = bp0Var5;
                            r4.g(jwVar);
                            throw th;
                        }
                    }
                    z10Var = (z10) ap0Var.getContext().get(ts.l);
                    cp0Var = jwVar;
                    r4 = bp0Var;
                    z10Var2 = z10Var;
                    jwVar3 = jwVar2;
                    jwVar = cp0Var;
                    do {
                        s = r4.s(jwVar);
                        oxVar = p01.e;
                        vnVar = vn.d;
                        if (s == oxVar) {
                        }
                    } while (r4.i(jwVar, ap0Var) != vnVar);
                    return;
                }
            }
            z10Var = (z10) ap0Var.getContext().get(ts.l);
            cp0Var = jwVar;
            r4 = bp0Var;
            z10Var2 = z10Var;
            jwVar3 = jwVar2;
            jwVar = cp0Var;
            do {
                s = r4.s(jwVar);
                oxVar = p01.e;
                vnVar = vn.d;
                if (s == oxVar) {
                }
            } while (r4.i(jwVar, ap0Var) != vnVar);
            return;
        } catch (Throwable th2) {
            r4 = bp0Var;
            th = th2;
            r4.g(jwVar);
            throw th;
        }
        ap0Var = new ap0(bp0Var, hmVar);
        Object obj2 = ap0Var.h;
        i = ap0Var.j;
        if (i != 0) {
        }
    }

    @Override // defpackage.jb0
    public final void a() {
        bp0 bp0Var;
        synchronized (this) {
            try {
                bp0Var = this;
                try {
                    bp0Var.t(o() + this.n, this.m, o() + this.n, o() + this.n + this.o);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bp0Var = this;
            }
        }
    }

    @Override // defpackage.jb0
    public final boolean b(Object obj) {
        int i;
        boolean z;
        hm[] hmVarArr = cq.a;
        synchronized (this) {
            if (q(obj)) {
                hmVarArr = n(hmVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (hm hmVar : hmVarArr) {
            if (hmVar != null) {
                hmVar.resumeWith(w01.a);
            }
        }
        return z;
    }

    @Override // defpackage.yy
    public final iw c(kn knVar, int i, mf mfVar) {
        return ((i == 0 || i == -3) && mfVar == mf.d) ? this : new dh(this, knVar, i, mfVar);
    }

    @Override // defpackage.iw
    public final Object collect(jw jwVar, hm hmVar) {
        k(this, jwVar, hmVar);
        return vn.d;
    }

    @Override // defpackage.l0
    public final m0 e() {
        cp0 cp0Var = new cp0();
        cp0Var.a = -1L;
        return cp0Var;
    }

    @Override // defpackage.jb0, defpackage.jw
    public final Object emit(Object obj, hm hmVar) {
        bp0 bp0Var;
        Throwable th;
        hm[] n;
        zo0 zo0Var;
        if (b(obj)) {
            return w01.a;
        }
        int i = 1;
        gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        hm[] hmVarArr = cq.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        ggVar.resumeWith(w01.a);
                        n = n(hmVarArr);
                        zo0Var = null;
                        bp0Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        bp0Var = this;
                        throw th;
                    }
                } else {
                    try {
                        bp0Var = this;
                        try {
                            zo0 zo0Var2 = new zo0(bp0Var, o() + this.n + this.o, obj, ggVar);
                            bp0Var.m(zo0Var2);
                            bp0Var.o++;
                            if (bp0Var.i == 0) {
                                hmVarArr = bp0Var.n(hmVarArr);
                            }
                            n = hmVarArr;
                            zo0Var = zo0Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        bp0Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (zo0Var != null) {
                    ggVar.w(new dg(zo0Var, i));
                }
                for (hm hmVar2 : n) {
                    if (hmVar2 != null) {
                        hmVar2.resumeWith(w01.a);
                    }
                }
                Object s = ggVar.s();
                vn vnVar = vn.d;
                if (s != vnVar) {
                    s = w01.a;
                }
                return s == vnVar ? s : w01.a;
            } catch (Throwable th5) {
                th = th5;
                bp0Var = this;
            }
        }
    }

    @Override // defpackage.l0
    public final m0[] f() {
        return new cp0[2];
    }

    public final Object i(cp0 cp0Var, ap0 ap0Var) {
        gg ggVar = new gg(1, d41.C(ap0Var));
        ggVar.u();
        synchronized (this) {
            try {
                if (r(cp0Var) < 0) {
                    cp0Var.b = ggVar;
                } else {
                    ggVar.resumeWith(w01.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = ggVar.s();
        return s == vn.d ? s : w01.a;
    }

    public final void j() {
        if (this.i != 0 || this.o > 1) {
            Object[] objArr = this.k;
            objArr.getClass();
            while (this.o > 0) {
                long o = o();
                int i = this.n;
                int i2 = this.o;
                if (objArr[((int) ((o + (i + i2)) - 1)) & (objArr.length - 1)] != p01.e) {
                    return;
                }
                this.o = i2 - 1;
                p01.B(objArr, o() + this.n + this.o, null);
            }
        }
    }

    public final void l() {
        m0[] m0VarArr;
        Object[] objArr = this.k;
        objArr.getClass();
        p01.B(objArr, o(), null);
        this.n--;
        long o = o() + 1;
        if (this.l < o) {
            this.l = o;
        }
        if (this.m < o) {
            if (this.e != 0 && (m0VarArr = this.d) != null) {
                for (m0 m0Var : m0VarArr) {
                    if (m0Var != null) {
                        cp0 cp0Var = (cp0) m0Var;
                        long j = cp0Var.a;
                        if (j >= 0 && j < o) {
                            cp0Var.a = o;
                        }
                    }
                }
            }
            this.m = o;
        }
    }

    public final void m(Object obj) {
        int i = this.n + this.o;
        Object[] objArr = this.k;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        p01.B(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hm[] n(hm[] hmVarArr) {
        m0[] m0VarArr;
        cp0 cp0Var;
        gg ggVar;
        int length = hmVarArr.length;
        if (this.e != 0 && (m0VarArr = this.d) != null) {
            int length2 = m0VarArr.length;
            int i = 0;
            hmVarArr = hmVarArr;
            while (i < length2) {
                m0 m0Var = m0VarArr[i];
                if (m0Var != null && (ggVar = (cp0Var = (cp0) m0Var).b) != null && r(cp0Var) >= 0) {
                    int length3 = hmVarArr.length;
                    hmVarArr = hmVarArr;
                    if (length >= length3) {
                        hmVarArr = Arrays.copyOf(hmVarArr, Math.max(2, hmVarArr.length * 2));
                    }
                    hmVarArr[length] = ggVar;
                    cp0Var.b = null;
                    length++;
                }
                i++;
                hmVarArr = hmVarArr;
            }
        }
        return hmVarArr;
    }

    public final long o() {
        return Math.min(this.m, this.l);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            o.f("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.k = objArr2;
        if (objArr != null) {
            long o = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o;
                p01.B(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i = this.e;
        int i2 = this.h;
        if (i != 0) {
            int i3 = this.n;
            int i4 = this.i;
            if (i3 >= i4 && this.m <= this.l) {
                int ordinal = this.j.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            o.n();
                        }
                    }
                }
                return false;
            }
            m(obj);
            int i5 = this.n + 1;
            this.n = i5;
            if (i5 > i4) {
                l();
            }
            long o = o() + this.n;
            long j = this.l;
            if (((int) (o - j)) > i2) {
                t(1 + j, this.m, o() + this.n, o() + this.n + this.o);
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.n + 1;
            this.n = i6;
            if (i6 > i2) {
                l();
            }
            this.m = o() + this.n;
            return true;
        }
        return true;
    }

    public final long r(cp0 cp0Var) {
        long j = cp0Var.a;
        if (j >= o() + this.n && (this.i > 0 || j > o() || this.o == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object s(cp0 cp0Var) {
        Object obj;
        hm[] hmVarArr = cq.a;
        synchronized (this) {
            try {
                long r = r(cp0Var);
                if (r < 0) {
                    obj = p01.e;
                } else {
                    long j = cp0Var.a;
                    Object[] objArr = this.k;
                    objArr.getClass();
                    Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                    if (obj2 instanceof zo0) {
                        obj2 = ((zo0) obj2).f;
                    }
                    cp0Var.a = r + 1;
                    Object obj3 = obj2;
                    hmVarArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (hm hmVar : hmVarArr) {
            if (hmVar != null) {
                hmVar.resumeWith(w01.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o = o(); o < min; o++) {
            Object[] objArr = this.k;
            objArr.getClass();
            p01.B(objArr, o, null);
        }
        this.l = j;
        this.m = j2;
        this.n = (int) (j3 - min);
        this.o = (int) (j4 - j3);
    }

    public final hm[] u(long j) {
        long j2;
        long j3;
        long j4;
        hm[] hmVarArr;
        hm[] hmVarArr2;
        m0[] m0VarArr;
        ox oxVar = p01.e;
        hm[] hmVarArr3 = cq.a;
        if (j <= this.m) {
            long o = o();
            long j5 = this.n + o;
            int i = this.i;
            if (i == 0 && this.o > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (m0VarArr = this.d) != null) {
                for (m0 m0Var : m0VarArr) {
                    if (m0Var != null) {
                        long j6 = ((cp0) m0Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.m) {
                long o2 = o() + this.n;
                int i3 = this.e;
                int i4 = this.o;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (o2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.o + o2;
                if (i4 > 0) {
                    Object[] objArr = this.k;
                    objArr.getClass();
                    j3 = o;
                    hm[] hmVarArr4 = new hm[i4];
                    long j8 = o2;
                    while (true) {
                        if (o2 >= j7) {
                            hmVarArr2 = hmVarArr4;
                            j4 = j5;
                            break;
                        }
                        hmVarArr2 = hmVarArr4;
                        Object obj = objArr[((int) o2) & (objArr.length - 1)];
                        if (obj != oxVar) {
                            obj.getClass();
                            zo0 zo0Var = (zo0) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            hmVarArr2[i2] = zo0Var.g;
                            p01.B(objArr, o2, oxVar);
                            p01.B(objArr, j8, zo0Var.f);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        o2 += j2;
                        hmVarArr4 = hmVarArr2;
                        j5 = j4;
                    }
                    o2 = j8;
                    hmVarArr = hmVarArr2;
                } else {
                    j3 = o;
                    j4 = j5;
                    hmVarArr = hmVarArr3;
                }
                int i6 = (int) (o2 - j3);
                long j9 = this.e == 0 ? o2 : j4;
                long max = Math.max(this.l, o2 - Math.min(this.h, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.k;
                    objArr2.getClass();
                    if (q10.b(objArr2[((int) max) & (objArr2.length - 1)], oxVar)) {
                        o2 += j2;
                        max += j2;
                    }
                }
                t(max, j9, o2, j7);
                j();
                return hmVarArr.length == 0 ? hmVarArr : n(hmVarArr);
            }
        }
        return hmVarArr3;
    }
}
