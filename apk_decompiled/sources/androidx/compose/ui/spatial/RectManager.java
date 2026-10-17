package androidx.compose.ui.spatial;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dq;
import defpackage.g10;
import defpackage.h10;
import defpackage.iy;
import defpackage.ky;
import defpackage.p01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final xa0 callbacks;
    private final iy dispatchLambda;
    private Object dispatchToken;
    private final ExecuteDelayed executeDelayed;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final g10 layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    public RectManager(g10 g10Var, ExecuteDelayed executeDelayed) {
        this.layoutNodes = g10Var;
        this.executeDelayed = executeDelayed;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new xa0();
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new RectManager$dispatchLambda$1(this);
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long m6852getOffsetFromRectListForBjo55l4 = m6852getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m7738equalsimpl0(m6852getOffsetFromRectListForBjo55l4, IntOffset.Companion.m7749getMaxnOccac())) {
                    float m7739getXimpl = IntOffset.m7739getXimpl(m6852getOffsetFromRectListForBjo55l4);
                    float m7740getYimpl = IntOffset.m7740getYimpl(m6852getOffsetFromRectListForBjo55l4);
                    mutableRect.m4501translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(m7740getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m7739getXimpl) << 32)));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] mo6630getUnderlyingMatrixsQKQjiQ = layer.mo6630getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m5030isIdentity58bKbWc(mo6630getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m5013mapimpl(mo6630getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long mo6489getPositionnOccac = nodeCoordinator.mo6489getPositionnOccac();
            float m7739getXimpl2 = IntOffset.m7739getXimpl(mo6489getPositionnOccac);
            float m7740getYimpl2 = IntOffset.m7740getYimpl(mo6489getPositionnOccac);
            mutableRect.m4501translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(m7740getYimpl2) & 4294967295L) | (Float.floatToRawIntBits(m7739getXimpl2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui();
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m5030isIdentity58bKbWc(layer.mo6630getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList$ui = layoutNode.getAddedToRectList$ui();
        layoutNode.setAddedToRectList$ui(true);
        if (!addedToRectList$ui || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui != null ? parent$ui.getSemanticsId() : -1, layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationZ)), layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(16)), this.throttledCallbacks.getRectChangedMap().a(semanticsId), 0, Fields.RotationY, null);
        }
        layoutNode.setRectInParentDirty$ui(false);
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m6851outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long m7750getZeronOccac = IntOffset.Companion.m7750getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy$ui()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.Companion.m7749getMaxnOccac();
            }
            m7750getZeronOccac = IntOffset.m7743plusqkQi6aY(m7750getZeronOccac, innerCoordinator$ui.mo6489getPositionnOccac());
        }
        return m7750getZeronOccac;
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty$ui()) {
            layoutNode.m6473setOuterToInnerOffsetgyyYBs$ui(m6851outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m7738equalsimpl0(layoutNode.m6468getOuterToInnerOffsetnOccac$ui(), IntOffset.Companion.m7749getMaxnOccac())) {
            return;
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNodeArr[i]);
        }
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long currentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            xa0 xa0Var = this.callbacks;
            Object[] objArr = xa0Var.a;
            int i = xa0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((iy) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(33554431 & ((int) j), jArr[i4], jArr[i4 + 1], currentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(currentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(currentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(currentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    public final FocusTargetModifierNode findFocusableNodeFromRect$ui(int i, int i2, int i3, int i4, int i5) {
        int i6;
        LayoutNode layoutNode;
        char c;
        Modifier.Node node;
        int i7;
        LayoutNode layoutNode2;
        boolean z;
        int i8;
        LayoutNode layoutNode3;
        int i9;
        MutableVector mutableVector;
        SemanticsInfo requireSemanticsInfo;
        RectManager rectManager = this;
        LayoutNode layoutNode4 = (LayoutNode) rectManager.layoutNodes.b(i5);
        if (layoutNode4 == null) {
            return null;
        }
        FocusTargetNode activeFocusTargetNode = LayoutNodeKt.requireOwner(layoutNode4).getFocusOwner().getActiveFocusTargetNode();
        int semanticsId = (activeFocusTargetNode == null || (requireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(activeFocusTargetNode)) == null) ? -1 : requireSemanticsInfo.getSemanticsId();
        RectList rectList = rectManager.rects;
        int i10 = i2;
        long j = (i10 & 4294967295L) | (i << 32);
        long j2 = (i4 & 4294967295L) | (i3 << 32);
        long[] jArr = rectList.items;
        int i11 = rectList.itemsSize;
        int i12 = Integer.MAX_VALUE;
        FocusTargetNode focusTargetNode = null;
        int i13 = 0;
        while (i13 < jArr.length - 2 && i13 < i11) {
            int i14 = i13;
            long j3 = jArr[i13 + 2];
            boolean z2 = true;
            if ((((int) (j3 >> 61)) & 1) != 0) {
                if (((((j2 - jArr[i14]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i14 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    int i15 = ((int) j3) & 33554431;
                    LayoutNode layoutNode5 = (LayoutNode) rectManager.layoutNodes.b(i15);
                    if (layoutNode5 != null) {
                        if (semanticsId == i15) {
                            c = 65535;
                            if (semanticsId != -1) {
                                return null;
                            }
                        } else {
                            c = 65535;
                        }
                        if (layoutNode5.getDepth$ui() >= i12 || !rectManager.isDescendantOf$ui(layoutNode5, layoutNode4)) {
                            i6 = i12;
                            layoutNode = layoutNode4;
                        } else {
                            NodeChain nodes$ui = layoutNode5.getNodes$ui();
                            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
                            if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
                                Modifier.Node head$ui = nodes$ui.getHead$ui();
                                while (head$ui != null) {
                                    if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        MutableVector mutableVector2 = null;
                                        node = head$ui;
                                        while (node != null) {
                                            if (node instanceof FocusTargetNode) {
                                                i6 = i12;
                                                layoutNode = layoutNode4;
                                                break;
                                            }
                                            if ((node.getKindSet$ui() & m6573constructorimpl) == 0 || !(node instanceof DelegatingNode)) {
                                                i7 = i12;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                            } else {
                                                Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                                                int i16 = 0;
                                                while (delegate$ui != null) {
                                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                                        i16++;
                                                        i8 = i12;
                                                        if (i16 == 1) {
                                                            node = delegate$ui;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                i9 = i16;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                i9 = i16;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = mutableVector2;
                                                            }
                                                            if (node != null) {
                                                                mutableVector.add(node);
                                                                node = null;
                                                            }
                                                            mutableVector.add(delegate$ui);
                                                            mutableVector2 = mutableVector;
                                                            i16 = i9;
                                                            delegate$ui = delegate$ui.getChild$ui();
                                                            i12 = i8;
                                                            layoutNode4 = layoutNode3;
                                                        }
                                                    } else {
                                                        i8 = i12;
                                                    }
                                                    layoutNode3 = layoutNode4;
                                                    delegate$ui = delegate$ui.getChild$ui();
                                                    i12 = i8;
                                                    layoutNode4 = layoutNode3;
                                                }
                                                i7 = i12;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                                if (i16 == 1) {
                                                    z2 = z;
                                                    i12 = i7;
                                                    layoutNode4 = layoutNode2;
                                                }
                                            }
                                            node = DelegatableNodeKt.pop(mutableVector2);
                                            z2 = z;
                                            i12 = i7;
                                            layoutNode4 = layoutNode2;
                                        }
                                    }
                                    i6 = i12;
                                    boolean z3 = z2;
                                    layoutNode = layoutNode4;
                                    if ((head$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                                        break;
                                    }
                                    head$ui = head$ui.getChild$ui();
                                    z2 = z3;
                                    i12 = i6;
                                    layoutNode4 = layoutNode;
                                }
                            }
                            i6 = i12;
                            layoutNode = layoutNode4;
                            node = null;
                            FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                            if (focusTargetNode2 != null) {
                                if (intersects$ui(focusTargetNode2, i, i10, i3, i4)) {
                                    focusTargetNode = focusTargetNode2;
                                    i12 = layoutNode5.getDepth$ui();
                                    i13 = i14 + 3;
                                    rectManager = this;
                                    i10 = i2;
                                    layoutNode4 = layoutNode;
                                }
                            }
                        }
                        i12 = i6;
                        i13 = i14 + 3;
                        rectManager = this;
                        i10 = i2;
                        layoutNode4 = layoutNode;
                    } else {
                        i6 = i12;
                        layoutNode = layoutNode4;
                    }
                    i12 = i6;
                    i13 = i14 + 3;
                    rectManager = this;
                    i10 = i2;
                    layoutNode4 = layoutNode;
                }
            }
            i6 = i12;
            layoutNode = layoutNode4;
            i12 = i6;
            i13 = i14 + 3;
            rectManager = this;
            i10 = i2;
            layoutNode4 = layoutNode;
        }
        return focusTargetNode;
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m6852getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        long topLeft = this.rects.getTopLeft(layoutNode.getSemanticsId());
        if (topLeft == SnapshotId_jvmKt.SnapshotIdMax) {
            return IntOffset.Companion.m7749getMaxnOccac();
        }
        return IntOffset.m7733constructorimpl((((int) topLeft) & 4294967295L) | (((int) (topLeft >> 32)) << 32));
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final ThrottledCallbacks getThrottledCallbacks$ui() {
        return this.throttledCallbacks;
    }

    public final boolean intersects$ui(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        NodeCoordinator m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(delegatableNode, NodeKind.m6573constructorimpl(Fields.RotationZ));
        LayoutNode layoutNode = m6414requireCoordinator64DMado.getLayoutNode();
        if (m6414requireCoordinator64DMado.equals(layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long mo6245localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo6245localToRootMKHz9U(LayoutCoordinates.m6241localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), m6414requireCoordinator64DMado, 0L, false, 6, null));
        long mo6242getSizeYbymL2g = m6414requireCoordinator64DMado.mo6242getSizeYbymL2g();
        int round = Math.round(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U >> 32)));
        int i5 = ((int) (mo6242getSizeYbymL2g >> 32)) + round;
        int round2 = Math.round(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U & 4294967295L)));
        return i < i5 && i3 > round && i2 < ((int) (mo6242getSizeYbymL2g & 4294967295L)) + round2 && i4 > round2;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList$ui()) {
            this.isDirty = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final boolean isDescendantOf$ui(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int depth$ui = layoutNode.getDepth$ui() - layoutNode2.getDepth$ui();
        if (depth$ui <= 0) {
            return false;
        }
        for (int i = 0; i < depth$ui; i++) {
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        }
        return layoutNode == layoutNode2;
    }

    public final boolean isTargetDrawnFirst$ui(int i, int i2) {
        LayoutNode layoutNode;
        LayoutNode parent$ui;
        LayoutNode layoutNode2 = (LayoutNode) this.layoutNodes.b(i);
        if (layoutNode2 != null && (layoutNode = (LayoutNode) this.layoutNodes.b(i2)) != null && layoutNode2.getDepth$ui() != 0 && layoutNode.getDepth$ui() != 0) {
            while (layoutNode2.getDepth$ui() > layoutNode.getDepth$ui()) {
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode2 == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            while (layoutNode.getDepth$ui() > layoutNode2.getDepth$ui()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            LayoutNode layoutNode3 = layoutNode2;
            LayoutNode layoutNode4 = layoutNode3;
            LayoutNode layoutNode5 = layoutNode;
            while (layoutNode3 != layoutNode) {
                LayoutNode parent$ui2 = layoutNode3.getParent$ui();
                if (parent$ui2 == null || (parent$ui = layoutNode.getParent$ui()) == null) {
                    return false;
                }
                layoutNode5 = layoutNode;
                layoutNode = parent$ui;
                layoutNode4 = layoutNode3;
                layoutNode3 = parent$ui2;
            }
            if (layoutNode4.getMeasurePassDelegate$ui().getZIndex$ui() == layoutNode5.getMeasurePassDelegate$ui().getZIndex$ui()) {
                return layoutNode4.getPlaceOrder$ui() < layoutNode5.getPlaceOrder$ui();
            }
            if (layoutNode4.getMeasurePassDelegate$ui().getZIndex$ui() < layoutNode5.getMeasurePassDelegate$ui().getZIndex$ui()) {
                return true;
            }
        }
        return false;
    }

    public final void recalculateRectIfDirty(LayoutNode layoutNode) {
        long m7750getZeronOccac;
        boolean m6858isSetgyyYBs;
        if (layoutNode.isPlaced() && layoutNode.getRectInParentDirty$ui()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui == null || parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                m7750getZeronOccac = parent$ui == null ? IntOffset.Companion.m7750getZeronOccac() : IntOffset.Companion.m7749getMaxnOccac();
            } else {
                if (parent$ui.getOuterToInnerOffsetDirty$ui()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m6473setOuterToInnerOffsetgyyYBs$ui(m6851outerToInnerOffsetBjo55l4(parent$ui));
                }
                m7750getZeronOccac = parent$ui.m6468getOuterToInnerOffsetnOccac$ui();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            m6858isSetgyyYBs = RectManagerKt.m6858isSetgyyYBs(m7750getZeronOccac);
            if (!m6858isSetgyyYBs || hasPositionalLayerTransformations(outerCoordinator$ui)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
            } else if (layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
            } else {
                long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(m7750getZeronOccac, outerCoordinator$ui.mo6489getPositionnOccac());
                MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                int semanticsId = layoutNode.getSemanticsId();
                if (layoutNode.getAddedToRectList$ui()) {
                    RectList rectList = this.rects;
                    if (parent$ui != null) {
                        rectList.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m7739getXimpl(m7743plusqkQi6aY), IntOffset.m7740getYimpl(m7743plusqkQi6aY), measuredWidth, measuredHeight);
                    } else {
                        rectList.move(semanticsId, IntOffset.m7739getXimpl(m7743plusqkQi6aY), IntOffset.m7740getYimpl(m7743plusqkQi6aY), IntOffset.m7739getXimpl(m7743plusqkQi6aY) + measuredWidth, IntOffset.m7740getYimpl(m7743plusqkQi6aY) + measuredHeight);
                    }
                } else {
                    layoutNode.setAddedToRectList$ui(true);
                    boolean m6528hasH91voCI$ui = layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationZ));
                    boolean m6528hasH91voCI$ui2 = layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(16));
                    boolean a = this.throttledCallbacks.getRectChangedMap().a(semanticsId);
                    RectList rectList2 = this.rects;
                    if (parent$ui != null) {
                        rectList2.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m7739getXimpl(m7743plusqkQi6aY), IntOffset.m7740getYimpl(m7743plusqkQi6aY), measuredWidth, measuredHeight, m6528hasH91voCI$ui, m6528hasH91voCI$ui2, a);
                    } else {
                        RectList.insert$default(rectList2, semanticsId, IntOffset.m7739getXimpl(m7743plusqkQi6aY), IntOffset.m7740getYimpl(m7743plusqkQi6aY), IntOffset.m7739getXimpl(m7743plusqkQi6aY) + measuredWidth, IntOffset.m7740getYimpl(m7743plusqkQi6aY) + measuredHeight, 0, m6528hasH91voCI$ui, m6528hasH91voCI$ui2, a, 0, 544, null);
                    }
                }
            }
            layoutNode.setRectInParentDirty$ui(false);
            invalidate();
            scheduleDebounceCallback(true);
        }
    }

    public final Object registerOnChangedCallback(iy iyVar) {
        this.callbacks.g(iyVar);
        return iyVar;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i, long j, long j2, DelegatableNode delegatableNode, ky kyVar) {
        return this.throttledCallbacks.registerOnGlobalChange(i, j, j2, delegatableNode, kyVar);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i, long j, long j2, DelegatableNode delegatableNode, ky kyVar) {
        DelegatableNode.RegistrationHandle registerOnRectChanged = this.throttledCallbacks.registerOnRectChanged(i, j, j2, delegatableNode, kyVar);
        if (DelegatableNodeKt.requireLayoutNode(delegatableNode.getNode()).getAddedToRectList$ui()) {
            this.rects.updateHasCallbacks(i, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registerOnRectChanged;
    }

    public final void remove(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList$ui()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            layoutNode.setRectInParentDirty$ui(true);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final void removeScheduledCallback() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.removeDelayedExecution(obj);
            this.dispatchToken = null;
        }
    }

    public final void resetOffsets() {
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        IntOffset.Companion companion = IntOffset.Companion;
        this.isScreenOrWindowDirty = throttledCallbacks.m6871updateOffsetsLDcG7Xg(companion.m7750getZeronOccac(), companion.m7750getZeronOccac(), null, 0, 0);
    }

    public final void scheduleDebounceCallback(boolean z) {
        boolean z2 = (z && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z2) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z2) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                this.executeDelayed.removeDelayedExecution(obj);
            }
            long currentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
            long max = Math.max(minDebounceDeadline, 16 + currentTimeMillis);
            this.scheduledDispatchDeadline = max;
            this.dispatchToken = this.executeDelayed.executeDelayed(max - currentTimeMillis, this.dispatchLambda);
        }
    }

    public final void unregisterOnChangedCallback(Object obj) {
        if ((p01.r(0, obj) ? (iy) obj : null) == null) {
            return;
        }
        this.callbacks.k(obj);
    }

    public final void unsetHasCallbacksFor(LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public final void updateFlagsFor(LayoutNode layoutNode, boolean z, boolean z2) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), z, z2);
        }
    }

    /* renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m6853updateOffsetsgTq6Wqs(long j, long j2, float[] fArr, int i, int i2) {
        int m6857analyzeComponents58bKbWc;
        m6857analyzeComponents58bKbWc = RectManagerKt.m6857analyzeComponents58bKbWc(fArr);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((m6857analyzeComponents58bKbWc & 2) != 0) {
            fArr = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m6871updateOffsetsLDcG7Xg(j, j2, fArr, i, i2) || this.isScreenOrWindowDirty;
    }

    public static /* synthetic */ void getThrottledCallbacks$ui$annotations() {
    }

    public RectManager() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RectManager(g10 g10Var, ExecuteDelayed executeDelayed, int i, dq dqVar) {
        this(g10Var, (i & 2) != 0 ? ExecuteDelayUsingPostAndRemove.INSTANCE : executeDelayed);
        if ((i & 1) != 0) {
            g10Var = h10.a;
            g10Var.getClass();
        }
    }
}
