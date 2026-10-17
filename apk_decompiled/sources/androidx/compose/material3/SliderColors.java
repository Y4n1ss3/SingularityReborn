package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.activeTrackColor = j2;
        this.activeTickColor = j3;
        this.inactiveTrackColor = j4;
        this.inactiveTickColor = j5;
        this.disabledThumbColor = j6;
        this.disabledActiveTrackColor = j7;
        this.disabledActiveTickColor = j8;
        this.disabledInactiveTrackColor = j9;
        this.disabledInactiveTickColor = j10;
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m2391copyK518z4$default(SliderColors sliderColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, Object obj) {
        long j11;
        long j12;
        long j13 = (i & 1) != 0 ? sliderColors.thumbColor : j;
        long j14 = (i & 2) != 0 ? sliderColors.activeTrackColor : j2;
        long j15 = (i & 4) != 0 ? sliderColors.activeTickColor : j3;
        long j16 = (i & 8) != 0 ? sliderColors.inactiveTrackColor : j4;
        long j17 = (i & 16) != 0 ? sliderColors.inactiveTickColor : j5;
        long j18 = (i & 32) != 0 ? sliderColors.disabledThumbColor : j6;
        long j19 = (i & 64) != 0 ? sliderColors.disabledActiveTrackColor : j7;
        long j20 = j13;
        long j21 = (i & Fields.SpotShadowColor) != 0 ? sliderColors.disabledActiveTickColor : j8;
        long j22 = (i & Fields.RotationX) != 0 ? sliderColors.disabledInactiveTrackColor : j9;
        if ((i & Fields.RotationY) != 0) {
            j12 = j22;
            j11 = sliderColors.disabledInactiveTickColor;
        } else {
            j11 = j10;
            j12 = j22;
        }
        return sliderColors.m2392copyK518z4(j20, j14, j15, j16, j17, j18, j19, j21, j12, j11);
    }

    /* renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m2392copyK518z4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        return new SliderColors(j != 16 ? j : this.thumbColor, j2 != 16 ? j2 : this.activeTrackColor, j3 != 16 ? j3 : this.activeTickColor, j4 != 16 ? j4 : this.inactiveTrackColor, j5 != 16 ? j5 : this.inactiveTickColor, j6 != 16 ? j6 : this.disabledThumbColor, j7 != 16 ? j7 : this.disabledActiveTrackColor, j8 != 16 ? j8 : this.disabledActiveTickColor, j9 != 16 ? j9 : this.disabledInactiveTrackColor, j10 != 16 ? j10 : this.disabledInactiveTickColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.m4762equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m4762equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m4762equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m4762equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m4762equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m4762equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m4762equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m4762equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m4762equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m4762equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    /* renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2393getActiveTickColor0d7_KjU() {
        return this.activeTickColor;
    }

    /* renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2394getActiveTrackColor0d7_KjU() {
        return this.activeTrackColor;
    }

    /* renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2395getDisabledActiveTickColor0d7_KjU() {
        return this.disabledActiveTickColor;
    }

    /* renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2396getDisabledActiveTrackColor0d7_KjU() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2397getDisabledInactiveTickColor0d7_KjU() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2398getDisabledInactiveTrackColor0d7_KjU() {
        return this.disabledInactiveTrackColor;
    }

    /* renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2399getDisabledThumbColor0d7_KjU() {
        return this.disabledThumbColor;
    }

    /* renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2400getInactiveTickColor0d7_KjU() {
        return this.inactiveTickColor;
    }

    /* renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2401getInactiveTrackColor0d7_KjU() {
        return this.inactiveTrackColor;
    }

    /* renamed from: getThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2402getThumbColor0d7_KjU() {
        return this.thumbColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledInactiveTickColor) + kp0.d(this.disabledInactiveTrackColor, kp0.d(this.disabledActiveTickColor, kp0.d(this.disabledActiveTrackColor, kp0.d(this.disabledThumbColor, kp0.d(this.inactiveTickColor, kp0.d(this.inactiveTrackColor, kp0.d(this.activeTickColor, kp0.d(this.activeTrackColor, Color.m4768hashCodeimpl(this.thumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: thumbColor-vNxB06k$material3, reason: not valid java name */
    public final long m2403thumbColorvNxB06k$material3(boolean z) {
        return z ? this.thumbColor : this.disabledThumbColor;
    }

    /* renamed from: tickColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2404tickColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.activeTickColor : this.inactiveTickColor : z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2405trackColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.activeTrackColor : this.inactiveTrackColor : z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    public /* synthetic */ SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }
}
