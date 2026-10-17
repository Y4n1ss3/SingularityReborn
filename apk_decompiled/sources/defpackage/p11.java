package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class p11 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void e(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void f(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void g(View view, fd0 fd0Var) {
        o11 o11Var = fd0Var != null ? new o11(view, fd0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, o11Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (o11Var != null) {
            view.setOnApplyWindowInsetsListener(o11Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void h(View view) {
        view.stopNestedScroll();
    }
}
