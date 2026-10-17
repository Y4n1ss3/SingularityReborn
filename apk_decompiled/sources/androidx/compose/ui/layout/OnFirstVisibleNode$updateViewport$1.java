package androidx.compose.ui.layout;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnFirstVisibleNode$updateViewport$1 extends f30 implements iy {
    final /* synthetic */ OnFirstVisibleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFirstVisibleNode$updateViewport$1(OnFirstVisibleNode onFirstVisibleNode) {
        super(0);
        this.this$0 = onFirstVisibleNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6291invoke() {
        OnFirstVisibleNode onFirstVisibleNode = this.this$0;
        LayoutBoundsHolder viewportBounds = onFirstVisibleNode.getViewportBounds();
        onFirstVisibleNode.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6291invoke();
        return w01.a;
    }
}
