package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cg0 extends qt {
    final /* synthetic */ dg0 this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class a extends qt {
        final /* synthetic */ dg0 this$0;

        public a(dg0 dg0Var) {
            this.this$0 = dg0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            dg0 dg0Var = this.this$0;
            int i = dg0Var.e + 1;
            dg0Var.e = i;
            if (i == 1) {
                if (dg0Var.f) {
                    dg0Var.i.e(q40.ON_RESUME);
                    dg0Var.f = false;
                } else {
                    Handler handler = dg0Var.h;
                    handler.getClass();
                    handler.removeCallbacks(dg0Var.j);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            dg0 dg0Var = this.this$0;
            int i = dg0Var.d + 1;
            dg0Var.d = i;
            if (i == 1 && dg0Var.g) {
                dg0Var.i.e(q40.ON_START);
                dg0Var.g = false;
            }
        }
    }

    public cg0(dg0 dg0Var) {
        this.this$0 = dg0Var;
    }

    @Override // defpackage.qt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // defpackage.qt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        dg0 dg0Var = this.this$0;
        int i = dg0Var.e - 1;
        dg0Var.e = i;
        if (i == 0) {
            Handler handler = dg0Var.h;
            handler.getClass();
            handler.postDelayed(dg0Var.j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.qt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        dg0 dg0Var = this.this$0;
        int i = dg0Var.d - 1;
        dg0Var.d = i;
        if (i == 0 && dg0Var.f) {
            dg0Var.i.e(q40.ON_STOP);
            dg0Var.g = true;
        }
    }
}
