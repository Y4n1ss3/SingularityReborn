package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.checkedBorderColor = j3;
        this.checkedIconColor = j4;
        this.uncheckedThumbColor = j5;
        this.uncheckedTrackColor = j6;
        this.uncheckedBorderColor = j7;
        this.uncheckedIconColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledCheckedBorderColor = j11;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = j13;
        this.disabledUncheckedTrackColor = j14;
        this.disabledUncheckedBorderColor = j15;
        this.disabledUncheckedIconColor = j16;
    }

    /* renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m2472copyQ_H9qLU$default(SwitchColors switchColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        SwitchColors switchColors2;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32 = (i & 1) != 0 ? switchColors.checkedThumbColor : j;
        long j33 = (i & 2) != 0 ? switchColors.checkedTrackColor : j2;
        long j34 = (i & 4) != 0 ? switchColors.checkedBorderColor : j3;
        long j35 = (i & 8) != 0 ? switchColors.checkedIconColor : j4;
        long j36 = (i & 16) != 0 ? switchColors.uncheckedThumbColor : j5;
        long j37 = (i & 32) != 0 ? switchColors.uncheckedTrackColor : j6;
        long j38 = (i & 64) != 0 ? switchColors.uncheckedBorderColor : j7;
        long j39 = j32;
        long j40 = (i & Fields.SpotShadowColor) != 0 ? switchColors.uncheckedIconColor : j8;
        long j41 = (i & Fields.RotationX) != 0 ? switchColors.disabledCheckedThumbColor : j9;
        long j42 = (i & Fields.RotationY) != 0 ? switchColors.disabledCheckedTrackColor : j10;
        long j43 = (i & Fields.RotationZ) != 0 ? switchColors.disabledCheckedBorderColor : j11;
        long j44 = (i & Fields.CameraDistance) != 0 ? switchColors.disabledCheckedIconColor : j12;
        long j45 = (i & Fields.TransformOrigin) != 0 ? switchColors.disabledUncheckedThumbColor : j13;
        long j46 = (i & 8192) != 0 ? switchColors.disabledUncheckedTrackColor : j14;
        long j47 = (i & Fields.Clip) != 0 ? switchColors.disabledUncheckedBorderColor : j15;
        if ((i & Fields.CompositingStrategy) != 0) {
            j18 = j47;
            j17 = switchColors.disabledUncheckedIconColor;
            j20 = j41;
            j21 = j42;
            j22 = j43;
            j23 = j44;
            j24 = j45;
            j25 = j46;
            j26 = j33;
            j27 = j34;
            j28 = j35;
            j29 = j36;
            j30 = j37;
            j31 = j38;
            j19 = j40;
            switchColors2 = switchColors;
        } else {
            j17 = j16;
            j18 = j47;
            j19 = j40;
            j20 = j41;
            j21 = j42;
            j22 = j43;
            j23 = j44;
            j24 = j45;
            j25 = j46;
            switchColors2 = switchColors;
            j26 = j33;
            j27 = j34;
            j28 = j35;
            j29 = j36;
            j30 = j37;
            j31 = j38;
        }
        return switchColors2.m2474copyQ_H9qLU(j39, j26, j27, j28, j29, j30, j31, j19, j20, j21, j22, j23, j24, j25, j18, j17);
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2473borderColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedBorderColor : this.uncheckedBorderColor : z2 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m2474copyQ_H9qLU(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new SwitchColors(j != 16 ? j : this.checkedThumbColor, j2 != 16 ? j2 : this.checkedTrackColor, j3 != 16 ? j3 : this.checkedBorderColor, j4 != 16 ? j4 : this.checkedIconColor, j5 != 16 ? j5 : this.uncheckedThumbColor, j6 != 16 ? j6 : this.uncheckedTrackColor, j7 != 16 ? j7 : this.uncheckedBorderColor, j8 != 16 ? j8 : this.uncheckedIconColor, j9 != 16 ? j9 : this.disabledCheckedThumbColor, j10 != 16 ? j10 : this.disabledCheckedTrackColor, j11 != 16 ? j11 : this.disabledCheckedBorderColor, j12 != 16 ? j12 : this.disabledCheckedIconColor, j13 != 16 ? j13 : this.disabledUncheckedThumbColor, j14 != 16 ? j14 : this.disabledUncheckedTrackColor, j15 != 16 ? j15 : this.disabledUncheckedBorderColor, j16 != 16 ? j16 : this.disabledUncheckedIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return Color.m4762equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m4762equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m4762equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m4762equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m4762equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m4762equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m4762equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m4762equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m4762equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m4762equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m4762equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m4762equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m4762equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m4762equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m4762equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m4762equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2475getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2476getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2477getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2478getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2479getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2480getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2481getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2482getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2483getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2484getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2485getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2486getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2487getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2488getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2489getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2490getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledUncheckedIconColor) + kp0.d(this.disabledUncheckedBorderColor, kp0.d(this.disabledUncheckedTrackColor, kp0.d(this.disabledUncheckedThumbColor, kp0.d(this.disabledCheckedIconColor, kp0.d(this.disabledCheckedBorderColor, kp0.d(this.disabledCheckedTrackColor, kp0.d(this.disabledCheckedThumbColor, kp0.d(this.uncheckedIconColor, kp0.d(this.uncheckedBorderColor, kp0.d(this.uncheckedTrackColor, kp0.d(this.uncheckedThumbColor, kp0.d(this.checkedIconColor, kp0.d(this.checkedBorderColor, kp0.d(this.checkedTrackColor, Color.m4768hashCodeimpl(this.checkedThumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2491iconColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedIconColor : this.uncheckedIconColor : z2 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    /* renamed from: thumbColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2492thumbColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedThumbColor : this.uncheckedThumbColor : z2 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2493trackColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedTrackColor : this.uncheckedTrackColor : z2 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    public /* synthetic */ SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }
}
