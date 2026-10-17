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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f4, z, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m815getTargetConstraintsOenEA2s(Density density) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.maxWidth)) {
            i = Integer.MAX_VALUE;
        } else {
            i = density.mo361roundToPx0680j_4(this.maxWidth);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = density.mo361roundToPx0680j_4(this.maxHeight);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.minWidth)) {
            i3 = density.mo361roundToPx0680j_4(this.minWidth);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.minHeight)) {
            int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(this.minHeight);
            if (mo361roundToPx0680j_4 < 0) {
                mo361roundToPx0680j_4 = 0;
            }
            if (mo361roundToPx0680j_4 > i2) {
                mo361roundToPx0680j_4 = i2;
            }
            if (mo361roundToPx0680j_4 != Integer.MAX_VALUE) {
                i4 = mo361roundToPx0680j_4;
            }
        }
        return ConstraintsKt.Constraints(i3, i, i4, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m816getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m817getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m818getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m819getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m815getTargetConstraintsOenEA2s = m815getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7561getHasFixedHeightimpl(m815getTargetConstraintsOenEA2s)) {
            return Constraints.m7563getMaxHeightimpl(m815getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m7581constrainWidthK40F9xA(m815getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m7580constrainHeightK40F9xA(m815getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m815getTargetConstraintsOenEA2s = m815getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7562getHasFixedWidthimpl(m815getTargetConstraintsOenEA2s)) {
            return Constraints.m7564getMaxWidthimpl(m815getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m7580constrainHeightK40F9xA(m815getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m7581constrainWidthK40F9xA(m815getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m7566getMinWidthimpl;
        int m7564getMaxWidthimpl;
        int m7565getMinHeightimpl;
        int m7563getMaxHeightimpl;
        long Constraints;
        long m815getTargetConstraintsOenEA2s = m815getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m7579constrainN9IONVI(j, m815getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
                int m7564getMaxWidthimpl2 = Constraints.m7564getMaxWidthimpl(m815getTargetConstraintsOenEA2s);
                if (m7566getMinWidthimpl > m7564getMaxWidthimpl2) {
                    m7566getMinWidthimpl = m7564getMaxWidthimpl2;
                }
            } else {
                m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(m815getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
                int m7566getMinWidthimpl2 = Constraints.m7566getMinWidthimpl(m815getTargetConstraintsOenEA2s);
                if (m7564getMaxWidthimpl < m7566getMinWidthimpl2) {
                    m7564getMaxWidthimpl = m7566getMinWidthimpl2;
                }
            } else {
                m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(m815getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
                int m7563getMaxHeightimpl2 = Constraints.m7563getMaxHeightimpl(m815getTargetConstraintsOenEA2s);
                if (m7565getMinHeightimpl > m7563getMaxHeightimpl2) {
                    m7565getMinHeightimpl = m7563getMaxHeightimpl2;
                }
            } else {
                m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(m815getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
                int m7565getMinHeightimpl2 = Constraints.m7565getMinHeightimpl(m815getTargetConstraintsOenEA2s);
                if (m7563getMaxHeightimpl < m7565getMinHeightimpl2) {
                    m7563getMaxHeightimpl = m7565getMinHeightimpl2;
                }
            } else {
                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(m815getTargetConstraintsOenEA2s);
            }
            Constraints = ConstraintsKt.Constraints(m7566getMinWidthimpl, m7564getMaxWidthimpl, m7565getMinHeightimpl, m7563getMaxHeightimpl);
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(6, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m815getTargetConstraintsOenEA2s = m815getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7561getHasFixedHeightimpl(m815getTargetConstraintsOenEA2s)) {
            return Constraints.m7563getMaxHeightimpl(m815getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m7581constrainWidthK40F9xA(m815getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m7580constrainHeightK40F9xA(m815getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m815getTargetConstraintsOenEA2s = m815getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7562getHasFixedWidthimpl(m815getTargetConstraintsOenEA2s)) {
            return Constraints.m7564getMaxWidthimpl(m815getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m7580constrainHeightK40F9xA(m815getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m7581constrainWidthK40F9xA(m815getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m820setMaxHeight0680j_4(float f) {
        this.maxHeight = f;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m821setMaxWidth0680j_4(float f) {
        this.maxWidth = f;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m822setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m823setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    private SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, dq dqVar) {
        this(f, f2, f3, f4, z);
    }
}
