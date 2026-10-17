package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
        this.disabledIconColor = j6;
        this.disabledTextColor = j7;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationItemColors m2187copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new NavigationItemColors(j != 16 ? j : this.selectedIconColor, j2 != 16 ? j2 : this.selectedTextColor, j3 != 16 ? j3 : this.selectedIndicatorColor, j4 != 16 ? j4 : this.unselectedIconColor, j5 != 16 ? j5 : this.unselectedTextColor, j6 != 16 ? j6 : this.disabledIconColor, j7 != 16 ? j7 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationItemColors)) {
            return false;
        }
        NavigationItemColors navigationItemColors = (NavigationItemColors) obj;
        return Color.m4762equalsimpl0(this.selectedIconColor, navigationItemColors.selectedIconColor) && Color.m4762equalsimpl0(this.unselectedIconColor, navigationItemColors.unselectedIconColor) && Color.m4762equalsimpl0(this.selectedTextColor, navigationItemColors.selectedTextColor) && Color.m4762equalsimpl0(this.unselectedTextColor, navigationItemColors.unselectedTextColor) && Color.m4762equalsimpl0(this.selectedIndicatorColor, navigationItemColors.selectedIndicatorColor) && Color.m4762equalsimpl0(this.disabledIconColor, navigationItemColors.disabledIconColor) && Color.m4762equalsimpl0(this.disabledTextColor, navigationItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2188getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2189getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2190getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2191getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2192getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2193getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2194getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledTextColor) + kp0.d(this.disabledIconColor, kp0.d(this.selectedIndicatorColor, kp0.d(this.unselectedTextColor, kp0.d(this.selectedTextColor, kp0.d(this.unselectedIconColor, Color.m4768hashCodeimpl(this.selectedIconColor) * 31, 31), 31), 31), 31), 31);
    }

    /* renamed from: iconColor-WaAFU9c, reason: not valid java name */
    public final long m2195iconColorWaAFU9c(boolean z, boolean z2) {
        return !z2 ? this.disabledIconColor : z ? this.selectedIconColor : this.unselectedIconColor;
    }

    /* renamed from: textColor-WaAFU9c, reason: not valid java name */
    public final long m2196textColorWaAFU9c(boolean z, boolean z2) {
        return !z2 ? this.disabledTextColor : z ? this.selectedTextColor : this.unselectedTextColor;
    }

    public /* synthetic */ NavigationItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7);
    }
}
