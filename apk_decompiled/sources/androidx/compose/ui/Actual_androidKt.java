package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import defpackage.f2;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Actual_androidKt {
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final Object postDelayed(long j, iy iyVar) {
        f2 f2Var = new f2(0, iyVar);
        handler.postDelayed(f2Var, j);
        return f2Var;
    }

    public static final void removePost(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
