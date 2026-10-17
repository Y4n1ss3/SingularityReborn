package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface SemanticsModifierNode extends DelegatableNode {
    void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    default boolean isImportantForBounds() {
        return true;
    }
}
