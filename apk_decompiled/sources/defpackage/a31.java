package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a31 {
    public z21 a;

    public a31(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new y21(r0.i(i, interpolator, j));
        } else {
            this.a = new w21(i, interpolator, j);
        }
    }

    public static void a(View view, r21 r21Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(r21Var != null ? new x21(r21Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = w21.e;
        View.OnApplyWindowInsetsListener v21Var = r21Var != null ? new v21(view, r21Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, v21Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(v21Var);
        }
    }
}
