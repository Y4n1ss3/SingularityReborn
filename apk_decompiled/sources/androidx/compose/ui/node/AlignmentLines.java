package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import defpackage.dq;
import defpackage.p80;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class AlignmentLines {
    public static final int $stable = 8;
    private final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i, NodeCoordinator nodeCoordinator) {
        float f = i;
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        while (true) {
            m4508constructorimpl = mo6393calculatePositionInParentR5De75A(nodeCoordinator, m4508constructorimpl);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui();
            nodeCoordinator.getClass();
            if (nodeCoordinator.equals(this.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
                m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(positionFor) << 32) | (Float.floatToRawIntBits(positionFor) & 4294967295L));
            }
        }
        int round = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (m4508constructorimpl & 4294967295L)) : Float.intBitsToFloat((int) (m4508constructorimpl >> 32)));
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            round = AlignmentLineKt.merge(alignmentLine, ((Number) p80.K(alignmentLine, this.alignmentLineMap)).intValue(), round);
        }
        map.put(alignmentLine, Integer.valueOf(round));
    }

    /* renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    public abstract long mo6393calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j);

    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator);

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui() {
        return this.dirty;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    public abstract int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui() {
        recalculateQueryOwner();
        return this.queryOwner != null;
    }

    public final boolean getUsedByModifierLayout$ui() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AlignmentLines$recalculate$1(this));
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        boolean queried$ui = getQueried$ui();
        AlignmentLinesOwner alignmentLinesOwner = this.alignmentLinesOwner;
        if (!queried$ui) {
            AlignmentLinesOwner parentAlignmentLinesOwner = alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                if (alignmentLinesOwner2 == null || alignmentLinesOwner2.getAlignmentLines().getQueried$ui()) {
                    return;
                }
                AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner();
                }
                AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                alignmentLinesOwner = (parentAlignmentLinesOwner3 == null || (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) == null) ? null : alignmentLines.queryOwner;
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final void reset$ui() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui(boolean z) {
        this.dirty = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void setUsedByModifierLayout$ui(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void setUsedByModifierMeasurement$ui(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void setUsedDuringParentLayout$ui(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void setUsedDuringParentMeasurement$ui(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, dq dqVar) {
        this(alignmentLinesOwner);
    }
}
