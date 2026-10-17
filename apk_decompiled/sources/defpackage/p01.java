package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.unit.Dp;
import com.lumi.singularity.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class p01 {
    public static final jh a = new jh();
    public static final fo0 b = new fo0(0);
    public static final bl c = new bl(29);
    public static final go0[] d = new go0[0];
    public static final ox e = new ox("NO_VALUE", 4);
    public static final zk0 f = new zk0(12);

    public static final void A(gg ggVar, hm hmVar, boolean z) {
        Object t = ggVar.t();
        Throwable f2 = ggVar.f(t);
        Object jj0Var = f2 != null ? new jj0(f2) : ggVar.g(t);
        if (!z) {
            hmVar.resumeWith(jj0Var);
            return;
        }
        hmVar.getClass();
        kr krVar = (kr) hmVar;
        hm hmVar2 = krVar.h;
        Object obj = krVar.j;
        kn context = hmVar2.getContext();
        Object X = y80.X(context, obj);
        u01 G = X != y80.i ? G(hmVar2, context, X) : null;
        try {
            hmVar2.resumeWith(jj0Var);
            if (G == null || G.a0()) {
                y80.N(context, X);
            }
        } catch (Throwable th) {
            if (G == null || G.a0()) {
                y80.N(context, X);
            }
            throw th;
        }
    }

    public static final void B(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static Set C(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static void D(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(uo.d(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        q10.C(classCastException, p01.class.getName());
        throw classCastException;
    }

    public static final ArrayList E(Collection collection) {
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }

    public static final double F(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final u01 G(hm hmVar, kn knVar, Object obj) {
        u01 u01Var = null;
        if ((hmVar instanceof wn) && knVar.get(v01.d) != null) {
            wn wnVar = (wn) hmVar;
            while (true) {
                if ((wnVar instanceof lr) || (wnVar = wnVar.getCallerFrame()) == null) {
                    break;
                }
                if (wnVar instanceof u01) {
                    u01Var = (u01) wnVar;
                    break;
                }
            }
            if (u01Var != null) {
                u01Var.b0(knVar, obj);
            }
        }
        return u01Var;
    }

    public static final Object H(kn knVar, my myVar, hm hmVar) {
        Unsafe unsafe;
        long j;
        kn context = hmVar.getContext();
        kn plus = !((Boolean) knVar.fold(Boolean.FALSE, new bl(23))).booleanValue() ? context.plus(knVar) : l(context, knVar, false);
        cq.l(plus);
        if (plus == context) {
            tl0 tl0Var = new tl0(hmVar, plus);
            return y80.S(tl0Var, tl0Var, myVar);
        }
        ts tsVar = ts.i;
        if (q10.b(plus.get(tsVar), context.get(tsVar))) {
            u01 u01Var = new u01(hmVar, plus);
            kn knVar2 = u01Var.f;
            Object X = y80.X(knVar2, null);
            try {
                return y80.S(u01Var, u01Var, myVar);
            } finally {
                y80.N(knVar2, X);
            }
        }
        lr lrVar = new lr(hmVar, plus);
        try {
            q10.B(d41.C(d41.g(lrVar, lrVar, myVar)), w01.a);
            do {
                unsafe = dc.a;
                j = lr.h;
                int intVolatile = unsafe.getIntVolatile(lrVar, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        o.f("Already suspended");
                        return null;
                    }
                    Object N = d41.N(lrVar.E());
                    if (N instanceof sj) {
                        throw ((sj) N).a;
                    }
                    return N;
                }
            } while (!unsafe.compareAndSwapInt(lrVar, j, 0, 1));
            return vn.d;
        } catch (Throwable th) {
            lrVar.resumeWith(new jj0(th));
            throw th;
        }
    }

    public static final Object I(kn knVar, Object obj, Object obj2, my myVar, hm hmVar) {
        Object X = y80.X(knVar, obj2);
        try {
            pr0 pr0Var = new pr0(hmVar, knVar);
            f(2, myVar);
            Object invoke = myVar.invoke(obj, pr0Var);
            y80.N(knVar, X);
            if (invoke == vn.d) {
                hmVar.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            y80.N(knVar, X);
            throw th;
        }
    }

    public static bp0 a(int i, mf mfVar) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if (i2 <= 0 && i3 <= 0 && mfVar != mf.d) {
            o.t(mfVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new bp0(i2, i4, mfVar);
    }

    public static Collection b(Object obj) {
        if ((obj instanceof n20) && !(obj instanceof o20)) {
            D(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            q10.C(e2, p01.class.getName());
            throw e2;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof n20) && !(obj instanceof q20)) {
            D(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            q10.C(e2, p01.class.getName());
            throw e2;
        }
    }

    public static xq d(un unVar, my myVar) {
        xq xqVar = new xq(w(unVar, st.d), true);
        xqVar.Z(xn.d, xqVar, myVar);
        return xqVar;
    }

    public static final void e(w11 w11Var, el0 el0Var, s40 s40Var) {
        el0Var.getClass();
        s40Var.getClass();
    }

    public static void f(int i, Object obj) {
        if (obj == null || r(i, obj)) {
            return;
        }
        D(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final Set g(go0 go0Var) {
        go0Var.getClass();
        if (go0Var instanceof tf) {
            return ((tf) go0Var).b();
        }
        HashSet hashSet = new HashSet(go0Var.e());
        int e2 = go0Var.e();
        for (int i = 0; i < e2; i++) {
            hashSet.add(go0Var.f(i));
        }
        return hashSet;
    }

    public static final go0[] h(List list) {
        go0[] go0VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (go0VarArr = (go0[]) list.toArray(new go0[0])) == null) ? d : go0VarArr;
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final ur j(iw iwVar, ky kyVar, my myVar) {
        if (iwVar instanceof ur) {
            ur urVar = (ur) iwVar;
            if (urVar.e == kyVar && urVar.f == myVar) {
                return urVar;
            }
        }
        return new ur(iwVar, kyVar, myVar);
    }

    public static final cu k(Enum[] enumArr) {
        enumArr.getClass();
        return new cu(enumArr);
    }

    public static final kn l(kn knVar, kn knVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 23;
        boolean booleanValue = ((Boolean) knVar.fold(bool, new bl(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) knVar2.fold(bool, new bl(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return knVar.plus(knVar2);
        }
        bl blVar = new bl(24);
        st stVar = st.d;
        kn knVar3 = (kn) knVar.fold(stVar, blVar);
        Object obj = knVar2;
        if (booleanValue2) {
            obj = knVar2.fold(stVar, new bl(25));
        }
        return knVar3.plus((kn) obj);
    }

    public static final void m(BufferedReader bufferedReader, x60 x60Var) {
        try {
            Iterator it = new ml(new cc(bufferedReader, 2)).iterator();
            while (it.hasNext()) {
                x60Var.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q10.g(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final a21 n(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            a21 a21Var = tag instanceof a21 ? (a21) tag : null;
            if (a21Var != null) {
                return a21Var;
            }
            Object u = p10.u(view);
            view = u instanceof View ? (View) u : null;
        }
        return null;
    }

    public static ei0 o(Context context, AttributeSet attributeSet, int i, int i2) {
        ei0 ei0Var = new ei0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, th0.a, i, i2);
        ei0Var.a = obtainStyledAttributes.getInt(0, 1);
        ei0Var.b = obtainStyledAttributes.getInt(10, 1);
        ei0Var.c = obtainStyledAttributes.getBoolean(9, false);
        ei0Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return ei0Var;
    }

    public static final int p(go0 go0Var, go0[] go0VarArr) {
        go0VarArr.getClass();
        int hashCode = (go0Var.a().hashCode() * 31) + Arrays.hashCode(go0VarArr);
        int e2 = go0Var.e();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(e2 > 0)) {
                break;
            }
            int i3 = e2 - 1;
            int i4 = i * 31;
            String a2 = go0Var.g(go0Var.e() - e2).a();
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            i = i4 + i2;
            e2 = i3;
        }
        int e3 = go0Var.e();
        int i5 = 1;
        while (true) {
            if (!(e3 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = e3 - 1;
            int i7 = i5 * 31;
            y80 d2 = go0Var.g(go0Var.e() - e3).d();
            i5 = i7 + (d2 != null ? d2.hashCode() : 0);
            e3 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(av0 av0Var, gd0 gd0Var, Throwable th, im imVar) {
        mw mwVar;
        int i;
        try {
            if (imVar instanceof mw) {
                mwVar = (mw) imVar;
                int i2 = mwVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mwVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = mwVar.e;
                    i = mwVar.f;
                    w01 w01Var = w01.a;
                    if (i != 0) {
                        p10.Q(obj);
                        mwVar.d = th;
                        mwVar.f = 1;
                        gd0Var.invoke(av0Var, th, mwVar);
                        vn vnVar = vn.d;
                        if (w01Var == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = mwVar.d;
                        p10.Q(obj);
                    }
                    return w01Var;
                }
            }
            if (i != 0) {
            }
            return w01Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                d41.c(th2, th);
            }
            throw th2;
        }
        mwVar = new mw(imVar);
        Object obj2 = mwVar.e;
        i = mwVar.f;
        w01 w01Var2 = w01.a;
    }

    public static boolean r(int i, Object obj) {
        int i2;
        if (obj instanceof ty) {
            if (obj instanceof vy) {
                i2 = ((vy) obj).getArity();
            } else if (obj instanceof iy) {
                i2 = 0;
            } else if (obj instanceof ky) {
                i2 = 1;
            } else if (obj instanceof my) {
                i2 = 2;
            } else if (obj instanceof ny) {
                i2 = 3;
            } else if (obj instanceof oy) {
                i2 = 4;
            } else if (obj instanceof py) {
                i2 = 5;
            } else if (obj instanceof qy) {
                i2 = 6;
            } else if (obj instanceof ry) {
                i2 = 7;
            } else if (obj instanceof sy) {
                i2 = 8;
            } else {
                boolean z = obj instanceof ComposableLambda;
                i2 = z ? 9 : z ? 10 : z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(ArrayList arrayList, im imVar) {
        ec ecVar;
        int i;
        Iterator it;
        if (imVar instanceof ec) {
            ecVar = (ec) imVar;
            int i2 = ecVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ecVar.f = i2 - Integer.MIN_VALUE;
                Object obj = ecVar.e;
                i = ecVar.f;
                if (i != 0) {
                    p10.Q(obj);
                    it = arrayList.iterator();
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = ecVar.d;
                    p10.Q(obj);
                }
                while (it.hasNext()) {
                    z10 z10Var = (z10) it.next();
                    ecVar.d = it;
                    ecVar.f = 1;
                    Object n = z10Var.n(ecVar);
                    vn vnVar = vn.d;
                    if (n == vnVar) {
                        return vnVar;
                    }
                }
                return w01.a;
            }
        }
        ecVar = new ec(imVar);
        Object obj2 = ecVar.e;
        i = ecVar.f;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return w01.a;
    }

    public static rr0 t(un unVar, kn knVar, xn xnVar, my myVar, int i) {
        if ((i & 1) != 0) {
            knVar = st.d;
        }
        if ((i & 2) != 0) {
            xnVar = xn.d;
        }
        kn w = w(unVar, knVar);
        xnVar.getClass();
        rr0 f40Var = xnVar == xn.e ? new f40(w, myVar) : new rr0(w, true);
        f40Var.Z(xnVar, f40Var, myVar);
        return f40Var;
    }

    public static int u(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static Comparable v(Dp dp, Dp dp2) {
        dp.getClass();
        dp2.getClass();
        return dp.compareTo(dp2) >= 0 ? dp : dp2;
    }

    public static final kn w(un unVar, kn knVar) {
        kn l = l(unVar.getCoroutineContext(), knVar, true);
        nq nqVar = nr.a;
        return (l == nqVar || l.get(ts.i) != null) ? l : l.plus(nqVar);
    }

    public static final Object x(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static d90 y(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    d90 d90Var = new d90();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    d90Var.g = duplicate;
                    d90Var.d = position;
                    int i6 = position - duplicate.getInt(position);
                    d90Var.e = i6;
                    d90Var.f = ((ByteBuffer) d90Var.g).getShort(i6);
                    return d90Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final String z(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }
}
