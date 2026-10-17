package androidx.compose.foundation.layout;

import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowColumnParentData {
    public static final int $stable = 8;
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private FlowLayoutData flowLayoutData;
    private float weight;

    public /* synthetic */ RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i, dq dqVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment, (i & 8) != 0 ? null : flowLayoutData);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rowColumnParentData.weight;
        }
        if ((i & 2) != 0) {
            z = rowColumnParentData.fill;
        }
        if ((i & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f, z, crossAxisAlignment, flowLayoutData);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    public final RowColumnParentData copy(float f, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(f, z, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && q10.b(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && q10.b(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int c = kp0.c(Float.hashCode(this.weight) * 31, 31, this.fill);
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int hashCode = (c + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return hashCode + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void setFlowLayoutData(FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.weight = f;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }
}
