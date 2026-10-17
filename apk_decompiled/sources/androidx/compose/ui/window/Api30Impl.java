package androidx.compose.ui.window;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final int getMaxDialogHeightExcludingSystemBarInsets(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void setFitInsetsSides(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }

    public final void setFitInsetsTypes(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }
}
