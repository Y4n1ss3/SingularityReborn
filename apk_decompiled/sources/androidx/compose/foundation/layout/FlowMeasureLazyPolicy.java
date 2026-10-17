package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.my;
import defpackage.oy;
import defpackage.q10;
import defpackage.w01;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final oy getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<my> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends my> list, oy oyVar) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.itemCount = i;
        this.maxLines = i2;
        this.maxItemsInMainAxis = i3;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = oyVar;
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<my> component11() {
        return this.overflowComposables;
    }

    private final oy component12() {
        return this.getComposable;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m700component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m701component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m702copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List list, oy oyVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((i4 & 2) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((i4 & 4) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((i4 & 8) != 0) {
            f = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((i4 & 16) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((i4 & 32) != 0) {
            f2 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((i4 & 64) != 0) {
            i = flowMeasureLazyPolicy.itemCount;
        }
        if ((i4 & Fields.SpotShadowColor) != 0) {
            i2 = flowMeasureLazyPolicy.maxLines;
        }
        if ((i4 & Fields.RotationX) != 0) {
            i3 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((i4 & Fields.RotationY) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((i4 & Fields.RotationZ) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i4 & Fields.CameraDistance) != 0) {
            oyVar = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        oy oyVar2 = oyVar;
        int i5 = i3;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i6 = i;
        int i7 = i2;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f3 = f2;
        return flowMeasureLazyPolicy.m704copyE4Q9ldg(z, horizontal, vertical, f, crossAxisAlignment2, f3, i6, i7, i5, flowLayoutOverflowState2, list2, oyVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult getMeasurePolicy$lambda$0(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return flowMeasureLazyPolicy.m703measure0kLqBqw(subcomposeMeasureScope, constraints.m7570unboximpl());
    }

    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    private final MeasureResult m703measure0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m7563getMaxHeightimpl(j) == 0 && this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new b(4), 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new g(0, subcomposeMeasureScope, this));
        this.overflow.setItemCount$foundation_layout(this.itemCount);
        this.overflow.m694setOverflowMeasurablesVKLhPVY$foundation_layout(this, j, new g(this, subcomposeMeasureScope));
        return FlowLayoutKt.m688breakDownItemsdi9J0FM(subcomposeMeasureScope, this, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m731constructorimpl(j, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_0kLqBqw$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List measure_0kLqBqw$lambda$1(SubcomposeMeasureScope subcomposeMeasureScope, final FlowMeasureLazyPolicy flowMeasureLazyPolicy, final int i, final FlowLineInfo flowLineInfo) {
        return subcomposeMeasureScope.subcompose(Integer.valueOf(i), ComposableLambdaKt.composableLambdaInstance(-195060736, true, new my() { // from class: androidx.compose.foundation.layout.e
            @Override // defpackage.my
            public final Object invoke(Object obj, Object obj2) {
                w01 measure_0kLqBqw$lambda$1$0;
                int intValue = ((Integer) obj2).intValue();
                measure_0kLqBqw$lambda$1$0 = FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$1$0(FlowMeasureLazyPolicy.this, i, flowLineInfo, (Composer) obj, intValue);
                return measure_0kLqBqw$lambda$1$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_0kLqBqw$lambda$1$0(FlowMeasureLazyPolicy flowMeasureLazyPolicy, int i, FlowLineInfo flowLineInfo, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195060736, i2, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:487)");
            }
            flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i), flowLineInfo, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Measurable measure_0kLqBqw$lambda$2(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope, boolean z, int i) {
        my myVar = (my) yi.r0(flowMeasureLazyPolicy.overflowComposables, !z ? 1 : 0);
        if (myVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(flowMeasureLazyPolicy.itemCount);
        sb.append(i);
        return (Measurable) yi.r0(subcomposeMeasureScope.subcompose(sb.toString(), myVar), 0);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m704copyE4Q9ldg(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends my> list, oy oyVar) {
        return new FlowMeasureLazyPolicy(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, i3, flowLayoutOverflowState, list, oyVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && q10.b(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && q10.b(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && Dp.m7616equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && q10.b(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && Dp.m7616equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && q10.b(this.overflow, flowMeasureLazyPolicy.overflow) && q10.b(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && q10.b(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final my getMeasurePolicy() {
        return new my() { // from class: androidx.compose.foundation.layout.f
            @Override // defpackage.my
            public final Object invoke(Object obj, Object obj2) {
                MeasureResult measurePolicy$lambda$0;
                measurePolicy$lambda$0 = FlowMeasureLazyPolicy.getMeasurePolicy$lambda$0(FlowMeasureLazyPolicy.this, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                return measurePolicy$lambda$0;
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return this.getComposable.hashCode() + ((this.overflowComposables.hashCode() + ((this.overflow.hashCode() + j50.b(this.maxItemsInMainAxis, j50.b(this.maxLines, j50.b(this.itemCount, j50.a(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + j50.a(this.mainAxisSpacing, (this.verticalArrangement.hashCode() + ((this.horizontalArrangement.hashCode() + (Boolean.hashCode(this.isHorizontal) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb.append(this.isHorizontal);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        fc.i(this.mainAxisSpacing, sb, ", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        fc.i(this.crossAxisArrangementSpacing, sb, ", itemCount=");
        sb.append(this.itemCount);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", maxItemsInMainAxis=");
        sb.append(this.maxItemsInMainAxis);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(", overflowComposables=");
        sb.append(this.overflowComposables);
        sb.append(", getComposable=");
        sb.append(this.getComposable);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List list, oy oyVar, dq dqVar) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, i3, flowLayoutOverflowState, list, oyVar);
    }
}
