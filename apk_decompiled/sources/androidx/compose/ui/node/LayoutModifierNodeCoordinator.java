package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int calculateAlignmentAndPlaceChildAsNeeded;
            calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().h(calculateAlignmentAndPlaceChildAsNeeded, alignmentLine);
            return calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo6234measureBRTryo0(long j) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            m6302setMeasurementConstraintsBRTryo0(j);
            layoutModifierNodeCoordinator.m6463setLookaheadConstraints_Sx5XlM$ui(Constraints.m7551boximpl(j));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            set_measureResult(layoutModifierNode.mo33measure3p2s80s(this, lookaheadDelegate, j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4637setColor8_81llA(Color.Companion.m4788getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo4641setStylek9PVt8s(PaintingStyle.Companion.m5043getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        this.approachMeasureScope = (layoutModifierNode.getNode().getKindSet$ui() & NodeKind.m6573constructorimpl(Fields.RotationY)) != 0 ? new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode) : null;
    }

    private final void onAfterPlaceAt() {
        boolean z;
        if (isShallowPlacing$ui()) {
            return;
        }
        onPlaced();
        NodeCoordinator wrappedNonNull = getWrappedNonNull();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            Placeable.PlacementScope placementScope = getPlacementScope();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (!approachNode.isPlacementApproachInProgress(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) && !approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                long mo6242getSizeYbymL2g = mo6242getSizeYbymL2g();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                if (IntSize.m7779equalsimpl(mo6242getSizeYbymL2g, lookaheadDelegate2 != null ? IntSize.m7774boximpl(lookaheadDelegate2.m6498getSizeYbymL2g$ui()) : null)) {
                    long mo6242getSizeYbymL2g2 = wrappedNonNull.mo6242getSizeYbymL2g();
                    LookaheadDelegate lookaheadDelegate3 = wrappedNonNull.getLookaheadDelegate();
                    if (IntSize.m7779equalsimpl(mo6242getSizeYbymL2g2, lookaheadDelegate3 != null ? IntSize.m7774boximpl(lookaheadDelegate3.m6498getSizeYbymL2g$ui()) : null)) {
                        z = true;
                        wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(z);
                    }
                }
            }
            z = false;
            wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(z);
        }
        wrappedNonNull.setPlacingForAlignment$ui(isPlacingForAlignment$ui());
        getMeasureResult$ui().placeChildren();
        wrappedNonNull.setPlacingForAlignment$ui(false);
        wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(false);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        int calculateAlignmentAndPlaceChildAsNeeded;
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.getCachedAlignmentLine$ui(alignmentLine);
        }
        calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
        return calculateAlignmentAndPlaceChildAsNeeded;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* renamed from: getLookaheadConstraints-DWUhwKw$ui, reason: not valid java name */
    public final Constraints m6462getLookaheadConstraintsDWUhwKw$ui() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui = getWrapped$ui();
        wrapped$ui.getClass();
        return wrapped$ui;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r8 == r2.getHeight()) goto L27;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Placeable mo6234measureBRTryo0(long j) {
        final MeasureResult mo33measure3p2s80s;
        if (getForceMeasureWithLookaheadConstraints$ui()) {
            Constraints constraints = this.lookaheadConstraints;
            if (constraints == null) {
                o.m("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = constraints.m7570unboximpl();
        }
        m6302setMeasurementConstraintsBRTryo0(j);
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            boolean z = true;
            approachMeasureScopeImpl.setApproachMeasureRequired$ui(approachNode.mo39isMeasurementApproachInProgressozmzZPI(approachMeasureScopeImpl.mo6212getLookaheadSizeYbymL2g()) || !Constraints.m7556equalsimpl(j, m6462getLookaheadConstraintsDWUhwKw$ui()));
            if (!approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(true);
            }
            mo33measure3p2s80s = approachNode.mo38approachMeasure3p2s80s(approachMeasureScopeImpl, getWrappedNonNull(), j);
            getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(false);
            int width = mo33measure3p2s80s.getWidth();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (width == lookaheadDelegate.getWidth()) {
                int height = mo33measure3p2s80s.getHeight();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                lookaheadDelegate2.getClass();
            }
            z = false;
            if (!approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                long mo6242getSizeYbymL2g = getWrappedNonNull().mo6242getSizeYbymL2g();
                LookaheadDelegate lookaheadDelegate3 = getWrappedNonNull().getLookaheadDelegate();
                if (IntSize.m7779equalsimpl(mo6242getSizeYbymL2g, lookaheadDelegate3 != null ? IntSize.m7774boximpl(lookaheadDelegate3.m6498getSizeYbymL2g$ui()) : null) && !z) {
                    mo33measure3p2s80s = new MeasureResult(this) { // from class: androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
                        private final int height;
                        private final int width;

                        {
                            LookaheadDelegate lookaheadDelegate4 = this.getLookaheadDelegate();
                            lookaheadDelegate4.getClass();
                            this.width = lookaheadDelegate4.getWidth();
                            LookaheadDelegate lookaheadDelegate5 = this.getLookaheadDelegate();
                            lookaheadDelegate5.getClass();
                            this.height = lookaheadDelegate5.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return MeasureResult.this.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return this.height;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public ky getRulers() {
                            return MeasureResult.this.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return this.width;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            MeasureResult.this.placeChildren();
                        }
                    };
                }
            }
        } else {
            mo33measure3p2s80s = getLayoutModifierNode().mo33measure3p2s80s(this, getWrappedNonNull(), j);
        }
        setMeasureResult$ui(mo33measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator wrapped$ui;
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (!LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds() || (wrapped$ui = getWrapped$ui()) == null) {
            return;
        }
        if (IntSize.m7780equalsimpl0(mo6242getSizeYbymL2g(), wrapped$ui.mo6242getSizeYbymL2g()) && IntOffset.m7738equalsimpl0(wrapped$ui.mo6489getPositionnOccac(), IntOffset.Companion.m7750getZeronOccac())) {
            return;
        }
        drawBorder(canvas, modifierBoundsPaint);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6300placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        super.mo6300placeAtf8xVGno(j, f, graphicsLayer);
        onAfterPlaceAt();
    }

    public final void setLayoutModifierNode$ui(LayoutModifierNode layoutModifierNode) {
        if (!q10.b(layoutModifierNode, this.layoutModifierNode)) {
            Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet$ui() & NodeKind.m6573constructorimpl(Fields.RotationY)) != 0) {
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    /* renamed from: setLookaheadConstraints-_Sx5XlM$ui, reason: not valid java name */
    public final void m6463setLookaheadConstraints_Sx5XlM$ui(Constraints constraints) {
        this.lookaheadConstraints = constraints;
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

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        super.mo6235placeAtf8xVGno(j, f, kyVar);
        onAfterPlaceAt();
    }
}
