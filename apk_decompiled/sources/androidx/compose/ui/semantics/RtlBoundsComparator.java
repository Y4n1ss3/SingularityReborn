package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RtlBoundsComparator implements Comparator<SemanticsNode> {
    public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        Rect boundsInWindow = semanticsNode.getBoundsInWindow();
        Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
        int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
        return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
    }
}
