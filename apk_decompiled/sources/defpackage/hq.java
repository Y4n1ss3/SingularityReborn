package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hq extends ju implements Executor {
    public static final hq d = new hq();
    public static final mn e;

    static {
        x01 x01Var = x01.d;
        int i = zs0.a;
        if (64 >= i) {
            i = 64;
        }
        e = mn.limitedParallelism$default(x01Var, q10.F("kotlinx.coroutines.io.parallelism", i, 12), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        e.dispatch(knVar, runnable);
    }

    @Override // defpackage.mn
    public final void dispatchYield(kn knVar, Runnable runnable) {
        e.dispatchYield(knVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(st.d, runnable);
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        return x01.d.limitedParallelism(i, str);
    }

    @Override // defpackage.mn
    public final String toString() {
        return "Dispatchers.IO";
    }
}
