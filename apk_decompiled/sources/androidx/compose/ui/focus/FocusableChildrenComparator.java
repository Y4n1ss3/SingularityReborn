package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import defpackage.o;
import defpackage.q10;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui();
        }
        return mutableVector;
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (!FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) || !FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) ? 1 : 0;
        }
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        if (q10.b(requireLayoutNode, requireLayoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> pathFromRoot = pathFromRoot(requireLayoutNode);
        MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(requireLayoutNode2);
        int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
        if (min >= 0) {
            int i = 0;
            while (q10.b(pathFromRoot.content[i], pathFromRoot2.content[i])) {
                if (i != min) {
                    i++;
                }
            }
            return q10.h(pathFromRoot.content[i].getPlaceOrder$ui(), pathFromRoot2.content[i].getPlaceOrder$ui());
        }
        o.f("Could not find a common ancestor between the two FocusModifiers.");
        return 0;
    }
}
