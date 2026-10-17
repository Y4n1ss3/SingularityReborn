package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.gj;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Alignment.Horizontal horizontalAlignment;
    private final Arrangement.Vertical verticalArrangement;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    private final Arrangement.Vertical component1() {
        return this.verticalArrangement;
    }

    private final Alignment.Horizontal component2() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i & 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i, int i2, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout(i, crossAxisSize(placeable), layoutDirection, placeable, i2) : this.horizontalAlignment.align(crossAxisSize(placeable), i, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeHelper$lambda$0$0(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Placeable placeable = placeableArr[i3];
            placeable.getClass();
            Placeable.PlacementScope.place$default(placementScope, placeable, columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i, i2, measureScope.getLayoutDirection()), iArr[i4], 0.0f, 4, null);
            i3++;
            i4++;
        }
        return w01.a;
    }

    public final ColumnMeasurePolicy copy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        return new ColumnMeasurePolicy(vertical, horizontal);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public long mo678createConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
        return ColumnKt.createColumnConstraints(z, i, i2, i3, i4);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return q10.b(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && q10.b(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return this.horizontalAlignment.hashCode() + (this.verticalArrangement.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.verticalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.verticalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureResult measure;
        measure = RowColumnMeasurePolicyKt.measure(this, Constraints.m7565getMinHeightimpl(j), Constraints.m7566getMinWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), Constraints.m7564getMaxWidthimpl(j), measureScope.mo361roundToPx0680j_4(this.verticalArrangement.mo653getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (r28 & Fields.RotationZ) != 0 ? null : null, (r28 & Fields.CameraDistance) != 0 ? 0 : 0);
        return measure;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.verticalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.verticalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return MeasureScope.layout$default(measureScope, i3, i2, null, new gj(placeableArr, this, i3, i, measureScope, iArr), 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i, iArr, iArr2);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
