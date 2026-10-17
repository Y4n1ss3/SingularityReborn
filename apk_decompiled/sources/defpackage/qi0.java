package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import defpackage.si0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class qi0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, q40 q40Var) {
        q40Var.getClass();
        if (activity instanceof y40) {
            s40 lifecycle = ((y40) activity).getLifecycle();
            if (lifecycle instanceof a50) {
                ((a50) lifecycle).e(q40Var);
            }
        }
    }

    public static void b(Activity activity) {
        si0.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new si0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new si0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
