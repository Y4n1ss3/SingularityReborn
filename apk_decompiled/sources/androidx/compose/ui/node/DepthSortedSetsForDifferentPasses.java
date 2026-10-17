package androidx.compose.ui.node;

import defpackage.ny;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet approachSet;
    private final DepthSortedSet lookaheadAndAncestorMeasureSet;
    private final DepthSortedSet lookaheadAndAncestorPlaceSet;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new DepthSortedSet(z);
        this.lookaheadAndAncestorPlaceSet = new DepthSortedSet(z);
        this.approachSet = new DepthSortedSet(z);
    }

    public final void add(LayoutNode layoutNode, Invalidation invalidation) {
        int i = WhenMappings.$EnumSwitchMapping$0[invalidation.ordinal()];
        if (i == 1) {
            this.lookaheadAndAncestorMeasureSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (i == 2) {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (i == 3) {
            if (layoutNode.getLookaheadRoot$ui() != null) {
                this.approachSet.add(layoutNode);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.add(layoutNode);
                return;
            }
        }
        if (i != 4) {
            o.n();
        } else if (layoutNode.getLookaheadRoot$ui() != null) {
            this.approachSet.add(layoutNode);
        } else {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
        }
    }

    public final boolean contains(LayoutNode layoutNode, boolean z) {
        boolean z2 = layoutNode.getLookaheadRoot$ui() == null;
        boolean z3 = this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode);
        return z ? !z2 && z3 : (z2 && z3) || this.approachSet.contains(layoutNode);
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.approachSet.isEmpty() || this.lookaheadAndAncestorMeasureSet.isEmpty()) ? false : true;
    }

    public final boolean isEmpty() {
        return this.lookaheadAndAncestorMeasureSet.isEmpty() && this.approachSet.isEmpty() && this.lookaheadAndAncestorPlaceSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final void popEach(ny nyVar) {
        LayoutNode pop;
        while (true) {
            boolean z = false;
            if (!this.lookaheadAndAncestorMeasureSet.isEmpty()) {
                pop = this.lookaheadAndAncestorMeasureSet.pop();
                z = pop.getLookaheadRoot$ui() != null;
                r1 = false;
            } else if (!this.lookaheadAndAncestorPlaceSet.isEmpty()) {
                pop = this.lookaheadAndAncestorPlaceSet.pop();
                if (pop.getLookaheadRoot$ui() != null) {
                    z = true;
                }
            } else if (this.approachSet.isEmpty()) {
                return;
            } else {
                pop = this.approachSet.pop();
            }
            nyVar.invoke(pop, Boolean.valueOf(z), Boolean.valueOf(r1));
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.approachSet.remove(layoutNode) || this.lookaheadAndAncestorMeasureSet.remove(layoutNode) || this.lookaheadAndAncestorPlaceSet.remove(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode) || this.approachSet.contains(layoutNode);
    }
}
