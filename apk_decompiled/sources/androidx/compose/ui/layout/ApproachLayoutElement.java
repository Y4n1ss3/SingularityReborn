package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    private final ny approachMeasure;
    private final ky isMeasurementApproachInProgress;
    private final my isPlacementApproachInProgress;

    public /* synthetic */ ApproachLayoutElement(ny nyVar, ky kyVar, my myVar, int i, dq dqVar) {
        this(nyVar, kyVar, (i & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : myVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return this.approachMeasure == approachLayoutElement.approachMeasure && this.isMeasurementApproachInProgress == approachLayoutElement.isMeasurementApproachInProgress && this.isPlacementApproachInProgress == approachLayoutElement.isPlacementApproachInProgress;
    }

    public final ny getApproachMeasure() {
        return this.approachMeasure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.isPlacementApproachInProgress.hashCode() + ((this.isMeasurementApproachInProgress.hashCode() + (this.approachMeasure.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    public final ky isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final my isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    public ApproachLayoutElement(ny nyVar, ky kyVar, my myVar) {
        this.approachMeasure = nyVar;
        this.isMeasurementApproachInProgress = kyVar;
        this.isPlacementApproachInProgress = myVar;
    }
}
