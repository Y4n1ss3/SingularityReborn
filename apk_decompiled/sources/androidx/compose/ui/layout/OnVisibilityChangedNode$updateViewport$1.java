package androidx.compose.ui.layout;

import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.f30;
import defpackage.iy;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnVisibilityChangedNode$updateViewport$1 extends f30 implements iy {
    final /* synthetic */ OnVisibilityChangedNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnVisibilityChangedNode$updateViewport$1(OnVisibilityChangedNode onVisibilityChangedNode) {
        super(0);
        this.this$0 = onVisibilityChangedNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6293invoke() {
        LayoutBoundsHolder viewportBounds = this.this$0.getViewportBounds();
        RelativeLayoutBounds bounds = viewportBounds != null ? viewportBounds.getBounds() : null;
        if (q10.b(this.this$0.getLastViewport(), bounds)) {
            return;
        }
        this.this$0.setLastViewport(bounds);
        this.this$0.forceUpdate();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6293invoke();
        return w01.a;
    }
}
