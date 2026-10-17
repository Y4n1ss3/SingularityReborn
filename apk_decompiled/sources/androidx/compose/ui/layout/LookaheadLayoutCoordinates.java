package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m6264getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m4520minusMKHz9U(mo6243localPositionOfR5De75A(coordinates, companion.m4532getZeroF1C5BW0()), getCoordinator().mo6243localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m4532getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getLayoutNode().getOuterCoordinator$ui().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo6242getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m7777constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo6243localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo6244localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo6244localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long mo6244localPositionOfS_NoaFU = mo6244localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j, z);
            long mo6489getPositionnOccac = rootLookaheadDelegate.mo6489getPositionnOccac();
            float m7739getXimpl = IntOffset.m7739getXimpl(mo6489getPositionnOccac);
            float m7740getYimpl = IntOffset.m7740getYimpl(mo6489getPositionnOccac);
            long m4520minusMKHz9U = Offset.m4520minusMKHz9U(mo6244localPositionOfS_NoaFU, Offset.m4508constructorimpl((4294967295L & Float.floatToRawIntBits(m7740getYimpl)) | (Float.floatToRawIntBits(m7739getXimpl) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m4521plusMKHz9U(m4520minusMKHz9U, parentCoordinates.mo6244localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m4532getZeroF1C5BW0(), z));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long m7742minusqkQi6aY = IntOffset.m7742minusqkQi6aY(IntOffset.m7743plusqkQi6aY(lookaheadDelegate.m6501positionIniSbpLlY$ui(lookaheadDelegate2, !z), IntOffsetKt.m7756roundk4lQ0M(j)), this.lookaheadDelegate.m6501positionIniSbpLlY$ui(lookaheadDelegate2, !z));
            float m7739getXimpl2 = IntOffset.m7739getXimpl(m7742minusqkQi6aY);
            float m7740getYimpl2 = IntOffset.m7740getYimpl(m7742minusqkQi6aY);
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(m7739getXimpl2) << 32) | (Float.floatToRawIntBits(m7740getYimpl2) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(IntOffset.m7743plusqkQi6aY(lookaheadDelegate.m6501positionIniSbpLlY$ui(rootLookaheadDelegate2, !z), rootLookaheadDelegate2.mo6489getPositionnOccac()), IntOffsetKt.m7756roundk4lQ0M(j));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long m7742minusqkQi6aY2 = IntOffset.m7742minusqkQi6aY(m7743plusqkQi6aY, IntOffset.m7743plusqkQi6aY(this.lookaheadDelegate.m6501positionIniSbpLlY$ui(rootLookaheadDelegate3, !z), rootLookaheadDelegate3.mo6489getPositionnOccac()));
        float m7739getXimpl3 = IntOffset.m7739getXimpl(m7742minusqkQi6aY2);
        float m7740getYimpl3 = IntOffset.m7740getYimpl(m7742minusqkQi6aY2);
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(m7739getXimpl3) << 32) | (4294967295L & Float.floatToRawIntBits(m7740getYimpl3)));
        NodeCoordinator wrappedBy$ui = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui();
        wrappedBy$ui.getClass();
        NodeCoordinator wrappedBy$ui2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui();
        wrappedBy$ui2.getClass();
        return wrappedBy$ui.mo6244localPositionOfS_NoaFU(wrappedBy$ui2, m4508constructorimpl, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo6245localToRootMKHz9U(long j) {
        return getCoordinator().mo6245localToRootMKHz9U(Offset.m4521plusMKHz9U(j, m6264getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo6246localToScreenMKHz9U(long j) {
        return getCoordinator().mo6246localToScreenMKHz9U(Offset.m4521plusMKHz9U(j, m6264getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo6247localToWindowMKHz9U(long j) {
        return getCoordinator().mo6247localToWindowMKHz9U(Offset.m4521plusMKHz9U(j, m6264getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo6248screenToLocalMKHz9U(long j) {
        return Offset.m4521plusMKHz9U(getCoordinator().mo6248screenToLocalMKHz9U(j), m6264getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo6249transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo6249transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo6250transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo6250transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo6251windowToLocalMKHz9U(long j) {
        return Offset.m4521plusMKHz9U(getCoordinator().mo6251windowToLocalMKHz9U(j), m6264getLookaheadOffsetF1C5BW0());
    }
}
