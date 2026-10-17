package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;
    private final ky inspectorInfo;

    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f, float f2, ky kyVar) {
        this.alignmentLine = alignmentLine;
        this.before = f;
        this.after = f2;
        this.inspectorInfo = kyVar;
        boolean z = true;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && q10.b(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Dp.m7616equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && Dp.m7616equalsimpl0(this.after, alignmentLineOffsetDpElement.after);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m625getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m626getBeforeD9Ej5fM() {
        return this.before;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.after) + j50.a(this.before, this.alignmentLine.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m630setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m629setAfter0680j_4(this.after);
    }

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f, float f2, ky kyVar, dq dqVar) {
        this(alignmentLine, f, f2, kyVar);
    }
}
