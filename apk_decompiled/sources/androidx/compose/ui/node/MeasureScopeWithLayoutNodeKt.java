package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.LayoutNode;
import defpackage.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MeasureScopeWithLayoutNodeKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<List<Measurable>> getChildrenOfVirtualChildren(IntrinsicMeasureScope intrinsicMeasureScope) {
        intrinsicMeasureScope.getClass();
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean isInLookaheadPass = isInLookaheadPass(layoutNode);
        List<LayoutNode> foldedChildren$ui = layoutNode.getFoldedChildren$ui();
        ArrayList arrayList = new ArrayList(foldedChildren$ui.size());
        int size = foldedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = foldedChildren$ui.get(i);
            arrayList.add(isInLookaheadPass ? layoutNode2.getChildLookaheadMeasurables$ui() : layoutNode2.getChildMeasurables$ui());
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(LayoutNode layoutNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                LayoutNode parent$ui = layoutNode.getParent$ui();
                if (parent$ui != null) {
                    return isInLookaheadPass(parent$ui);
                }
                o.m("no parent for idle node");
                return false;
            }
            o.n();
        }
        return false;
    }
}
