package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class o7 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static o7 c;
    public aj0 a;

    public static synchronized void b() {
        synchronized (o7.class) {
            if (c == null) {
                o7 o7Var = new o7();
                c = o7Var;
                o7Var.a = aj0.c();
                aj0 aj0Var = c.a;
                n7 n7Var = new n7();
                synchronized (aj0Var) {
                    aj0Var.e = n7Var;
                }
            }
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.d(context, i);
    }
}
