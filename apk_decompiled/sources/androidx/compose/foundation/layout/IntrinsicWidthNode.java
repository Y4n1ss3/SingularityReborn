package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize width;

    public IntrinsicWidthNode(IntrinsicSize intrinsicSize, boolean z) {
        this.width = intrinsicSize;
        this.enforceIncoming = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo715calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j) {
        int minIntrinsicWidth = this.width == IntrinsicSize.Min ? measurable.minIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) : measurable.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j));
        if (minIntrinsicWidth < 0) {
            minIntrinsicWidth = 0;
        }
        return Constraints.Companion.m7576fixedWidthOenEA2s(minIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getWidth() {
        return this.width;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    public void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    public final void setWidth(IntrinsicSize intrinsicSize) {
        this.width = intrinsicSize;
    }
}
