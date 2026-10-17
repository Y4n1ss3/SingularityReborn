package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m6414requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m6573constructorimpl(16));
    }

    public static final boolean isAttached(PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}
