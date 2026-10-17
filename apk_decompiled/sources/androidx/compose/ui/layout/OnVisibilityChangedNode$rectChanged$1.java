package androidx.compose.ui.layout;

import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnVisibilityChangedNode$rectChanged$1 extends f30 implements ky {
    final /* synthetic */ OnVisibilityChangedNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnVisibilityChangedNode$rectChanged$1(OnVisibilityChangedNode onVisibilityChangedNode) {
        super(1);
        this.this$0 = onVisibilityChangedNode;
    }

    public final void invoke(RelativeLayoutBounds relativeLayoutBounds) {
        OnVisibilityChangedNode onVisibilityChangedNode = this.this$0;
        LayoutBoundsHolder viewportBounds = onVisibilityChangedNode.getViewportBounds();
        onVisibilityChangedNode.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
        OnVisibilityChangedNode onVisibilityChangedNode2 = this.this$0;
        onVisibilityChangedNode2.checkVisibility(onVisibilityChangedNode2.getMinFractionVisible(), relativeLayoutBounds, this.this$0.getLastViewport());
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RelativeLayoutBounds) obj);
        return w01.a;
    }
}
