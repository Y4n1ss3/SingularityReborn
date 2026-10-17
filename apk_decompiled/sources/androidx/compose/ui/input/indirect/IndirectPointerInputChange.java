package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import defpackage.dq;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IndirectPointerInputChange {
    public static final int $stable = 8;
    private final long id;
    private boolean isConsumed;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long uptimeMillis;

    private IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
    }

    public final void consume() {
        this.isConsumed = true;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m5604getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m5605getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m5606getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) PointerId.m6082toStringimpl(this.id));
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", position=");
        sb.append((Object) Offset.m4524toStringimpl(this.position));
        sb.append(", pressed=");
        sb.append(this.pressed);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", previousUptimeMillis=");
        sb.append(this.previousUptimeMillis);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m4524toStringimpl(this.previousPosition));
        sb.append(", previousPressed=");
        sb.append(this.previousPressed);
        sb.append(", isConsumed=");
        return uf.e(sb, this.isConsumed, ')');
    }

    public /* synthetic */ IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2);
    }
}
