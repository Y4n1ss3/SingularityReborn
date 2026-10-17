package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {
    private ky isMeasurementApproachInProgress;
    private my isPlacementApproachInProgress;
    private ny measureBlock;

    public ApproachLayoutModifierNodeImpl(ny nyVar, ky kyVar, my myVar) {
        this.measureBlock = nyVar;
        this.isMeasurementApproachInProgress = kyVar;
        this.isPlacementApproachInProgress = myVar;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo38approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        return (MeasureResult) this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m7551boximpl(j));
    }

    public final ny getMeasureBlock() {
        return this.measureBlock;
    }

    public final ky isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo39isMeasurementApproachInProgressozmzZPI(long j) {
        return ((Boolean) this.isMeasurementApproachInProgress.invoke(IntSize.m7774boximpl(j))).booleanValue();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates)).booleanValue();
    }

    public final void setMeasureBlock(ny nyVar) {
        this.measureBlock = nyVar;
    }

    public final void setMeasurementApproachInProgress(ky kyVar) {
        this.isMeasurementApproachInProgress = kyVar;
    }

    public final void setPlacementApproachInProgress(my myVar) {
        this.isPlacementApproachInProgress = myVar;
    }

    public final my isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }
}
