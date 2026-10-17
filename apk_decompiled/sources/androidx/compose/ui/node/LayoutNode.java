package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.bu;
import defpackage.dq;
import defpackage.er;
import defpackage.iy;
import defpackage.ji0;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.y5;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean addedToRectList;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private int globallyPositionedObservers;
    private boolean hasPositionalLayerTransformationsInOffsetFromRoot;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnGloballyPositionedDispatch;
    private final NodeChain nodes;
    private ky onAttach;
    private ky onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private boolean rectInParentDirty;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m6475measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m6475measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }
    };
    private static final iy Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo6474getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m7719getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new y5(3);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LayoutState {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Measuring = new LayoutState("Measuring", 0);
        public static final LayoutState LookaheadMeasuring = new LayoutState("LookaheadMeasuring", 1);
        public static final LayoutState LayingOut = new LayoutState("LayingOut", 2);
        public static final LayoutState LookaheadLayingOut = new LayoutState("LookaheadLayingOut", 3);
        public static final LayoutState Idle = new LayoutState("Idle", 4);

        private static final /* synthetic */ LayoutState[] $values() {
            return new LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        static {
            LayoutState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private LayoutState(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UsageByParent {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InMeasureBlock = new UsageByParent("InMeasureBlock", 0);
        public static final UsageByParent InLayoutBlock = new UsageByParent("InLayoutBlock", 1);
        public static final UsageByParent NotUsed = new UsageByParent("NotUsed", 2);

        private static final /* synthetic */ UsageByParent[] $values() {
            return new UsageByParent[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        static {
            UsageByParent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private UsageByParent(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode(boolean z, int i) {
        Density density;
        this.isVirtual = z;
        this.semanticsId = i;
        this.outerToInnerOffset = IntOffset.Companion.m7749getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this.rectInParentDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        density = LayoutNodeKt.DefaultDensity;
        this.density = density;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$0(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? q10.h(layoutNode.getPlaceOrder$ui(), layoutNode2.getPlaceOrder$ui()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void applyModifier(Modifier modifier) {
        boolean m6528hasH91voCI$ui = this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(16));
        boolean m6528hasH91voCI$ui2 = this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationZ));
        this._modifier = modifier;
        this.nodes.updateFrom$ui(modifier);
        boolean m6528hasH91voCI$ui3 = this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(16));
        boolean m6528hasH91voCI$ui4 = this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationZ));
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationY))) {
            setLookaheadRoot(this);
        }
        if (m6528hasH91voCI$ui == m6528hasH91voCI$ui3 && m6528hasH91voCI$ui2 == m6528hasH91voCI$ui4) {
            return;
        }
        LayoutNodeKt.requireOwner(this).getRectManager().updateFlagsFor(this, m6528hasH91voCI$ui4, m6528hasH91voCI$ui3);
    }

    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        ji0 ji0Var = new ji0();
        ji0Var.d = new SemanticsConfiguration();
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(this).getSnapshotObserver();
        LayoutNode$calculateSemanticsConfiguration$1 layoutNode$calculateSemanticsConfiguration$1 = new LayoutNode$calculateSemanticsConfiguration$1(this, ji0Var);
        snapshotObserver.observer.observeReads(this, snapshotObserver.onCommitAffectingSemantics, layoutNode$calculateSemanticsConfiguration$1);
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) ji0Var.d;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    private final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(layoutNodeArr[i3].debugTreeToString(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(debugTreeToString$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        sb.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
        return sb.toString();
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    private final CompositionErrorContext getTraceContext() {
        return (CompositionErrorContext) getCompositionLocalMap().get(CompositionErrorContextKt.getLocalCompositionErrorContext());
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui().getZIndex$ui();
    }

    /* renamed from: hitTest-6fMxITs$ui$default, reason: not valid java name */
    public static /* synthetic */ void m6464hitTest6fMxITs$ui$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.Companion.m6182getUnknownT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m6469hitTest6fMxITs$ui(j, hitTestResult, i3, z);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui$default, reason: not valid java name */
    public static /* synthetic */ void m6465hitTestSemantics6fMxITs$ui$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.Companion.m6181getTouchT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m6470hitTestSemantics6fMxITs$ui(j, hitTestResult, i3, z);
    }

    public static /* synthetic */ void invalidateDrawForSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateDrawForSubtree(z);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui$default, reason: not valid java name */
    public static /* synthetic */ boolean m6466lookaheadRemeasure_Sx5XlM$ui$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m6485getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m6471lookaheadRemeasure_Sx5XlM$ui(constraints);
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui();
        }
        layoutNode._foldedParent = null;
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers - 1);
        }
        layoutNode.getOuterCoordinator$ui().setWrappedBy$ui(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i = 0; i < size; i++) {
                layoutNodeArr[i].getOuterCoordinator$ui().setWrappedBy$ui(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui();
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
        } else {
            Owner owner = this.owner;
            if (owner != null) {
                owner.invalidateRootLayer();
            }
        }
        invalidateLayers$ui();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode = layoutNodeArr[i];
                if (layoutNode.isVirtual) {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui());
                } else {
                    mutableVector.add(layoutNode);
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui$default, reason: not valid java name */
    public static /* synthetic */ boolean m6467remeasure_Sx5XlM$ui$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m6484getLastConstraintsDWUhwKw();
        }
        return layoutNode.m6472remeasure_Sx5XlM$ui(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui(z);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui(z, z2, z3);
    }

    public static /* synthetic */ void requestRelayout$ui$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui(z);
    }

    public static /* synthetic */ void requestRemeasure$ui$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestRemeasure$ui(z, z2, z3);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (q10.b(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNode != null) {
            layoutNodeLayoutDelegate.ensureLookaheadDelegateCreated$ui();
            NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
            for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !q10.b(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
                outerCoordinator$ui.ensureLookaheadDelegateCreated();
            }
        } else {
            layoutNodeLayoutDelegate.onRemovedFromLookaheadScope();
        }
        invalidateMeasurements$ui();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106 A[LOOP:0: B:45:0x0104->B:46:0x0106, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attach$ui(Owner owner) {
        boolean z;
        LayoutNode parent$ui;
        Modifier modifier;
        LayoutNode layoutNode;
        int size;
        ky kyVar;
        if (!(this.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 != null) {
            if (!q10.b(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
                z = false;
                if (!z) {
                    StringBuilder sb = new StringBuilder("Attaching to a different owner(");
                    sb.append(owner);
                    sb.append(") than the parent's owner(");
                    LayoutNode parent$ui2 = getParent$ui();
                    sb.append(parent$ui2 != null ? parent$ui2.owner : null);
                    sb.append("). This tree: ");
                    sb.append(debugTreeToString$default(this, 0, 1, null));
                    sb.append(" Parent tree: ");
                    LayoutNode layoutNode3 = this._foldedParent;
                    sb.append(layoutNode3 != null ? debugTreeToString$default(layoutNode3, 0, 1, null) : null);
                    InlineClassHelperKt.throwIllegalStateException(sb.toString());
                }
                parent$ui = getParent$ui();
                if (parent$ui == null) {
                    getMeasurePassDelegate$ui().setPlaced$ui(true);
                    owner.getRectManager().recalculateRectIfDirty(this);
                    LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
                    if (lookaheadPassDelegate$ui != null) {
                        lookaheadPassDelegate$ui.onAttachedToNullParent();
                    }
                }
                getOuterCoordinator$ui().setWrappedBy$ui(parent$ui == null ? parent$ui.getInnerCoordinator$ui() : null);
                this.owner = owner;
                this.depth = (parent$ui == null ? parent$ui.depth : -1) + 1;
                modifier = this.pendingModifier;
                if (modifier != null) {
                    applyModifier(modifier);
                }
                this.pendingModifier = null;
                owner.onPreAttach(this);
                if (this.isVirtualLookaheadRoot) {
                    LayoutNode layoutNode4 = this._foldedParent;
                    if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                        layoutNode = this.lookaheadRoot;
                    }
                    setLookaheadRoot(layoutNode);
                    if (this.lookaheadRoot == null && this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(Fields.RotationY))) {
                        setLookaheadRoot(this);
                    }
                } else {
                    setLookaheadRoot(this);
                }
                if (!isDeactivated()) {
                    this.nodes.markAsAttached();
                }
                MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
                LayoutNode[] layoutNodeArr = vector.content;
                size = vector.getSize();
                for (int i = 0; i < size; i++) {
                    layoutNodeArr[i].attach$ui(owner);
                }
                if (!isDeactivated()) {
                    this.nodes.runAttachLifecycle();
                }
                invalidateMeasurements$ui();
                if (parent$ui != null) {
                    parent$ui.invalidateMeasurements$ui();
                }
                kyVar = this.onAttach;
                if (kyVar != null) {
                    kyVar.invoke(owner);
                }
                this.layoutDelegate.updateParentData();
                if (!isDeactivated() && this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                    invalidateSemantics$ui();
                }
                owner.onPostAttach(this);
            }
        }
        z = true;
        if (!z) {
        }
        parent$ui = getParent$ui();
        if (parent$ui == null) {
        }
        getOuterCoordinator$ui().setWrappedBy$ui(parent$ui == null ? parent$ui.getInnerCoordinator$ui() : null);
        this.owner = owner;
        this.depth = (parent$ui == null ? parent$ui.depth : -1) + 1;
        modifier = this.pendingModifier;
        if (modifier != null) {
        }
        this.pendingModifier = null;
        owner.onPreAttach(this);
        if (this.isVirtualLookaheadRoot) {
        }
        if (!isDeactivated()) {
        }
        MutableVector<LayoutNode> vector2 = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr2 = vector2.content;
        size = vector2.getSize();
        while (i < size) {
        }
        if (!isDeactivated()) {
        }
        invalidateMeasurements$ui();
        if (parent$ui != null) {
        }
        kyVar = this.onAttach;
        if (kyVar != null) {
        }
        this.layoutDelegate.updateParentData();
        if (!isDeactivated()) {
            invalidateSemantics$ui();
        }
        owner.onPostAttach(this);
    }

    public final void clearSubtreeIntrinsicsUsage$ui() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    public final void detach$ui() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui = getParent$ui();
            sb.append(parent$ui != null ? debugTreeToString$default(parent$ui, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
            o.j();
            return;
        }
        LayoutNode parent$ui2 = getParent$ui();
        if (parent$ui2 != null) {
            parent$ui2.invalidateLayer$ui();
            parent$ui2.invalidateMeasurements$ui();
            MeasurePassDelegate measurePassDelegate$ui = getMeasurePassDelegate$ui();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui.setMeasuredByParent$ui(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.setMeasuredByParent$ui(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !q10.b(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            outerCoordinator$ui.onLayoutNodeDetach();
        }
        ky kyVar = this.onDetach;
        if (kyVar != null) {
            kyVar.invoke(owner);
        }
        this.nodes.runDetachLifecycle$ui();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].detach$ui();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui();
        owner.onDetach(this);
        owner.getRectManager().remove(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui2 = getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui2 != null) {
            lookaheadPassDelegate$ui2.onNodeDetached();
        }
        if (this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
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
    public final void dispatchOnPositionedCallbacks$ui() {
        if (getLayoutState$ui() != LayoutState.Idle || getLayoutPending$ui() || getMeasurePending$ui() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationX);
        if ((nodeChain.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m6414requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m6573constructorimpl(Fields.RotationX)));
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
                    return;
                }
            }
        }
    }

    public final void draw$ui(Canvas canvas, GraphicsLayer graphicsLayer) {
        try {
            getOuterCoordinator$ui().draw(canvas, graphicsLayer);
        } catch (Throwable th) {
            rethrowWithComposeStackTrace(th);
            o.j();
        }
    }

    public final void forEachChild(ky kyVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(layoutNodeArr[i]);
        }
    }

    public final void forEachChildIndexed(my myVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            myVar.invoke(Integer.valueOf(i), layoutNodeArr[i]);
        }
    }

    public final void forEachCoordinator$ui(ky kyVar) {
        NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui();
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        while (outerCoordinator$ui != innerCoordinator$ui) {
            outerCoordinator$ui.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui;
            kyVar.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui = layoutModifierNodeCoordinator.getWrapped$ui();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui(ky kyVar) {
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !q10.b(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            kyVar.invoke(outerCoordinator$ui);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            requestLookaheadRemeasure$ui$default(layoutNode, false, false, false, 5, null);
        } else {
            layoutNode = this;
            requestRemeasure$ui$default(layoutNode, false, false, false, 5, null);
        }
        Constraints m6484getLastConstraintsDWUhwKw = layoutNode.layoutDelegate.m6484getLastConstraintsDWUhwKw();
        Owner owner = layoutNode.owner;
        if (m6484getLastConstraintsDWUhwKw != null) {
            if (owner != null) {
                owner.mo6640measureAndLayout0kLqBqw(layoutNode, m6484getLastConstraintsDWUhwKw.m7570unboximpl());
            }
        } else if (owner != null) {
            Owner.measureAndLayout$default(owner, false, 1, null);
        }
    }

    public final boolean getAddedToRectList$ui() {
        return this.addedToRectList;
    }

    public final boolean getAlignmentLinesRequired$ui() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui() || !((lookaheadAlignmentLinesOwner$ui = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui());
    }

    public final boolean getApplyingModifierOnAttach$ui() {
        return this.pendingModifier != null;
    }

    public final boolean getCanMultiMeasure$ui() {
        return this.canMultiMeasure;
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui() {
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        return lookaheadPassDelegate$ui.getChildDelegates$ui();
    }

    public final List<Measurable> getChildMeasurables$ui() {
        return getMeasurePassDelegate$ui().getChildDelegates$ui();
    }

    public final List<LayoutNode> getChildren$ui() {
        return get_children$ui().asMutableList();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui() {
        return this.depth;
    }

    public final List<LayoutNode> getFoldedChildren$ui() {
        return this._foldedChildren.getVector().asMutableList();
    }

    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final boolean getHasFixedInnerContentConstraints$ui() {
        long m6552getLastMeasurementConstraintsmsEJaDk$ui = getInnerCoordinator$ui().m6552getLastMeasurementConstraintsmsEJaDk$ui();
        return Constraints.m7562getHasFixedWidthimpl(m6552getLastMeasurementConstraintsmsEJaDk$ui) && Constraints.m7561getHasFixedHeightimpl(m6552getLastMeasurementConstraintsmsEJaDk$ui);
    }

    public final boolean getHasPositionalLayerTransformationsInOffsetFromRoot$ui() {
        return this.hasPositionalLayerTransformationsInOffsetFromRoot;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui();
    }

    public final NodeCoordinator getInnerCoordinator$ui() {
        return this.nodes.getInnerCoordinator$ui();
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
            NodeCoordinator wrappedBy$ui = getOuterCoordinator$ui().getWrappedBy$ui();
            this._innerLayerCoordinator = null;
            while (true) {
                if (q10.b(innerCoordinator$ui, wrappedBy$ui)) {
                    break;
                }
                if ((innerCoordinator$ui != null ? innerCoordinator$ui.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui;
                    break;
                }
                innerCoordinator$ui = innerCoordinator$ui != null ? innerCoordinator$ui.getWrappedBy$ui() : null;
            }
            this.innerLayerCoordinatorIsDirty = false;
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw k4.a("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui() {
        return this.interopViewFactoryHolder;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui() {
        return this.intrinsicsUsageByParent;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui() {
        return this.layoutDelegate.getLayoutPending$ui();
    }

    public final LayoutState getLayoutState$ui() {
        return this.layoutDelegate.getLayoutState$ui();
    }

    public final boolean getLookaheadLayoutPending$ui() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui();
    }

    public final boolean getLookaheadMeasurePending$ui() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui();
    }

    public final LayoutNode getLookaheadRoot$ui() {
        return this.lookaheadRoot;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.layoutDelegate.getMeasurePassDelegate$ui();
    }

    public final boolean getMeasurePending$ui() {
        return this.layoutDelegate.getMeasurePending$ui();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui() {
        return getMeasurePassDelegate$ui().getMeasuredByParent$ui();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui() {
        UsageByParent measuredByParent$ui;
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        return (lookaheadPassDelegate$ui == null || (measuredByParent$ui = lookaheadPassDelegate$ui.getMeasuredByParent$ui()) == null) ? UsageByParent.NotUsed : measuredByParent$ui;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this._modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnGloballyPositionedDispatch$ui() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final NodeChain getNodes$ui() {
        return this.nodes;
    }

    public final ky getOnAttach$ui() {
        return this.onAttach;
    }

    public final ky getOnDetach$ui() {
        return this.onDetach;
    }

    public final NodeCoordinator getOuterCoordinator$ui() {
        return this.nodes.getOuterCoordinator$ui();
    }

    /* renamed from: getOuterToInnerOffset-nOcc-ac$ui, reason: not valid java name */
    public final long m6468getOuterToInnerOffsetnOccac$ui() {
        return this.outerToInnerOffset;
    }

    public final boolean getOuterToInnerOffsetDirty$ui() {
        return this.outerToInnerOffsetDirty;
    }

    public final Owner getOwner$ui() {
        return this.owner;
    }

    public final LayoutNode getParent$ui() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui() {
        return getMeasurePassDelegate$ui().getPlaceOrder();
    }

    public final boolean getRectInParentDirty$ui() {
        return this.rectInParentDirty;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (isAttached() && !isDeactivated() && this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
            return this._semanticsConfiguration;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui();
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final MutableVector<LayoutNode> get_children$ui() {
        updateChildrenIfDirty$ui();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        mutableVector.getClass();
        return mutableVector;
    }

    /* renamed from: hitTest-6fMxITs$ui, reason: not valid java name */
    public final void m6469hitTest6fMxITs$ui(long j, HitTestResult hitTestResult, int i, boolean z) {
        getOuterCoordinator$ui().m6555hitTestqzLsGqo(NodeCoordinator.Companion.getPointerInputSource(), NodeCoordinator.m6536fromParentPosition8S9VItk$default(getOuterCoordinator$ui(), j, false, 2, null), hitTestResult, i, z);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui, reason: not valid java name */
    public final void m6470hitTestSemantics6fMxITs$ui(long j, HitTestResult hitTestResult, int i, boolean z) {
        getOuterCoordinator$ui().m6555hitTestqzLsGqo(NodeCoordinator.Companion.getSemanticsSource(), NodeCoordinator.m6536fromParentPosition8S9VItk$default(getOuterCoordinator$ui(), j, false, 2, null), hitTestResult, PointerType.Companion.m6181getTouchT8wyACA(), z);
    }

    public final <T> T ignoreRemeasureRequests$ui(iy iyVar) {
        this.ignoreRemeasureRequests = true;
        T t = (T) iyVar.invoke();
        this.ignoreRemeasureRequests = false;
        return t;
    }

    public final void insertAt$ui(int i, LayoutNode layoutNode) {
        if (!(layoutNode._foldedParent == null || layoutNode.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(layoutNode));
        }
        layoutNode._foldedParent = this;
        this._foldedChildren.add(i, layoutNode);
        onZSortedChildrenInvalidated$ui();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui(owner);
        }
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void invalidateDrawForSubtree(boolean z) {
        if (z) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            } else {
                Owner owner = this.owner;
                if (owner != null) {
                    owner.invalidateRootLayer();
                }
            }
        }
        NodeChain nodeChain = this.nodes;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m6414requireCoordinator64DMado((LayoutModifierNode) delegatingNode, NodeKind.m6573constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
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
        MutableVector<LayoutNode> mutableVector2 = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2].invalidateDrawForSubtree(false);
        }
    }

    public final void invalidateLayer$ui() {
        NodeCoordinator innerLayerCoordinator$ui = getInnerLayerCoordinator$ui();
        if (innerLayerCoordinator$ui != null) {
            innerLayerCoordinator$ui.invalidateLayer();
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
            return;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.invalidateRootLayer();
        }
    }

    public final void invalidateLayers$ui() {
        NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui();
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        while (outerCoordinator$ui != innerCoordinator$ui) {
            outerCoordinator$ui.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui = layoutModifierNodeCoordinator.getWrapped$ui();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurementForSubtree() {
        requestRemeasure$ui$default(this, false, false, false, 7, null);
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].invalidateMeasurementForSubtree();
        }
    }

    public final void invalidateMeasurements$ui() {
        if (this.isVirtual) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateMeasurements$ui();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui() {
        if (this.globallyPositionedObservers == 0 || getLayoutPending$ui() || getMeasurePending$ui() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    public final void invalidateParentData$ui() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (this.nodes.isUpdating$ui() || getApplyingModifierOnAttach$ui()) {
            this.isSemanticsInvalidated = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
        this._semanticsConfiguration = calculateSemanticsConfiguration();
        this.isSemanticsInvalidated = false;
        Owner requireOwner = LayoutNodeKt.requireOwner(this);
        requireOwner.getSemanticsOwner().notifySemanticsChange$ui(this, semanticsConfiguration);
        requireOwner.onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void invalidateSubtree(boolean z) {
        if (z) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            } else {
                Owner owner = this.owner;
                if (owner != null) {
                    owner.invalidateRootLayer();
                }
            }
        }
        invalidateSemantics$ui();
        requestRemeasure$ui$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m6414requireCoordinator64DMado((LayoutModifierNode) delegatingNode, NodeKind.m6573constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
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
        MutableVector<LayoutNode> mutableVector2 = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2].invalidateSubtree(false);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui().isPlaced$ui();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui().isPlacedByParent();
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui.isPlaced$ui());
        }
        return null;
    }

    public final boolean isSemanticsInvalidated$ui() {
        return this.isSemanticsInvalidated;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui().isTransparent();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui, reason: not valid java name */
    public final boolean m6471lookaheadRemeasure_Sx5XlM$ui(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        return lookaheadPassDelegate$ui.m6506remeasureBRTryo0(constraints.m7570unboximpl());
    }

    public final void lookaheadReplace$ui() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        lookaheadPassDelegate$ui.replace();
    }

    public final void markLayoutPending$ui() {
        this.layoutDelegate.markLayoutPending$ui();
    }

    public final void markLookaheadLayoutPending$ui() {
        this.layoutDelegate.markLookaheadLayoutPending$ui();
    }

    public final void markLookaheadMeasurePending$ui() {
        this.layoutDelegate.markLookaheadMeasurePending$ui();
    }

    public final void markMeasurePending$ui() {
        this.layoutDelegate.markMeasurePending$ui();
    }

    public final int maxIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i);
    }

    public final int minIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i);
    }

    public final int minIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i);
    }

    public final void move$ui(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this._foldedChildren.add(i > i2 ? i2 + i4 : (i2 + i3) - 2, this._foldedChildren.removeAt(i > i2 ? i + i4 : i));
        }
        onZSortedChildrenInvalidated$ui();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui();
    }

    public final void onCoordinatorRectChanged$ui(NodeCoordinator nodeCoordinator) {
        Owner owner = this.owner;
        RectManager rectManager = owner != null ? owner.getRectManager() : null;
        boolean z = getLayoutState$ui() != LayoutState.Idle || getMeasurePending$ui() || getLayoutPending$ui();
        if (this.addedToRectList && rectManager != null) {
            if (nodeCoordinator == getOuterCoordinator$ui()) {
                this.rectInParentDirty = true;
                if (!z) {
                    rectManager.recalculateRectIfDirty(this);
                }
            } else {
                this.outerToInnerOffsetDirty = true;
                MutableVector<LayoutNode> mutableVector = get_children$ui();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = layoutNodeArr[i];
                    layoutNode.rectInParentDirty = true;
                    if (!z) {
                        rectManager.recalculateRectIfDirty(layoutNode);
                    }
                }
                rectManager.invalidateCallbacksFor(this);
            }
        }
        this.layoutDelegate.getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
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
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4194304);
        boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
        Modifier.Node tail = innerCoordinator$ui.getTail();
        if (!m6582getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode = innerCoordinator$ui.headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                DelegatingNode delegatingNode = headNode;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(getInnerCoordinator$ui());
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

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !q10.b(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            outerCoordinator$ui.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        RectManager rectManager;
        RectManager rectManager2;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (isDeactivated()) {
            this.isDeactivated = false;
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        Owner owner = this.owner;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.remove(this);
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPreLayoutNodeReused(this, semanticsId);
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (this.nodes.m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
            invalidateSemantics$ui();
        }
        rescheduleRemeasureOrRelayout$ui(this);
        Owner owner3 = this.owner;
        if (owner3 != null) {
            owner3.onPostLayoutNodeReused(this, semanticsId);
        }
        Owner owner4 = this.owner;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.recalculateRectIfDirty(this);
    }

    public final void onZSortedChildrenInvalidated$ui() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.onZSortedChildrenInvalidated$ui();
        }
    }

    public final void place$ui(int i, int i2) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui == null || (innerCoordinator$ui = parent$ui.getInnerCoordinator$ui()) == null || (placementScope = innerCoordinator$ui.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui(), i, i2, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui, reason: not valid java name */
    public final boolean m6472remeasure_Sx5XlM$ui(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui();
        }
        return getMeasurePassDelegate$ui().m6520remeasureBRTryo0(constraints.m7570unboximpl());
    }

    public final void removeAll$ui() {
        int size = this._foldedChildren.getVector().getSize();
        while (true) {
            size--;
            MutableVectorWithMutationTracking<LayoutNode> mutableVectorWithMutationTracking = this._foldedChildren;
            if (-1 >= size) {
                mutableVectorWithMutationTracking.clear();
                return;
            }
            onChildRemoved(mutableVectorWithMutationTracking.getVector().content[size]);
        }
    }

    public final void removeAt$ui(int i, int i2) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.getVector().content[i3]);
            this._foldedChildren.removeAt(i3);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void replace$ui() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui().replace();
    }

    public final void requestAutofill$ui() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    public final void requestLookaheadRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, z);
    }

    public final void requestLookaheadRemeasure$ui(boolean z, boolean z2, boolean z3) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, z, z2);
        if (z3) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.invalidateIntrinsicsParent(z);
        }
    }

    public final void requestRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, z, 2, null);
    }

    public final void requestRemeasure$ui(boolean z, boolean z2, boolean z3) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z, z2, 2, null);
        if (z3) {
            getMeasurePassDelegate$ui().invalidateIntrinsicsParent(z);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()] != 1) {
            o.s(layoutNode.getLayoutState$ui(), "Unexpected state ");
            return;
        }
        if (layoutNode.getLookaheadMeasurePending$ui()) {
            requestLookaheadRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            return;
        }
        if (layoutNode.getLookaheadLayoutPending$ui()) {
            layoutNode.requestLookaheadRelayout$ui(true);
        }
        if (layoutNode.getMeasurePending$ui()) {
            requestRemeasure$ui$default(layoutNode, true, false, false, 6, null);
        } else if (layoutNode.getLayoutPending$ui()) {
            layoutNode.requestRelayout$ui(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui() {
        MutableVector<LayoutNode> mutableVector = get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    public final Void rethrowWithComposeStackTrace(Throwable th) {
        CompositionErrorContext traceContext = getTraceContext();
        if (traceContext == null) {
            throw th;
        }
        traceContext.attachComposeStackTrace(th, this);
        throw th;
    }

    public final void setAddedToRectList$ui(boolean z) {
        this.addedToRectList = z;
    }

    public final void setCanMultiMeasure$ui(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i) {
        this.compositeKeyHash = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.CompositingStrategy);
        if ((nodeChain.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNode).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
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
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density density) {
        if (q10.b(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head$ui = this.nodes.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.onDensityChange();
        }
    }

    public final void setDepth$ui(int i) {
        this.depth = i;
    }

    public final void setGloballyPositionedObservers(int i) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (parent$ui2 = getParent$ui()) != null) {
                parent$ui2.setGloballyPositionedObservers(parent$ui2.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (parent$ui = getParent$ui()) != null) {
                parent$ui.setGloballyPositionedObservers(parent$ui.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    public final void setHasPositionalLayerTransformationsInOffsetFromRoot$ui(boolean z) {
        this.hasPositionalLayerTransformationsInOffsetFromRoot = z;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void setInteropViewFactoryHolder$ui(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head$ui = this.nodes.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                head$ui.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (q10.b(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (!(!this.isVirtual || getModifier() == Modifier.Companion)) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui();
        }
    }

    public final void setNeedsOnGloballyPositionedDispatch$ui(boolean z) {
        this.needsOnGloballyPositionedDispatch = z;
    }

    public final void setOnAttach$ui(ky kyVar) {
        this.onAttach = kyVar;
    }

    public final void setOnDetach$ui(ky kyVar) {
        this.onDetach = kyVar;
    }

    /* renamed from: setOuterToInnerOffset--gyyYBs$ui, reason: not valid java name */
    public final void m6473setOuterToInnerOffsetgyyYBs$ui(long j) {
        this.outerToInnerOffset = j;
    }

    public final void setOuterToInnerOffsetDirty$ui(boolean z) {
        this.outerToInnerOffsetDirty = z;
    }

    public final void setRectInParentDirty$ui(boolean z) {
        this.rectInParentDirty = z;
    }

    public void setSemanticsId(int i) {
        this.semanticsId = i;
    }

    public final void setSemanticsInvalidated$ui(boolean z) {
        this.isSemanticsInvalidated = z;
    }

    public final void setSubcompositionsState$ui(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (q10.b(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode).onViewConfigurationChange();
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
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui().size() + " measurePolicy: " + getMeasurePolicy() + " deactivated: " + isDeactivated();
    }

    public final void updateChildrenIfDirty$ui() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final iy getConstructor$ui() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui$annotations() {
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public SemanticsInfo getParentInfo() {
        return getParent$ui();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        /* renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m6476maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m6477maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m6478minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m6479minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m6476maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m6477maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m6478minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m6479minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }
    }

    @er
    public static /* synthetic */ void getCanMultiMeasure$ui$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }
}
