package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class jl {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
