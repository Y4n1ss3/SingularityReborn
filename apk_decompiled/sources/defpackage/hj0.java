package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class hj0 extends mc {
    public hj0(hm hmVar) {
        super(hmVar);
        if (hmVar == null || hmVar.getContext() == st.d) {
            return;
        }
        o.m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.hm
    public kn getContext() {
        return st.d;
    }
}
