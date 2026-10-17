package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m7566getMinWidthimpl;
        int m7564getMaxWidthimpl;
        int i;
        int i2;
        if (!Constraints.m7560getHasBoundedWidthimpl(j) || this.direction == Direction.Vertical) {
            m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
            m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        } else {
            int round = Math.round(Constraints.m7564getMaxWidthimpl(j) * this.fraction);
            int m7566getMinWidthimpl2 = Constraints.m7566getMinWidthimpl(j);
            m7566getMinWidthimpl = Constraints.m7564getMaxWidthimpl(j);
            if (round < m7566getMinWidthimpl2) {
                round = m7566getMinWidthimpl2;
            }
            if (round <= m7566getMinWidthimpl) {
                m7566getMinWidthimpl = round;
            }
            m7564getMaxWidthimpl = m7566getMinWidthimpl;
        }
        if (!Constraints.m7559getHasBoundedHeightimpl(j) || this.direction == Direction.Horizontal) {
            int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
            int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            i = m7565getMinHeightimpl;
            i2 = m7563getMaxHeightimpl;
        } else {
            int round2 = Math.round(Constraints.m7563getMaxHeightimpl(j) * this.fraction);
            int m7565getMinHeightimpl2 = Constraints.m7565getMinHeightimpl(j);
            i = Constraints.m7563getMaxHeightimpl(j);
            if (round2 < m7565getMinHeightimpl2) {
                round2 = m7565getMinHeightimpl2;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.Constraints(m7566getMinWidthimpl, m7564getMaxWidthimpl, i, i2));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(3, mo6234measureBRTryo0), 4, null);
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }
}
