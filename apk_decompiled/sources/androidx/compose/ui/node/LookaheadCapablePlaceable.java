package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.ky;
import defpackage.lu0;
import defpackage.q10;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ky onCommitAffectingRuler = LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.INSTANCE;
    private ResettableRulerScope _rulerScope;
    private PlaceableResult cachedRulerPlaceableResult;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private fb0 rulerReaders;
    private RulerTrackingMap rulerValues;
    private ky rulersLambda;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class ResettableRulerScope implements RulerScope {
        private boolean coordinatesAccessed;
        private long positionOnScreen = IntOffset.Companion.m7749getMaxnOccac();
        private long size = IntSize.Companion.m7787getZeroYbymL2g();

        public ResettableRulerScope() {
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public LayoutCoordinates getCoordinates() {
            this.coordinatesAccessed = true;
            LayoutCoordinates coordinates = LookaheadCapablePlaceable.this.getCoordinates();
            if (IntOffset.m7738equalsimpl0(this.positionOnScreen, IntOffset.Companion.m7749getMaxnOccac())) {
                this.positionOnScreen = IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                this.size = coordinates.mo6242getSizeYbymL2g();
            }
            LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
            return coordinates;
        }

        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }

        /* renamed from: getPositionOnScreen-nOcc-ac, reason: not valid java name */
        public final long m6490getPositionOnScreennOccac() {
            return this.positionOnScreen;
        }

        /* renamed from: getSize-YbymL2g, reason: not valid java name */
        public final long m6491getSizeYbymL2g() {
            return this.size;
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void provides(Ruler ruler, float f) {
            LookaheadCapablePlaceable.this.provideRulerValue(ruler, f);
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void providesRelative(VerticalRuler verticalRuler, float f) {
            LookaheadCapablePlaceable.this.provideRelativeRulerValue(verticalRuler, f);
        }

        public final void setCoordinatesAccessed(boolean z) {
            this.coordinatesAccessed = z;
        }

        /* renamed from: setPositionOnScreen--gyyYBs, reason: not valid java name */
        public final void m6492setPositionOnScreengyyYBs(long j) {
            this.positionOnScreen = j;
        }

        /* renamed from: setSize-ozmzZPI, reason: not valid java name */
        public final void m6493setSizeozmzZPI(long j) {
            this.size = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addRulerReader(LayoutNode layoutNode, Ruler ruler) {
        char c;
        long j;
        long j2;
        long j3;
        fb0 fb0Var;
        fb0 fb0Var2;
        Object d;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        fb0 fb0Var3 = this.rulerReaders;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (fb0Var3 != null) {
            Object[] objArr = fb0Var3.c;
            long[] jArr3 = fb0Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                gb0 gb0Var = (gb0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = gb0Var.b;
                                long[] jArr4 = gb0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((WeakReference) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean isAttached = layoutNode2.isAttached();
                                                        i4 = i8;
                                                        if (isAttached) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    gb0Var.n(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                fb0Var = this.rulerReaders;
                if (fb0Var != null) {
                    long[] jArr5 = fb0Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((gb0) fb0Var.c[i18]).b()) {
                                            fb0Var.k(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                fb0Var2 = this.rulerReaders;
                if (fb0Var2 == null) {
                    fb0Var2 = new fb0();
                    this.rulerReaders = fb0Var2;
                }
                d = fb0Var2.d(ruler);
                if (d == null) {
                    d = new gb0();
                    fb0Var2.l(ruler, d);
                }
                ((gb0) d).l(new WeakReference(layoutNode));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        fb0Var = this.rulerReaders;
        if (fb0Var != null) {
        }
        fb0Var2 = this.rulerReaders;
        if (fb0Var2 == null) {
        }
        d = fb0Var2.d(ruler);
        if (d == null) {
        }
        ((gb0) d).l(new WeakReference(layoutNode));
    }

    /* renamed from: captureRulers-OSxE8f4, reason: not valid java name */
    private final void m6487captureRulersOSxE8f4(PlaceableResult placeableResult, long j, long j2) {
        OwnerSnapshotObserver snapshotObserver;
        fb0 fb0Var = this.rulerReaders;
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        Owner owner$ui = getLayoutNode().getOwner$ui();
        if (owner$ui != null && (snapshotObserver = owner$ui.getSnapshotObserver()) != null) {
            snapshotObserver.observer.observeReads(placeableResult, onCommitAffectingRuler, new LookaheadCapablePlaceable$captureRulers$1(this, j, j2, placeableResult));
        }
        rulerTrackingMap.notifyChanged(isLookingAhead(), this, fb0Var);
    }

    /* renamed from: captureRulers-OSxE8f4$default, reason: not valid java name */
    public static /* synthetic */ void m6488captureRulersOSxE8f4$default(LookaheadCapablePlaceable lookaheadCapablePlaceable, PlaceableResult placeableResult, long j, long j2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
            return;
        }
        if ((i & 2) != 0) {
            j = IntOffset.Companion.m7749getMaxnOccac();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = IntSize.Companion.m7787getZeroYbymL2g();
        }
        lookaheadCapablePlaceable.m6487captureRulersOSxE8f4(placeableResult, j3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureRulersIfNeeded(PlaceableResult placeableResult) {
        if (this.isPlacingForAlignment) {
            return;
        }
        ky rulers = placeableResult.getResult().getRulers();
        fb0 fb0Var = this.rulerReaders;
        if (rulers != null) {
            m6488captureRulersOSxE8f4$default(this, placeableResult, 0L, 0L, 6, null);
            this.rulersLambda = rulers;
            return;
        }
        if (fb0Var != null) {
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
                                notifyRulerValueChange((gb0) objArr[(i << 3) + i3]);
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
            fb0Var.f();
        }
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        while (true) {
            RulerTrackingMap rulerTrackingMap = this.rulerValues;
            if (rulerTrackingMap != null && rulerTrackingMap.contains(ruler)) {
                return this;
            }
            LookaheadCapablePlaceable parent = this.getParent();
            if (parent == null) {
                return this;
            }
            this = parent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResettableRulerScope getRulerScope() {
        ResettableRulerScope resettableRulerScope = this._rulerScope;
        if (resettableRulerScope != null) {
            return resettableRulerScope;
        }
        ResettableRulerScope resettableRulerScope2 = new ResettableRulerScope();
        this._rulerScope = resettableRulerScope2;
        return resettableRulerScope2;
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui != null) {
            return isLayoutNodeAncestor(parent$ui, layoutNode2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyRulerValueChange(gb0 gb0Var) {
        LayoutNode layoutNode;
        Object[] objArr = gb0Var.b;
        long[] jArr = gb0Var.a;
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
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui(false);
                        } else {
                            layoutNode.requestRelayout$ui(false);
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

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public final void captureRulersIfNeeded$ui(MeasureResult measureResult) {
        char c;
        char c2;
        fb0 fb0Var = this.rulerReaders;
        char c3 = 7;
        if (measureResult == null) {
            if (fb0Var != null) {
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
                                if ((j & 255) < 128) {
                                    notifyRulerValueChange((gb0) objArr[(i << 3) + i3]);
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
            }
            if (fb0Var != null) {
                fb0Var.f();
            }
            RulerTrackingMap rulerTrackingMap = this.rulerValues;
            if (rulerTrackingMap != null) {
                rulerTrackingMap.clear();
                return;
            }
            return;
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        ky rulers = measureResult.getRulers();
        if (rulers != null) {
            boolean z = this.rulersLambda != rulers;
            long m7749getMaxnOccac = IntOffset.Companion.m7749getMaxnOccac();
            long m7787getZeroYbymL2g = IntSize.Companion.m7787getZeroYbymL2g();
            if (!z && getRulerScope().getCoordinatesAccessed()) {
                LayoutCoordinates coordinates = getCoordinates();
                m7749getMaxnOccac = IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                m7787getZeroYbymL2g = coordinates.mo6242getSizeYbymL2g();
                z = (IntOffset.m7738equalsimpl0(m7749getMaxnOccac, getRulerScope().m6490getPositionOnScreennOccac()) && IntSize.m7780equalsimpl0(m7787getZeroYbymL2g, getRulerScope().m6491getSizeYbymL2g())) ? false : true;
            }
            long j2 = m7749getMaxnOccac;
            long j3 = m7787getZeroYbymL2g;
            if (z) {
                PlaceableResult placeableResult = this.cachedRulerPlaceableResult;
                if (placeableResult != null) {
                    placeableResult.setResult(measureResult);
                } else {
                    placeableResult = new PlaceableResult(measureResult, this);
                    this.cachedRulerPlaceableResult = placeableResult;
                }
                m6487captureRulersOSxE8f4(placeableResult, j2, j3);
                this.rulersLambda = measureResult.getRulers();
                return;
            }
            return;
        }
        if (fb0Var != null) {
            Object[] objArr2 = fb0Var.c;
            long[] jArr2 = fb0Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr2[i4];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length2)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                c2 = c3;
                                notifyRulerValueChange((gb0) objArr2[(i4 << 3) + i6]);
                            } else {
                                c2 = c3;
                            }
                            j4 >>= 8;
                            i6++;
                            c3 = c2;
                        }
                        c = c3;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                    }
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    c3 = c;
                }
            }
            fb0Var.f();
        }
    }

    public final float findRulerValue(Ruler ruler, float f) {
        if (this.isPlacingForAlignment) {
            return f;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = rulerTrackingMap != null ? rulerTrackingMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return f;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        if (getHasMeasureResult() && (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return calculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m7739getXimpl(m6297getApparentToRealOffsetnOccac()) : IntOffset.m7740getYimpl(m6297getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui();

    public abstract LookaheadCapablePlaceable getParent();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo6489getPositionnOccac();

    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui = nodeCoordinator.getWrapped$ui();
        if (!q10.b(wrapped$ui != null ? wrapped$ui.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    public final void invalidateChildrenOfDefiningRuler$ui(Ruler ruler) {
        fb0 fb0Var = findAncestorRulerDefiner(ruler).rulerReaders;
        gb0 gb0Var = fb0Var != null ? (gb0) fb0Var.j(ruler) : null;
        if (gb0Var != null) {
            notifyRulerValueChange(gb0Var);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final boolean isPlacingForAlignment$ui() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final ky kyVar, final ky kyVar2) {
        if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
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
                kyVar2.invoke(this.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(Ruler ruler, float f) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f = getWidth() - f;
        }
        rulerTrackingMap.set(ruler, f);
    }

    public final void provideRulerValue(Ruler ruler, float f) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        rulerTrackingMap.set(ruler, f);
    }

    public abstract void replace$ui();

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final void setPlacingForAlignment$ui(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui(boolean z) {
        this.isShallowPlacing = z;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (q10.b(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(z);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
