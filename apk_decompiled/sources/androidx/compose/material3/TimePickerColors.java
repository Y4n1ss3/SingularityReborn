package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    private TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.clockDialColor = j;
        this.selectorColor = j2;
        this.containerColor = j3;
        this.periodSelectorBorderColor = j4;
        this.clockDialSelectedContentColor = j5;
        this.clockDialUnselectedContentColor = j6;
        this.periodSelectorSelectedContainerColor = j7;
        this.periodSelectorUnselectedContainerColor = j8;
        this.periodSelectorSelectedContentColor = j9;
        this.periodSelectorUnselectedContentColor = j10;
        this.timeSelectorSelectedContainerColor = j11;
        this.timeSelectorUnselectedContainerColor = j12;
        this.timeSelectorSelectedContentColor = j13;
        this.timeSelectorUnselectedContentColor = j14;
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m2610copydVHXu7A$default(TimePickerColors timePickerColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i, Object obj) {
        long j15;
        long j16;
        long j17 = (i & 1) != 0 ? timePickerColors.containerColor : j;
        long j18 = (i & 2) != 0 ? timePickerColors.selectorColor : j2;
        long j19 = (i & 4) != 0 ? timePickerColors.containerColor : j3;
        long j20 = (i & 8) != 0 ? timePickerColors.periodSelectorBorderColor : j4;
        long j21 = (i & 16) != 0 ? timePickerColors.clockDialSelectedContentColor : j5;
        long j22 = (i & 32) != 0 ? timePickerColors.clockDialUnselectedContentColor : j6;
        long j23 = (i & 64) != 0 ? timePickerColors.periodSelectorSelectedContainerColor : j7;
        long j24 = j17;
        long j25 = (i & Fields.SpotShadowColor) != 0 ? timePickerColors.periodSelectorUnselectedContainerColor : j8;
        long j26 = (i & Fields.RotationX) != 0 ? timePickerColors.periodSelectorSelectedContentColor : j9;
        long j27 = (i & Fields.RotationY) != 0 ? timePickerColors.periodSelectorUnselectedContentColor : j10;
        long j28 = (i & Fields.RotationZ) != 0 ? timePickerColors.timeSelectorSelectedContainerColor : j11;
        long j29 = (i & Fields.CameraDistance) != 0 ? timePickerColors.timeSelectorUnselectedContainerColor : j12;
        long j30 = (i & Fields.TransformOrigin) != 0 ? timePickerColors.timeSelectorSelectedContentColor : j13;
        if ((i & 8192) != 0) {
            j16 = j30;
            j15 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j15 = j14;
            j16 = j30;
        }
        return timePickerColors.m2612copydVHXu7A(j24, j18, j19, j20, j21, j22, j23, j25, j26, j27, j28, j29, j16, j15);
    }

    /* renamed from: clockDialContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m2611clockDialContentColorvNxB06k$material3(boolean z) {
        return z ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2612copydVHXu7A(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        return new TimePickerColors(j != 16 ? j : this.clockDialColor, j2 != 16 ? j2 : this.selectorColor, j3 != 16 ? j3 : this.containerColor, j4 != 16 ? j4 : this.periodSelectorBorderColor, j5 != 16 ? j5 : this.clockDialSelectedContentColor, j6 != 16 ? j6 : this.clockDialUnselectedContentColor, j7 != 16 ? j7 : this.periodSelectorSelectedContainerColor, j8 != 16 ? j8 : this.periodSelectorUnselectedContainerColor, j9 != 16 ? j9 : this.periodSelectorSelectedContentColor, j10 != 16 ? j10 : this.periodSelectorUnselectedContentColor, j11 != 16 ? j11 : this.timeSelectorSelectedContainerColor, j12 != 16 ? j12 : this.timeSelectorUnselectedContainerColor, j13 != 16 ? j13 : this.timeSelectorSelectedContentColor, j14 != 16 ? j14 : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerColors.class != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        return Color.m4762equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m4762equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m4762equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m4762equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m4762equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m4762equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m4762equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m4762equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m4762equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m4762equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m4762equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m4762equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m2613getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2614getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2615getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2616getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2617getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2618getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2619getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2620getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2621getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m2622getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2623getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2624getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2625getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2626getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.timeSelectorUnselectedContentColor) + kp0.d(this.timeSelectorSelectedContentColor, kp0.d(this.timeSelectorUnselectedContainerColor, kp0.d(this.timeSelectorSelectedContainerColor, kp0.d(this.periodSelectorUnselectedContentColor, kp0.d(this.periodSelectorSelectedContentColor, kp0.d(this.periodSelectorUnselectedContainerColor, kp0.d(this.periodSelectorSelectedContainerColor, kp0.d(this.periodSelectorBorderColor, kp0.d(this.containerColor, kp0.d(this.selectorColor, Color.m4768hashCodeimpl(this.clockDialColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: periodSelectorContainerColor-vNxB06k$material3, reason: not valid java name */
    public final long m2627periodSelectorContainerColorvNxB06k$material3(boolean z) {
        return z ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: periodSelectorContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m2628periodSelectorContentColorvNxB06k$material3(boolean z) {
        return z ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: timeSelectorContainerColor-vNxB06k$material3, reason: not valid java name */
    public final long m2629timeSelectorContainerColorvNxB06k$material3(boolean z) {
        return z ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: timeSelectorContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m2630timeSelectorContentColorvNxB06k$material3(boolean z) {
        return z ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    public /* synthetic */ TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }
}
