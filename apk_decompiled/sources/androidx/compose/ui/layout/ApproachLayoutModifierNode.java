package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo38approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo39isMeasurementApproachInProgressozmzZPI(long j);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo6213measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo38approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo6213measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo38approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ApproachLayoutModifierNode$measure$1$1(mo6234measureBRTryo0), 4, null);
    }

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo6213measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo38approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo6213measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo38approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
