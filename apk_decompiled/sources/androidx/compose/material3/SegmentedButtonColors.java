package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    private SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.activeContainerColor = j;
        this.activeContentColor = j2;
        this.activeBorderColor = j3;
        this.inactiveContainerColor = j4;
        this.inactiveContentColor = j5;
        this.inactiveBorderColor = j6;
        this.disabledActiveContainerColor = j7;
        this.disabledActiveContentColor = j8;
        this.disabledActiveBorderColor = j9;
        this.disabledInactiveContainerColor = j10;
        this.disabledInactiveContentColor = j11;
        this.disabledInactiveBorderColor = j12;
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m2335copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15 = (i & 1) != 0 ? segmentedButtonColors.activeContainerColor : j;
        long j16 = (i & 2) != 0 ? segmentedButtonColors.activeContentColor : j2;
        long j17 = (i & 4) != 0 ? segmentedButtonColors.activeBorderColor : j3;
        long j18 = (i & 8) != 0 ? segmentedButtonColors.inactiveContainerColor : j4;
        long j19 = (i & 16) != 0 ? segmentedButtonColors.inactiveContentColor : j5;
        long j20 = (i & 32) != 0 ? segmentedButtonColors.inactiveBorderColor : j6;
        long j21 = (i & 64) != 0 ? segmentedButtonColors.disabledActiveContainerColor : j7;
        long j22 = j15;
        long j23 = (i & Fields.SpotShadowColor) != 0 ? segmentedButtonColors.disabledActiveContentColor : j8;
        long j24 = (i & Fields.RotationX) != 0 ? segmentedButtonColors.disabledActiveBorderColor : j9;
        long j25 = (i & Fields.RotationY) != 0 ? segmentedButtonColors.disabledInactiveContainerColor : j10;
        long j26 = (i & Fields.RotationZ) != 0 ? segmentedButtonColors.disabledInactiveContentColor : j11;
        if ((i & Fields.CameraDistance) != 0) {
            j14 = j26;
            j13 = segmentedButtonColors.disabledInactiveBorderColor;
        } else {
            j13 = j12;
            j14 = j26;
        }
        return segmentedButtonColors.m2339copy2qZNXz8(j22, j16, j17, j18, j19, j20, j21, j23, j24, j25, j14, j13);
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2336borderColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeBorderColor : (!z || z2) ? (z || !z2) ? this.disabledInactiveBorderColor : this.disabledActiveBorderColor : this.inactiveBorderColor;
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2337containerColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeContainerColor : (!z || z2) ? (z || !z2) ? this.disabledInactiveContainerColor : this.disabledActiveContainerColor : this.inactiveContainerColor;
    }

    /* renamed from: contentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2338contentColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeContentColor : (!z || z2) ? (z || !z2) ? this.disabledInactiveContentColor : this.disabledActiveContentColor : this.inactiveContentColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2339copy2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new SegmentedButtonColors(j != 16 ? j : this.activeContainerColor, j2 != 16 ? j2 : this.activeContentColor, j3 != 16 ? j3 : this.activeBorderColor, j4 != 16 ? j4 : this.inactiveContainerColor, j5 != 16 ? j5 : this.inactiveContentColor, j6 != 16 ? j6 : this.inactiveBorderColor, j7 != 16 ? j7 : this.disabledActiveContainerColor, j8 != 16 ? j8 : this.disabledActiveContentColor, j9 != 16 ? j9 : this.disabledActiveBorderColor, j10 != 16 ? j10 : this.disabledInactiveContainerColor, j11 != 16 ? j11 : this.disabledInactiveContentColor, j12 != 16 ? j12 : this.disabledInactiveBorderColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.m4762equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m4762equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m4762equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m4762equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m4762equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m4762equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m4762equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m4762equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m4762equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m4762equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m4762equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m4762equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2340getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2341getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2342getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2343getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2344getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2345getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2346getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2347getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2348getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2349getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2350getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2351getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledInactiveContainerColor) + kp0.d(this.disabledInactiveContentColor, kp0.d(this.disabledInactiveBorderColor, kp0.d(this.disabledActiveContainerColor, kp0.d(this.disabledActiveContentColor, kp0.d(this.disabledActiveBorderColor, kp0.d(this.inactiveContainerColor, kp0.d(this.inactiveContentColor, kp0.d(this.inactiveBorderColor, kp0.d(this.activeContainerColor, kp0.d(this.activeContentColor, Color.m4768hashCodeimpl(this.activeBorderColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public /* synthetic */ SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }
}
