package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntrinsicsPolicy {
    public static final int $stable = 8;
    private final LayoutNode layoutNode;
    private final MutableState measurePolicyState$delegate;

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.layoutNode = layoutNode;
        this.measurePolicyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int minIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int minIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }
}
