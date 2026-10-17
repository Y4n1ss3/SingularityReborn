package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wi0 implements Runnable {
    public vx d;
    public wx e;
    public Handler f;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.d.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f.post(new z3(4, this.e, obj));
    }
}
