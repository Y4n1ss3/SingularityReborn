package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.lumi.singularity.R;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w21 extends z21 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final jv f = new jv();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(a31 a31Var, View view) {
        r21 j = j(view);
        if (j != null) {
            j.onEnd(a31Var);
            if (j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(a31Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, a31 a31Var, p31 p31Var, boolean z) {
        r21 j = j(view);
        if (j != null) {
            j.mDispachedInsets = p31Var;
            if (!z) {
                j.onPrepare(a31Var);
                z = j.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), a31Var, p31Var, z);
            }
        }
    }

    public static void h(View view, p31 p31Var, List list) {
        r21 j = j(view);
        if (j != null) {
            p31Var = j.onProgress(p31Var, list);
            if (j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), p31Var, list);
            }
        }
    }

    public static void i(View view, a31 a31Var, q21 q21Var) {
        r21 j = j(view);
        if (j != null) {
            j.onStart(a31Var, q21Var);
            if (j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), a31Var, q21Var);
            }
        }
    }

    public static r21 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof v21) {
            return ((v21) tag).a;
        }
        return null;
    }
}
