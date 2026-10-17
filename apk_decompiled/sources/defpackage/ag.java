package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ag implements Runnable {
    public final /* synthetic */ p7 d;
    public final /* synthetic */ int e;

    public ag(p7 p7Var, int i) {
        this.d = p7Var;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ej0 ej0Var = (ej0) this.d.d;
        if (ej0Var != null) {
            ej0Var.onFontRetrievalFailed(this.e);
        }
    }
}
