package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo6242getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo6242getSizeYbymL2g() & 4294967295L)) : localBoundingBoxOf$default;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, boolean z) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float mo6242getSizeYbymL2g = (int) (findRootCoordinates.mo6242getSizeYbymL2g() >> 32);
        float mo6242getSizeYbymL2g2 = (int) (findRootCoordinates.mo6242getSizeYbymL2g() & 4294967295L);
        Rect localBoundingBoxOf = findRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float left = localBoundingBoxOf.getLeft();
        if (z) {
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > mo6242getSizeYbymL2g) {
                left = mo6242getSizeYbymL2g;
            }
        }
        float top = localBoundingBoxOf.getTop();
        if (z) {
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > mo6242getSizeYbymL2g2) {
                top = mo6242getSizeYbymL2g2;
            }
        }
        if (z) {
            float right = localBoundingBoxOf.getRight();
            if (right < 0.0f) {
                right = 0.0f;
            }
            if (right <= mo6242getSizeYbymL2g) {
                mo6242getSizeYbymL2g = right;
            }
        } else {
            mo6242getSizeYbymL2g = localBoundingBoxOf.getRight();
        }
        if (z) {
            float bottom = localBoundingBoxOf.getBottom();
            float f = bottom >= 0.0f ? bottom : 0.0f;
            if (f <= mo6242getSizeYbymL2g2) {
                mo6242getSizeYbymL2g2 = f;
            }
        } else {
            mo6242getSizeYbymL2g2 = localBoundingBoxOf.getBottom();
        }
        if (left == mo6242getSizeYbymL2g || top == mo6242getSizeYbymL2g2) {
            return Rect.Companion.getZero();
        }
        long mo6247localToWindowMKHz9U = findRootCoordinates.mo6247localToWindowMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)));
        long mo6247localToWindowMKHz9U2 = findRootCoordinates.mo6247localToWindowMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(mo6242getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)));
        long mo6247localToWindowMKHz9U3 = findRootCoordinates.mo6247localToWindowMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(mo6242getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(mo6242getSizeYbymL2g2) & 4294967295L)));
        long mo6247localToWindowMKHz9U4 = findRootCoordinates.mo6247localToWindowMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(mo6242getSizeYbymL2g2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        float intBitsToFloat = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (mo6247localToWindowMKHz9U3 & 4294967295L));
        return new Rect(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static /* synthetic */ Rect boundsInWindow$default(LayoutCoordinates layoutCoordinates, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return boundsInWindow(layoutCoordinates, z);
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui = nodeCoordinator.getWrappedBy$ui();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy$ui = nodeCoordinator.getWrappedBy$ui();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m4532getZeroF1C5BW0()) : Offset.Companion.m4532getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo6245localToRootMKHz9U(Offset.Companion.m4532getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo6247localToWindowMKHz9U(Offset.Companion.m4532getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo6246localToScreenMKHz9U(Offset.Companion.m4532getZeroF1C5BW0());
    }
}
