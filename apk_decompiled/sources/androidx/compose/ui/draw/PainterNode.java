package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, dq dqVar) {
        this(painter, z, (i & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m4343calculateScaledSizeE7KxVPU(long j) {
        if (!getUseIntrinsicSize()) {
            return j;
        }
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(!m4345hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo5455getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (this.painter.mo5455getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!m4344hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo5455getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.mo5455getIntrinsicSizeNHjbRc() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j >> 32)) == 0.0f || Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) ? Size.Companion.m4594getZeroNHjbRc() : ScaleFactorKt.m6368timesUQTWf7w(m4576constructorimpl, this.contentScale.mo6227computeScaleFactorH7hwNQA(m4576constructorimpl, j));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo5455getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m4344hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        return !Size.m4581equalsimpl0(j, Size.Companion.m4593getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m4345hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        return !Size.m4581equalsimpl0(j, Size.Companion.m4593getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m4346modifyConstraintsZezNO4M(long j) {
        boolean z = false;
        boolean z2 = Constraints.m7560getHasBoundedWidthimpl(j) && Constraints.m7559getHasBoundedHeightimpl(j);
        if (Constraints.m7562getHasFixedWidthimpl(j) && Constraints.m7561getHasFixedHeightimpl(j)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m7554copyZbe2FdA$default(j, Constraints.m7564getMaxWidthimpl(j), 0, Constraints.m7563getMaxHeightimpl(j), 0, 10, null);
        }
        long mo5455getIntrinsicSizeNHjbRc = this.painter.mo5455getIntrinsicSizeNHjbRc();
        int round = m4345hasSpecifiedAndFiniteWidthuvyYCjk(mo5455getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo5455getIntrinsicSizeNHjbRc >> 32))) : Constraints.m7566getMinWidthimpl(j);
        int round2 = m4344hasSpecifiedAndFiniteHeightuvyYCjk(mo5455getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo5455getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m7565getMinHeightimpl(j);
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, round);
        long m4343calculateScaledSizeE7KxVPU = m4343calculateScaledSizeE7KxVPU(Size.m4576constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m7580constrainHeightK40F9xA(j, round2)) & 4294967295L) | (Float.floatToRawIntBits(m7581constrainWidthK40F9xA) << 32)));
        return Constraints.m7554copyZbe2FdA$default(j, ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.round(Float.intBitsToFloat((int) (m4343calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m7580constrainHeightK40F9xA(j, Math.round(Float.intBitsToFloat((int) (m4343calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long mo5455getIntrinsicSizeNHjbRc = this.painter.mo5455getIntrinsicSizeNHjbRc();
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(m4345hasSpecifiedAndFiniteWidthuvyYCjk(mo5455getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo5455getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(m4344hasSpecifiedAndFiniteHeightuvyYCjk(mo5455getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo5455getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L));
        long m4594getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.Companion.m4594getZeroNHjbRc() : ScaleFactorKt.m6368timesUQTWf7w(m4576constructorimpl, this.contentScale.mo6227computeScaleFactorH7hwNQA(m4576constructorimpl, contentDrawScope.mo5335getSizeNHjbRc()));
        long mo4178alignKFBX0sM = this.alignment.mo4178alignKFBX0sM(IntSize.m7777constructorimpl((Math.round(Float.intBitsToFloat((int) (m4594getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (m4594getZeroNHjbRc >> 32))) << 32)), IntSize.m7777constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32))) << 32)), contentDrawScope.getLayoutDirection());
        float m7739getXimpl = IntOffset.m7739getXimpl(mo4178alignKFBX0sM);
        float m7740getYimpl = IntOffset.m7740getYimpl(mo4178alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m7739getXimpl, m7740getYimpl);
        try {
            this.painter.m5461drawx_KDEd0(contentDrawScope, m4594getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-m7739getXimpl, -m7740getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-m7739getXimpl, -m7740getYimpl);
            throw th;
        }
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long m4346modifyConstraintsZezNO4M = m4346modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m7565getMinHeightimpl(m4346modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long m4346modifyConstraintsZezNO4M = m4346modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m7566getMinWidthimpl(m4346modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(m4346modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long m4346modifyConstraintsZezNO4M = m4346modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m7565getMinHeightimpl(m4346modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long m4346modifyConstraintsZezNO4M = m4346modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m7566getMinWidthimpl(m4346modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }
}
