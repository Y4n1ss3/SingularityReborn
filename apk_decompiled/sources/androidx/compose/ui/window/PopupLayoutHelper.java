package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PopupLayoutHelper {
    void getWindowBounds(View view, Rect rect);

    void getWindowVisibleDisplayFrame(View view, Rect rect);

    void setGestureExclusionRects(View view, int i, int i2);

    void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams);
}
