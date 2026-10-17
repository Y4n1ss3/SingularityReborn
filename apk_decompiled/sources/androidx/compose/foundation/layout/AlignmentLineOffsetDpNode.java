package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;
    private AlignmentLine alignmentLine;
    private float before;

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f, float f2) {
        this.alignmentLine = alignmentLine;
        this.before = f;
        this.after = f2;
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m627getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m628getBeforeD9Ej5fM() {
        return this.before;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        MeasureResult m616alignmentLineOffsetMeasuretjqqzMA;
        m616alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m616alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j);
        return m616alignmentLineOffsetMeasuretjqqzMA;
    }

    /* renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m629setAfter0680j_4(float f) {
        this.after = f;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m630setBefore0680j_4(float f) {
        this.before = f;
    }

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f, float f2, dq dqVar) {
        this(alignmentLine, f, f2);
    }
}
