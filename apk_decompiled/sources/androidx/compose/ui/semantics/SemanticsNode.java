package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.ut;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(Modifier.Node node, boolean z, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private final Rect boundsInImportantForBoundsAncestor(LayoutCoordinates layoutCoordinates) {
        DelegatingNode delegatingNode;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeChain nodes$ui = parent.layoutNode.getNodes$ui();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(8);
        if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            loop0: for (Modifier.Node head$ui = nodes$ui.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            if (delegatingNode.isImportantForBounds()) {
                                break loop0;
                            }
                        } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                            int i = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNode = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                delegatingNode = delegatingNode;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                    break;
                }
            }
        }
        delegatingNode = 0;
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
        NodeCoordinator m6414requireCoordinator64DMado = semanticsModifierNode != null ? DelegatableNodeKt.m6414requireCoordinator64DMado(semanticsModifierNode, NodeKind.m6573constructorimpl(8)) : null;
        return m6414requireCoordinator64DMado == null ? parent.boundsInImportantForBoundsAncestor(layoutCoordinates) : LayoutCoordinates.localBoundingBoxOf$default(m6414requireCoordinator64DMado, layoutCoordinates, false, 2, null);
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        Role role;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && !list.isEmpty()) {
            list.add(m6837fakeSemanticsNodeypyhhiA(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !list.isEmpty() && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            String str = list2 != null ? (String) yi.q0(list2) : null;
            if (str != null) {
                list.add(0, m6837fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m6837fakeSemanticsNodeypyhhiA(Role role, ky kyVar) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        kyVar.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(kyVar), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list, boolean z) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isAttached() && (z || !layoutNode2.isDeactivated())) {
                if (layoutNode2.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                    list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                } else {
                    fillOneLayerOfSemanticsWrappers(layoutNode2, list, z);
                }
            }
        }
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list, List<SemanticsNode> list2) {
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = list.get(size2);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list2.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list, list2);
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SemanticsModifierNode findSemanticsModifierNodeToGetBounds() {
        Modifier.Node node;
        boolean z;
        boolean isMergingSemanticsOfDescendants = this.unmergedConfig.isMergingSemanticsOfDescendants();
        LayoutNode layoutNode = this.layoutNode;
        Object obj = null;
        if (!isMergingSemanticsOfDescendants) {
            NodeChain nodes$ui = layoutNode.getNodes$ui();
            int m6573constructorimpl = NodeKind.m6573constructorimpl(8);
            if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
                loop3: for (Modifier.Node head$ui = nodes$ui.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                    if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        node = head$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof SemanticsModifierNode) {
                                if (((SemanticsModifierNode) node).isImportantForBounds()) {
                                    obj = node;
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                        break;
                    }
                }
            }
            return (SemanticsModifierNode) obj;
        }
        NodeChain nodes$ui2 = layoutNode.getNodes$ui();
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(8);
        if ((nodes$ui2.getAggregateChildKindSet() & m6573constructorimpl2) != 0) {
            node = null;
            for (Modifier.Node head$ui2 = nodes$ui2.getHead$ui(); head$ui2 != null; head$ui2 = head$ui2.getChild$ui()) {
                if ((head$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                    Modifier.Node node2 = head$ui2;
                    MutableVector mutableVector2 = null;
                    while (node2 != null) {
                        if (node2 instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) node2;
                            if (semanticsModifierNode.isImportantForBounds()) {
                                if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                    return semanticsModifierNode;
                                }
                                if (node == null) {
                                    node = semanticsModifierNode;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = delegate$ui2;
                                    } else {
                                        if (mutableVector2 == null) {
                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            mutableVector2.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector2.add(delegate$ui2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector2);
                    }
                }
                if ((head$ui2.getAggregateChildKindSet$ui() & m6573constructorimpl2) == 0) {
                    break;
                }
            }
            obj = node;
        }
        return (SemanticsModifierNode) obj;
    }

    private final void forEachUnmergedChild(List<SemanticsNode> list, ky kyVar) {
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            kyVar.invoke(list.get(size2));
        }
    }

    public static /* synthetic */ List getChildren$ui$default(SemanticsNode semanticsNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.getChildren$ui(z, z2, z3);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(List<SemanticsNode> list, SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.isClearingSemantics()) {
            return;
        }
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = list.get(size2);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(list, semanticsConfiguration);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List unmergedChildren$ui$default(SemanticsNode semanticsNode, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return semanticsNode.unmergedChildren$ui(list, z, z2);
    }

    public final SemanticsNode copyWithMergingEnabled$ui() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui() {
        NodeCoordinator m6414requireCoordinator64DMado;
        if (!isFake$ui()) {
            SemanticsModifierNode findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
            return (findSemanticsModifierNodeToGetBounds == null || (m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(findSemanticsModifierNodeToGetBounds, NodeKind.m6573constructorimpl(8))) == null) ? this.layoutNode.getInnerCoordinator$ui() : m6414requireCoordinator64DMado;
        }
        SemanticsNode parent = getParent();
        if (parent != null) {
            return parent.findCoordinatorToGetBounds$ui();
        }
        return null;
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            return findCoordinatorToGetBounds$ui.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final Rect getBoundsInParent$ui() {
        LayoutCoordinates coordinates;
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (coordinates = findCoordinatorToGetBounds$ui.getCoordinates()) != null) {
                return boundsInImportantForBoundsAncestor(coordinates);
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui)) != null) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInWindow() {
        Rect boundsInWindow$default;
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (boundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(findCoordinatorToGetBounds$ui, false, 1, null)) != null) {
                return boundsInWindow$default;
            }
        }
        return Rect.Companion.getZero();
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren$ui$default(this, false, false, false, 7, null);
    }

    public final List<SemanticsNode> getChildren$ui(boolean z, boolean z2, boolean z3) {
        if (!z && this.unmergedConfig.isClearingSemantics()) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        return isMergingSemanticsOfDescendants() ? findOneLayerOfMergingSemanticsNodes$default(this, arrayList, null, 2, null) : unmergedChildren$ui(arrayList, z2, z3);
    }

    public final SemanticsConfiguration getConfig() {
        boolean isMergingSemanticsOfDescendants = isMergingSemanticsOfDescendants();
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        if (!isMergingSemanticsOfDescendants) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration copy = semanticsConfiguration.copy();
        mergeConfig(new ArrayList(), copy);
        return copy;
    }

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final Modifier.Node getOuterSemanticsNode$ui() {
        return this.outerSemanticsNode;
    }

    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode = this.layoutNode.getParent$ui();
            while (layoutNode != null) {
                SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                    break;
                }
                layoutNode = layoutNode.getParent$ui();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            layoutNode = this.layoutNode.getParent$ui();
            while (true) {
                if (layoutNode == null) {
                    layoutNode = null;
                    break;
                }
                if (layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                    break;
                }
                layoutNode = layoutNode.getParent$ui();
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNode, this.mergingEnabled);
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m6838getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m6839getPositionInWindowF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m6840getPositionOnScreenF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionOnScreen(findCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    public final List<SemanticsNode> getReplacedChildren$ui() {
        return getChildren$ui$default(this, false, true, false, 4, null);
    }

    public final RootForTest getRoot() {
        Owner owner$ui = this.layoutNode.getOwner$ui();
        if (owner$ui != null) {
            return owner$ui.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m6841getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        return findCoordinatorToGetBounds$ui != null ? findCoordinatorToGetBounds$ui.mo6242getSizeYbymL2g() : IntSize.Companion.m7787getZeroYbymL2g();
    }

    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        return findSemanticsModifierNodeToGetBounds == null ? this.layoutNode.getInnerCoordinator$ui().touchBoundsInRoot() : SemanticsModifierNodeKt.effectiveBoundsInRoot(findSemanticsModifierNodeToGetBounds.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig), true);
    }

    public final Rect getUnclippedBoundsInRoot$ui() {
        SemanticsModifierNode findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        return findSemanticsModifierNodeToGetBounds == null ? SemanticsModifierNodeKt.boundsInRoot(this.layoutNode.getInnerCoordinator$ui(), false) : SemanticsModifierNodeKt.effectiveBoundsInRoot(findSemanticsModifierNodeToGetBounds.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig), false);
    }

    public final SemanticsConfiguration getUnmergedConfig$ui() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui() {
        return this.fakeNodeParent != null;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final boolean isTransparent$ui() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            return findCoordinatorToGetBounds$ui.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui() {
        if (isFake$ui() || !getReplacedChildren$ui().isEmpty()) {
            return false;
        }
        LayoutNode parent$ui = this.layoutNode.getParent$ui();
        while (true) {
            if (parent$ui == null) {
                parent$ui = null;
                break;
            }
            SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                break;
            }
            parent$ui = parent$ui.getParent$ui();
        }
        return parent$ui == null;
    }

    public final List<SemanticsNode> unmergedChildren$ui(List<SemanticsNode> list, boolean z, boolean z2) {
        if (isFake$ui()) {
            return ut.d;
        }
        fillOneLayerOfSemanticsWrappers(this.layoutNode, list, z2);
        if (z) {
            emitFakeNodes(list);
        }
        return list;
    }
}
