package androidx.compose.ui.semantics;

import android.os.Trace;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.g10;
import defpackage.h10;
import defpackage.ky;
import defpackage.na0;
import defpackage.yi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsOwnerKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        return yi.I0(getAllSemanticsNodesToMap(semanticsOwner, !z, z2).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z, z2);
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z2 && unmergedRootSemanticsNode.getLayoutNode$ui().isDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z2, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z, z2);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, false, !z, 3, null);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z, (SemanticsNode) children$ui$default.get(i));
        }
    }

    public static final g10 getAllUncoveredSemanticsNodesToIntObjectMap(SemanticsOwner semanticsOwner, int i, ky kyVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
            if (unmergedRootSemanticsNode.getLayoutNode$ui().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui().isAttached()) {
                Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
                na0 na0Var = new na0(48);
                SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                SemanticsRegion.set(IntRectKt.roundToIntRect(boundsInRoot));
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(unmergedRootSemanticsNode, na0Var, kyVar, i, unmergedRootSemanticsNode, SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                return na0Var;
            }
            na0 na0Var2 = h10.a;
            na0Var2.getClass();
            return na0Var2;
        } finally {
            Trace.endSection();
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(na0 na0Var, ky kyVar, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        if (!semanticsNode2.getLayoutNode$ui().isPlaced() || !semanticsNode2.getLayoutNode$ui().isAttached() || semanticsRegion2.isEmpty()) {
            if (semanticsNode2.isFake$ui()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(na0Var, semanticsNode, i, semanticsNode2);
                return;
            }
            return;
        }
        Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
        if (touchBoundsInRoot.isEmpty()) {
            touchBoundsInRoot = semanticsNode2.getUnclippedBoundsInRoot$ui();
        }
        IntRect roundToIntRect = IntRectKt.roundToIntRect(touchBoundsInRoot);
        SemanticsRegion semanticsRegion3 = semanticsRegion;
        semanticsRegion.set(roundToIntRect);
        if (semanticsRegion.intersect(semanticsRegion2)) {
            na0Var.i(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
            List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
            int size = replacedChildren$ui.size() - 1;
            while (-1 < size) {
                if (!((Boolean) kyVar.invoke(replacedChildren$ui.get(size))).booleanValue()) {
                    getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(na0Var, kyVar, semanticsNode, i, replacedChildren$ui.get(size), semanticsRegion3, semanticsRegion2);
                }
                size--;
                semanticsRegion3 = semanticsRegion;
            }
            if (isImportantForAccessibility(semanticsNode2)) {
                semanticsRegion2.difference(roundToIntRect);
            }
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(na0 na0Var, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        LayoutInfo layoutInfo;
        SemanticsNode parent = semanticsNode2.getParent();
        na0Var.i(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, IntRectKt.roundToIntRect((parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot())));
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(SemanticsNode semanticsNode, na0 na0Var, ky kyVar, int i, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        int i2 = i;
        boolean z = (semanticsNode2.getLayoutNode$ui().isPlaced() && semanticsNode2.getLayoutNode$ui().isAttached()) ? false : true;
        if (!semanticsRegion2.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.isFake$ui()) {
                IntRect roundToIntRect = IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
                SemanticsRegion semanticsRegion3 = semanticsRegion;
                semanticsRegion3.set(roundToIntRect);
                int allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId = getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2);
                if (!semanticsRegion.intersect(semanticsRegion2)) {
                    if (semanticsNode2.isFake$ui()) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(na0Var, semanticsNode, i, semanticsNode2);
                        return;
                    } else {
                        if (allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId == i2) {
                            na0Var.i(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                na0Var.i(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion3.getBounds()));
                List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
                if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled && semanticsNode2.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() && isPartiallyOffscreenInScrollParent(semanticsNode2)) {
                    SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                    SemanticsRegion.set(IntRectKt.roundToIntRect(semanticsNode2.getUnclippedBoundsInRoot$ui()));
                    int size = replacedChildren$ui.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) kyVar.invoke(replacedChildren$ui.get(size))).booleanValue()) {
                            getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(na0Var, kyVar, semanticsNode, i2, replacedChildren$ui.get(size), SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                        }
                        size--;
                        i2 = i;
                    }
                } else {
                    int size2 = replacedChildren$ui.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) kyVar.invoke(replacedChildren$ui.get(size2))).booleanValue()) {
                            getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(semanticsNode, na0Var, kyVar, i, replacedChildren$ui.get(size2), semanticsRegion3, semanticsRegion2);
                        }
                        size2--;
                        semanticsRegion3 = semanticsRegion;
                    }
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    semanticsRegion2.difference(roundToIntRect);
                }
            }
        }
    }

    private static final int getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        return semanticsNode2.getId() == semanticsNode.getId() ? i : semanticsNode2.getId();
    }

    private static final SemanticsNode getScrollableParent(SemanticsNode semanticsNode) {
        for (SemanticsNode parent = semanticsNode.getParent(); parent != null; parent = parent.getParent()) {
            if (isScrollNode(parent)) {
                return parent;
            }
        }
        return null;
    }

    public static final boolean isHidden(SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui.contains(semanticsProperties.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getInvisibleToUser());
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui().containsImportantForAccessibility$ui();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean isPartiallyOffscreenInScrollParent(SemanticsNode semanticsNode) {
        LayoutCoordinates layoutCoordinates;
        NodeCoordinator findCoordinatorToGetBounds$ui;
        SemanticsNode scrollableParent = getScrollableParent(semanticsNode);
        if (scrollableParent != null) {
            NodeCoordinator findCoordinatorToGetBounds$ui2 = semanticsNode.findCoordinatorToGetBounds$ui();
            LayoutCoordinates layoutCoordinates2 = null;
            if (findCoordinatorToGetBounds$ui2 != null) {
                if (!findCoordinatorToGetBounds$ui2.isAttached()) {
                    findCoordinatorToGetBounds$ui2 = null;
                }
                if (findCoordinatorToGetBounds$ui2 != null) {
                    layoutCoordinates = findCoordinatorToGetBounds$ui2.getCoordinates();
                    findCoordinatorToGetBounds$ui = scrollableParent.findCoordinatorToGetBounds$ui();
                    if (findCoordinatorToGetBounds$ui != null) {
                        if (!findCoordinatorToGetBounds$ui.isAttached()) {
                            findCoordinatorToGetBounds$ui = null;
                        }
                        if (findCoordinatorToGetBounds$ui != null) {
                            layoutCoordinates2 = findCoordinatorToGetBounds$ui.getCoordinates();
                        }
                    }
                    if (layoutCoordinates != null && layoutCoordinates2 != null) {
                        Rect localBoundingBoxOf = layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                        return !localBoundingBoxOf.equals(localBoundingBoxOf.intersect(RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), IntSizeKt.m7794toSizeozmzZPI(layoutCoordinates2.mo6242getSizeYbymL2g()))));
                    }
                }
            }
            layoutCoordinates = null;
            findCoordinatorToGetBounds$ui = scrollableParent.findCoordinatorToGetBounds$ui();
            if (findCoordinatorToGetBounds$ui != null) {
            }
            if (layoutCoordinates != null) {
                Rect localBoundingBoxOf2 = layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                return !localBoundingBoxOf2.equals(localBoundingBoxOf2.intersect(RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), IntSizeKt.m7794toSizeozmzZPI(layoutCoordinates2.mo6242getSizeYbymL2g()))));
            }
        }
        return false;
    }

    private static final boolean isScrollNode(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui.contains(semanticsProperties.getVerticalScrollAxisRange()) || semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getHorizontalScrollAxisRange());
    }

    public static /* synthetic */ void isHidden$annotations(SemanticsNode semanticsNode) {
    }
}
