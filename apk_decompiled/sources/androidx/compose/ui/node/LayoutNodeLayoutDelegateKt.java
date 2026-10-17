package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.Measurable;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui() == null) {
            return false;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui != null ? parent$ui.getLookaheadRoot$ui() : null) == null || layoutNode.getLayoutDelegate$ui().getDetachedFromParentLookaheadPass$ui();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Measurable> void updateChildMeasurables(LayoutNode layoutNode, MutableVector<T> mutableVector, ky kyVar) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (mutableVector.getSize() <= i) {
                mutableVector.add(kyVar.invoke(layoutNode2));
            } else {
                mutableVector.set(i, kyVar.invoke(layoutNode2));
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui().size(), mutableVector.getSize());
    }
}
