package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;
    private final ky inspectorInfo;

    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j, long j2, ky kyVar) {
        this.alignmentLine = alignmentLine;
        this.before = j;
        this.after = j2;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        return alignmentLineOffsetTextUnitElement != null && q10.b(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m7802equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m7802equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m631getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m632getBeforeXSAIIZE() {
        return this.before;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return TextUnit.m7806hashCodeimpl(this.after) + ((TextUnit.m7806hashCodeimpl(this.before) + (this.alignmentLine.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetTextUnitNode.m636setBeforeR2X_6o(this.before);
        alignmentLineOffsetTextUnitNode.m635setAfterR2X_6o(this.after);
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j, long j2, ky kyVar, dq dqVar) {
        this(alignmentLine, j, j2, kyVar);
    }
}
