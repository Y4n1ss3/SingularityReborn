package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class sz {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object jj0Var;
        try {
            jj0Var = new rz(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            jj0Var = new jj0(th);
        }
        if (jj0Var instanceof jj0) {
            jj0Var = null;
        }
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
