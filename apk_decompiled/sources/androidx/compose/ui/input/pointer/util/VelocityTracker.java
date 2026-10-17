package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.unit.VelocityKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private final PlatformVelocityTracker platformVelocityTracker = PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m6207addPositionUv8p0NA(long j, long j2) {
        this.platformVelocityTracker.mo6198addPositionUv8p0NA(j, j2);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m6208calculateVelocity9UxMQ8M() {
        return m6209calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m6209calculateVelocityAH228Gc(long j) {
        return this.platformVelocityTracker.mo6199calculateVelocityAH228Gc(j);
    }

    public final PlatformVelocityTracker getPlatformVelocityTracker$ui() {
        return this.platformVelocityTracker;
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }
}
