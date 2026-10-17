package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.graphics.Fields;
import com.lumi.singularity.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class y80 {
    public static final ox b;
    public static final ox c;
    public static final ox d;
    public static final ox e;
    public static final ox i;
    public final /* synthetic */ int a;
    public static final zk0 f = new zk0(0);
    public static final zk0 g = new zk0(1);
    public static final zk0 h = new zk0(2);
    public static final ll0 j = new ll0(27);
    public static final ll0 k = new ll0(28);
    public static final ll0 l = new ll0(29);

    static {
        int i2 = 4;
        b = new ox("RESUME_TOKEN", i2);
        c = new ox("REMOVED_TASK", i2);
        d = new ox("CLOSED_EMPTY", i2);
        e = new ox("NULL", i2);
        i = new ox("NO_THREAD_ELEMENTS", i2);
    }

    public /* synthetic */ y80(int i2) {
        this.a = i2;
    }

    public static final void A(String str) {
        str.getClass();
        throw new IllegalArgumentException(uo.d("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static g30 B(g40 g40Var, iy iyVar) {
        ts tsVar = ts.p;
        iyVar.getClass();
        int ordinal = g40Var.ordinal();
        if (ordinal == 0) {
            return new ys0(iyVar);
        }
        if (ordinal == 1) {
            mk0 mk0Var = new mk0();
            mk0Var.d = iyVar;
            mk0Var.e = tsVar;
            return mk0Var;
        }
        if (ordinal != 2) {
            o.n();
            return null;
        }
        z01 z01Var = new z01();
        z01Var.d = iyVar;
        z01Var.e = tsVar;
        return z01Var;
    }

    public static ys0 C(iy iyVar) {
        iyVar.getClass();
        return new ys0(iyVar);
    }

    public static List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List E(Object... objArr) {
        if (objArr.length <= 0) {
            return ut.d;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static kn F(in inVar, jn jnVar) {
        jnVar.getClass();
        return q10.b(inVar.getKey(), jnVar) ? st.d : inVar;
    }

    public static ArrayList G(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ob(objArr, true));
    }

    public static kn I(in inVar, kn knVar) {
        knVar.getClass();
        return knVar == st.d ? inVar : (kn) knVar.fold(inVar, new bl(22));
    }

    public static final void J(int i2, int i3) {
        if (i3 < 0) {
            o.m(j50.i(i3, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i3 <= i2) {
                return;
            }
            o.r(") is greater than size (", i3, i2, "toIndex (");
        }
    }

    public static byte[] K(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                o.f(j50.h(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] L(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[Fields.CameraDistance];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long M(InputStream inputStream, int i2) {
        byte[] K = K(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (K[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final void N(kn knVar, Object obj) {
        if (obj == i) {
            return;
        }
        if (!(obj instanceof zu0)) {
            Object fold = knVar.fold(null, k);
            fold.getClass();
            ((wu0) fold).restoreThreadContext(knVar, obj);
            return;
        }
        zu0 zu0Var = (zu0) obj;
        wu0[] wu0VarArr = zu0Var.c;
        int length = wu0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            wu0 wu0Var = wu0VarArr[length];
            wu0Var.getClass();
            wu0Var.restoreThreadContext(knVar, zu0Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static int O(double d2) {
        if (Double.isNaN(d2)) {
            o.m("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int P(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        o.m("Cannot round NaN value.");
        return 0;
    }

    public static long Q(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        o.m("Cannot round NaN value.");
        return 0L;
    }

    public static final Object R(rz rzVar, my myVar) {
        du duVar;
        kn l2;
        Thread currentThread = Thread.currentThread();
        jn jnVar = ts.i;
        mn mnVar = (mn) rzVar.get(jnVar);
        st stVar = st.d;
        if (mnVar == null) {
            duVar = xu0.a();
            l2 = p01.l(stVar, rzVar.plus((kn) duVar), true);
            nq nqVar = nr.a;
            if (l2 != nqVar && l2.get(jnVar) == null) {
                l2 = l2.plus(nqVar);
            }
        } else {
            duVar = (du) xu0.a.get();
            l2 = p01.l(stVar, rzVar, true);
            nq nqVar2 = nr.a;
            if (l2 != nqVar2 && l2.get(jnVar) == null) {
                l2 = l2.plus(nqVar2);
            }
        }
        de deVar = new de(l2, currentThread, duVar);
        deVar.Z(xn.d, deVar, myVar);
        du duVar2 = deVar.h;
        if (duVar2 != null) {
            int i2 = du.g;
            duVar2.j(false);
        }
        while (!Thread.interrupted()) {
            try {
                long k2 = duVar2 != null ? duVar2.k() : SnapshotId_jvmKt.SnapshotIdMax;
                if (!(deVar.E() instanceof n00)) {
                    if (duVar2 != null) {
                        int i3 = du.g;
                        duVar2.g(false);
                    }
                    Object N = d41.N(deVar.E());
                    sj sjVar = N instanceof sj ? (sj) N : null;
                    if (sjVar == null) {
                        return N;
                    }
                    throw sjVar.a;
                }
                LockSupport.parkNanos(deVar, k2);
            } catch (Throwable th) {
                if (duVar2 != null) {
                    int i4 = du.g;
                    duVar2.g(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        deVar.s(interruptedException);
        throw interruptedException;
    }

    public static final Object S(tl0 tl0Var, tl0 tl0Var2, my myVar) {
        Object sjVar;
        Object L;
        try {
            p01.f(2, myVar);
            sjVar = myVar.invoke(tl0Var2, tl0Var);
        } catch (Throwable th) {
            sjVar = new sj(th, false);
        }
        vn vnVar = vn.d;
        if (sjVar == vnVar || (L = tl0Var.L(sjVar)) == d41.c) {
            return vnVar;
        }
        if (L instanceof sj) {
            throw ((sj) L).a;
        }
        return d41.N(L);
    }

    public static i10 T(k10 k10Var, int i2) {
        k10Var.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = k10Var.d;
        int i4 = k10Var.e;
        if (k10Var.f <= 0) {
            i2 = -i2;
        }
        return new i10(i3, i4, i2);
    }

    public static final Object U(kn knVar) {
        Object fold = knVar.fold(0, j);
        fold.getClass();
        return fold;
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static k10 W(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new k10(i2, i3 - 1, 1);
        }
        k10 k10Var = k10.g;
        return k10.g;
    }

    public static final Object X(kn knVar, Object obj) {
        if (obj == null) {
            obj = U(knVar);
        }
        return obj == 0 ? i : obj instanceof Integer ? knVar.fold(new zu0(((Number) obj).intValue(), knVar), l) : ((wu0) obj).updateThreadContext(knVar);
    }

    public static void Y(OutputStream outputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        Y(byteArrayOutputStream, i2, 2);
    }

    public static ArrayList a(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ob(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(im imVar) {
        zq zqVar;
        int i2;
        if (imVar instanceof zq) {
            zqVar = (zq) imVar;
            int i3 = zqVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zqVar.e = i3 - Integer.MIN_VALUE;
                Object obj = zqVar.d;
                i2 = zqVar.e;
                if (i2 != 0) {
                    p10.Q(obj);
                    zqVar.e = 1;
                    gg ggVar = new gg(1, d41.C(zqVar));
                    ggVar.u();
                    if (ggVar.s() == vn.d) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    p10.Q(obj);
                }
                o.j();
            }
        }
        zqVar = new zq(imVar);
        Object obj2 = zqVar.d;
        i2 = zqVar.e;
        if (i2 != 0) {
        }
        o.j();
    }

    public static int c(int i2, ky kyVar, List list) {
        list.getClass();
        J(list.size(), i2);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int intValue = ((Number) kyVar.invoke(list.get(i5))).intValue();
            if (intValue < 0) {
                i4 = i5 + 1;
            } else {
                if (intValue <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static m50 d(m50 m50Var) {
        m50Var.d();
        m50Var.f = true;
        return m50Var.e > 0 ? m50Var : m50.g;
    }

    public static final void e(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    kp0.m(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    d41.c(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (!(autoCloseable instanceof TypedArray)) {
                    throw new IllegalArgumentException();
                }
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static double f(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float g(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int h(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long i(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static Comparable j(Comparable comparable, ui uiVar) {
        uiVar.getClass();
        ti tiVar = (ti) uiVar;
        float f2 = tiVar.b;
        float f3 = tiVar.a;
        if (!tiVar.a()) {
            return (!tiVar.b(comparable, Float.valueOf(f3)) || tiVar.b(Float.valueOf(f3), comparable)) ? (!tiVar.b(Float.valueOf(f2), comparable) || tiVar.b(comparable, Float.valueOf(f2))) ? comparable : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + uiVar + '.');
    }

    public static final Object k(iw iwVar, my myVar, hm hmVar) {
        int i2 = bx.a;
        ax axVar = new ax(myVar, null);
        st stVar = st.d;
        mf mfVar = mf.d;
        Object collect = r(new hh(axVar, iwVar, stVar, -2, mfVar), null, 0, mfVar, 1).collect(uc0.d, hmVar);
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        if (collect != vnVar) {
            collect = w01Var;
        }
        return collect == vnVar ? collect : w01Var;
    }

    public static byte[] l(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static q10 m(int i2) {
        return i2 != 0 ? i2 != 1 ? new ak0() : new ap() : new ak0();
    }

    public static m50 o() {
        return new m50(10);
    }

    public static final Object p(long j2, hm hmVar) {
        if (j2 > 0) {
            gg ggVar = new gg(1, d41.C(hmVar));
            ggVar.u();
            if (j2 < SnapshotId_jvmKt.SnapshotIdMax) {
                u(ggVar.h).d(j2, ggVar);
            }
            Object s = ggVar.s();
            if (s == vn.d) {
                return s;
            }
        }
        return w01.a;
    }

    public static Object q(in inVar, Object obj, my myVar) {
        myVar.getClass();
        return myVar.invoke(obj, inVar);
    }

    public static /* synthetic */ iw r(yy yyVar, rz rzVar, int i2, mf mfVar, int i3) {
        kn knVar = rzVar;
        if ((i3 & 1) != 0) {
            knVar = st.d;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            mfVar = mf.d;
        }
        return yyVar.c(knVar, i2, mfVar);
    }

    public static in s(in inVar, jn jnVar) {
        jnVar.getClass();
        if (q10.b(inVar.getKey(), jnVar)) {
            return inVar;
        }
        return null;
    }

    public static final hl0 t(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            hl0 hl0Var = tag instanceof hl0 ? (hl0) tag : null;
            if (hl0Var != null) {
                return hl0Var;
            }
            Object u = p10.u(view);
            view = u instanceof View ? (View) u : null;
        }
        return null;
    }

    public static final yq u(kn knVar) {
        in inVar = knVar.get(ts.i);
        yq yqVar = inVar instanceof yq ? (yq) inVar : null;
        return yqVar == null ? fq.a : yqVar;
    }

    public static int v(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final gg w(hm hmVar) {
        Unsafe unsafe;
        gg ggVar;
        gg ggVar2;
        if (!(hmVar instanceof kr)) {
            return new gg(1, hmVar);
        }
        kr krVar = (kr) hmVar;
        ox oxVar = q10.f;
        long j2 = kr.k;
        loop0: while (true) {
            unsafe = dc.a;
            Object objectVolatile = unsafe.getObjectVolatile(krVar, j2);
            ggVar = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(krVar, j2, oxVar);
                ggVar2 = null;
                break;
            }
            if (objectVolatile instanceof gg) {
                do {
                    unsafe = dc.a;
                    if (unsafe.compareAndSwapObject(krVar, kr.k, objectVolatile, oxVar)) {
                        ggVar2 = (gg) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(krVar, j2) == objectVolatile);
            } else if (objectVolatile != oxVar && !(objectVolatile instanceof Throwable)) {
                o.p(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (ggVar2 != null) {
            long j3 = gg.k;
            Object objectVolatile2 = unsafe.getObjectVolatile(ggVar2, j3);
            if (!(objectVolatile2 instanceof qj) || ((qj) objectVolatile2).d == null) {
                unsafe.putIntVolatile(ggVar2, gg.i, 536870911);
                unsafe.putObjectVolatile(ggVar2, j3, r1.a);
                ggVar = ggVar2;
            } else {
                ggVar2.p();
            }
            if (ggVar != null) {
                return ggVar;
            }
        }
        return new gg(2, hmVar);
    }

    public static final bl0 x(a21 a21Var) {
        to toVar;
        yk0 yk0Var = new yk0();
        if (a21Var instanceof dk) {
            dk dkVar = (dk) a21Var;
            toVar = new ja0(so.b);
            Application application = dkVar.getApplication();
            LinkedHashMap linkedHashMap = toVar.a;
            if (application != null) {
                linkedHashMap.put(y11.f, dkVar.getApplication());
            }
            linkedHashMap.put(f, dkVar);
            linkedHashMap.put(g, dkVar);
            if (dkVar.getIntent() != null && dkVar.getIntent().getExtras() != null) {
                linkedHashMap.put(h, dkVar.getIntent().getExtras());
            }
        } else {
            toVar = so.b;
        }
        toVar.getClass();
        t60 c2 = ((dk) a21Var).c();
        c2.getClass();
        return (bl0) new f90(c2, yk0Var, toVar).a(ki0.a(bl0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final boolean z(ji jiVar) {
        jiVar.getClass();
        Class cls = jiVar.d;
        cls.getClass();
        return cls.isInterface();
    }

    public abstract Object H(int i2, Intent intent);

    public int hashCode() {
        switch (this.a) {
            case 21:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract Intent n(vu0 vu0Var, Object obj);

    public String toString() {
        switch (this.a) {
            case 21:
                String b2 = ki0.a(getClass()).b();
                b2.getClass();
                return b2;
            default:
                return super.toString();
        }
    }

    public void y(vu0 vu0Var, Object obj) {
    }
}
