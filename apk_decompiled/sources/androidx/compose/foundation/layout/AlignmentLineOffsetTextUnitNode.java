package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j, long j2) {
        this.alignmentLine = alignmentLine;
        this.before = j;
        this.after = j2;
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m633getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m634getBeforeXSAIIZE() {
        return this.before;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        MeasureResult m616alignmentLineOffsetMeasuretjqqzMA;
        m616alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m616alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, TextUnit.m7803getRawTypeimpl(this.before) == 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : measureScope.mo362toDpGaN1DYA(this.before), TextUnit.m7803getRawTypeimpl(this.after) == 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : measureScope.mo362toDpGaN1DYA(this.after), measurable, j);
        return m616alignmentLineOffsetMeasuretjqqzMA;
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m635setAfterR2X_6o(long j) {
        this.after = j;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m636setBeforeR2X_6o(long j) {
        this.before = j;
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j, long j2, dq dqVar) {
        this(alignmentLine, j, j2);
    }
}
