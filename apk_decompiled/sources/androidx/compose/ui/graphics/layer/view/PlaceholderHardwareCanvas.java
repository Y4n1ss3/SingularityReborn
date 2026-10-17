package androidx.compose.ui.graphics.layer.view;

import android.graphics.Rect;
import android.view.HardwareCanvas;
import android.view.RenderNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlaceholderHardwareCanvas extends HardwareCanvas {
    public static final int $stable = 8;

    public int drawRenderNode(RenderNode renderNode, Rect rect, int i) {
        return 0;
    }

    public boolean isHardwareAccelerated() {
        return true;
    }
}
