package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ad0;
import defpackage.dq;
import defpackage.gb0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.no0;
import defpackage.o;
import defpackage.q10;
import defpackage.qa0;
import defpackage.sl0;
import defpackage.ta0;
import defpackage.xt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private my _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastClip;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private ky layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private ta0 oldAlignmentLines;
    private boolean released;
    private boolean wasLayerBlockInvoked;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final ky onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    private static final ky onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m5005constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo6563childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
            layoutNode.m6469hitTest6fMxITs$ui(j, hitTestResult, i, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo6564entityTypeOLwlOKw() {
            return NodeKind.m6573constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = node.getDelegate$ui();
                    int i = 0;
                    node = node;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui);
                            }
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        node = node;
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                return false;
            }
            hitTestResult.acceptHits();
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo6563childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
            layoutNode.m6470hitTestSemantics6fMxITs$ui(j, hitTestResult, i, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo6564entityTypeOLwlOKw() {
            return NodeKind.m6573constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTest(Modifier.Node node) {
            if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                return SemanticsOwnerKt.isImportantForAccessibility(SemanticsNodeKt.SemanticsNode(DelegatableNodeKt.requireLayoutNode(node), false));
            }
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            boolean z = false;
            if (semanticsConfiguration != null && semanticsConfiguration.isClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m7750getZeronOccac();
    private Shape lastShape = RectangleShapeKt.getRectangleShape();
    private final iy invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo6563childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z);

        /* renamed from: entityType-OLwlOKw */
        int mo6564entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode);

        default boolean shouldHitTest(Modifier.Node node) {
            return true;
        }

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m6535ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j, boolean z) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || q10.b(nodeCoordinator, nodeCoordinator2)) ? m6551fromParentPosition8S9VItk(j, z) : m6551fromParentPosition8S9VItk(nodeCoordinator2.m6535ancestorToLocalS_NoaFU(nodeCoordinator, j, z), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node m6554headH91voCI = m6554headH91voCI(NodeKind.m6573constructorimpl(4));
        if (m6554headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui().m6482draweZhPAX0$ui(canvas, IntSizeKt.m7794toSizeozmzZPI(mo6242getSizeYbymL2g()), this, m6554headH91voCI, graphicsLayer);
        }
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m6536fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
            return 0L;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m6551fromParentPosition8S9VItk(j, z);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float m7739getXimpl = IntOffset.m7739getXimpl(mo6489getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m7739getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m7739getXimpl);
        float m7740getYimpl = IntOffset.m7740getYimpl(mo6489getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m7740getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m7740getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, (int) (mo6242getSizeYbymL2g() >> 32), (int) (mo6242getSizeYbymL2g() & 4294967295L));
                mutableRect.isEmpty();
            }
        }
    }

    private final my getDrawBlock() {
        my myVar = this._drawBlock;
        if (myVar != null) {
            return myVar;
        }
        NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this));
        this._drawBlock = nodeCoordinator$drawBlock$1;
        return nodeCoordinator$drawBlock$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m6537hasNodeH91voCI(int i) {
        Modifier.Node headNode = headNode(NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(i));
        return headNode != null && DelegatableNodeKt.m6412has64DMado(headNode, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui() == this) {
            return getLayoutNode().getNodes$ui().getHead$ui();
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (!z) {
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m6538hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        long DistanceAndFlags;
        Modifier.Node m6571nextUntilhw7D004;
        Modifier.Node m6571nextUntilhw7D0042;
        if (node == null) {
            mo6460hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m6571nextUntilhw7D0042 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
            m6538hit5ShdDok(m6571nextUntilhw7D0042, hitTestSource, j, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.g(node);
        qa0 qa0Var = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z, false);
        qa0Var.a(DistanceAndFlags);
        m6571nextUntilhw7D004 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
        m6538hit5ShdDok(m6571nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z);
        hitTestResult.hitDepth = i2;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m6539hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        long DistanceAndFlags;
        Modifier.Node m6571nextUntilhw7D004;
        Modifier.Node m6571nextUntilhw7D0042;
        if (node == null) {
            mo6460hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m6571nextUntilhw7D0042 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
            m6539hitNearFh5PU_I(m6571nextUntilhw7D0042, hitTestSource, j, hitTestResult, i, z, f);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.g(node);
        qa0 qa0Var = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
        qa0Var.a(DistanceAndFlags);
        m6571nextUntilhw7D004 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
        m6542outOfBoundsHit8NAm7pk(m6571nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, true);
        hitTestResult.hitDepth = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m6540isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j, int i) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.Companion;
        if (!PointerType.m6174equalsimpl0(i, companion.m6180getStylusT8wyACA()) && !PointerType.m6174equalsimpl0(i, companion.m6178getEraserT8wyACA())) {
            return false;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long mo1225getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1225getTouchBoundsExpansionRZrCHBk();
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) >= (-TouchBoundsExpansion.m6659computeLeftimpl$ui(mo1225getTouchBoundsExpansionRZrCHBk, getLayoutDirection()))) {
                    if (Float.intBitsToFloat(i2) < TouchBoundsExpansion.m6660computeRightimpl$ui(mo1225getTouchBoundsExpansionRZrCHBk, getLayoutDirection()) + getMeasuredWidth()) {
                        int i3 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i3) >= (-TouchBoundsExpansion.m6667getTopimpl(mo1225getTouchBoundsExpansionRZrCHBk))) {
                            if (Float.intBitsToFloat(i3) < TouchBoundsExpansion.m6664getBottomimpl(mo1225getTouchBoundsExpansionRZrCHBk) + getMeasuredHeight()) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = node.getDelegate$ui();
                int i4 = 0;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i4++;
                        if (i4 == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    node = node;
                }
                if (i4 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m6541offsetFromEdgeMKHz9U(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat < 0.0f ? -intBitsToFloat : intBitsToFloat - getMeasuredWidth());
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m6542outOfBoundsHit8NAm7pk(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f, boolean z2) {
        Modifier.Node m6571nextUntilhw7D004;
        if (node == null) {
            mo6460hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m6571nextUntilhw7D004 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
            m6542outOfBoundsHit8NAm7pk(m6571nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, z2);
        } else if (m6540isInExpandedTouchBoundsThDn1k(node, j, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new NodeCoordinator$outOfBoundsHit$1(this, node, hitTestSource, j, hitTestResult, i, z, f, z2));
        } else if (z2) {
            m6539hitNearFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        } else {
            m6544speculativeHitFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        }
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m6543placeSelfMLgxB_4(long j, float f, ky kyVar, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (!(kyVar == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer createLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, graphicsLayer);
                createLayer.mo6635resizeozmzZPI(m6298getMeasuredSizeYbymL2g());
                createLayer.mo6634movegyyYBs(j);
                this.layer = createLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, kyVar, false, 2, null);
        }
        if (!IntOffset.m7738equalsimpl0(mo6489getPositionnOccac(), j)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.Companion.m4187getHighNSsRyOo());
            m6559setPositiongyyYBs(j);
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo6634movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorRectChanged$ui(this);
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui = getLayoutNode().getOwner$ui();
            if (owner$ui != null) {
                owner$ui.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f;
        if (this == getLayoutNode().getOuterCoordinator$ui()) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().recalculateRectIfDirty(getLayoutNode());
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    public static /* synthetic */ void rectInParent$ui$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: rectInParent");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui(mutableRect, z, z2);
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m6544speculativeHitFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        Modifier.Node m6571nextUntilhw7D004;
        Modifier.Node m6571nextUntilhw7D0042;
        if (node == null) {
            mo6460hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m6571nextUntilhw7D0042 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
            m6544speculativeHitFh5PU_I(m6571nextUntilhw7D0042, hitTestSource, j, hitTestResult, i, z, f);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j, hitTestResult, i, z, f));
        } else {
            m6571nextUntilhw7D004 = NodeCoordinatorKt.m6571nextUntilhw7D004(node, hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
            m6542outOfBoundsHit8NAm7pk(m6571nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        layoutCoordinates.getClass();
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m6545toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
            return 0L;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m6560toParentPosition8S9VItk(j, z);
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m6546transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (q10.b(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        nodeCoordinator2.getClass();
        nodeCoordinator2.m6546transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m7738equalsimpl0(mo6489getPositionnOccac(), IntOffset.Companion.m7750getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m5014resetimpl(fArr2);
            Matrix.m5027translateimpl$default(fArr2, -IntOffset.m7739getXimpl(mo6489getPositionnOccac()), -IntOffset.m7740getYimpl(mo6489getPositionnOccac()), 0.0f, 4, null);
            Matrix.m5024timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo6631inverseTransform58bKbWc(fArr);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m6547transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        while (!this.equals(nodeCoordinator)) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo6636transform58bKbWc(fArr);
            }
            if (!IntOffset.m7738equalsimpl0(this.mo6489getPositionnOccac(), IntOffset.Companion.m7750getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m5014resetimpl(fArr2);
                Matrix.m5027translateimpl$default(fArr2, IntOffset.m7739getXimpl(r0), IntOffset.m7740getYimpl(r0), 0.0f, 4, null);
                Matrix.m5024timesAssign58bKbWc(fArr, fArr2);
            }
            this = this.wrappedBy;
            this.getClass();
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, ky kyVar, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: updateLayerBlock");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(kyVar, z);
    }

    private final void updateLayerParameters(boolean z) {
        Owner owner$ui;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        ky kyVar = this.layerBlock;
        if (ownedLayer == null) {
            if (kyVar == null) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            return;
        }
        if (kyVar == null) {
            throw k4.a("updateLayerParameters requires a non-null layerBlock");
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m5089setSizeuvyYCjk(IntSizeKt.m7794toSizeozmzZPI(mo6242getSizeYbymL2g()));
        getSnapshotObserver().observer.observeReads(this, onCommitAffectingLayerParams, new NodeCoordinator$updateLayerParameters$1(kyVar, this));
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z2 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean hasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        if (z && ((!hasSameValuesAs || z2 != this.isClipping) && (owner$ui = getLayoutNode().getOwner$ui()) != null)) {
            owner$ui.onLayoutChange(getLayoutNode());
        }
        if (hasSameValuesAs) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        layoutNode.onCoordinatorRectChanged$ui(this);
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            LayoutNodeKt.requireOwner(layoutNode).requestOnPositionedCallback(layoutNode);
        }
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: updateLayerParameters");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    /* renamed from: calculateMinimumTouchTargetOffset-C6jSQ5I, reason: not valid java name */
    public final long m6548calculateMinimumTouchTargetOffsetC6jSQ5I(MutableRect mutableRect, long j) {
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        if (mutableRect.getRight() < 0.0f || left > ((int) (mo6242getSizeYbymL2g() >> 32)) || mutableRect.getBottom() < 0.0f || top > ((int) (mo6242getSizeYbymL2g() & 4294967295L))) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float right = (intBitsToFloat - (mutableRect.getRight() - mutableRect.getLeft())) / 2.0f;
        if (right > 0.0f) {
            left -= right;
        } else {
            float f = (-intBitsToFloat) / 2.0f;
            if (left < f) {
                left = f;
            }
        }
        float bottom = (intBitsToFloat2 - (mutableRect.getBottom() - mutableRect.getTop())) / 2.0f;
        if (bottom > 0.0f) {
            top -= bottom;
        } else {
            float f2 = (-intBitsToFloat2) / 2.0f;
            if (top < f2) {
                top = f2;
            }
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m6549calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - getMeasuredWidth();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - getMeasuredHeight();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return Size.m4576constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m6550distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j2 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m6549calculateMinimumTouchTargetPaddingE7KxVPU = m6549calculateMinimumTouchTargetPaddingE7KxVPU(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (m6549calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m6549calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long m6541offsetFromEdgeMKHz9U = m6541offsetFromEdgeMKHz9U(j);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (m6541offsetFromEdgeMKHz9U >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (m6541offsetFromEdgeMKHz9U & 4294967295L)) <= intBitsToFloat2) {
            return Offset.m4515getDistanceSquaredimpl(m6541offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float m7739getXimpl = IntOffset.m7739getXimpl(mo6489getPositionnOccac());
        float m7740getYimpl = IntOffset.m7740getYimpl(mo6489getPositionnOccac());
        canvas.translate(m7739getXimpl, m7740getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-m7739getXimpl, -m7740getYimpl);
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (m6298getMeasuredSizeYbymL2g() >> 32)) - 0.5f, ((int) (m6298getMeasuredSizeYbymL2g() & 4294967295L)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final NodeCoordinator findCommonAncestor$ui(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int m6573constructorimpl = NodeKind.m6573constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui = tail2.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0 && parent$ui == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui() > layoutNode2.getDepth$ui()) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode.getClass();
        }
        while (layoutNode2.getDepth$ui() > layoutNode.getDepth$ui()) {
            layoutNode2 = layoutNode2.getParent$ui();
            layoutNode2.getClass();
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode2 = layoutNode2.getParent$ui();
            if (layoutNode == null || layoutNode2 == null) {
                o.m("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != nodeCoordinator.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui();
            }
            return nodeCoordinator;
        }
        return this;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m6551fromParentPosition8S9VItk(long j, boolean z) {
        if (z || !isPlacedUnderMotionFrameOfReference()) {
            j = IntOffsetKt.m7752minusNvtHpc(j, mo6489getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo6633mapOffset8S9VItk(j, true) : j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui().getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastClip$ui() {
        return this.lastClip;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m6552getLastMeasurementConstraintsmsEJaDk$ui() {
        return m6299getMeasurementConstraintsmsEJaDk();
    }

    public final Shape getLastShape$ui() {
        return this.lastShape;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final ky getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        o.f(UnmeasuredError);
        return null;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m6553getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo368toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo6474getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(64))) {
            return null;
        }
        getTail();
        Object obj = null;
        for (Modifier.Node tail$ui = getLayoutNode().getNodes$ui().getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if ((NodeKind.m6573constructorimpl(64) & tail$ui.getKindSet$ui()) != 0) {
                int m6573constructorimpl = NodeKind.m6573constructorimpl(64);
                DelegatingNode delegatingNode = tail$ui;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        obj = ((ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), obj);
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
        }
        return obj;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            StringBuilder sb = new StringBuilder(ExpectAttachedLayoutCoordinates);
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.getParent$ui()) {
                sb.append("\n|");
                sb.append(layoutNode);
                sb.append(" isAttached=");
                sb.append(layoutNode.isAttached());
                sb.append(" modifier=");
                sb.append(layoutNode.getModifier());
                sb.append(" tail=");
                sb.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        onCoordinatesUsed$ui();
        return getLayoutNode().getOuterCoordinator$ui().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo6489getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        gb0 gb0Var = null;
        while (this != null) {
            MeasureResult measureResult = this._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (gb0Var == null) {
                    gb0 gb0Var2 = sl0.a;
                    gb0Var = new gb0();
                }
                Set<AlignmentLine> keySet = alignmentLines.keySet();
                keySet.getClass();
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    gb0Var.l(it.next());
                }
            }
            this = this.wrapped;
        }
        return gb0Var != null ? new no0(gb0Var) : xt.d;
    }

    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo6242getSizeYbymL2g() {
        return m6298getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final boolean getWasLayerBlockInvoked$ui() {
        return this.wasLayerBlockInvoked;
    }

    public final NodeCoordinator getWrapped$ui() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m6554headH91voCI(int i) {
        boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m6582getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & i) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & i) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m6555hitTestqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        boolean z2;
        Modifier.Node m6554headH91voCI = m6554headH91voCI(hitTestSource.mo6564entityTypeOLwlOKw());
        boolean z3 = false;
        if (!m6562withinLayerBoundsk4lQ0M(j)) {
            if (PointerType.m6174equalsimpl0(i, PointerType.Companion.m6181getTouchT8wyACA())) {
                float m6550distanceInMinimumTouchTargettz77jQw = m6550distanceInMinimumTouchTargettz77jQw(j, m6553getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(m6550distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(m6550distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m6539hitNearFh5PU_I(m6554headH91voCI, hitTestSource, j, hitTestResult, i, false, m6550distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (m6554headH91voCI == null) {
            mo6460hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (m6556isPointerInBoundsk4lQ0M(j)) {
            m6538hit5ShdDok(m6554headH91voCI, hitTestSource, j, hitTestResult, i, z);
            return;
        }
        float m6550distanceInMinimumTouchTargettz77jQw2 = !PointerType.m6174equalsimpl0(i, PointerType.Companion.m6181getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m6550distanceInMinimumTouchTargettz77jQw(j, m6553getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(m6550distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z2 = z;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m6550distanceInMinimumTouchTargettz77jQw2, z2)) {
                z3 = true;
            }
        } else {
            z2 = z;
        }
        m6542outOfBoundsHit8NAm7pk(m6554headH91voCI, hitTestSource, j, hitTestResult, i, z2, m6550distanceInMinimumTouchTargettz77jQw2, z3);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo6460hitTestChildqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m6555hitTestqzLsGqo(hitTestSource, m6536fromParentPosition8S9VItk$default(nodeCoordinator, j, false, 2, null), hitTestResult, i, z);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m6556isPointerInBoundsk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < ((float) getMeasuredWidth()) && intBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (layoutCoordinates.mo6242getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (layoutCoordinates.mo6242getSizeYbymL2g() & 4294967295L));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != findCommonAncestor$ui) {
            boolean z2 = z;
            rectInParent$ui$default(nodeCoordinator, rectCache, z2, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            nodeCoordinator.getClass();
            z = z2;
        }
        ancestorToLocal(findCommonAncestor$ui, rectCache, z);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo6243localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo6244localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo6244localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui();
            return Offset.m4508constructorimpl(lookaheadLayoutCoordinates.mo6244localPositionOfS_NoaFU(this, Offset.m4508constructorimpl(j ^ (-9223372034707292160L)), z) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != findCommonAncestor$ui) {
            j = coordinator.m6560toParentPosition8S9VItk(j, z);
            coordinator = coordinator.wrappedBy;
            coordinator.getClass();
        }
        return m6535ancestorToLocalS_NoaFU(findCommonAncestor$ui, j, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo6245localToRootMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        long j2 = j;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long m6852getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNode).getRectManager().m6852getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m7738equalsimpl0(m6852getOffsetFromRectListForBjo55l4, IntOffset.Companion.m7749getMaxnOccac())) {
                    return IntOffsetKt.m7754plusNvtHpc(j2, m6852getOffsetFromRectListForBjo55l4);
                }
            }
            j2 = m6545toParentPosition8S9VItk$default(nodeCoordinator, j2, false, 2, null);
        }
        return j2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo6246localToScreenMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo6183localToScreenMKHz9U(mo6245localToRootMKHz9U(j));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo6247localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo6638calculatePositionInWindowMKHz9U(mo6245localToRootMKHz9U(j));
    }

    public final void onCoordinatesUsed$ui() {
        getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
        if (getLayoutNode().isPlaced()) {
            onUnplaced();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public void onMeasureResultChanged(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo6635resizeozmzZPI(IntSize.m7777constructorimpl((i << 32) | (i2 & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4);
        boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
        Modifier.Node tail = getTail();
        if (m6582getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
            for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
                if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                            int i3 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
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
                            if (i3 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui = getLayoutNode().getOwner$ui();
        if (owner$ui != null) {
            owner$ui.onLayoutChange(getLayoutNode());
        }
        getLayoutNode().onCoordinatorRectChanged$ui(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent$ui;
        if (m6537hasNodeH91voCI(NodeKind.m6573constructorimpl(Fields.SpotShadowColor))) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.SpotShadowColor);
                boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
                if (m6582getIncludeSelfInTraversalH91voCI) {
                    parent$ui = getTail();
                } else {
                    parent$ui = getTail().getParent$ui();
                    if (parent$ui == null) {
                    }
                }
                for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null; headNode = headNode.getChild$ui()) {
                    if ((headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                        break;
                    }
                    if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNode = headNode;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof MeasuredSizeAwareModifierNode) {
                                ((MeasuredSizeAwareModifierNode) delegatingNode).mo356onRemeasuredozmzZPI(m6298getMeasuredSizeYbymL2g());
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
                    if (headNode == parent$ui) {
                        break;
                    }
                }
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4194304);
        boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
        Modifier.Node tail = getTail();
        if (!m6582getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                DelegatingNode delegatingNode = headNode;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
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
            if (headNode == tail) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m7738equalsimpl0(mo6489getPositionnOccac(), IntOffset.Companion.m7750getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorRectChanged$ui(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void onUnplaced() {
        if (m6537hasNodeH91voCI(NodeKind.m6573constructorimpl(1048576))) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(1048576);
            boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
            Modifier.Node tail = getTail();
            if (!m6582getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
                return;
            }
            for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
                if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof UnplacedAwareModifierNode) {
                            ((UnplacedAwareModifierNode) delegatingNode).onUnplaced();
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
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m6557performingMeasureK40F9xA(long j, iy iyVar) {
        m6302setMeasurementConstraintsBRTryo0(j);
        return (Placeable) iyVar.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6300placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m6543placeSelfMLgxB_4(j, f, null, graphicsLayer);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        lookaheadDelegate.getClass();
        m6543placeSelfMLgxB_4(lookaheadDelegate.mo6489getPositionnOccac(), f, null, graphicsLayer);
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m6558placeSelfApparentToRealOffsetMLgxB_4(long j, float f, ky kyVar, GraphicsLayer graphicsLayer) {
        m6543placeSelfMLgxB_4(IntOffset.m7743plusqkQi6aY(j, m6297getApparentToRealOffsetnOccac()), f, kyVar, graphicsLayer);
    }

    public final void rectInParent$ui(MutableRect mutableRect, boolean z, boolean z2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long m6553getMinimumTouchTargetSizeNHjbRc = m6553getMinimumTouchTargetSizeNHjbRc();
                    long m6548calculateMinimumTouchTargetOffsetC6jSQ5I = m6548calculateMinimumTouchTargetOffsetC6jSQ5I(mutableRect, m6553getMinimumTouchTargetSizeNHjbRc);
                    float intBitsToFloat = Float.intBitsToFloat((int) (m6548calculateMinimumTouchTargetOffsetC6jSQ5I >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (m6548calculateMinimumTouchTargetOffsetC6jSQ5I & 4294967295L));
                    long mo6242getSizeYbymL2g = mo6242getSizeYbymL2g();
                    float f = (int) (mo6242getSizeYbymL2g >> 32);
                    int i = (int) (m6553getMinimumTouchTargetSizeNHjbRc >> 32);
                    float min = Math.min(Float.intBitsToFloat(i) + f, Math.max(f, Float.intBitsToFloat(i) + intBitsToFloat));
                    float f2 = (int) (mo6242getSizeYbymL2g & 4294967295L);
                    int i2 = (int) (m6553getMinimumTouchTargetSizeNHjbRc & 4294967295L);
                    mutableRect.intersect(intBitsToFloat, intBitsToFloat2, min, Math.min(Float.intBitsToFloat(i2) + f2, Math.max(f2, Float.intBitsToFloat(i2) + intBitsToFloat2)));
                } else if (z) {
                    mutableRect.intersect(0.0f, 0.0f, (int) (mo6242getSizeYbymL2g() >> 32), (int) (4294967295L & mo6242getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float m7739getXimpl = IntOffset.m7739getXimpl(mo6489getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + m7739getXimpl);
        mutableRect.setRight(mutableRect.getRight() + m7739getXimpl);
        float m7740getYimpl = IntOffset.m7740getYimpl(mo6489getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + m7740getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + m7740getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo6300placeAtf8xVGno(mo6489getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo6235placeAtf8xVGno(mo6489getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo6248screenToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo6243localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo6184screenToLocalMKHz9U(j));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    public final void setForcePlaceWithLookaheadOffset$ui(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    public final void setLastClip$ui(boolean z) {
        this.lastClip = z;
    }

    public final void setLastShape$ui(Shape shape) {
        this.lastShape = shape;
    }

    public abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui(MeasureResult measureResult) {
        boolean compareEquals;
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            ta0 ta0Var = this.oldAlignmentLines;
            if ((ta0Var == null || ta0Var.e == 0) && measureResult.getAlignmentLines().isEmpty()) {
                return;
            }
            compareEquals = NodeCoordinatorKt.compareEquals(this.oldAlignmentLines, measureResult.getAlignmentLines());
            if (compareEquals) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            ta0 ta0Var2 = this.oldAlignmentLines;
            if (ta0Var2 == null) {
                ta0 ta0Var3 = ad0.a;
                ta0Var2 = new ta0();
                this.oldAlignmentLines = ta0Var2;
            }
            ta0Var2.c();
            for (Map.Entry<AlignmentLine, Integer> entry : measureResult.getAlignmentLines().entrySet()) {
                ta0Var2.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m6559setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWasLayerBlockInvoked$ui(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    public final void setWrapped$ui(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(NodeKind.m6573constructorimpl(16)));
        if (headNode != null && headNode.isAttached()) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
            if (!headNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = headNode.getNode();
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                    return true;
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
                    node = node.getChild$ui();
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m6560toParentPosition8S9VItk(long j, boolean z) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j = ownedLayer.mo6633mapOffset8S9VItk(j, false);
        }
        return (z || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m7754plusNvtHpc(j, mo6489getPositionnOccac()) : j;
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m6549calculateMinimumTouchTargetPaddingE7KxVPU = m6549calculateMinimumTouchTargetPaddingE7KxVPU(m6553getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (m6549calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i2 = (int) (m6549calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i2));
        rectCache.setRight(Float.intBitsToFloat(i) + getMeasuredWidth());
        rectCache.setBottom(Float.intBitsToFloat(i2) + getMeasuredHeight());
        while (this != findRootCoordinates) {
            this.rectInParent$ui(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            this = this.wrappedBy;
            this.getClass();
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo6249transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m5014resetimpl(fArr);
        coordinator.m6547transformToAncestorEL8BTi8(findCommonAncestor$ui, fArr);
        m6546transformFromAncestorEL8BTi8(findCommonAncestor$ui, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo6250transformToScreen58bKbWc(float[] fArr) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m6547transformToAncestorEL8BTi8(coordinator, fArr);
        if (requireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) requireOwner).mo6007localToScreen58bKbWc(fArr);
            return;
        }
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & positionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m5026translateimpl(fArr, Float.intBitsToFloat((int) (positionOnScreen >> 32)), Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)), 0.0f);
        }
    }

    public final void updateLayerBlock(ky kyVar, boolean z) {
        Owner owner$ui;
        if (!(kyVar == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z2 = (!z && this.layerBlock == kyVar && q10.b(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && kyVar != null) {
            this.layerBlock = kyVar;
            if (this.layer != null) {
                if (z2) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer createLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
            createLayer$default.mo6635resizeozmzZPI(m6298getMeasuredSizeYbymL2g());
            createLayer$default.mo6634movegyyYBs(mo6489getPositionnOccac());
            this.layer = createLayer$default;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m5030isIdentity58bKbWc(ownedLayer.mo6630getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorRectChanged$ui(this);
            }
            ownedLayer.destroy();
            this.layer = null;
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner$ui = layoutNode.getOwner$ui()) != null) {
                owner$ui.onLayoutChange(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    public final void visitNodes(int i, boolean z, ky kyVar) {
        Modifier.Node tail = getTail();
        if (!z && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(z); headNode != null && (headNode.getAggregateChildKindSet$ui() & i) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & i) != 0) {
                kyVar.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final <T> void m6561visitNodesaLcG6gQ(int i, ky kyVar) {
        boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m6582getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & i) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & i) != 0) {
                q10.G();
                throw null;
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo6251windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo6243localPositionOfR5De75A(findRootCoordinates, Offset.m4520minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo6637calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    public final void withPositionTranslation(Canvas canvas, ky kyVar) {
        float m7739getXimpl = IntOffset.m7739getXimpl(mo6489getPositionnOccac());
        float m7740getYimpl = IntOffset.m7740getYimpl(mo6489getPositionnOccac());
        canvas.translate(m7739getXimpl, m7740getYimpl);
        kyVar.invoke(canvas);
        canvas.translate(-m7739getXimpl, -m7740getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m6562withinLayerBoundsk4lQ0M(long j) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo6632isInLayerk4lQ0M(j);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            m6543placeSelfMLgxB_4(lookaheadDelegate.mo6489getPositionnOccac(), f, kyVar, null);
            return;
        }
        m6543placeSelfMLgxB_4(j, f, kyVar, null);
    }
}
