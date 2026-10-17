package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ky;
import defpackage.o;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private ApproachLayoutModifierNode approachNode;
    private final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final boolean getApproachMeasureRequired$ui() {
        return this.approachMeasureRequired;
    }

    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo6211getLookaheadConstraintsmsEJaDk() {
        Constraints m6462getLookaheadConstraintsDWUhwKw$ui = this.coordinator.m6462getLookaheadConstraintsDWUhwKw$ui();
        if (m6462getLookaheadConstraintsDWUhwKw$ui != null) {
            return m6462getLookaheadConstraintsDWUhwKw$ui.m7570unboximpl();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        o.j();
        return 0L;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        NodeCoordinator innerCoordinator$ui;
        LayoutNode lookaheadRoot$ui = this.coordinator.getLayoutNode().getLookaheadRoot$ui();
        if (lookaheadRoot$ui == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            o.j();
            return null;
        }
        if (!lookaheadRoot$ui.isVirtualLookaheadRoot$ui()) {
            return lookaheadRoot$ui.getOuterCoordinator$ui();
        }
        LayoutNode parent$ui = lookaheadRoot$ui.getParent$ui();
        return (parent$ui == null || (innerCoordinator$ui = parent$ui.getInnerCoordinator$ui()) == null) ? lookaheadRoot$ui.getChildren$ui().get(0).getOuterCoordinator$ui() : innerCoordinator$ui;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo6212getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        MeasureResult measureResult$ui = lookaheadDelegate.getMeasureResult$ui();
        return IntSize.m7777constructorimpl((measureResult$ui.getWidth() << 32) | (measureResult$ui.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final ky kyVar, final ky kyVar2) {
        if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, kyVar, kyVar2, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1
            final /* synthetic */ ky $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final ky rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            {
                this.$placementBlock = kyVar2;
                this.this$0 = this;
                this.width = i;
                this.height = i2;
                this.alignmentLines = map;
                this.rulers = kyVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public ky getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo360roundToPxR2X_6o(long j) {
        return this.coordinator.mo360roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo361roundToPx0680j_4(float f) {
        return this.coordinator.mo361roundToPx0680j_4(f);
    }

    public final void setApproachMeasureRequired$ui(boolean z) {
        this.approachMeasureRequired = z;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo362toDpGaN1DYA(long j) {
        return this.coordinator.mo362toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo363toDpu2uoSUM(float f) {
        return this.coordinator.mo363toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo365toDpSizekrfVVM(long j) {
        return this.coordinator.mo365toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
        o.j();
        return null;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo366toPxR2X_6o(long j) {
        return this.coordinator.mo366toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo367toPx0680j_4(float f) {
        return this.coordinator.mo367toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo368toSizeXkaWNTQ(long j) {
        return this.coordinator.mo368toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo369toSp0xMU5do(float f) {
        return this.coordinator.mo369toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo370toSpkPz2Gy4(float f) {
        return this.coordinator.mo370toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo364toDpu2uoSUM(int i) {
        return this.coordinator.mo364toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo371toSpkPz2Gy4(int i) {
        return this.coordinator.mo371toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar) {
        return this.coordinator.layout(i, i2, map, kyVar);
    }
}
