package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private ky callback;

    public OnGloballyPositionedNode(ky kyVar) {
        this.callback = kyVar;
    }

    public final ky getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(ky kyVar) {
        this.callback = kyVar;
    }
}
