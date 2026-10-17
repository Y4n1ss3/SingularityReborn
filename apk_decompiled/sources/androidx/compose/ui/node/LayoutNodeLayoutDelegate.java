package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private boolean detachedFromParentLookaheadPlacement;
    private final LayoutNode layoutNode;
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    private boolean lookaheadCoordinatesAccessedDuringPlacement;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate(this);

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final void ensureLookaheadDelegateCreated$ui() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate(this);
        }
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui() {
        return this.detachedFromParentLookaheadPass;
    }

    public final boolean getDetachedFromParentLookaheadPlacement$ui() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final int getHeight$ui() {
        return this.measurePassDelegate.getHeight();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m6484getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m6517getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m6485getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m6504getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final LayoutNode getLayoutNode$ui() {
        return this.layoutNode;
    }

    public final boolean getLayoutPending$ui() {
        return this.measurePassDelegate.getLayoutPending$ui();
    }

    public final LayoutNode.LayoutState getLayoutState$ui() {
        return this.layoutState;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final boolean getLookaheadLayoutPending$ui() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadLayoutPendingForAlignment$ui() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    public final boolean getLookaheadMeasurePending$ui() {
        return this.lookaheadMeasurePending;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui() {
        return this.lookaheadPassDelegate;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui() {
        return this.measurePassDelegate.getMeasurePending$ui();
    }

    public final int getNextChildLookaheadPlaceOrder$ui() {
        return this.nextChildLookaheadPlaceOrder;
    }

    public final int getNextChildPlaceOrder$ui() {
        return this.nextChildPlaceOrder;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui().getOuterCoordinator$ui();
    }

    public final int getWidth$ui() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui(true);
        }
    }

    public final void markLayoutPending$ui() {
        this.measurePassDelegate.markLayoutPending();
    }

    public final void markLookaheadLayoutPending$ui() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui() {
        this.measurePassDelegate.markMeasurePending$ui();
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui = this.layoutNode.getLayoutState$ui();
        if (layoutState$ui == LayoutNode.LayoutState.LayingOut || layoutState$ui == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            }
        }
    }

    public final void onRemovedFromLookaheadScope() {
        this.lookaheadPassDelegate = null;
        this.lookaheadLayoutPending = false;
        this.lookaheadMeasurePending = false;
    }

    /* renamed from: performLookaheadMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m6486performLookaheadMeasureBRTryo0$ui(long j) {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.m6505performMeasureBRTryo0$ui(j);
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui();
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui = this.layoutNode.getParent$ui();
            LayoutNodeLayoutDelegate layoutDelegate$ui = parent$ui != null ? parent$ui.getLayoutDelegate$ui() : null;
            if (layoutDelegate$ui != null) {
                int i3 = layoutDelegate$ui.childrenAccessingCoordinatesDuringPlacement;
                if (i == 0) {
                    layoutDelegate$ui.setChildrenAccessingCoordinatesDuringPlacement(i3 - 1);
                } else {
                    layoutDelegate$ui.setChildrenAccessingCoordinatesDuringPlacement(i3 + 1);
                }
            }
        }
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui = this.layoutNode.getParent$ui();
            LayoutNodeLayoutDelegate layoutDelegate$ui = parent$ui != null ? parent$ui.getLayoutDelegate$ui() : null;
            if (layoutDelegate$ui != null) {
                int i3 = layoutDelegate$ui.childrenAccessingLookaheadCoordinatesDuringPlacement;
                if (i == 0) {
                    layoutDelegate$ui.setChildrenAccessingLookaheadCoordinatesDuringPlacement(i3 - 1);
                } else {
                    layoutDelegate$ui.setChildrenAccessingLookaheadCoordinatesDuringPlacement(i3 + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setDetachedFromParentLookaheadPass$ui(boolean z) {
        this.detachedFromParentLookaheadPass = z;
    }

    public final void setDetachedFromParentLookaheadPlacement$ui(boolean z) {
        this.detachedFromParentLookaheadPlacement = z;
    }

    public final void setLayoutState$ui(LayoutNode.LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadLayoutPending$ui(boolean z) {
        this.lookaheadLayoutPending = z;
    }

    public final void setLookaheadLayoutPendingForAlignment$ui(boolean z) {
        this.lookaheadLayoutPendingForAlignment = z;
    }

    public final void setLookaheadMeasurePending$ui(boolean z) {
        this.lookaheadMeasurePending = z;
    }

    public final void setNextChildLookaheadPlaceOrder$ui(int i) {
        this.nextChildLookaheadPlaceOrder = i;
    }

    public final void setNextChildPlaceOrder$ui(int i) {
        this.nextChildPlaceOrder = i;
    }

    public final void updateParentData() {
        LayoutNode parent$ui;
        if (this.measurePassDelegate.updateParentData() && (parent$ui = this.layoutNode.getParent$ui()) != null) {
            LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        boolean isOutMostLookaheadRoot = LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode);
        LayoutNode layoutNode = this.layoutNode;
        if (isOutMostLookaheadRoot) {
            LayoutNode parent$ui2 = layoutNode.getParent$ui();
            if (parent$ui2 != null) {
                LayoutNode.requestRemeasure$ui$default(parent$ui2, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui3 = layoutNode.getParent$ui();
        if (parent$ui3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui3, false, false, false, 7, null);
        }
    }
}
