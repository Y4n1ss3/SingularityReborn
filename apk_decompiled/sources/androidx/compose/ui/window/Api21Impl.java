package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    private final int getSystemBarsHeight(Window window, int i) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i2 + (i3 > i ? i3 - i : 0);
    }

    public final int getMaxDialogHeightExcludingSystemBarInsets(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        return i - getSystemBarsHeight(window, i);
    }
}
