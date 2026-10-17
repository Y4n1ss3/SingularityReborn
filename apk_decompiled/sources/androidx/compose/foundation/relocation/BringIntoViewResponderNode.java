package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import defpackage.hm;
import defpackage.iy;
import defpackage.p10;
import defpackage.p9;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean hasBeenPlaced;
    private BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewResponderNode(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$lambda$1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, iy iyVar) {
        Rect bringIntoView$localRect = bringIntoView$localRect(bringIntoViewResponderNode, layoutCoordinates, iyVar);
        if (bringIntoView$localRect != null) {
            return bringIntoViewResponderNode.responder.calculateRectForParent(bringIntoView$localRect);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, iy iyVar) {
        Rect rect;
        Rect localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt;
        if (!bringIntoViewResponderNode.isAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) iyVar.invoke()) == null) {
            return null;
        }
        localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt = BringIntoViewRequesterKt__BringIntoViewResponderKt.localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(requireLayoutCoordinates, layoutCoordinates, rect);
        return localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, iy iyVar, hm hmVar) {
        Object n = p10.n(new BringIntoViewResponderNode$bringIntoView$2(this, layoutCoordinates, iyVar, new p9(this, layoutCoordinates, iyVar, 2), null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.hasBeenPlaced = true;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
