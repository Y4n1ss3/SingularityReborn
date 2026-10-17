package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dr implements cr, y31 {
    public static final dr d = new dr();
    public static final dr e = new dr();

    @Override // defpackage.y31
    public u31 a(Activity activity, cr crVar) {
        jf.a.getClass();
        return new u31(new gf((Build.VERSION.SDK_INT >= 30 ? kf.d : ts.h).b(activity)), crVar.f(activity));
    }

    @Override // defpackage.y31
    public u31 e(Context context, cr crVar) {
        context.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new u31(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.cr
    public float f(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
