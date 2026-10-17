package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.dq;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DefaultVelocityTracker implements PlatformVelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    public DefaultVelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        boolean z = false;
        int i = 1;
        dq dqVar = null;
        this.xVelocityTracker = new VelocityTracker1D(z, strategy, i, dqVar);
        this.yVelocityTracker = new VelocityTracker1D(z, strategy, i, dqVar);
        this.currentPointerPositionAccumulator = Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* renamed from: addPointerInputChangeLegacy-Uv8p0NA, reason: not valid java name */
    private final void m6195addPointerInputChangeLegacyUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            this.currentPointerPositionAccumulator = pointerInputChange.m6101getPositionF1C5BW0();
            resetTracking();
        }
        long m6102getPreviousPositionF1C5BW0 = pointerInputChange.m6102getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long m4520minusMKHz9U = Offset.m4520minusMKHz9U(historicalChange.m6001getPositionF1C5BW0(), m6102getPreviousPositionF1C5BW0);
            long m6001getPositionF1C5BW0 = historicalChange.m6001getPositionF1C5BW0();
            this.currentPointerPositionAccumulator = Offset.m4521plusMKHz9U(this.currentPointerPositionAccumulator, m4520minusMKHz9U);
            mo6198addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m4521plusMKHz9U(this.currentPointerPositionAccumulator, j));
            i++;
            m6102getPreviousPositionF1C5BW0 = m6001getPositionF1C5BW0;
        }
        this.currentPointerPositionAccumulator = Offset.m4521plusMKHz9U(this.currentPointerPositionAccumulator, Offset.m4520minusMKHz9U(pointerInputChange.m6101getPositionF1C5BW0(), m6102getPreviousPositionF1C5BW0));
        mo6198addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), Offset.m4521plusMKHz9U(this.currentPointerPositionAccumulator, j));
    }

    /* renamed from: addPointerInputChangeWithFix-Uv8p0NA, reason: not valid java name */
    private final void m6196addPointerInputChangeWithFixUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = historical.get(i);
                mo6198addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m4521plusMKHz9U(historicalChange.m5999getOriginalEventPositionF1C5BW0$ui(), j));
            }
            mo6198addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), Offset.m4521plusMKHz9U(pointerInputChange.m6099getOriginalEventPositionF1C5BW0$ui(), j));
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            resetTracking();
        }
        this.lastMoveEventTimeStamp = pointerInputChange.getUptimeMillis();
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPointerInputChange-Uv8p0NA, reason: not valid java name */
    public void mo6197addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (VelocityTrackerKt.getVelocityTrackerAddPointsFix()) {
            m6196addPointerInputChangeWithFixUv8p0NA(pointerInputChange, j);
        } else {
            m6195addPointerInputChangeLegacyUv8p0NA(pointerInputChange, j);
        }
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public void mo6198addPositionUv8p0NA(long j, long j2) {
        this.xVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.yVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public long mo6199calculateVelocityAH228Gc(long j) {
        if (!(Velocity.m7849getXimpl(j) > 0.0f && Velocity.m7850getYimpl(j) > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m7856toStringimpl(j)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m7849getXimpl(j)), this.yVelocityTracker.calculateVelocity(Velocity.m7850getYimpl(j)));
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui, reason: not valid java name */
    public final long m6200getCurrentPointerPositionAccumulatorF1C5BW0$ui() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui() {
        return this.lastMoveEventTimeStamp;
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui, reason: not valid java name */
    public final void m6201setCurrentPointerPositionAccumulatork4lQ0M$ui(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    public final void setLastMoveEventTimeStamp$ui(long j) {
        this.lastMoveEventTimeStamp = j;
    }
}
