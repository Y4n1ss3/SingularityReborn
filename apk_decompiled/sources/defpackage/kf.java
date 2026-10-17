package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kf implements jf, y31 {
    public static final kf d = new kf();
    public static final kf e = new kf();

    @Override // defpackage.y31
    public u31 a(Activity activity, cr crVar) {
        jf.a.getClass();
        return new u31(new gf((Build.VERSION.SDK_INT >= 30 ? d : ts.h).b(activity)), crVar.f(activity));
    }

    @Override // defpackage.jf
    public Rect b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.y31
    public u31 e(Context context, cr crVar) {
        context.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new u31(bounds, f);
    }
}
