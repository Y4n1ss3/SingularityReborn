package androidx.compose.foundation.gestures.snapping;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i, int i2, int i3, int i4, int i5, int i6, SnapPosition snapPosition, int i7) {
        return i5 - snapPosition.position(i, i4, i2, i3, i6, i7);
    }
}
