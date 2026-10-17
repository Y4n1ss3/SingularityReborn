package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Arrangement.Horizontal horizontalArrangement;
    private final Alignment.Vertical verticalAlignment;

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    private final Arrangement.Horizontal component1() {
        return this.horizontalArrangement;
    }

    private final Alignment.Vertical component2() {
        return this.verticalAlignment;
    }

    public static /* synthetic */ RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = rowMeasurePolicy.horizontalArrangement;
        }
        if ((i & 2) != 0) {
            vertical = rowMeasurePolicy.verticalAlignment;
        }
        return rowMeasurePolicy.copy(horizontal, vertical);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i, int i2) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout(i, crossAxisSize(placeable), LayoutDirection.Ltr, placeable, i2) : this.verticalAlignment.align(crossAxisSize(placeable), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeHelper$lambda$0$0(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i, int i2, int[] iArr, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Placeable placeable = placeableArr[i3];
            placeable.getClass();
            Placeable.PlacementScope.place$default(placementScope, placeable, iArr[i4], rowMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i, i2), 0.0f, 4, null);
            i3++;
            i4++;
        }
        return w01.a;
    }

    public final RowMeasurePolicy copy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        return new RowMeasurePolicy(horizontal, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public long mo678createConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
        return RowKt.createRowConstraints(z, i, i2, i3, i4);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return q10.b(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && q10.b(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return this.verticalAlignment.hashCode() + (this.horizontalArrangement.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.horizontalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.horizontalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureResult measure;
        measure = RowColumnMeasurePolicyKt.measure(this, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), measureScope.mo361roundToPx0680j_4(this.horizontalArrangement.mo653getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (r28 & Fields.RotationZ) != 0 ? null : null, (r28 & Fields.CameraDistance) != 0 ? 0 : 0);
        return measure;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.horizontalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.horizontalArrangement.mo653getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return MeasureScope.layout$default(measureScope, i2, i3, null, new ky() { // from class: bk0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 placeHelper$lambda$0$0;
                placeHelper$lambda$0$0 = RowMeasurePolicy.placeHelper$lambda$0$0(placeableArr, this, i3, i, iArr, (Placeable.PlacementScope) obj);
                return placeHelper$lambda$0$0;
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
