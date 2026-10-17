package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class d41 {
    public static final ox b;
    public static final ox c;
    public static final ox d;
    public static final ox e;
    public static final ox f;
    public static final Object[] a = new Object[0];
    public static final pt g = new pt(false);
    public static final pt h = new pt(true);
    public static final a30[] i = new a30[0];
    public static final long[] j = new long[0];

    static {
        int i2 = 4;
        b = new ox("COMPLETING_ALREADY", i2);
        c = new ox("COMPLETING_WAITING_CHILDREN", i2);
        d = new ox("COMPLETING_RETRY", i2);
        e = new ox("TOO_LATE_TO_CANCEL", i2);
        f = new ox("SEALED", i2);
    }

    public static final void B(kn knVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = pn.a.iterator();
        while (it.hasNext()) {
            try {
                ((on) it.next()).handleException(knVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            c(th, new jr(knVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static hm C(hm hmVar) {
        hm intercepted;
        hmVar.getClass();
        im imVar = hmVar instanceof im ? (im) hmVar : null;
        return (imVar == null || (intercepted = imVar.intercepted()) == null) ? hmVar : intercepted;
    }

    public static final boolean D(Object obj) {
        return obj == cq.b;
    }

    public static boolean E(String str, String str2) {
        str2.getClass();
        List w0 = ds0.w0(ds0.B0(ds0.B0(ds0.B0(ds0.t0(str, "v"), ".r"), "_B"), "-"), new String[]{"."});
        ArrayList arrayList = new ArrayList();
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            Integer e0 = ks0.e0((String) it.next());
            if (e0 != null) {
                arrayList.add(e0);
            }
        }
        List w02 = ds0.w0(ds0.B0(ds0.B0(ds0.B0(ds0.t0(str2, "v"), ".r"), "_B"), "-"), new String[]{"."});
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = w02.iterator();
        while (it2.hasNext()) {
            Integer e02 = ks0.e0((String) it2.next());
            if (e02 != null) {
                arrayList2.add(e02);
            }
        }
        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            int max = Math.max(arrayList.size(), arrayList2.size());
            int i2 = 0;
            while (i2 < max) {
                int intValue = ((Number) ((i2 < 0 || i2 >= arrayList.size()) ? 0 : arrayList.get(i2))).intValue();
                int intValue2 = ((Number) ((i2 < 0 || i2 >= arrayList2.size()) ? 0 : arrayList2.get(i2))).intValue();
                if (intValue > intValue2) {
                    return true;
                }
                if (intValue < intValue2) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public static final Object F(Object obj) {
        return obj instanceof sj ? p10.p(((sj) obj).a) : obj;
    }

    public static final g80 G(y80 y80Var, ky kyVar, Composer composer, int i2) {
        composer.startReplaceableGroup(-1408504823);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(y80Var, composer, 8);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(kyVar, composer, (i2 >> 3) & 14);
        String str = (String) RememberSaveableKt.m4147rememberSaveable(new Object[0], (Saver) null, (String) null, (iy) e2.e, composer, 3080, 6);
        ProvidableCompositionLocal providableCompositionLocal = t50.a;
        composer.startReplaceableGroup(1418020823);
        dk dkVar = (dk) composer.consume(t50.a);
        if (dkVar == null) {
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                }
                if (context instanceof dk) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            dkVar = (dk) context;
        }
        composer.endReplaceableGroup();
        if (dkVar == null) {
            o.f("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        yj yjVar = dkVar.n;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new w1();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        w1 w1Var = (w1) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new g80(w1Var, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        g80 g80Var = (g80) rememberedValue2;
        EffectsKt.DisposableEffect(yjVar, str, y80Var, new d2(w1Var, yjVar, str, y80Var, rememberUpdatedState2), composer, 520);
        composer.endReplaceableGroup();
        return g80Var;
    }

    public static void H(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            v0.e(window, z);
        } else {
            if (i2 >= 30) {
                v0.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final Object I(qv0 qv0Var, my myVar) {
        Object sjVar;
        Object L;
        cq.w(qv0Var, true, new rr(y80.u(qv0Var.g.getContext()).c(qv0Var.h, qv0Var, qv0Var.f)));
        try {
            if (myVar instanceof mc) {
                p01.f(2, myVar);
                sjVar = myVar.invoke(qv0Var, qv0Var);
            } else {
                sjVar = S(myVar, qv0Var, qv0Var);
            }
        } catch (Throwable th) {
            sjVar = new sj(th, false);
        }
        vn vnVar = vn.d;
        if (sjVar == vnVar || (L = qv0Var.L(sjVar)) == c) {
            return vnVar;
        }
        if (L instanceof sj) {
            Throwable th2 = ((sj) L).a;
            if (!(th2 instanceof pv0)) {
                throw th2;
            }
            if (((pv0) th2).d != qv0Var) {
                throw th2;
            }
            if (sjVar instanceof sj) {
                throw ((sj) sjVar).a;
            }
        } else {
            sjVar = N(L);
        }
        return sjVar;
    }

    public static final Object[] J(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final long L(long j2, rs rsVar) {
        TimeUnit timeUnit = rsVar.d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j2 || j2 > convert) {
            return u(y80.i(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long convert2 = timeUnit2.convert(j2, timeUnit) << 1;
        int i2 = ps.f;
        int i3 = qs.a;
        return convert2;
    }

    public static final Object N(Object obj) {
        o00 o00Var = obj instanceof o00 ? (o00) obj : null;
        return o00Var != null ? o00Var.a : obj;
    }

    public static final boolean P(String str, iy iyVar) {
        try {
            boolean booleanValue = ((Boolean) iyVar.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final Object Q(long j2, my myVar, us0 us0Var) {
        if (j2 > 0) {
            return I(new qv0(j2, us0Var), myVar);
        }
        throw new pv0("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(long j2, my myVar, im imVar) {
        rv0 rv0Var;
        int i2;
        ji0 ji0Var;
        if (imVar instanceof rv0) {
            rv0Var = (rv0) imVar;
            int i3 = rv0Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rv0Var.f = i3 - Integer.MIN_VALUE;
                Object obj = rv0Var.e;
                i2 = rv0Var.f;
                if (i2 != 0) {
                    p10.Q(obj);
                    if (j2 > 0) {
                        ji0 ji0Var2 = new ji0();
                        try {
                            rv0Var.d = ji0Var2;
                            rv0Var.f = 1;
                            qv0 qv0Var = new qv0(j2, rv0Var);
                            ji0Var2.d = qv0Var;
                            Object I = I(qv0Var, myVar);
                            vn vnVar = vn.d;
                            return I == vnVar ? vnVar : I;
                        } catch (pv0 e2) {
                            e = e2;
                            ji0Var = ji0Var2;
                        }
                    }
                    return null;
                }
                if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = rv0Var.d;
                try {
                    p10.Q(obj);
                    return obj;
                } catch (pv0 e3) {
                    e = e3;
                }
                if (e.d != ji0Var.d) {
                    throw e;
                }
                return null;
            }
        }
        rv0Var = new rv0(imVar);
        Object obj2 = rv0Var.e;
        i2 = rv0Var.f;
        if (i2 != 0) {
        }
        if (e.d != ji0Var.d) {
        }
        return null;
    }

    public static Object S(my myVar, Object obj, hm hmVar) {
        myVar.getClass();
        kn context = hmVar.getContext();
        Object t10Var = context == st.d ? new t10(hmVar) : new u10(hmVar, context);
        p01.f(2, myVar);
        return myVar.invoke(obj, t10Var);
    }

    public static final void a(boolean z, iy iyVar, Composer composer, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-361453782);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(iyVar) ? 32 : 16;
        }
        int i4 = 0;
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(iyVar, startRestartGroup, (i3 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new kc(z, rememberUpdatedState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            kc kcVar = (kc) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(-3686552);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(kcVar);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new hc(kcVar, z);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((iy) rememberedValue2, startRestartGroup, 0);
            td0 a2 = y50.a(startRestartGroup);
            if (a2 == null) {
                o.f("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            } else {
                rd0 onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
                y40 y40Var = (y40) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                EffectsKt.DisposableEffect(y40Var, onBackPressedDispatcher, new ic(onBackPressedDispatcher, y40Var, kcVar, i4), startRestartGroup, 72);
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new jc(z, iyVar, i2, i4));
    }

    public static of b(int i2, int i3, mf mfVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        mf mfVar2 = mf.d;
        if (i4 != 0) {
            mfVar = mfVar2;
        }
        if (i2 == -2) {
            if (mfVar != mfVar2) {
                return new ll(1, mfVar);
            }
            zg.b.getClass();
            return new of(yg.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? mfVar == mfVar2 ? new of(i2) : new ll(i2, mfVar) : new of(Integer.MAX_VALUE) : mfVar == mfVar2 ? new of(0) : new ll(1, mfVar);
        }
        if (mfVar == mfVar2) {
            return new ll(1, mf.e);
        }
        o.m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static void c(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = x10.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = mf0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void f(int i2, int i3) {
        String i4;
        if (i2 <= 0 || i3 <= 0) {
            if (i2 != i3) {
                i4 = "Both size " + i2 + " and step " + i3 + " must be greater than zero.";
            } else {
                i4 = j50.i(i2, "size ", " must be greater than zero.");
            }
            o.c(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hm g(hm hmVar, hm hmVar2, my myVar) {
        myVar.getClass();
        if (myVar instanceof mc) {
            return ((mc) myVar).create(hmVar, hmVar2);
        }
        kn context = hmVar2.getContext();
        return context == st.d ? new r10(hmVar2, hmVar, myVar) : new s10(hmVar2, context, myVar, hmVar);
    }

    public static final String t(String str, d41 d41Var) {
        d41Var.getClass();
        return "Cannot deserialize " + str + " with '" + ki0.a(d41Var.getClass()).b() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final long u(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = ps.f;
        int i3 = qs.a;
        return j3;
    }

    public static final long v(long j2) {
        if (-4611686018426L > j2 || j2 >= 4611686018427L) {
            return u(y80.i(j2, -4611686018427387903L, 4611686018427387903L));
        }
        long j3 = (j2 * AnimationKt.MillisToNanos) << 1;
        int i2 = ps.f;
        int i3 = qs.a;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(jw jwVar, Object obj, Object obj2, im imVar) {
        uw uwVar;
        int i2;
        if (imVar instanceof uw) {
            uwVar = (uw) imVar;
            int i3 = uwVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uwVar.f = i3 - Integer.MIN_VALUE;
                Object obj3 = uwVar.e;
                i2 = uwVar.f;
                if (i2 != 0) {
                    p10.Q(obj3);
                    uwVar.d = obj2;
                    uwVar.f = 1;
                    if (jwVar.emit(obj, uwVar) == vn.d) {
                        return;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    obj2 = uwVar.d;
                    p10.Q(obj3);
                }
                throw new a(obj2);
            }
        }
        uwVar = new uw(imVar);
        Object obj32 = uwVar.e;
        i2 = uwVar.f;
        if (i2 != 0) {
        }
        throw new a(obj2);
    }

    public static final String x(String str, uk0 uk0Var) {
        uk0Var.getClass();
        return "Cannot serialize " + str + " with '" + ki0.a(uk0Var.getClass()).b() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final t40 y(y40 y40Var) {
        y40Var.getClass();
        s40 lifecycle = y40Var.getLifecycle();
        lifecycle.getClass();
        p7 p7Var = lifecycle.a;
        while (true) {
            t40 t40Var = (t40) ((AtomicReference) p7Var.d).get();
            if (t40Var != null) {
                return t40Var;
            }
            hm hmVar = null;
            qs0 qs0Var = new qs0(null);
            nq nqVar = nr.a;
            t40 t40Var2 = new t40(lifecycle, y80.I(qs0Var, f80.a.g));
            AtomicReference atomicReference = (AtomicReference) p7Var.d;
            while (!atomicReference.compareAndSet(null, t40Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            nq nqVar2 = nr.a;
            p01.t(t40Var2, f80.a.g, null, new w3(t40Var2, hmVar, 1), 2);
            return t40Var2;
        }
    }

    public static final dn0 z(Object obj) {
        if (obj != cq.b) {
            return (dn0) obj;
        }
        o.f("Does not contain segment");
        return null;
    }

    public abstract w50 A();

    public d41 d(go0 go0Var) {
        go0Var.getClass();
        return this;
    }

    public boolean h() {
        s();
        throw null;
    }

    public char i() {
        s();
        throw null;
    }

    public double j() {
        s();
        throw null;
    }

    public abstract int k(go0 go0Var);

    public float l() {
        s();
        throw null;
    }

    public int m() {
        s();
        throw null;
    }

    public long n() {
        s();
        throw null;
    }

    public boolean o() {
        return true;
    }

    public Object p(go0 go0Var, a30 a30Var) {
        go0Var.getClass();
        a30Var.getClass();
        return q(a30Var);
    }

    public Object q(a30 a30Var) {
        a30Var.getClass();
        return a30Var.b(this);
    }

    public String r() {
        s();
        throw null;
    }

    public void s() {
        throw new jo0(ki0.a(getClass()) + " can't retrieve untyped values");
    }
}
