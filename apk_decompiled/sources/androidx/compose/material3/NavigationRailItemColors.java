package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
        this.disabledIconColor = j6;
        this.disabledTextColor = j7;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationRailItemColors m2220copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new NavigationRailItemColors(j != 16 ? j : this.selectedIconColor, j2 != 16 ? j2 : this.selectedTextColor, j3 != 16 ? j3 : this.selectedIndicatorColor, j4 != 16 ? j4 : this.unselectedIconColor, j5 != 16 ? j5 : this.unselectedTextColor, j6 != 16 ? j6 : this.disabledIconColor, j7 != 16 ? j7 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        return Color.m4762equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m4762equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m4762equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m4762equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m4762equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor) && Color.m4762equalsimpl0(this.disabledIconColor, navigationRailItemColors.disabledIconColor) && Color.m4762equalsimpl0(this.disabledTextColor, navigationRailItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2221getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2222getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3, reason: not valid java name */
    public final long m2223getIndicatorColor0d7_KjU$material3() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2224getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2225getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2226getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2227getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2228getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledTextColor) + kp0.d(this.disabledIconColor, kp0.d(this.selectedIndicatorColor, kp0.d(this.unselectedTextColor, kp0.d(this.selectedTextColor, kp0.d(this.unselectedIconColor, Color.m4768hashCodeimpl(this.selectedIconColor) * 31, 31), 31), 31), 31), 31);
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2229iconColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledIconColor : z ? this.selectedIconColor : this.unselectedIconColor;
    }

    /* renamed from: textColor-WaAFU9c$material3, reason: not valid java name */
    public final long m2230textColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledTextColor : z ? this.selectedTextColor : this.unselectedTextColor;
    }

    public /* synthetic */ NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7);
    }
}
