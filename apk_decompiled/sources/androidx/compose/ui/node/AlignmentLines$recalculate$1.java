package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AlignmentLines$recalculate$1 extends f30 implements ky {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        Map map;
        if (alignmentLinesOwner.getPlaceOrder() == Integer.MAX_VALUE) {
            return;
        }
        if (alignmentLinesOwner.getAlignmentLines().getDirty$ui()) {
            alignmentLinesOwner.layoutChildren();
        }
        map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
        AlignmentLines alignmentLines = this.this$0;
        for (Map.Entry entry : map.entrySet()) {
            alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
        }
        NodeCoordinator wrappedBy$ui = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui();
        wrappedBy$ui.getClass();
        while (!wrappedBy$ui.equals(this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
            Set<AlignmentLine> keySet = this.this$0.getAlignmentLinesMap(wrappedBy$ui).keySet();
            AlignmentLines alignmentLines2 = this.this$0;
            for (AlignmentLine alignmentLine : keySet) {
                alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui, alignmentLine), wrappedBy$ui);
            }
            wrappedBy$ui = wrappedBy$ui.getWrappedBy$ui();
            wrappedBy$ui.getClass();
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return w01.a;
    }
}
