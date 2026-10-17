package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface LayoutAwareModifierNode extends MeasuredSizeAwareModifierNode, DelegatableNode {
    default void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    default void mo356onRemeasuredozmzZPI(long j) {
    }
}
