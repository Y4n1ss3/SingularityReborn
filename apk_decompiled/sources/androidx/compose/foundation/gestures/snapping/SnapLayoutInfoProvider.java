package androidx.compose.foundation.gestures.snapping;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SnapLayoutInfoProvider {
    float calculateSnapOffset(float f);

    default float calculateApproachOffset(float f, float f2) {
        return f2;
    }
}
