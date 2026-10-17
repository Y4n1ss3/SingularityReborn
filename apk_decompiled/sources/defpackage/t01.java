package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t01 extends mn {
    public static final /* synthetic */ int d = 0;

    static {
        new t01();
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        c41 c41Var = (c41) knVar.get(c41.e);
        if (c41Var != null) {
            c41Var.d = true;
        } else {
            lu0.a("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.mn
    public final boolean isDispatchNeeded(kn knVar) {
        return false;
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.mn
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
