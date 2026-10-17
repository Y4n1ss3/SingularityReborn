package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.c10;
import defpackage.fc;
import defpackage.j50;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private c10 collapseSize;
    private my getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private c10 seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i3 & 2) != 0) {
            i = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i3 & 4) != 0) {
            i2 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setOverflowMeasurables__hBUhpc$lambda$2$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.seeMoreSize = new c10(c10.a(i, i2));
        flowLayoutOverflowState.seeMorePlaceable = placeable;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setOverflowMeasurables__hBUhpc$lambda$3$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.collapseSize = new c10(c10.a(i, i2));
        flowLayoutOverflowState.collapsePlaceable = placeable;
        return w01.a;
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout() {
        return this.type;
    }

    public final int component2$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        return new FlowLayoutOverflowState(overflowType, i, i2);
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout(boolean z, int i, int i2) {
        Measurable measurable;
        c10 c10Var;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3 && i3 != 4) {
                o.n();
                return null;
            }
            if (z) {
                my myVar = this.getOverflowMeasurable;
                if (myVar == null || (measurable = (Measurable) myVar.invoke(Boolean.TRUE, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                    measurable = this.seeMoreMeasurable;
                }
                c10Var = this.seeMoreSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.seeMorePlaceable;
                    placeable2 = placeable;
                    measurable2 = measurable;
                }
                measurable2 = measurable;
                placeable2 = null;
            } else {
                if (i < this.minLinesToShowCollapse - 1 || i2 < this.minCrossAxisSizeToShowCollapse) {
                    measurable = null;
                } else {
                    my myVar2 = this.getOverflowMeasurable;
                    if (myVar2 == null || (measurable = (Measurable) myVar2.invoke(Boolean.FALSE, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                        measurable = this.collapseMeasurable;
                    }
                }
                c10Var = this.collapseSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.collapsePlaceable;
                    placeable2 = placeable;
                    measurable2 = measurable;
                }
                measurable2 = measurable;
                placeable2 = null;
            }
            if (measurable2 != null) {
                c10Var.getClass();
                return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable2, placeable2, c10Var.a, false, 8, null);
            }
        }
        return null;
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout, reason: not valid java name */
    public final c10 m691ellipsisSizeF35zmw$foundation_layout(boolean z, int i, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    o.n();
                    return null;
                }
                if (z) {
                    return this.seeMoreSize;
                }
                if (i + 1 < this.minLinesToShowCollapse || i2 < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (z) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int getItemCount$foundation_layout() {
        return this.itemCount;
    }

    public final int getItemShown$foundation_layout() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        o.f(this.shownItemLazyErrorMessage);
        return 0;
    }

    public final String getShownItemLazyErrorMessage$foundation_layout() {
        return this.shownItemLazyErrorMessage;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.minCrossAxisSizeToShowCollapse) + j50.b(this.minLinesToShowCollapse, this.type.hashCode() * 31, 31);
    }

    public final void setItemCount$foundation_layout(int i) {
        this.itemCount = i;
    }

    public final void setItemShown$foundation_layout(int i) {
        this.itemShown = i;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m693setOverflowMeasurableshBUhpc$foundation_layout(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z, long j) {
        long m731constructorimpl = OrientationIndependentConstraints.m731constructorimpl(j, z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int mainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z, Constraints.m7563getMaxHeightimpl(m731constructorimpl));
            this.seeMoreSize = new c10(c10.a(mainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z, mainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int mainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z, Constraints.m7563getMaxHeightimpl(m731constructorimpl));
            this.collapseSize = new c10(c10.a(mainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z, mainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout, reason: not valid java name */
    public final void m694setOverflowMeasurablesVKLhPVY$foundation_layout(FlowLineMeasurePolicy flowLineMeasurePolicy, long j, my myVar) {
        this.itemShown = 0;
        this.getOverflowMeasurable = myVar;
        m692setOverflowMeasurableshBUhpc$foundation_layout(flowLineMeasurePolicy, (Measurable) myVar.invoke(Boolean.TRUE, 0), (Measurable) myVar.invoke(Boolean.FALSE, 0), j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.type);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.minLinesToShowCollapse);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return fc.e(sb, this.minCrossAxisSizeToShowCollapse, ')');
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m692setOverflowMeasurableshBUhpc$foundation_layout(final FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long m744toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m744toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m733copyyUG9Ft0$default(OrientationIndependentConstraints.m731constructorimpl(j, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            final int i = 0;
            FlowLayoutKt.m689measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, m744toBoxConstraintsOenEA2s, new ky(this) { // from class: lx
                public final /* synthetic */ FlowLayoutOverflowState e;

                {
                    this.e = this;
                }

                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 overflowMeasurables__hBUhpc$lambda$2$0;
                    w01 overflowMeasurables__hBUhpc$lambda$3$0;
                    int i2 = i;
                    FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                    FlowLayoutOverflowState flowLayoutOverflowState = this.e;
                    Placeable placeable = (Placeable) obj;
                    switch (i2) {
                        case 0:
                            overflowMeasurables__hBUhpc$lambda$2$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$2$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$2$0;
                        default:
                            overflowMeasurables__hBUhpc$lambda$3$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$3$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$3$0;
                    }
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            final int i2 = 1;
            FlowLayoutKt.m689measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, m744toBoxConstraintsOenEA2s, new ky(this) { // from class: lx
                public final /* synthetic */ FlowLayoutOverflowState e;

                {
                    this.e = this;
                }

                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 overflowMeasurables__hBUhpc$lambda$2$0;
                    w01 overflowMeasurables__hBUhpc$lambda$3$0;
                    int i22 = i2;
                    FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                    FlowLayoutOverflowState flowLayoutOverflowState = this.e;
                    Placeable placeable = (Placeable) obj;
                    switch (i22) {
                        case 0:
                            overflowMeasurables__hBUhpc$lambda$2$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$2$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$2$0;
                        default:
                            overflowMeasurables__hBUhpc$lambda$3$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$3$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$3$0;
                    }
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }
}
