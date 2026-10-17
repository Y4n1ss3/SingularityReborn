package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hg extends sj {
    public static final /* synthetic */ long c = dc.a.objectFieldOffset(hg.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hg(gg ggVar, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + ggVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
