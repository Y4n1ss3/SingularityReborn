package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import defpackage.dq;
import defpackage.q10;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            layoutNode.dispatchOnPositionedCallbacks$ui();
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                dispatchHierarchy(layoutNodeArr[i]);
            }
        }
    }

    public final void dispatch() {
        MutableVector<LayoutNode> mutableVector;
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        int i = 0;
        while (true) {
            mutableVector = this.layoutNodes;
            if (i >= size) {
                break;
            }
            layoutNodeArr[i] = mutableVector.content[i];
            i++;
        }
        mutableVector.clear();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            layoutNode.getClass();
            if (layoutNode.getNeedsOnGloballyPositionedDispatch$ui()) {
                dispatchHierarchy(layoutNode);
            }
            layoutNodeArr[size] = null;
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void onNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.add(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void onRootNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.clear();
            this.layoutNodes.add(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void remove(LayoutNode layoutNode) {
        this.layoutNodes.remove(layoutNode);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int h = q10.h(layoutNode2.getDepth$ui(), layoutNode.getDepth$ui());
                return h != 0 ? h : q10.h(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
