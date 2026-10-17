package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class q11 {
    public static p31 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        p31 c = p31.c(rootWindowInsets, null);
        m31 m31Var = c.a;
        m31Var.t(c);
        m31Var.d(view.getRootView());
        return c;
    }
}
