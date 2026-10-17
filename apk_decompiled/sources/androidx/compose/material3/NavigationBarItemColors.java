package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationBarItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
        this.disabledIconColor = j6;
        this.disabledTextColor = j7;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationBarItemColors m2156copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new NavigationBarItemColors(j != 16 ? j : this.selectedIconColor, j2 != 16 ? j2 : this.selectedTextColor, j3 != 16 ? j3 : this.selectedIndicatorColor, j4 != 16 ? j4 : this.unselectedIconColor, j5 != 16 ? j5 : this.unselectedTextColor, j6 != 16 ? j6 : this.disabledIconColor, j7 != 16 ? j7 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        return Color.m4762equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m4762equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m4762equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m4762equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m4762equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor) && Color.m4762equalsimpl0(this.disabledIconColor, navigationBarItemColors.disabledIconColor) && Color.m4762equalsimpl0(this.disabledTextColor, navigationBarItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2157getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2158getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3, reason: not valid java name */
    public final long m2159getIndicatorColor0d7_KjU$material3() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2160getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2161getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2162getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2163getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2164getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledTextColor) + kp0.d(this.disabledIconColor, kp0.d(this.selectedIndicatorColor, kp0.d(this.unselectedTextColor, kp0.d(this.selectedTextColor, kp0.d(this.unselectedIconColor, Color.m4768hashCodeimpl(this.selectedIconColor) * 31, 31), 31), 31), 31), 31);
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2165iconColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledIconColor : z ? this.selectedIconColor : this.unselectedIconColor;
    }

    /* renamed from: textColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2166textColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledTextColor : z ? this.selectedTextColor : this.unselectedTextColor;
    }

    public /* synthetic */ NavigationBarItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7);
    }
}
