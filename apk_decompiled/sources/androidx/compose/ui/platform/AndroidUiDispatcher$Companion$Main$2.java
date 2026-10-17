package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.f30;
import defpackage.f80;
import defpackage.iy;
import defpackage.kn;
import defpackage.nq;
import defpackage.nr;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends f30 implements iy {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // defpackage.iy
    public final kn invoke() {
        boolean isMainThread;
        Choreographer choreographer;
        isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
        if (isMainThread) {
            choreographer = Choreographer.getInstance();
        } else {
            nq nqVar = nr.a;
            choreographer = (Choreographer) y80.R(f80.a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
