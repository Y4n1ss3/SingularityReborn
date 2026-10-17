package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import defpackage.er;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {
    @er
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, false, null, new FocusTargetModifierNodeKt$FocusTargetModifierNode$1(InvalidateSemantics.INSTANCE), 7, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m4425FocusTargetModifierNodePYyLHbc(int i, my myVar) {
        return new FocusTargetNode(i, false, myVar, null, 10, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m4426FocusTargetModifierNodePYyLHbc$default(int i, my myVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Focusability.Companion.m4450getAlwaysLCbbffg();
        }
        if ((i2 & 2) != 0) {
            myVar = null;
        }
        return m4425FocusTargetModifierNodePYyLHbc(i, myVar);
    }

    public static final Rect getFocusedRect(FocusTargetModifierNode focusTargetModifierNode) {
        if (!focusTargetModifierNode.getNode().isAttached()) {
            return null;
        }
        FocusState focusState = focusTargetModifierNode.getFocusState();
        if (!focusState.getHasFocus()) {
            return null;
        }
        if (focusState.isFocused()) {
            return FocusTargetNode.fetchFocusRect$ui$default((FocusTargetNode) focusTargetModifierNode, null, 1, null);
        }
        FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetModifierNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            return activeFocusTargetNode.fetchFocusRect$ui(DelegatableNodeKt.requireLayoutCoordinates(focusTargetModifierNode));
        }
        return null;
    }
}
