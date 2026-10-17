package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().h(intValue, alignmentLine);
            return intValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo6234measureBRTryo0(long j) {
            m6302setMeasurementConstraintsBRTryo0(j);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                lookaheadPassDelegate$ui.setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo5measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui(), j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.onNodePlaced$ui();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4637setColor8_81llA(Color.Companion.m4795getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo4641setStylek9PVt8s(PaintingStyle.Companion.m5043getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui() != null ? new LookaheadDelegateImpl() : null;
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui().onNodePlaced$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    public void mo6460hitTestChildqzLsGqo(NodeCoordinator.HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeCoordinator.HitTestSource hitTestSource2;
        boolean z2 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (!m6562withinLayerBoundsk4lQ0M(j)) {
                if (PointerType.m6174equalsimpl0(i, PointerType.Companion.m6181getTouchT8wyACA()) && (Float.floatToRawIntBits(m6550distanceInMinimumTouchTargettz77jQw(j, m6553getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) < 2139095040) {
                    z = false;
                }
            }
            z2 = true;
        }
        if (z2) {
            int i2 = hitTestResult.hitDepth;
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            LayoutNode[] layoutNodeArr = zSortedChildren.content;
            int size = zSortedChildren.getSize() - 1;
            while (size >= 0) {
                LayoutNode layoutNode = layoutNodeArr[size];
                if (layoutNode.isPlaced()) {
                    hitTestSource2 = hitTestSource;
                    hitTestSource2.mo6563childHitTestqzLsGqo(layoutNode, j, hitTestResult, i, z);
                    boolean hasHit = hitTestResult.hasHit();
                    if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                        if (hasHit && !hitTestSource2.shareWithSiblings(hitTestResult, layoutNode)) {
                            break;
                        }
                    } else if (!hasHit) {
                        continue;
                    } else if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                        break;
                    } else {
                        hitTestResult.acceptHits();
                    }
                } else {
                    hitTestSource2 = hitTestSource;
                }
                size--;
                hitTestSource = hitTestSource2;
            }
            hitTestResult.hitDepth = i2;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo6234measureBRTryo0(long j) {
        if (getForceMeasureWithLookaheadConstraints$ui()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            j = lookaheadDelegate.m6497getConstraintsmsEJaDk$ui();
        }
        m6302setMeasurementConstraintsBRTryo0(j);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].getMeasurePassDelegate$ui().setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui(getLayoutNode().getMeasurePolicy().mo5measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui(), j));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return getLayoutNode().minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return getLayoutNode().minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui(canvas, graphicsLayer);
            }
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6300placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        super.mo6300placeAtf8xVGno(j, f, graphicsLayer);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        super.mo6235placeAtf8xVGno(j, f, kyVar);
        onAfterPlaceAt();
    }
}
