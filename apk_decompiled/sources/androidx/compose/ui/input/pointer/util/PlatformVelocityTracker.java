package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PlatformVelocityTracker {
    /* renamed from: addPointerInputChange-Uv8p0NA */
    void mo6197addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j);

    /* renamed from: addPosition-Uv8p0NA */
    void mo6198addPositionUv8p0NA(long j, long j2);

    /* renamed from: calculateVelocity-AH228Gc */
    long mo6199calculateVelocityAH228Gc(long j);

    void resetTracking();
}
