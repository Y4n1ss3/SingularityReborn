package androidx.compose.foundation.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    private final ValueInsets insets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode, Measurable measurable, int i, int i2, Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
            long mo6242getSizeYbymL2g = coordinates.mo6242getSizeYbymL2g();
            long mo6245localToRootMKHz9U = coordinates.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g >> 32)) << 32)));
            long mo6242getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo6242getSizeYbymL2g();
            int round = Math.round(Float.intBitsToFloat((int) (positionInRoot >> 32)));
            int round2 = Math.round(Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
            int round3 = ((int) (mo6242getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U >> 32)));
            int round4 = ((int) (mo6242getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U & 4294967295L)));
            InsetsValues value$foundation_layout = recalculateWindowInsetsModifierNode.insets.getValue$foundation_layout();
            if (value$foundation_layout.getLeft() != round || value$foundation_layout.getTop() != round2 || value$foundation_layout.getRight() != round3 || value$foundation_layout.getBottom() != round4) {
                recalculateWindowInsetsModifierNode.insets.setValue$foundation_layout(new InsetsValues(round, round2, round3, round4));
                recalculateWindowInsetsModifierNode.insetsInvalidated();
            }
        }
        Placeable.PlacementScope.place$default(placementScope, measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i, i2)), 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return this.insets.getValue$foundation_layout().getLeft() == -1 ? windowInsets : this.insets;
    }

    public final ValueInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final Measurable measurable, long j) {
        if (Constraints.m7562getHasFixedWidthimpl(j) && Constraints.m7561getHasFixedHeightimpl(j)) {
            final int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
            final int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7563getMaxHeightimpl, null, new ky() { // from class: androidx.compose.foundation.layout.j
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 measure_3p2s80s$lambda$1;
                    measure_3p2s80s$lambda$1 = RecalculateWindowInsetsModifierNode.measure_3p2s80s$lambda$1(RecalculateWindowInsetsModifierNode.this, measurable, m7564getMaxWidthimpl, m7563getMaxHeightimpl, (Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$1;
                }
            }, 4, null);
        }
        if (this.insets.getValue$foundation_layout().getLeft() != -1) {
            this.insets.setValue$foundation_layout(new InsetsValues(-1, -1, -1, -1));
            insetsInvalidated();
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(5, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
