package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i, int i2) {
        view.setSystemGestureExclusionRects(y80.G(new Rect(0, 0, i, i2)));
    }
}
