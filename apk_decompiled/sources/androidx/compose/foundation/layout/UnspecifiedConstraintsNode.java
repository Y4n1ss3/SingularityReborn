package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m826getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m827getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        int mo361roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo361roundToPx0680j_4(this.minHeight) : 0;
        return maxIntrinsicHeight < mo361roundToPx0680j_4 ? mo361roundToPx0680j_4 : maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        int mo361roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo361roundToPx0680j_4(this.minWidth) : 0;
        return maxIntrinsicWidth < mo361roundToPx0680j_4 ? mo361roundToPx0680j_4 : maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m7566getMinWidthimpl;
        int m7565getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m7566getMinWidthimpl(j) != 0) {
            m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        } else {
            int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.minWidth);
            m7566getMinWidthimpl = Constraints.m7564getMaxWidthimpl(j);
            if (mo361roundToPx0680j_4 < 0) {
                mo361roundToPx0680j_4 = 0;
            }
            if (mo361roundToPx0680j_4 <= m7566getMinWidthimpl) {
                m7566getMinWidthimpl = mo361roundToPx0680j_4;
            }
        }
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        if (Float.isNaN(this.minHeight) || Constraints.m7565getMinHeightimpl(j) != 0) {
            m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        } else {
            int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(this.minHeight);
            m7565getMinHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            int i = mo361roundToPx0680j_42 >= 0 ? mo361roundToPx0680j_42 : 0;
            if (i <= m7565getMinHeightimpl) {
                m7565getMinHeightimpl = i;
            }
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.Constraints(m7566getMinWidthimpl, m7564getMaxWidthimpl, m7565getMinHeightimpl, Constraints.m7563getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(7, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        int mo361roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo361roundToPx0680j_4(this.minHeight) : 0;
        return minIntrinsicHeight < mo361roundToPx0680j_4 ? mo361roundToPx0680j_4 : minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        int mo361roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo361roundToPx0680j_4(this.minWidth) : 0;
        return minIntrinsicWidth < mo361roundToPx0680j_4 ? mo361roundToPx0680j_4 : minIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m828setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m829setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    private UnspecifiedConstraintsNode(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, dq dqVar) {
        this(f, f2);
    }
}
