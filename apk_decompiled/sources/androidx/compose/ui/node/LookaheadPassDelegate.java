package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.bu;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private ky lastLayerBlock;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private Constraints lookaheadConstraints;
    private boolean measuredOnce;
    private boolean onNodePlacedCalled;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    private long lastPosition = IntOffset.Companion.m7750getZeronOccac();
    private PlacedState _placedState = PlacedState.IsNotPlaced;
    private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
    private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
    private boolean childDelegatesDirty = true;
    private final iy layoutChildrenBlock = new LookaheadPassDelegate$layoutChildrenBlock$1(this);
    private boolean parentDataDirty = true;
    private Object parentData = getMeasurePassDelegate$ui().getParentData();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final iy performMeasureBlock = new LookaheadPassDelegate$performMeasureBlock$1(this);
    private final iy layoutModifierBlock = new LookaheadPassDelegate$layoutModifierBlock$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PlacedState {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ PlacedState[] $VALUES;
        public static final PlacedState IsPlacedInLookahead = new PlacedState("IsPlacedInLookahead", 0);
        public static final PlacedState IsPlacedInApproach = new PlacedState("IsPlacedInApproach", 1);
        public static final PlacedState IsNotPlaced = new PlacedState("IsNotPlaced", 2);

        private static final /* synthetic */ PlacedState[] $values() {
            return new PlacedState[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
        }

        static {
            PlacedState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private PlacedState(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            if (lookaheadPassDelegate$ui.previousPlaceOrder != lookaheadPassDelegate$ui.getPlaceOrder() && lookaheadPassDelegate$ui.getPlaceOrder() == Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildLookaheadPlaceOrder$ui(0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.previousPlaceOrder = lookaheadPassDelegate$ui.getPlaceOrder();
            lookaheadPassDelegate$ui.setPlaceOrder$ui(Integer.MAX_VALUE);
            if (lookaheadPassDelegate$ui.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                lookaheadPassDelegate$ui.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void forEachChildDelegate(ky kyVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            kyVar.invoke(lookaheadPassDelegate$ui);
        }
    }

    private final boolean getDetachedFromParentLookaheadPlacement() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui();
    }

    private final boolean getLayoutPending() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending$ui();
    }

    private final boolean getLayoutPendingForAlignment() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment$ui();
    }

    private final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui();
    }

    private final boolean getMeasurePending() {
        return this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        PlacedState placedState = this._placedState;
        if (getDetachedFromParentLookaheadPlacement()) {
            this._placedState = PlacedState.IsPlacedInApproach;
        } else {
            this._placedState = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui()) {
            LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), true, false, false, 6, null);
        }
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui == null) {
                o.m("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (lookaheadPassDelegate$ui.getPlaceOrder() != Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.getLookaheadMeasurePending$ui() && layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                Constraints m6485getLastLookaheadConstraintsDWUhwKw = layoutNode.getLayoutDelegate$ui().m6485getLastLookaheadConstraintsDWUhwKw();
                m6485getLastLookaheadConstraintsDWUhwKw.getClass();
                if (lookaheadPassDelegate$ui.m6506remeasureBRTryo0(m6485getLastLookaheadConstraintsDWUhwKw.m7570unboximpl())) {
                    LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || getLayoutNode().getIntrinsicsUsageByParent$ui() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        int i = WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        layoutNode.setIntrinsicsUsageByParent$ui(i != 2 ? i != 3 ? parent$ui.getIntrinsicsUsageByParent$ui() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m6503placeSelfMLgxB_4(long j, float f, ky kyVar, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = getLayoutNode();
        try {
            LayoutNode parent$ui = getLayoutNode().getParent$ui();
            LayoutNode.LayoutState layoutState$ui = parent$ui != null ? parent$ui.getLayoutState$ui() : null;
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutState$ui == layoutState) {
                this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui(false);
            }
            if (getLayoutNode().isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            setLayoutState(layoutState);
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!IntOffset.m7738equalsimpl0(j, this.lastPosition)) {
                if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    setLayoutPending(true);
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
            this.lastPosition = j;
            if (getLayoutPending() || !isPlaced$ui()) {
                this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui(false);
                OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                snapshotObserver.observer.observeReads(getLayoutNode(), snapshotObserver.onCommitAffectingLayoutModifierInLookahead, this.layoutModifierBlock);
            } else {
                LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
                lookaheadDelegate.getClass();
                lookaheadDelegate.m6500placeSelfApparentToRealOffsetgyyYBs$ui(j);
                onNodePlaced$ui();
            }
            this.lastZIndex = f;
            this.lastLayerBlock = kyVar;
            this.lastExplicitLayer = graphicsLayer;
            setLayoutState(LayoutNode.LayoutState.Idle);
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            o.j();
        }
    }

    private final void setLayoutPending(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPending$ui(z);
    }

    private final void setLayoutPendingForAlignment(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPendingForAlignment$ui(z);
    }

    private final void setLayoutState(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui(layoutState);
    }

    private final void setMeasurePending(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadMeasurePending$ui(z);
    }

    private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui())) {
            InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        if (i == 1 || i == 2) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i != 3 && i != 4) {
                o.s(parent$ui.getLayoutState$ui(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                return;
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui(true);
                if (getAlignmentLines().getDirty$ui()) {
                    this.layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui(true);
            }
        }
        LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.setPlacingForAlignment$ui(true);
        }
        layoutChildren();
        LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.setPlacingForAlignment$ui(false);
        }
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(ky kyVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = layoutNodeArr[i].getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
            lookaheadAlignmentLinesOwner$ui.getClass();
            kyVar.invoke(lookaheadAlignmentLinesOwner$ui);
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui(true);
        } else {
            LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        int i = lookaheadDelegate.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final List<LookaheadPassDelegate> getChildDelegates$ui() {
        getLayoutNode().getChildren$ui();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.asMutableList();
        }
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (mutableVector.getSize() <= i) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode2.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                mutableVector.add(lookaheadPassDelegate$ui);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate$ui2 = layoutNode2.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui2.getClass();
                mutableVector.set(i, lookaheadPassDelegate$ui2);
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    }

    public final boolean getChildDelegatesDirty$ui() {
        return this.childDelegatesDirty;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m6504getLastConstraintsDWUhwKw() {
        return this.lookaheadConstraints;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate$ui();
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredWidth();
    }

    public final boolean getNeedsToBePlacedInApproach() {
        return LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) || getDetachedFromParentLookaheadPlacement();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || (layoutDelegate$ui = parent$ui.getLayoutDelegate$ui()) == null) {
            return null;
        }
        return layoutDelegate$ui.getLookaheadAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    public final iy getPerformMeasureBlock$ui() {
        return this.performMeasureBlock;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    public final boolean getPlacedOnce$ui() {
        return this.placedOnce;
    }

    public final void invalidateIntrinsicsParent(boolean z) {
        LayoutNode layoutNode;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui = getLayoutNode().getIntrinsicsUsageByParent$ui();
        if (parent$ui == null || intrinsicsUsageByParent$ui == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui;
            if (layoutNode.getIntrinsicsUsageByParent$ui() != intrinsicsUsageByParent$ui) {
                break;
            } else {
                parent$ui = layoutNode.getParent$ui();
            }
        } while (parent$ui != null);
        int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui.ordinal()];
        if (i == 1) {
            if (layoutNode.getLookaheadRoot$ui() != null) {
                LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, z, false, false, 6, null);
                return;
            } else {
                LayoutNode.requestRemeasure$ui$default(layoutNode, z, false, false, 6, null);
                return;
            }
        }
        if (i != 2) {
            o.f("Intrinsics isn't used by the parent");
        } else if (layoutNode.getLookaheadRoot$ui() != null) {
            layoutNode.requestLookaheadRelayout$ui(z);
        } else {
            layoutNode.requestRelayout$ui(z);
        }
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    public final boolean isPlaced$ui() {
        return this._placedState != PlacedState.IsNotPlaced;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (getLayoutPending()) {
            onBeforeLayoutChildren();
        }
        LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (getLayoutPendingForAlignment() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui() && getLayoutPending())) {
            setLayoutPending(false);
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LookaheadLayingOut);
            this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringPlacement(false);
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
            LayoutNode layoutNode = getLayoutNode();
            iy iyVar = this.layoutChildrenBlock;
            snapshotObserver.observer.observeReads(layoutNode, snapshotObserver.onCommitAffectingLookahead, iyVar);
            setLayoutState(layoutState);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui()) {
                requestLayout();
            }
            setLayoutPendingForAlignment(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui(true);
        }
        if (getAlignmentLines().getDirty$ui() && getAlignmentLines().getRequired$ui()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markLayoutPending$ui() {
        setLayoutPending(true);
        setLayoutPendingForAlignment(true);
    }

    public final void markMeasurePending$ui() {
        setMeasurePending(true);
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui(boolean z) {
        if (z && getNeedsToBePlacedInApproach()) {
            return;
        }
        if (z || getNeedsToBePlacedInApproach()) {
            this._placedState = PlacedState.IsNotPlaced;
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r0 != null ? r0.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Placeable mo6234measureBRTryo0(long j) {
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
            LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
        }
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui(false);
        trackLookaheadMeasurementByParent(getLayoutNode());
        if (getLayoutNode().getIntrinsicsUsageByParent$ui() == LayoutNode.UsageByParent.NotUsed) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui();
        }
        m6506remeasureBRTryo0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode = layoutNodeArr[i];
                LayoutNodeLayoutDelegate layoutDelegate$ui = layoutNode.getLayoutDelegate$ui();
                if ((layoutDelegate$ui.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate$ui.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui.getLookaheadLayoutPending$ui()) {
                    LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutDelegate$ui.getLookaheadPassDelegate$ui();
                if (lookaheadPassDelegate$ui != null) {
                    lookaheadPassDelegate$ui.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
            }
        }
    }

    public final void onApproachPlacement$ui() {
        if (this._placedState != PlacedState.IsNotPlaced || LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            return;
        }
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui(true);
    }

    public final void onAttachedToNullParent() {
        this._placedState = PlacedState.IsPlacedInLookahead;
    }

    public final void onNodeDetached() {
        setPlaceOrder$ui(Integer.MAX_VALUE);
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.IsNotPlaced;
    }

    public final void onNodePlaced$ui() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((this._placedState != PlacedState.IsPlacedInLookahead && !getDetachedFromParentLookaheadPlacement()) || (this._placedState != PlacedState.IsPlacedInApproach && getDetachedFromParentLookaheadPlacement())) {
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui != null) {
                LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        if (parent$ui == null) {
            setPlaceOrder$ui(0);
        } else if (!this.relayoutWithoutParentInProgress && (parent$ui.getLayoutState$ui() == LayoutNode.LayoutState.LayingOut || parent$ui.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadLayingOut)) {
            if (!(getPlaceOrder() == Integer.MAX_VALUE)) {
                InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
            }
            setPlaceOrder$ui(parent$ui.getLayoutDelegate$ui().getNextChildLookaheadPlaceOrder$ui());
            LayoutNodeLayoutDelegate layoutDelegate$ui = parent$ui.getLayoutDelegate$ui();
            layoutDelegate$ui.setNextChildLookaheadPlaceOrder$ui(layoutDelegate$ui.getNextChildLookaheadPlaceOrder$ui() + 1);
        }
        layoutChildren();
    }

    /* renamed from: performMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m6505performMeasureBRTryo0$ui(long j) {
        setLayoutState(LayoutNode.LayoutState.LookaheadMeasuring);
        setMeasurePending(false);
        this.performMeasureConstraints = j;
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
        LayoutNode layoutNode = getLayoutNode();
        iy iyVar = this.performMeasureBlock;
        snapshotObserver.observer.observeReads(layoutNode, snapshotObserver.onCommitAffectingLookaheadMeasure, iyVar);
        markLayoutPending$ui();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            getMeasurePassDelegate$ui().markLayoutPending();
        } else {
            getMeasurePassDelegate$ui().markMeasurePending$ui();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        m6503placeSelfMLgxB_4(j, f, kyVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x000f, B:6:0x0018, B:9:0x0031, B:13:0x003b, B:15:0x0048, B:20:0x0059, B:22:0x0063, B:23:0x006a, B:26:0x004e, B:27:0x0072, B:29:0x008b, B:30:0x0099, B:34:0x00aa, B:35:0x00af, B:37:0x00d8, B:42:0x0090), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x000f, B:6:0x0018, B:9:0x0031, B:13:0x003b, B:15:0x0048, B:20:0x0059, B:22:0x0063, B:23:0x006a, B:26:0x004e, B:27:0x0072, B:29:0x008b, B:30:0x0099, B:34:0x00aa, B:35:0x00af, B:37:0x00d8, B:42:0x0090), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x000f, B:6:0x0018, B:9:0x0031, B:13:0x003b, B:15:0x0048, B:20:0x0059, B:22:0x0063, B:23:0x006a, B:26:0x004e, B:27:0x0072, B:29:0x008b, B:30:0x0099, B:34:0x00aa, B:35:0x00af, B:37:0x00d8, B:42:0x0090), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x000f, B:6:0x0018, B:9:0x0031, B:13:0x003b, B:15:0x0048, B:20:0x0059, B:22:0x0063, B:23:0x006a, B:26:0x004e, B:27:0x0072, B:29:0x008b, B:30:0x0099, B:34:0x00aa, B:35:0x00af, B:37:0x00d8, B:42:0x0090), top: B:2:0x0005 }] */
    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6506remeasureBRTryo0(long j) {
        boolean z;
        LookaheadDelegate lookaheadDelegate;
        LayoutNode layoutNode = getLayoutNode();
        try {
            if (getLayoutNode().isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode parent$ui = getLayoutNode().getParent$ui();
            LayoutNode layoutNode2 = getLayoutNode();
            if (!getLayoutNode().getCanMultiMeasure$ui() && (parent$ui == null || !parent$ui.getCanMultiMeasure$ui())) {
                z = false;
                layoutNode2.setCanMultiMeasure$ui(z);
                if (!getLayoutNode().getLookaheadMeasurePending$ui()) {
                    Constraints constraints = this.lookaheadConstraints;
                    if (constraints == null ? false : Constraints.m7557equalsimpl0(constraints.m7570unboximpl(), j)) {
                        Owner owner$ui = getLayoutNode().getOwner$ui();
                        if (owner$ui != null) {
                            owner$ui.forceMeasureTheSubtree(getLayoutNode(), true);
                        }
                        getLayoutNode().resetSubtreeIntrinsicsUsage$ui();
                        return false;
                    }
                }
                this.lookaheadConstraints = Constraints.m7551boximpl(j);
                m6302setMeasurementConstraintsBRTryo0(j);
                getAlignmentLines().setUsedByModifierMeasurement$ui(false);
                forEachChildAlignmentLinesOwner(LookaheadPassDelegate$remeasure$1$2.INSTANCE);
                long m6298getMeasuredSizeYbymL2g = !this.measuredOnce ? m6298getMeasuredSizeYbymL2g() : IntSize.m7777constructorimpl(-9223372034707292160L);
                this.measuredOnce = true;
                lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
                if (!(lookaheadDelegate == null)) {
                    InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
                }
                this.layoutNodeLayoutDelegate.m6486performLookaheadMeasureBRTryo0$ui(j);
                m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L)));
                return ((int) (m6298getMeasuredSizeYbymL2g >> 32)) == lookaheadDelegate.getWidth() || ((int) (m6298getMeasuredSizeYbymL2g & 4294967295L)) != lookaheadDelegate.getHeight();
            }
            z = true;
            layoutNode2.setCanMultiMeasure$ui(z);
            if (!getLayoutNode().getLookaheadMeasurePending$ui()) {
            }
            this.lookaheadConstraints = Constraints.m7551boximpl(j);
            m6302setMeasurementConstraintsBRTryo0(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui(false);
            forEachChildAlignmentLinesOwner(LookaheadPassDelegate$remeasure$1$2.INSTANCE);
            if (!this.measuredOnce) {
            }
            this.measuredOnce = true;
            lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            if (!(lookaheadDelegate == null)) {
            }
            this.layoutNodeLayoutDelegate.m6486performLookaheadMeasureBRTryo0$ui(j);
            m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L)));
            if (((int) (m6298getMeasuredSizeYbymL2g >> 32)) == lookaheadDelegate.getWidth()) {
            }
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            o.j();
            return false;
        }
    }

    public final void replace() {
        LookaheadPassDelegate lookaheadPassDelegate;
        LayoutNode parent$ui;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean isPlaced$ui = isPlaced$ui();
            lookaheadPassDelegate = this;
            try {
                lookaheadPassDelegate.m6503placeSelfMLgxB_4(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced$ui && !lookaheadPassDelegate.onNodePlacedCalled && (parent$ui = lookaheadPassDelegate.getLayoutNode().getParent$ui()) != null) {
                    LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
                }
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lookaheadPassDelegate = this;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestLookaheadRelayout$ui$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void setChildDelegatesDirty$ui(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final void setMeasuredByParent$ui(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public void setPlaceOrder$ui(int i) {
        this.placeOrder = i;
    }

    public final void setPlacedOnce$ui(boolean z) {
        this.placedOnce = z;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final boolean updateParentData() {
        if (getParentData() == null) {
            LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate2.getClass();
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadDelegate lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        if (!Boolean.valueOf(z).equals(lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate()) != null) {
            lookaheadDelegate.setPlacedUnderMotionFrameOfReference(z);
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo6300placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        m6503placeSelfMLgxB_4(j, f, null, graphicsLayer);
    }
}
