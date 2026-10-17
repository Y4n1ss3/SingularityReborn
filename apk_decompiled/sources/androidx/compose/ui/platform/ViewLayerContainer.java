package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 8;

    public ViewLayerContainer(Context context) {
        super(context);
    }

    public final void dispatchGetDisplayList() {
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }
}
