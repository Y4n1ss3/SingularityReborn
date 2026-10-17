package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void getWindowBounds(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void getWindowVisibleDisplayFrame(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i, int i2) {
    }
}
