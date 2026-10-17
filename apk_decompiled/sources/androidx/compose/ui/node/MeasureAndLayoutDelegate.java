package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.unit.Constraints;
import defpackage.iy;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;
    private RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

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
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
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

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        Owner.OnLayoutCompletedListener[] onLayoutCompletedListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            onLayoutCompletedListenerArr[i].onLayoutComplete();
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m6510doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot$ui() == null) {
            return false;
        }
        boolean m6471lookaheadRemeasure_Sx5XlM$ui = constraints != null ? layoutNode.m6471lookaheadRemeasure_Sx5XlM$ui(constraints) : LayoutNode.m6466lookaheadRemeasure_Sx5XlM$ui$default(layoutNode, null, 1, null);
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (m6471lookaheadRemeasure_Sx5XlM$ui && parent$ui != null) {
            if (parent$ui.getLookaheadRoot$ui() == null) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m6471lookaheadRemeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m6471lookaheadRemeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        return m6471lookaheadRemeasure_Sx5XlM$ui;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m6511doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m6472remeasure_Sx5XlM$ui = constraints != null ? layoutNode.m6472remeasure_Sx5XlM$ui(constraints) : LayoutNode.m6467remeasure_Sx5XlM$ui$default(layoutNode, null, 1, null);
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (m6472remeasure_Sx5XlM$ui && parent$ui != null) {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m6472remeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        return m6472remeasure_Sx5XlM$ui;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            PostponedRequest[] postponedRequestArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                PostponedRequest postponedRequest = postponedRequestArr[i];
                if (postponedRequest.getNode().isAttached()) {
                    if (postponedRequest.isLookahead()) {
                        LayoutNode.requestLookaheadRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    } else {
                        LayoutNode.requestRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.clear();
        }
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (q10.b(layoutNode2.isPlacedInLookahead(), Boolean.TRUE) && !layoutNode2.isDeactivated()) {
                if (this.relayoutNodes.contains(layoutNode2, true)) {
                    layoutNode2.lookaheadReplace$ui();
                }
                ensureSubtreeLookaheadReplaced(layoutNode2);
            }
        }
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if ((!z && getRemeasureCanAffectParentSize(layoutNode2)) || (z && getLookaheadRemeasureCanAffectParentSize(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z) {
                    if (layoutNode2.getLookaheadMeasurePending$ui() && this.relayoutNodes.contains(layoutNode2, true)) {
                        remeasureIfNeeded$default(this, layoutNode2, true, false, 4, null);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                onlyRemeasureIfPending(layoutNode2, z);
                if (!measurePending(layoutNode2, z)) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z);
                }
            }
        }
        onlyRemeasureIfPending(layoutNode, z);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadMeasurePending$ui()) {
            return (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.NotUsed && ((lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui())) ? false : true;
        }
        return false;
    }

    private final boolean getCanAffectPlacedParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui() && getMeasuredByPlacedParent(layoutNode);
    }

    private final boolean getLookaheadRemeasureCanAffectParentSize(LayoutNode layoutNode) {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        AlignmentLines alignmentLines;
        return layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock || !((lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui());
    }

    private final boolean getMeasuredByPlacedParent(LayoutNode layoutNode) {
        do {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.NotUsed && !layoutNode.getLayoutDelegate$ui().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui()) {
                LayoutNode parent$ui = layoutNode.getParent$ui();
                if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.isPlaced());
        return true;
    }

    private final boolean getRemeasureCanAffectParentSize(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui();
    }

    private final boolean isUsedInMeasureOrLayout(LayoutNode layoutNode) {
        return layoutNode.isPlaced() || layoutNode.isPlacedByParent() || getCanAffectPlacedParent(layoutNode) || q10.b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode) || layoutNode.getAlignmentLinesRequired$ui();
    }

    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iyVar = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(iyVar);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getLookaheadMeasurePending$ui() : layoutNode.getMeasurePending$ui();
    }

    private final void onlyRemeasureIfPending(LayoutNode layoutNode, boolean z) {
        if (measurePending(layoutNode, z)) {
            remeasureIfNeeded$default(this, layoutNode, z, false, 4, null);
        }
    }

    private final void performMeasureAndLayout(boolean z, iy iyVar) {
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = z;
            try {
                iyVar.invoke();
            } catch (Throwable th) {
                try {
                    RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                    if (uncaughtExceptionHandler == null) {
                        throw th;
                    }
                    uncaughtExceptionHandler.onUncaughtException(th);
                } finally {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                }
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        boolean z2;
        LayoutNode parent$ui;
        boolean m6510doLookaheadRemeasuresdFAvZA;
        boolean z3 = false;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                constraints.getClass();
            } else {
                constraints = null;
            }
            if (z) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            m6510doLookaheadRemeasuresdFAvZA = m6510doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        m6510doLookaheadRemeasuresdFAvZA = m6510doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                    }
                    z3 = m6510doLookaheadRemeasuresdFAvZA;
                }
                if ((z3 || layoutNode.getLookaheadLayoutPending$ui()) && q10.b(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadLayout");
                        try {
                            layoutNode.lookaheadReplace$ui();
                        } finally {
                        }
                    } else {
                        layoutNode.lookaheadReplace$ui();
                    }
                }
            } else {
                if (!layoutNode.getMeasurePending$ui()) {
                    z2 = false;
                } else if (ComposeToolingFlags.isVerboseTracingEnabled) {
                    Trace.beginSection("Compose:measure");
                    try {
                        z2 = m6511doRemeasuresdFAvZA(layoutNode, constraints);
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    z2 = m6511doRemeasuresdFAvZA(layoutNode, constraints);
                }
                if (layoutNode.getLayoutPending$ui() && (layoutNode == this.root || ((parent$ui = layoutNode.getParent$ui()) != null && parent$ui.isPlaced() && layoutNode.isPlacedByParent()))) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:layout");
                        try {
                            if (layoutNode == this.root) {
                                layoutNode.place$ui(0, 0);
                            } else {
                                layoutNode.replace$ui();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    } else if (layoutNode == this.root) {
                        layoutNode.place$ui(0, 0);
                    } else {
                        layoutNode.replace$ui();
                    }
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                }
                z3 = z2;
            }
            drainPostponedMeasureRequests();
        }
        return z3;
    }

    public static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureIfNeeded(LayoutNode layoutNode, boolean z, boolean z2) {
        Constraints constraints;
        boolean m6511doRemeasuresdFAvZA;
        boolean z3 = false;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                constraints.getClass();
            } else {
                constraints = null;
            }
            if (z) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled && z2) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            m6511doRemeasuresdFAvZA = m6510doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                        } finally {
                        }
                    } else {
                        m6511doRemeasuresdFAvZA = m6510doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                    }
                    z3 = m6511doRemeasuresdFAvZA;
                }
                drainPostponedMeasureRequests();
            } else {
                if (layoutNode.getMeasurePending$ui()) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled && z2) {
                        Trace.beginSection("Compose:measure");
                        try {
                            m6511doRemeasuresdFAvZA = m6511doRemeasuresdFAvZA(layoutNode, constraints);
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        m6511doRemeasuresdFAvZA = m6511doRemeasuresdFAvZA(layoutNode, constraints);
                    }
                    z3 = m6511doRemeasuresdFAvZA;
                }
                drainPostponedMeasureRequests();
            }
        }
        return z3;
    }

    public static /* synthetic */ boolean remeasureIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.remeasureIfNeeded(layoutNode, z, z2);
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (getRemeasureCanAffectParentSize(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                    remeasureOnly(layoutNode2, true);
                } else {
                    remeasureLookaheadRootsInSubtree(layoutNode2);
                }
            }
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            constraints.getClass();
        } else {
            constraints = null;
        }
        if (z) {
            m6510doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m6511doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        if (this.onPositionedDispatcher.isNotEmpty()) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                this.onPositionedDispatcher.dispatch();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(layoutNode, z)) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z);
    }

    public final boolean getDuringMeasureLayout$ui() {
        return this.duringMeasureLayout;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return this.uncaughtExceptionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean measureAndLayout(iy iyVar) {
        boolean z;
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        LayoutNode pop;
        boolean z2;
        boolean z3;
        boolean remeasureIfNeeded;
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z = false;
                    while (true) {
                        try {
                            if (!depthSortedSetsForDifferentPasses.lookaheadAndAncestorMeasureSet.isEmpty()) {
                                pop = depthSortedSetsForDifferentPasses.lookaheadAndAncestorMeasureSet.pop();
                                z3 = pop.getLookaheadRoot$ui() != null;
                                z2 = false;
                            } else if (!depthSortedSetsForDifferentPasses.lookaheadAndAncestorPlaceSet.isEmpty()) {
                                pop = depthSortedSetsForDifferentPasses.lookaheadAndAncestorPlaceSet.pop();
                                z3 = pop.getLookaheadRoot$ui() != null;
                                z2 = true;
                            } else {
                                if (depthSortedSetsForDifferentPasses.approachSet.isEmpty()) {
                                    break;
                                }
                                pop = depthSortedSetsForDifferentPasses.approachSet.pop();
                                z2 = true;
                                z3 = false;
                            }
                            if (z2) {
                                remeasureIfNeeded = remeasureAndRelayoutIfNeeded(pop, z3);
                            } else {
                                remeasureIfNeeded = remeasureIfNeeded(pop, z3, true);
                                if (pop.getLookaheadLayoutPending$ui()) {
                                    this.relayoutNodes.add(pop, Invalidation.LookaheadPlacement);
                                }
                                if (pop.getLayoutPending$ui()) {
                                    this.relayoutNodes.add(pop, Invalidation.Placement);
                                }
                            }
                            if (pop == this.root && remeasureIfNeeded) {
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                                if (uncaughtExceptionHandler == null) {
                                    throw th;
                                }
                                uncaughtExceptionHandler.onUncaughtException(th);
                                this.duringMeasureLayout = false;
                                this.duringFullMeasureLayoutPass = false;
                                z4 = z;
                                layoutTreeConsistencyChecker = this.consistencyChecker;
                                if (layoutTreeConsistencyChecker != null) {
                                }
                                callOnLayoutCompletedListeners();
                                return z4;
                            } catch (Throwable th2) {
                                this.duringMeasureLayout = false;
                                this.duringFullMeasureLayoutPass = false;
                                throw th2;
                            }
                        }
                    }
                    if (iyVar != null) {
                        iyVar.invoke();
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            this.duringMeasureLayout = false;
            this.duringFullMeasureLayoutPass = false;
            z4 = z;
            layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        callOnLayoutCompletedListeners();
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6512measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.remove(layoutNode);
            } catch (Throwable th) {
                try {
                    RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                    if (uncaughtExceptionHandler == null) {
                        throw th;
                    }
                    uncaughtExceptionHandler.onUncaughtException(th);
                } finally {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                }
            }
            if (!m6510doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m7551boximpl(j))) {
                if (layoutNode.getLookaheadLayoutPending$ui()) {
                }
                ensureSubtreeLookaheadReplaced(layoutNode);
                m6511doRemeasuresdFAvZA(layoutNode, Constraints.m7551boximpl(j));
                if (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                drainPostponedMeasureRequests();
                layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            if (q10.b(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                layoutNode.lookaheadReplace$ui();
            }
            ensureSubtreeLookaheadReplaced(layoutNode);
            m6511doRemeasuresdFAvZA(layoutNode, Constraints.m7551boximpl(j));
            if (layoutNode.getLayoutPending$ui()) {
                layoutNode.replace$ui();
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
            }
            drainPostponedMeasureRequests();
            layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadRemeasure");
                        try {
                            if (this.relayoutNodes.getAffectsLookaheadMeasure()) {
                                LayoutNode lookaheadRoot$ui = this.root.getLookaheadRoot$ui();
                                LayoutNode layoutNode = this.root;
                                if (lookaheadRoot$ui != null) {
                                    remeasureOnly(layoutNode, true);
                                } else {
                                    remeasureLookaheadRootsInSubtree(layoutNode);
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (this.relayoutNodes.getAffectsLookaheadMeasure()) {
                        LayoutNode lookaheadRoot$ui2 = this.root.getLookaheadRoot$ui();
                        LayoutNode layoutNode2 = this.root;
                        if (lookaheadRoot$ui2 != null) {
                            remeasureOnly(layoutNode2, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(layoutNode2);
                        }
                    }
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:remeasure");
                        try {
                            remeasureOnly(this.root, false);
                            Trace.endSection();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        remeasureOnly(this.root, false);
                    }
                } catch (Throwable th2) {
                    try {
                        RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                        if (uncaughtExceptionHandler == null) {
                            throw th2;
                        }
                        uncaughtExceptionHandler.onUncaughtException(th2);
                    } finally {
                        this.duringMeasureLayout = false;
                        this.duringFullMeasureLayoutPass = false;
                    }
                }
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
        this.onPositionedDispatcher.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        o.n();
                        return false;
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui() || layoutNode.getLookaheadLayoutPending$ui()) && !z) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui();
            layoutNode.markLayoutPending$ui();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (q10.b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui == null || !parent$ui.getLookaheadMeasurePending$ui()) && (parent$ui == null || !parent$ui.getLookaheadLayoutPending$ui()))) {
                this.relayoutNodes.add(layoutNode, Invalidation.LookaheadPlacement);
            } else if (layoutNode.isPlaced() && ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui()))) {
                this.relayoutNodes.add(layoutNode, Invalidation.Placement);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        if (!(layoutNode.getLookaheadRoot$ui() != null)) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    o.n();
                    return false;
                }
                if (layoutNode.getLookaheadMeasurePending$ui() && !z) {
                    return false;
                }
                layoutNode.markLookaheadMeasurePending$ui();
                layoutNode.markMeasurePending$ui();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if ((q10.b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui = layoutNode.getParent$ui()) == null || !parent$ui.getLookaheadMeasurePending$ui())) {
                    this.relayoutNodes.add(layoutNode, Invalidation.LookaheadMeasurement);
                } else if ((layoutNode.isPlaced() || getCanAffectPlacedParent(layoutNode)) && ((parent$ui2 = layoutNode.getParent$ui()) == null || !parent$ui2.getMeasurePending$ui())) {
                    this.relayoutNodes.add(layoutNode, Invalidation.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            return false;
        }
        if (i != 5) {
            o.n();
            return false;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        boolean z2 = parent$ui == null || parent$ui.isPlaced();
        if (!z && (layoutNode.getMeasurePending$ui() || (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced() == z2 && layoutNode.isPlaced() == layoutNode.isPlacedByParent()))) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return false;
        }
        layoutNode.markLayoutPending$ui();
        if (!layoutNode.isDeactivated() && layoutNode.isPlacedByParent() && z2) {
            if ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui())) {
                this.relayoutNodes.add(layoutNode, Invalidation.Placement);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    o.n();
                    return false;
                }
                if (layoutNode.getMeasurePending$ui() && !z) {
                    return false;
                }
                layoutNode.markMeasurePending$ui();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if (!layoutNode.isPlaced() && !getCanAffectPlacedParent(layoutNode)) {
                    return false;
                }
                LayoutNode parent$ui = layoutNode.getParent$ui();
                if (parent$ui == null || !parent$ui.getMeasurePending$ui()) {
                    this.relayoutNodes.add(layoutNode, Invalidation.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void setDuringMeasureLayout$ui(boolean z) {
        this.duringMeasureLayout = z;
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m6513updateRootConstraintsBRTryo0(long j) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m7557equalsimpl0(constraints.m7570unboximpl(), j)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.m7551boximpl(j);
        if (this.root.getLookaheadRoot$ui() != null) {
            this.root.markLookaheadMeasurePending$ui();
        }
        this.root.markMeasurePending$ui();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui() != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }
}
