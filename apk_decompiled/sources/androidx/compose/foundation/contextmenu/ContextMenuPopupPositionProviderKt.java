package androidx.compose.foundation.contextmenu;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProviderKt {
    private static final int alignEndEdges(int i, int i2, boolean z) {
        return alignStartEdges(i, i2, !z);
    }

    public static final int alignPopupAxis(int i, int i2, int i3, boolean z) {
        return i2 >= i3 ? alignStartEdges(i2, i3, z) : popupFitsBetweenPositionAndEndEdge(i, i2, i3, z) ? alignPopupStartEdgeToPosition(i, i2, z) : popupFitsBetweenPositionAndStartEdge(i, i2, i3, z) ? alignPopupEndEdgeToPosition(i, i2, z) : alignEndEdges(i2, i3, z);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = true;
        }
        return alignPopupAxis(i, i2, i3, z);
    }

    private static final int alignPopupEndEdgeToPosition(int i, int i2, boolean z) {
        return alignPopupStartEdgeToPosition(i, i2, !z);
    }

    private static final int alignPopupStartEdgeToPosition(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static final int alignStartEdges(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i, int i2, int i3, boolean z) {
        return popupFitsBetweenPositionAndStartEdge(i, i2, i3, !z);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i, int i2, int i3, boolean z) {
        return z ? i2 <= i : i3 - i2 > i;
    }
}
