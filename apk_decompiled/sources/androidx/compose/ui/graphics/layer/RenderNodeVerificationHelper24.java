package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper24 {
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    public final void discardDisplayList(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
