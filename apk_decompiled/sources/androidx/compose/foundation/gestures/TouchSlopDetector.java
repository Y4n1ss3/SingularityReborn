package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, int i, dq dqVar) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j, null);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m562calculatePostSlopOffsettuRUvjQ(float f) {
        Orientation orientation = this.orientation;
        long j = this.totalPositionChange;
        if (orientation == null) {
            return Offset.m4520minusMKHz9U(this.totalPositionChange, Offset.m4523timestuRUvjQ(Offset.m4511divtuRUvjQ(j, Offset.m4514getDistanceimpl(j)), f));
        }
        float m566mainAxisk4lQ0M = m566mainAxisk4lQ0M(j) - (Math.signum(m566mainAxisk4lQ0M(this.totalPositionChange)) * f);
        float m565crossAxisk4lQ0M = m565crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation != Orientation.Horizontal) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(m565crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m566mainAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(m565crossAxisk4lQ0M) & 4294967295L) | (Float.floatToRawIntBits(m566mainAxisk4lQ0M) << 32));
    }

    /* renamed from: reset-k-4lQ0M$default, reason: not valid java name */
    public static /* synthetic */ void m563resetk4lQ0M$default(TouchSlopDetector touchSlopDetector, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        touchSlopDetector.m567resetk4lQ0M(j);
    }

    /* renamed from: addPositions-akrDWew, reason: not valid java name */
    public final long m564addPositionsakrDWew(long j, long j2, float f) {
        long m4521plusMKHz9U = Offset.m4521plusMKHz9U(this.totalPositionChange, Offset.m4520minusMKHz9U(j, j2));
        this.totalPositionChange = m4521plusMKHz9U;
        return (this.orientation == null ? Offset.m4514getDistanceimpl(m4521plusMKHz9U) : Math.abs(m566mainAxisk4lQ0M(m4521plusMKHz9U))) >= f ? m562calculatePostSlopOffsettuRUvjQ(f) : Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m565crossAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m566mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: reset-k-4lQ0M, reason: not valid java name */
    public final void m567resetk4lQ0M(long j) {
        this.totalPositionChange = j;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    private TouchSlopDetector(Orientation orientation, long j) {
        this.orientation = orientation;
        this.totalPositionChange = j;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, dq dqVar) {
        this(orientation, j);
    }
}
