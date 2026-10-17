package androidx.compose.ui.platform;

import android.view.RenderNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper23 {
    public static final RenderNodeVerificationHelper23 INSTANCE = new RenderNodeVerificationHelper23();

    private RenderNodeVerificationHelper23() {
    }

    public final void destroyDisplayListData(RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
