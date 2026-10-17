package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.my;
import defpackage.w01;
import defpackage.xe0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DraggableAnchorsNodeV2<T> extends Modifier.Node implements LayoutModifierNode {
    private my anchors;
    private boolean didLookahead;
    private Orientation orientation;
    private androidx.compose.foundation.gestures.AnchoredDraggableState<T> state;

    public DraggableAnchorsNodeV2(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, my myVar, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = myVar;
        this.orientation = orientation;
    }

    private final boolean isReverseDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(MeasureScope measureScope, DraggableAnchorsNodeV2 draggableAnchorsNodeV2, Placeable placeable, Placeable.PlacementScope placementScope) {
        float positionOf = measureScope.isLookingAhead() ? draggableAnchorsNodeV2.state.getAnchors().positionOf(draggableAnchorsNodeV2.state.getTargetValue()) : draggableAnchorsNodeV2.state.requireOffset();
        float f = draggableAnchorsNodeV2.isReverseDirection() ? -1.0f : 1.0f;
        Orientation orientation = draggableAnchorsNodeV2.orientation;
        float f2 = orientation == Orientation.Horizontal ? f * positionOf : 0.0f;
        if (orientation != Orientation.Vertical) {
            positionOf = 0.0f;
        }
        placementScope.withMotionFrameOfReferencePlacement(new j(placeable, f2, positionOf, 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1$lambda$0(Placeable placeable, float f, float f2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, y80.P(f), y80.P(f2), 0.0f, 4, null);
        return w01.a;
    }

    public final my getAnchors() {
        return this.anchors;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final androidx.compose.foundation.gestures.AnchoredDraggableState<T> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            xe0 xe0Var = (xe0) this.anchors.invoke(IntSize.m7774boximpl(IntSize.m7777constructorimpl((mo6234measureBRTryo0.getHeight() & 4294967295L) | (mo6234measureBRTryo0.getWidth() << 32))), Constraints.m7551boximpl(j));
            this.state.updateAnchors((androidx.compose.foundation.gestures.DraggableAnchors) xe0Var.d, xe0Var.e);
        }
        int i = 1;
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new i(measureScope, this, mo6234measureBRTryo0, i), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    public final void setAnchors(my myVar) {
        this.anchors = myVar;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setState(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }
}
