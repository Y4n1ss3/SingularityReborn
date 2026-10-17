package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final IntRect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, IntRect intRect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = intRect;
    }

    public final IntRect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
