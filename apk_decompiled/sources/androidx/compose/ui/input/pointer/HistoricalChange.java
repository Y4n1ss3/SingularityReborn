package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private final float scaleFactor;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, int i, dq dqVar) {
        this(j, j2, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j3, (dq) null);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m5999getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m6000getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m6001getPositionF1C5BW0() {
        return this.position;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m4524toStringimpl(this.position)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m4524toStringimpl(this.panOffset)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, dq dqVar) {
        this(j, j2, f, j3);
    }

    @er
    public /* synthetic */ HistoricalChange(long j, long j2, dq dqVar) {
        this(j, j2);
    }

    private HistoricalChange(long j, long j2, float f, long j3) {
        this.uptimeMillis = j;
        this.position = j2;
        this.scaleFactor = f;
        this.panOffset = j3;
        this.originalEventPosition = Offset.Companion.m4532getZeroF1C5BW0();
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, long j4, dq dqVar) {
        this(j, j2, f, j3, j4);
    }

    private HistoricalChange(long j, long j2) {
        this(j, j2, 1.0f, Offset.Companion.m4532getZeroF1C5BW0(), (dq) null);
    }

    private HistoricalChange(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3, (dq) null);
        this.originalEventPosition = j4;
    }
}
