package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class sj {
    public static final /* synthetic */ long b = dc.a.objectFieldOffset(sj.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public sj(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
