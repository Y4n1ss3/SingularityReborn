package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class mn extends l implements in {
    public static final ln Key = new ln(ts.i, new ed(24));

    public mn() {
        super(ts.i);
    }

    public static /* synthetic */ mn limitedParallelism$default(mn mnVar, int i, String str, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return mnVar.limitedParallelism(i, str);
    }

    public abstract void dispatch(kn knVar, Runnable runnable);

    public void dispatchYield(kn knVar, Runnable runnable) {
        dispatch(knVar, runnable);
    }

    @Override // defpackage.l, defpackage.kn
    public <E extends in> E get(jn jnVar) {
        E e;
        jnVar.getClass();
        if (jnVar instanceof ln) {
            ln lnVar = (ln) jnVar;
            jn key = getKey();
            key.getClass();
            if ((key == lnVar || lnVar.e == key) && (e = (E) lnVar.d.invoke(this)) != null) {
                return e;
            }
        } else if (ts.i == jnVar) {
            return this;
        }
        return null;
    }

    public final <T> hm interceptContinuation(hm hmVar) {
        return new kr(this, hmVar);
    }

    public boolean isDispatchNeeded(kn knVar) {
        return true;
    }

    public mn limitedParallelism(int i, String str) {
        cq.e(i);
        return new c50(this, i, str);
    }

    @Override // defpackage.l, defpackage.kn
    public kn minusKey(jn jnVar) {
        jnVar.getClass();
        if (jnVar instanceof ln) {
            ln lnVar = (ln) jnVar;
            jn key = getKey();
            key.getClass();
            if (key != lnVar && lnVar.e != key) {
                return this;
            }
            if (((in) lnVar.d.invoke(this)) == null) {
                return this;
            }
        } else if (ts.i != jnVar) {
            return this;
        }
        return st.d;
    }

    public final void releaseInterceptedContinuation(hm hmVar) {
        Unsafe unsafe;
        long j;
        hmVar.getClass();
        kr krVar = (kr) hmVar;
        do {
            unsafe = dc.a;
            j = kr.k;
        } while (unsafe.getObjectVolatile(krVar, j) == q10.f);
        Object objectVolatile = unsafe.getObjectVolatile(krVar, j);
        gg ggVar = objectVolatile instanceof gg ? (gg) objectVolatile : null;
        if (ggVar != null) {
            ggVar.p();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + cq.r(this);
    }

    @er
    public /* synthetic */ mn limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    @er
    public final mn plus(mn mnVar) {
        return mnVar;
    }
}
