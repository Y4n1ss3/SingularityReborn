package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class IntrinsicHeightNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize height;

    public IntrinsicHeightNode(IntrinsicSize intrinsicSize, boolean z) {
        this.height = intrinsicSize;
        this.enforceIncoming = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    public long mo715calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j) {
        int minIntrinsicHeight = this.height == IntrinsicSize.Min ? measurable.minIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)) : measurable.maxIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j));
        if (minIntrinsicHeight < 0) {
            minIntrinsicHeight = 0;
        }
        return Constraints.Companion.m7575fixedHeightOenEA2s(minIntrinsicHeight);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getHeight() {
        return this.height;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    public void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    public final void setHeight(IntrinsicSize intrinsicSize) {
        this.height = intrinsicSize;
    }
}
