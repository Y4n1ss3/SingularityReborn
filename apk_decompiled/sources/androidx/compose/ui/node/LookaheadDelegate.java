package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ad0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.ta0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final ta0 cachedAlignmentLinesMap;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m7750getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
        ta0 ta0Var = ad0.a;
        this.cachedAlignmentLinesMap = new ta0();
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m6496placeSelfgyyYBs(long j) {
        if (!IntOffset.m7738equalsimpl0(mo6489getPositionnOccac(), j)) {
            m6502setPositiongyyYBs(j);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((measureResult.getHeight() & 4294967295L) | (measureResult.getWidth() << 32)));
        } else {
            m6301setMeasuredSizeozmzZPI(IntSize.Companion.m7787getZeroYbymL2g());
        }
        if (!q10.b(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !q10.b(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = this.coordinator.getLayoutNode().getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
        lookaheadAlignmentLinesOwner$ui.getClass();
        return lookaheadAlignmentLinesOwner$ui;
    }

    public final int getCachedAlignmentLine$ui(AlignmentLine alignmentLine) {
        ta0 ta0Var = this.cachedAlignmentLinesMap;
        int a = ta0Var.a(alignmentLine);
        if (a >= 0) {
            return ta0Var.c[a];
        }
        return Integer.MIN_VALUE;
    }

    public final ta0 getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui != null) {
            return wrapped$ui.getLookaheadDelegate();
        }
        return null;
    }

    /* renamed from: getConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m6497getConstraintsmsEJaDk$ui() {
        return m6299getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
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

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw k4.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui = this.coordinator.getWrappedBy$ui();
        if (wrappedBy$ui != null) {
            return wrappedBy$ui.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo6489getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m6498getSizeYbymL2g$ui() {
        return IntSize.m7777constructorimpl((getWidth() << 32) | (getHeight() & 4294967295L));
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m6499performingMeasureK40F9xA(long j, iy iyVar) {
        m6302setMeasurementConstraintsBRTryo0(j);
        set_measureResult((MeasureResult) iyVar.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        m6496placeSelfgyyYBs(j);
        if (isShallowPlacing$ui()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        getMeasureResult$ui().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui, reason: not valid java name */
    public final void m6500placeSelfApparentToRealOffsetgyyYBs$ui(long j) {
        m6496placeSelfgyyYBs(IntOffset.m7743plusqkQi6aY(j, m6297getApparentToRealOffsetnOccac()));
    }

    /* renamed from: positionIn-iSbpLlY$ui, reason: not valid java name */
    public final long m6501positionIniSbpLlY$ui(LookaheadDelegate lookaheadDelegate, boolean z) {
        long m7750getZeronOccac = IntOffset.Companion.m7750getZeronOccac();
        while (!this.equals(lookaheadDelegate)) {
            if (!this.isPlacedUnderMotionFrameOfReference() || !z) {
                m7750getZeronOccac = IntOffset.m7743plusqkQi6aY(m7750getZeronOccac, this.mo6489getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui = this.coordinator.getWrappedBy$ui();
            wrappedBy$ui.getClass();
            this = wrappedBy$ui.getLookaheadDelegate();
            this.getClass();
        }
        return m7750getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        mo6235placeAtf8xVGno(mo6489getPositionnOccac(), 0.0f, (ky) null);
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m6502setPositiongyyYBs(long j) {
        this.position = j;
    }
}
