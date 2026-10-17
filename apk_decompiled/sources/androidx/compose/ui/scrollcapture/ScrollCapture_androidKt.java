package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import defpackage.bv;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ScrollCapture_androidKt {
    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        my scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui(false, false, false);
    }

    public static final my getScrollCaptureScrollByAction(SemanticsNode semanticsNode) {
        return (my) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final void visitDescendants(SemanticsNode semanticsNode, ky kyVar) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode));
        while (mutableVector.getSize() != 0) {
            SemanticsNode semanticsNode2 = (SemanticsNode) bv.d(mutableVector, 1);
            if (((Boolean) kyVar.invoke(semanticsNode2)).booleanValue()) {
                mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i, ky kyVar) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (List) childrenForSearch);
            while (mutableVector.getSize() != 0) {
                semanticsNode2 = (SemanticsNode) bv.d(mutableVector, 1);
                if (!SemanticsOwnerKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode2.findCoordinatorToGetBounds$ui();
                    if (findCoordinatorToGetBounds$ui == null) {
                        throw k4.a("Expected semantics node to have a coordinator.");
                    }
                    LayoutCoordinates coordinates = findCoordinatorToGetBounds$ui.getCoordinates();
                    IntRect roundToIntRect = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow$default(coordinates, false, 1, null));
                    if (roundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(semanticsNode2)) {
                            break;
                        }
                        int i2 = 1 + i;
                        kyVar.invoke(new ScrollCaptureCandidate(semanticsNode2, i2, roundToIntRect, coordinates));
                        visitScrollCaptureCandidates(semanticsNode2, i2, kyVar);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }

    public static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i, kyVar);
    }
}
