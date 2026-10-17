package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m6304placeRelative70tqf50$default(placementScope, placeable, IntOffset.Companion.m7750getZeronOccac(), 0.0f, 2, null);
        return w01.a;
    }

    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public abstract long mo715calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j);

    public abstract boolean getEnforceIncoming();

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long mo715calculateContentConstraintsl58MMJ0 = mo715calculateContentConstraintsl58MMJ0(measureScope, measurable, j);
        if (getEnforceIncoming()) {
            mo715calculateContentConstraintsl58MMJ0 = ConstraintsKt.m7579constrainN9IONVI(j, mo715calculateContentConstraintsl58MMJ0);
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(mo715calculateContentConstraintsl58MMJ0);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(4, mo6234measureBRTryo0), 4, null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
