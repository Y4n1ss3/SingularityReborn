package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (!(child != null)) {
            InlineClassHelperKt.throwIllegalStateException("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = child.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui(true);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(true);
        lookaheadCapablePlaceable.replace$ui();
        child.setShallowPlacing$ui(false);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(false);
        return (alignmentLine instanceof HorizontalAlignmentLine ? IntOffset.m7740getYimpl(child.mo6489getPositionnOccac()) : IntOffset.m7739getXimpl(child.mo6489getPositionnOccac())) + i;
    }
}
