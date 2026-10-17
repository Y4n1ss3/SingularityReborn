package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PausableComposition;
import androidx.compose.runtime.PausedComposition;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fb0;
import defpackage.iy;
import defpackage.kp0;
import defpackage.ky;
import defpackage.ma0;
import defpackage.my;
import defpackage.n10;
import defpackage.o;
import defpackage.oa0;
import defpackage.q10;
import defpackage.ql0;
import defpackage.tj;
import defpackage.ut;
import defpackage.yi;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private final String NoIntrinsicsMessage;
    private final ApproachMeasureScopeImpl approachMeasureScope;
    private final fb0 approachPrecomposeSlotHandleMap;
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private final fb0 nodeToNodeState;
    private final fb0 precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet;
    private final LayoutNode root;
    private final Scope scope;
    private final fb0 slotIdToNode;
    private final MutableVector<Object> slotIdsOfCompositionsNeededInApproach;
    private SubcomposeSlotReusePolicy slotReusePolicy;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final ky kyVar, final ky kyVar2) {
            if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public ky getRulers() {
                    return kyVar;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getLookaheadDelegate()) == null) {
                        kyVar2.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getPlacementScope());
                    } else {
                        kyVar2.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, my myVar) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, myVar);
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        long[] jArr = ql0.a;
        this.nodeToNodeState = new fb0();
        this.slotIdToNode = new fb0();
        this.scope = new Scope();
        this.approachMeasureScope = new ApproachMeasureScopeImpl();
        this.precomposeMap = new fb0();
        this.reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.approachPrecomposeSlotHandleMap = new fb0();
        this.slotIdsOfCompositionsNeededInApproach = new MutableVector<>(new Object[16], 0);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPausedPrecomposition(NodeState nodeState, boolean z) {
        PausedComposition pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                if (z) {
                    while (!pausedComposition.isComplete()) {
                        try {
                            pausedComposition.resume(new o(19));
                        } catch (Throwable th) {
                            ma0 operations = nodeState.getOperations();
                            if (operations == null) {
                                throw th;
                            }
                            throw new SubcomposeLayoutPausableCompositionException(operations, nodeState.getSlotId(), th);
                        }
                    }
                }
                pausedComposition.apply();
                nodeState.setPausedComposition(null);
                layoutNode.ignoreRemeasureRequests = false;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyPausedPrecomposition$lambda$0$0$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object obj, my myVar) {
        if (!(this.slotIdsOfCompositionsNeededInApproach.getSize() >= this.currentApproachIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode = (LayoutNode) this.slotIdToNode.d(obj);
        int size = this.slotIdsOfCompositionsNeededInApproach.getSize();
        int i = this.currentApproachIndex;
        MutableVector<Object> mutableVector = this.slotIdsOfCompositionsNeededInApproach;
        if (size == i) {
            mutableVector.add(obj);
        } else {
            mutableVector.set(i, obj);
        }
        this.currentApproachIndex++;
        boolean a = this.precomposeMap.a(obj);
        if (a || layoutNode != null) {
            if (!a && layoutNode != null) {
                move(this.root.getFoldedChildren$ui().indexOf(layoutNode), this.root.getFoldedChildren$ui().size(), 1);
                this.precomposedCount++;
                this.slotIdToNode.j(obj);
                this.precomposeMap.l(obj, layoutNode);
                this.approachPrecomposeSlotHandleMap.l(obj, createPrecomposedSlotHandle(obj));
                if (this.root.isAttached()) {
                    makeSureStateIsConsistent();
                }
            }
            LayoutNode layoutNode2 = (LayoutNode) this.precomposeMap.d(obj);
            NodeState nodeState = layoutNode2 != null ? (NodeState) this.nodeToNodeState.d(layoutNode2) : null;
            if (nodeState != null && nodeState.getForceRecompose()) {
                subcompose(layoutNode2, obj, false, myVar);
            }
            if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                applyPausedPrecomposition(nodeState, true);
            }
        } else {
            this.approachPrecomposeSlotHandleMap.l(obj, precompose(obj, myVar));
        }
        LayoutNode layoutNode3 = (LayoutNode) this.precomposeMap.d(obj);
        if (layoutNode3 != null) {
            List<MeasurePassDelegate> childDelegates$ui = layoutNode3.getMeasurePassDelegate$ui().getChildDelegates$ui();
            int size2 = childDelegates$ui.size();
            for (int i2 = 0; i2 < size2; i2++) {
                childDelegates$ui.get(i2).markDetachedFromParentLookaheadPass$ui();
            }
            if (childDelegates$ui != null) {
                return childDelegates$ui;
            }
        }
        return ut.d;
    }

    private final void cancelPausedPrecomposition(NodeState nodeState) {
        PausedComposition pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            pausedComposition.cancel();
            nodeState.setPausedComposition(null);
            ReusableComposition composition = nodeState.getComposition();
            if (composition != null) {
                composition.dispose();
            }
            nodeState.setComposition(null);
        }
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final iy iyVar) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public ky getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                iyVar.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui(i, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle(final Object obj) {
        return !this.root.isAttached() ? new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
            }
        } : new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$2
            private final oa0 hasPremeasured;

            {
                int[] iArr = n10.a;
                this.hasPremeasured = new oa0();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
            }

            public final oa0 getHasPremeasured() {
                return this.hasPremeasured;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                fb0 fb0Var;
                List<LayoutNode> children$ui;
                fb0Var = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) fb0Var.d(obj);
                if (layoutNode == null || (children$ui = layoutNode.getChildren$ui()) == null) {
                    return 0;
                }
                return children$ui.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: getSize-YEO4UFw, reason: not valid java name */
            public long mo6261getSizeYEO4UFw(int i) {
                fb0 fb0Var;
                fb0Var = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) fb0Var.d(obj);
                if (layoutNode != null && layoutNode.isAttached()) {
                    int size = layoutNode.getChildren$ui().size();
                    if (i < 0 || i >= size) {
                        InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                    }
                    if (this.hasPremeasured.a(i)) {
                        int width = layoutNode.getChildren$ui().get(i).getWidth();
                        return IntSize.m7777constructorimpl((layoutNode.getChildren$ui().get(i).getHeight() & 4294967295L) | (width << 32));
                    }
                }
                return IntSize.Companion.m7787getZeroYbymL2g();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo6262premeasure0kLqBqw(int i, long j) {
                fb0 fb0Var;
                fb0Var = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) fb0Var.d(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui().size();
                if (i < 0 || i >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo6640measureAndLayout0kLqBqw(layoutNode.getChildren$ui().get(i), j);
                layoutNode2.ignoreRemeasureRequests = false;
                this.hasPremeasured.b(i);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, ky kyVar) {
                fb0 fb0Var;
                NodeChain nodes$ui;
                fb0Var = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) fb0Var.d(obj);
                Modifier.Node head$ui = (layoutNode == null || (nodes$ui = layoutNode.getNodes$ui()) == null) ? null : nodes$ui.getHead$ui();
                if (head$ui == null || !head$ui.isAttached()) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui, obj2, kyVar);
            }
        };
    }

    private final void deactivateOutOfFrame(NodeState nodeState, OutOfFrameExecutor outOfFrameExecutor) {
        outOfFrameExecutor.schedule(new LayoutNodeSubcompositionsState$deactivateOutOfFrame$1(nodeState));
    }

    private final void disposeCurrentNodes() {
        ReusableComposition composition;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        fb0 fb0Var = this.nodeToNodeState;
        Object[] objArr = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (composition = ((NodeState) objArr[(i << 3) + i3]).getComposition()) != null) {
                            composition.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.root.removeAll$ui();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.f();
        this.slotIdToNode.f();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.f();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposePrecomposedSlot(Object obj) {
        makeSureStateIsConsistent();
        LayoutNode layoutNode = (LayoutNode) this.precomposeMap.j(obj);
        if (layoutNode != null) {
            if (!(this.precomposedCount > 0)) {
                InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
            }
            int indexOf = this.root.getFoldedChildren$ui().indexOf(layoutNode);
            if (!(indexOf >= this.root.getFoldedChildren$ui().size() - this.precomposedCount)) {
                InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
            }
            this.reusableCount++;
            this.precomposedCount--;
            NodeState nodeState = (NodeState) this.nodeToNodeState.d(layoutNode);
            if (nodeState != null) {
                cancelPausedPrecomposition(nodeState);
            }
            int size = (this.root.getFoldedChildren$ui().size() - this.precomposedCount) - this.reusableCount;
            move(indexOf, size, 1);
            disposeOrReuseStartingFromIndex(size);
        }
        if (this.slotIdsOfCompositionsNeededInApproach.contains(obj)) {
            LayoutNode.requestRemeasure$ui$default(this.root, true, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        Object obj;
        fb0 fb0Var = this.approachPrecomposeSlotHandleMap;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = fb0Var.b[i4];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) fb0Var.c[i4];
                        int indexOf = this.slotIdsOfCompositionsNeededInApproach.indexOf(obj2);
                        if (indexOf < 0 || indexOf >= this.currentApproachIndex) {
                            if (indexOf >= 0) {
                                MutableVector<Object> mutableVector = this.slotIdsOfCompositionsNeededInApproach;
                                obj = SubcomposeLayoutKt.UnspecifiedSlotId;
                                mutableVector.set(indexOf, obj);
                            }
                            if (this.precomposeMap.a(obj2)) {
                                precomposedSlotHandle.dispose();
                            }
                            fb0Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final OutOfFrameExecutor getOutOfFrameExecutor() {
        return LayoutNodeKt.requireOwner(this.root).getOutOfFrameExecutor();
    }

    private final Object getSlotIdAtIndex(List<LayoutNode> list, int i) {
        Object d = this.nodeToNodeState.d(list.get(i));
        d.getClass();
        return ((NodeState) d).getSlotId();
    }

    private final <T> T ignoreRemeasureRequests(iy iyVar) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        T t = (T) iyVar.invoke();
        layoutNode.ignoreRemeasureRequests = false;
        return t;
    }

    private final void markActiveNodesAsReused(boolean z) {
        SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        this.precomposedCount = 0;
        this.precomposeMap.f();
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i = 0; i < size; i++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(i);
                    NodeState nodeState = (NodeState) this.nodeToNodeState.d(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        reuseComposition(nodeState, z);
                        subcomposeLayoutKt$ReusedSlotId$1 = SubcomposeLayoutKt.ReusedSlotId;
                        nodeState.setSlotId(subcomposeLayoutKt$ReusedSlotId$1);
                    }
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.slotIdToNode.f();
        }
        makeSureStateIsConsistent();
    }

    private final void move(int i, int i2, int i3) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui(i, i2, i3);
        layoutNode.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    private final void precompose(Object obj, my myVar, boolean z) {
        if (this.root.isAttached()) {
            makeSureStateIsConsistent();
            if (this.slotIdToNode.b(obj)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.j(obj);
            fb0 fb0Var = this.precomposeMap;
            Object d = fb0Var.d(obj);
            if (d == null) {
                d = takeNodeFromReusables(obj);
                LayoutNode layoutNode = this.root;
                if (d != null) {
                    move(layoutNode.getFoldedChildren$ui().indexOf(d), this.root.getFoldedChildren$ui().size(), 1);
                    this.precomposedCount++;
                } else {
                    d = createNodeAt(layoutNode.getFoldedChildren$ui().size());
                    this.precomposedCount++;
                }
                fb0Var.l(obj, d);
            }
            subcompose((LayoutNode) d, obj, z, myVar);
        }
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui.setMeasuredByParent$ui(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui != null) {
            lookaheadPassDelegate$ui.setMeasuredByParent$ui(usageByParent);
        }
    }

    private final void reuseComposition(NodeState nodeState, boolean z) {
        ReusableComposition composition;
        if (z || !nodeState.getComposedWithReusableContentHost()) {
            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
        } else {
            nodeState.setActive(false);
        }
        if (nodeState.getPausedComposition() != null) {
            cancelPausedPrecomposition(nodeState);
            return;
        }
        if (z) {
            ReusableComposition composition2 = nodeState.getComposition();
            if (composition2 != null) {
                composition2.deactivate();
                return;
            }
            return;
        }
        OutOfFrameExecutor outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            deactivateOutOfFrame(nodeState, outOfFrameExecutor);
        } else {
            if (nodeState.getComposedWithReusableContentHost() || (composition = nodeState.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i;
        SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (q10.b(getSlotIdAtIndex(foldedChildren$ui, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object d = this.nodeToNodeState.d(foldedChildren$ui.get(i3));
                d.getClass();
                NodeState nodeState = (NodeState) d;
                Object slotId = nodeState.getSlotId();
                subcomposeLayoutKt$ReusedSlotId$1 = SubcomposeLayoutKt.ReusedSlotId;
                if (slotId == subcomposeLayoutKt$ReusedSlotId$1 || this.slotReusePolicy.areCompatible(obj, nodeState.getSlotId())) {
                    nodeState.setSlotId(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui.get(i2);
        Object d2 = this.nodeToNodeState.d(layoutNode);
        d2.getClass();
        NodeState nodeState2 = (NodeState) d2;
        nodeState2.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null));
        nodeState2.setForceReuse(true);
        nodeState2.setForceRecompose(true);
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final my myVar) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                LayoutNodeSubcompositionsState.ApproachMeasureScopeImpl approachMeasureScopeImpl;
                final int i;
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) myVar.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m7551boximpl(j));
                    final int i2 = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResult.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResult.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public ky getRulers() {
                            return measureResult.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResult.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i2;
                            measureResult.placeChildren();
                            if (layoutNodeSubcompositionsState.root.getLookaheadRoot$ui() == null) {
                                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                                layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                            }
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                my myVar2 = myVar;
                approachMeasureScopeImpl = LayoutNodeSubcompositionsState.this.approachMeasureScope;
                final MeasureResult measureResult2 = (MeasureResult) myVar2.invoke(approachMeasureScopeImpl, Constraints.m7551boximpl(j));
                i = LayoutNodeSubcompositionsState.this.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResult2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResult2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public ky getRulers() {
                        return measureResult2.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResult2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i;
                        measureResult2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        boolean z = false;
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = (foldedChildren$ui.size() - this.precomposedCount) - 1;
        if (i <= size) {
            this.reusableSlotIdsSet.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z2 = false;
            while (size >= i) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(size);
                    Object d = this.nodeToNodeState.d(layoutNode);
                    d.getClass();
                    NodeState nodeState = (NodeState) d;
                    Object slotId = nodeState.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState.getActive()) {
                            resetLayoutState(layoutNode);
                            reuseComposition(nodeState, false);
                            if (nodeState.getComposedWithReusableContentHost()) {
                                z2 = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.j(layoutNode);
                        ReusableComposition composition = nodeState.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.j(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            z = z2;
        }
        if (z) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui().size()) {
            fb0 fb0Var = this.nodeToNodeState;
            Object[] objArr = fb0Var.c;
            long[] jArr = fb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((NodeState) objArr[(i << 3) + i3]).setForceRecompose(true);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            LayoutNode lookaheadRoot$ui = this.root.getLookaheadRoot$ui();
            LayoutNode layoutNode = this.root;
            if (lookaheadRoot$ui != null) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    return;
                }
                LayoutNode.requestLookaheadRemeasure$ui$default(this.root, false, false, false, 7, null);
            } else {
                if (layoutNode.getMeasurePending$ui()) {
                    return;
                }
                LayoutNode.requestRemeasure$ui$default(this.root, false, false, false, 7, null);
            }
        }
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui().size();
        if (!(this.nodeToNodeState.e == size)) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            StringBuilder f = kp0.f(size, "Incorrect state. Total children ", ". Reusable children ");
            f.append(this.reusableCount);
            f.append(". Precomposed children ");
            f.append(this.precomposedCount);
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        if (this.precomposeMap.e == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.e);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final SubcomposeLayoutState.PausedPrecomposition precomposePaused(final Object obj, my myVar) {
        if (!this.root.isAttached()) {
            return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precomposePaused$1
                private final boolean isComplete = true;

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                    SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle;
                    createPrecomposedSlotHandle = LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
                    return createPrecomposedSlotHandle;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean isComplete() {
                    return this.isComplete;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean resume(ShouldPauseCallback shouldPauseCallback) {
                    return true;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public void cancel() {
                }
            };
        }
        precompose(obj, myVar, true);
        return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precomposePaused$2
            private final LayoutNodeSubcompositionsState.NodeState getNodeState() {
                fb0 fb0Var;
                fb0 fb0Var2;
                fb0Var = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) fb0Var.d(obj);
                if (layoutNode == null) {
                    return null;
                }
                fb0Var2 = LayoutNodeSubcompositionsState.this.nodeToNodeState;
                return (LayoutNodeSubcompositionsState.NodeState) fb0Var2.d(layoutNode);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle;
                LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
                if (nodeState != null) {
                    LayoutNodeSubcompositionsState.this.applyPausedPrecomposition(nodeState, false);
                }
                createPrecomposedSlotHandle = LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
                return createPrecomposedSlotHandle;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public void cancel() {
                LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
                if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                    LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean isComplete() {
                PausedComposition pausedComposition;
                LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
                if (nodeState == null || (pausedComposition = nodeState.getPausedComposition()) == null) {
                    return true;
                }
                return pausedComposition.isComplete();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean resume(ShouldPauseCallback shouldPauseCallback) {
                LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
                PausedComposition pausedComposition = nodeState != null ? nodeState.getPausedComposition() : null;
                if (pausedComposition == null || pausedComposition.isComplete()) {
                    return true;
                }
                Snapshot.Companion companion = Snapshot.Companion;
                Object obj2 = obj;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    boolean resume = pausedComposition.resume(shouldPauseCallback);
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    return resume;
                } catch (Throwable th) {
                    try {
                        if (nodeState.getOperations() != null) {
                            throw new SubcomposeLayoutPausableCompositionException(nodeState.getOperations(), obj2, th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th2;
                    }
                }
            }
        };
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui$default(this.root, false, false, false, 7, null);
        }
    }

    public final List<Measurable> subcompose(Object obj, my myVar) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState;
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui = this.root.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (!(layoutState$ui == layoutState || layoutState$ui == LayoutNode.LayoutState.LayingOut || layoutState$ui == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui == LayoutNode.LayoutState.LookaheadLayingOut)) {
            InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        fb0 fb0Var = this.slotIdToNode;
        Object d = fb0Var.d(obj);
        if (d == null) {
            d = (LayoutNode) this.precomposeMap.j(obj);
            if (d != null) {
                if (!(this.precomposedCount > 0)) {
                    InlineClassHelperKt.throwIllegalStateException("Check failed.");
                }
                this.precomposedCount--;
            } else {
                d = takeNodeFromReusables(obj);
                if (d == null) {
                    d = createNodeAt(this.currentIndex);
                }
            }
            fb0Var.l(obj, d);
        }
        LayoutNode layoutNode = (LayoutNode) d;
        if (yi.r0(this.root.getFoldedChildren$ui(), this.currentIndex) != layoutNode) {
            int indexOf = this.root.getFoldedChildren$ui().indexOf(layoutNode);
            if (!(indexOf >= this.currentIndex)) {
                InlineClassHelperKt.throwIllegalArgumentException("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i = this.currentIndex;
            if (i != indexOf) {
                layoutNodeSubcompositionsState = this;
                move$default(layoutNodeSubcompositionsState, indexOf, i, 0, 4, null);
                layoutNodeSubcompositionsState.currentIndex++;
                layoutNodeSubcompositionsState.subcompose(layoutNode, obj, false, myVar);
                return (layoutState$ui != layoutState || layoutState$ui == LayoutNode.LayoutState.LayingOut) ? layoutNode.getChildMeasurables$ui() : layoutNode.getChildLookaheadMeasurables$ui();
            }
        }
        layoutNodeSubcompositionsState = this;
        layoutNodeSubcompositionsState.currentIndex++;
        layoutNodeSubcompositionsState.subcompose(layoutNode, obj, false, myVar);
        if (layoutState$ui != layoutState) {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar) {
            return this.$$delegate_0.layout(i, i2, map, kyVar);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo360roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo360roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo361roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo361roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, my myVar) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.d(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(obj, myVar) : layoutNode.getChildMeasurables$ui();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo362toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo362toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo363toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo363toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo365toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo365toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo366toPxR2X_6o(long j) {
            return this.$$delegate_0.mo366toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo367toPx0680j_4(float f) {
            return this.$$delegate_0.mo367toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo368toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo369toSp0xMU5do(float f) {
            return this.$$delegate_0.mo369toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo370toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo370toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar, ky kyVar2) {
            return this.$$delegate_0.layout(i, i2, map, kyVar, kyVar2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo364toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo364toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo371toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo371toSpkPz2Gy4(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NodeState {
        private MutableState<Boolean> activeState;
        private boolean composedWithReusableContentHost;
        private ReusableComposition composition;
        private my content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private final ma0 operations;
        private PausedComposition pausedComposition;
        private Object slotId;

        public NodeState(Object obj, my myVar, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = myVar;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.operations = null;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final boolean getComposedWithReusableContentHost() {
            return this.composedWithReusableContentHost;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final my getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final ma0 getOperations() {
            return this.operations;
        }

        public final PausedComposition getPausedComposition() {
            return this.pausedComposition;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        /* renamed from: record-Fsph7yY, reason: not valid java name */
        public final void m6260recordFsph7yY(int i) {
            ma0 ma0Var = this.operations;
            if (ma0Var == null) {
                return;
            }
            ma0Var.e(i);
            if (ma0Var.b >= 50) {
                ma0Var.h(0, 10);
            }
        }

        public final void setActive(boolean z) {
            this.activeState.setValue(Boolean.valueOf(z));
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposedWithReusableContentHost(boolean z) {
            this.composedWithReusableContentHost = z;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(my myVar) {
            this.content = myVar;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setForceReuse(boolean z) {
            this.forceReuse = z;
        }

        public final void setPausedComposition(PausedComposition pausedComposition) {
            this.pausedComposition = pausedComposition;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, my myVar, ReusableComposition reusableComposition, int i, dq dqVar) {
            this(obj, myVar, (i & 4) != 0 ? null : reusableComposition);
        }
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(Object obj, my myVar) {
        precompose(obj, myVar, false);
        return createPrecomposedSlotHandle(obj);
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, boolean z, my myVar) {
        fb0 fb0Var = this.nodeToNodeState;
        Object d = fb0Var.d(layoutNode);
        if (d == null) {
            NodeState nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.getLambda$641200809$ui(), null, 4, null);
            fb0Var.l(layoutNode, nodeState);
            d = nodeState;
        }
        NodeState nodeState2 = (NodeState) d;
        boolean z2 = nodeState2.getContent() != myVar;
        if (nodeState2.getPausedComposition() != null) {
            if (z2) {
                cancelPausedPrecomposition(nodeState2);
            } else if (z) {
                return;
            } else {
                applyPausedPrecomposition(nodeState2, true);
            }
        }
        ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (z2 || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(myVar);
            subcompose(layoutNode, nodeState2, z);
            nodeState2.setForceRecompose(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0024, B:14:0x0033, B:17:0x0048, B:19:0x0055, B:21:0x006a, B:23:0x0076, B:24:0x0097, B:28:0x0080, B:29:0x008a, B:31:0x0090, B:32:0x0094, B:33:0x0059, B:35:0x003f, B:36:0x0044, B:37:0x00a1, B:38:0x00ab), top: B:10:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0024, B:14:0x0033, B:17:0x0048, B:19:0x0055, B:21:0x006a, B:23:0x0076, B:24:0x0097, B:28:0x0080, B:29:0x008a, B:31:0x0090, B:32:0x0094, B:33:0x0059, B:35:0x003f, B:36:0x0044, B:37:0x00a1, B:38:0x00ab), top: B:10:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0024, B:14:0x0033, B:17:0x0048, B:19:0x0055, B:21:0x006a, B:23:0x0076, B:24:0x0097, B:28:0x0080, B:29:0x008a, B:31:0x0090, B:32:0x0094, B:33:0x0059, B:35:0x003f, B:36:0x0044, B:37:0x00a1, B:38:0x00ab), top: B:10:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0024, B:14:0x0033, B:17:0x0048, B:19:0x0055, B:21:0x006a, B:23:0x0076, B:24:0x0097, B:28:0x0080, B:29:0x008a, B:31:0x0090, B:32:0x0094, B:33:0x0059, B:35:0x003f, B:36:0x0044, B:37:0x00a1, B:38:0x00ab), top: B:10:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void subcompose(LayoutNode layoutNode, NodeState nodeState, boolean z) {
        if (!(nodeState.getPausedComposition() == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("new subcompose call while paused composition is still active");
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                if (composition != null) {
                    if (composition.isDisposed()) {
                    }
                    nodeState.setComposition(composition);
                    my content = nodeState.getContent();
                    if (getOutOfFrameExecutor() == null) {
                        nodeState.setComposedWithReusableContentHost(false);
                    } else {
                        nodeState.setComposedWithReusableContentHost(true);
                        content = ComposableLambdaKt.composableLambdaInstance(1524156494, true, new LayoutNodeSubcompositionsState$subcompose$4$1$composable$1(nodeState, content));
                    }
                    if (!z) {
                        composition.getClass();
                        if (nodeState.getForceReuse()) {
                            nodeState.setPausedComposition(((PausableComposition) composition).setPausableContentWithReuse(content));
                        } else {
                            nodeState.setPausedComposition(((PausableComposition) composition).setPausableContent(content));
                        }
                    } else if (nodeState.getForceReuse()) {
                        composition.setContentWithReuse(content);
                    } else {
                        composition.setContent(content);
                    }
                    nodeState.setForceReuse(false);
                    layoutNode2.ignoreRemeasureRequests = false;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    return;
                }
                if (z) {
                    composition = SubcompositionKt.createPausableSubcomposition(layoutNode, compositionContext);
                } else {
                    composition = SubcompositionKt.createSubcomposition(layoutNode, compositionContext);
                }
                nodeState.setComposition(composition);
                my content2 = nodeState.getContent();
                if (getOutOfFrameExecutor() == null) {
                }
                if (!z) {
                }
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
            throw new tj();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
