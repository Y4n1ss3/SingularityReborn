package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public static final int $stable = 8;

    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo6393calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        return NodeCoordinator.m6545toParentPosition8S9VItk$default(nodeCoordinator, j, false, 2, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.getMeasureResult$ui().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.get(alignmentLine);
    }
}
