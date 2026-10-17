package androidx.compose.foundation;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import defpackage.iy;
import defpackage.k00;
import defpackage.ky;
import defpackage.w01;
import defpackage.x00;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isVertical;
    private boolean reverseScrolling;
    private ScrollState state;

    public ScrollNode(ScrollState scrollState, boolean z, boolean z2) {
        this.state = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float applySemantics$lambda$0(ScrollNode scrollNode) {
        return scrollNode.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float applySemantics$lambda$1(ScrollNode scrollNode) {
        return scrollNode.state.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(ScrollNode scrollNode, int i, Placeable placeable, Placeable.PlacementScope placementScope) {
        int value = scrollNode.state.getValue();
        if (value < 0) {
            value = 0;
        }
        if (value > i) {
            value = i;
        }
        int i2 = scrollNode.reverseScrolling ? value - i : -value;
        boolean z = scrollNode.isVertical;
        placementScope.withMotionFrameOfReferencePlacement(new x00(placeable, z ? 0 : i2, z ? i2 : 0, 2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0$0(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i, i2, 0.0f, (ky) null, 12, (Object) null);
        return w01.a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        final int i = 0;
        final int i2 = 1;
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new iy(this) { // from class: vl0
            public final /* synthetic */ ScrollNode e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                float applySemantics$lambda$0;
                int i3 = i;
                ScrollNode scrollNode = this.e;
                switch (i3) {
                    case 0:
                        applySemantics$lambda$0 = ScrollNode.applySemantics$lambda$0(scrollNode);
                        break;
                    default:
                        applySemantics$lambda$0 = ScrollNode.applySemantics$lambda$1(scrollNode);
                        break;
                }
                return Float.valueOf(applySemantics$lambda$0);
            }
        }, new iy(this) { // from class: vl0
            public final /* synthetic */ ScrollNode e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                float applySemantics$lambda$0;
                int i3 = i2;
                ScrollNode scrollNode = this.e;
                switch (i3) {
                    case 0:
                        applySemantics$lambda$0 = ScrollNode.applySemantics$lambda$0(scrollNode);
                        break;
                    default:
                        applySemantics$lambda$0 = ScrollNode.applySemantics$lambda$1(scrollNode);
                        break;
                }
                return Float.valueOf(applySemantics$lambda$0);
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final ScrollState getState() {
        return this.state;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        CheckScrollableContainerConstraintsKt.m254checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m7564getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m7563getMaxHeightimpl(j), 5, null));
        int width = mo6234measureBRTryo0.getWidth();
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int i = width > m7564getMaxWidthimpl ? m7564getMaxWidthimpl : width;
        int height = mo6234measureBRTryo0.getHeight();
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        int i2 = height > m7563getMaxHeightimpl ? m7563getMaxHeightimpl : height;
        int height2 = mo6234measureBRTryo0.getHeight() - i2;
        int width2 = mo6234measureBRTryo0.getWidth() - i;
        if (!this.isVertical) {
            height2 = width2;
        }
        this.state.setMaxValue$foundation(height2);
        this.state.setViewportSize$foundation(this.isVertical ? i2 : i);
        this.state.setContentSize$foundation(this.isVertical ? mo6234measureBRTryo0.getHeight() : mo6234measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, i, i2, null, new k00(this, height2, mo6234measureBRTryo0, 3), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final void setReverseScrolling(boolean z) {
        this.reverseScrolling = z;
    }

    public final void setState(ScrollState scrollState) {
        this.state = scrollState;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }
}
