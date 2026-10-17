package androidx.compose.ui.node;

import defpackage.q10;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int h = q10.h(layoutNode.getDepth$ui(), layoutNode2.getDepth$ui());
            return h != 0 ? h : q10.h(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
