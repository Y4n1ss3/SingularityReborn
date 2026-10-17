package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates, boolean z) {
        return LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, z);
    }

    public static final Rect effectiveBoundsInRoot(Modifier.Node node, boolean z, boolean z2) {
        return !node.getNode().isAttached() ? Rect.Companion.getZero() : !z ? boundsInRoot(DelegatableNodeKt.m6414requireCoordinator64DMado(node, NodeKind.m6573constructorimpl(8)), z2) : DelegatableNodeKt.m6414requireCoordinator64DMado(node, NodeKind.m6573constructorimpl(8)).touchBoundsInRoot();
    }

    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui();
    }
}
