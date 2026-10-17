package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m6873rectInfoForDg36KO4(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(delegatableNode, NodeKind.m6573constructorimpl(2));
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!requireLayoutNode.isPlaced()) {
            return null;
        }
        if (requireLayoutNode.getOuterCoordinator$ui() == m6414requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
        }
        long m7733constructorimpl = IntOffset.m7733constructorimpl(j);
        float m7739getXimpl = IntOffset.m7739getXimpl(m7733constructorimpl);
        float m7740getYimpl = IntOffset.m7740getYimpl(m7733constructorimpl);
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(m7739getXimpl) << 32) | (Float.floatToRawIntBits(m7740getYimpl) & 4294967295L));
        long mo6242getSizeYbymL2g = m6414requireCoordinator64DMado.getCoordinates().mo6242getSizeYbymL2g();
        return new RelativeLayoutBounds(IntOffsetKt.m7756roundk4lQ0M(requireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo6243localPositionOfR5De75A(m6414requireCoordinator64DMado, m4508constructorimpl)), IntOffset.m7733constructorimpl(((IntOffset.m7739getXimpl(r0) + ((int) (mo6242getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m7740getYimpl(r0) + ((int) (mo6242getSizeYbymL2g & 4294967295L))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
    }
}
