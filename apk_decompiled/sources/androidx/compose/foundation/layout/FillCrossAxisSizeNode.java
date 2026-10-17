package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private float fraction;

    public FillCrossAxisSizeNode(float f) {
        this.fraction = f;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        FlowLayoutData flowLayoutData = rowColumnParentData.getFlowLayoutData();
        if (flowLayoutData == null) {
            flowLayoutData = new FlowLayoutData(this.fraction);
        }
        rowColumnParentData.setFlowLayoutData(flowLayoutData);
        FlowLayoutData flowLayoutData2 = rowColumnParentData.getFlowLayoutData();
        flowLayoutData2.getClass();
        flowLayoutData2.setFillCrossAxisFraction(this.fraction);
        return rowColumnParentData;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }
}
