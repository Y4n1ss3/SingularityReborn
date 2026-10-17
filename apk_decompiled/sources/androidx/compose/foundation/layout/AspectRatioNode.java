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
import androidx.compose.ui.unit.IntSize;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m665findSizeToXhtMw(long j) {
        IntSize.Companion companion;
        if (this.matchHeightConstraintsFirst) {
            long m666tryMaxHeightJN0ABg = m666tryMaxHeightJN0ABg(j, true);
            companion = IntSize.Companion;
            if (!IntSize.m7780equalsimpl0(m666tryMaxHeightJN0ABg, companion.m7787getZeroYbymL2g())) {
                return m666tryMaxHeightJN0ABg;
            }
            long m667tryMaxWidthJN0ABg = m667tryMaxWidthJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m667tryMaxWidthJN0ABg, companion.m7787getZeroYbymL2g())) {
                return m667tryMaxWidthJN0ABg;
            }
            long m668tryMinHeightJN0ABg = m668tryMinHeightJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m668tryMinHeightJN0ABg, companion.m7787getZeroYbymL2g())) {
                return m668tryMinHeightJN0ABg;
            }
            long m669tryMinWidthJN0ABg = m669tryMinWidthJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m669tryMinWidthJN0ABg, companion.m7787getZeroYbymL2g())) {
                return m669tryMinWidthJN0ABg;
            }
            long m666tryMaxHeightJN0ABg2 = m666tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m666tryMaxHeightJN0ABg2, companion.m7787getZeroYbymL2g())) {
                return m666tryMaxHeightJN0ABg2;
            }
            long m667tryMaxWidthJN0ABg2 = m667tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m667tryMaxWidthJN0ABg2, companion.m7787getZeroYbymL2g())) {
                return m667tryMaxWidthJN0ABg2;
            }
            long m668tryMinHeightJN0ABg2 = m668tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m668tryMinHeightJN0ABg2, companion.m7787getZeroYbymL2g())) {
                return m668tryMinHeightJN0ABg2;
            }
            long m669tryMinWidthJN0ABg2 = m669tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m669tryMinWidthJN0ABg2, companion.m7787getZeroYbymL2g())) {
                return m669tryMinWidthJN0ABg2;
            }
        } else {
            long m667tryMaxWidthJN0ABg3 = m667tryMaxWidthJN0ABg(j, true);
            companion = IntSize.Companion;
            if (!IntSize.m7780equalsimpl0(m667tryMaxWidthJN0ABg3, companion.m7787getZeroYbymL2g())) {
                return m667tryMaxWidthJN0ABg3;
            }
            long m666tryMaxHeightJN0ABg3 = m666tryMaxHeightJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m666tryMaxHeightJN0ABg3, companion.m7787getZeroYbymL2g())) {
                return m666tryMaxHeightJN0ABg3;
            }
            long m669tryMinWidthJN0ABg3 = m669tryMinWidthJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m669tryMinWidthJN0ABg3, companion.m7787getZeroYbymL2g())) {
                return m669tryMinWidthJN0ABg3;
            }
            long m668tryMinHeightJN0ABg3 = m668tryMinHeightJN0ABg(j, true);
            if (!IntSize.m7780equalsimpl0(m668tryMinHeightJN0ABg3, companion.m7787getZeroYbymL2g())) {
                return m668tryMinHeightJN0ABg3;
            }
            long m667tryMaxWidthJN0ABg4 = m667tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m667tryMaxWidthJN0ABg4, companion.m7787getZeroYbymL2g())) {
                return m667tryMaxWidthJN0ABg4;
            }
            long m666tryMaxHeightJN0ABg4 = m666tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m666tryMaxHeightJN0ABg4, companion.m7787getZeroYbymL2g())) {
                return m666tryMaxHeightJN0ABg4;
            }
            long m669tryMinWidthJN0ABg4 = m669tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m669tryMinWidthJN0ABg4, companion.m7787getZeroYbymL2g())) {
                return m669tryMinWidthJN0ABg4;
            }
            long m668tryMinHeightJN0ABg4 = m668tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7780equalsimpl0(m668tryMinHeightJN0ABg4, companion.m7787getZeroYbymL2g())) {
                return m668tryMinHeightJN0ABg4;
            }
        }
        return companion.m7787getZeroYbymL2g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m666tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        return (m7563getMaxHeightimpl == Integer.MAX_VALUE || (round = Math.round(((float) m7563getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m664isSatisfiedByNN6EwU(j, round, m7563getMaxHeightimpl))) ? IntSize.Companion.m7787getZeroYbymL2g() : IntSize.m7777constructorimpl((round << 32) | (m7563getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m667tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        return (m7564getMaxWidthimpl == Integer.MAX_VALUE || (round = Math.round(((float) m7564getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m664isSatisfiedByNN6EwU(j, m7564getMaxWidthimpl, round))) ? IntSize.Companion.m7787getZeroYbymL2g() : IntSize.m7777constructorimpl((m7564getMaxWidthimpl << 32) | (round & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m668tryMinHeightJN0ABg(long j, boolean z) {
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int round = Math.round(m7565getMinHeightimpl * this.aspectRatio);
        return (round <= 0 || (z && !AspectRatioKt.m664isSatisfiedByNN6EwU(j, round, m7565getMinHeightimpl))) ? IntSize.Companion.m7787getZeroYbymL2g() : IntSize.m7777constructorimpl((round << 32) | (m7565getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m669tryMinWidthJN0ABg(long j, boolean z) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int round = Math.round(m7566getMinWidthimpl / this.aspectRatio);
        return (round <= 0 || (z && !AspectRatioKt.m664isSatisfiedByNN6EwU(j, m7566getMinWidthimpl, round))) ? IntSize.Companion.m7787getZeroYbymL2g() : IntSize.m7777constructorimpl((m7566getMinWidthimpl << 32) | (round & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m665findSizeToXhtMw = m665findSizeToXhtMw(j);
        if (!IntSize.m7780equalsimpl0(m665findSizeToXhtMw, IntSize.Companion.m7787getZeroYbymL2g())) {
            j = Constraints.Companion.m7574fixedJhjzzOo((int) (m665findSizeToXhtMw >> 32), (int) (m665findSizeToXhtMw & 4294967295L));
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new a(0, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }
}
