package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    private MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m2132copytNS2XkQ$default(MenuItemColors menuItemColors, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = menuItemColors.textColor;
        }
        return menuItemColors.m2133copytNS2XkQ(j, (i & 2) != 0 ? menuItemColors.leadingIconColor : j2, (i & 4) != 0 ? menuItemColors.trailingIconColor : j3, (i & 8) != 0 ? menuItemColors.disabledTextColor : j4, (i & 16) != 0 ? menuItemColors.disabledLeadingIconColor : j5, (i & 32) != 0 ? menuItemColors.disabledTrailingIconColor : j6);
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m2133copytNS2XkQ(long j, long j2, long j3, long j4, long j5, long j6) {
        return new MenuItemColors(j != 16 ? j : this.textColor, j2 != 16 ? j2 : this.leadingIconColor, j3 != 16 ? j3 : this.trailingIconColor, j4 != 16 ? j4 : this.disabledTextColor, j5 != 16 ? j5 : this.disabledLeadingIconColor, j6 != 16 ? j6 : this.disabledTrailingIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.m4762equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m4762equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m4762equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m4762equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m4762equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m4762equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2134getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2135getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2136getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2137getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m2138getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2139getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledTrailingIconColor) + kp0.d(this.disabledLeadingIconColor, kp0.d(this.disabledTextColor, kp0.d(this.trailingIconColor, kp0.d(this.leadingIconColor, Color.m4768hashCodeimpl(this.textColor) * 31, 31), 31), 31), 31);
    }

    /* renamed from: leadingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m2140leadingIconColorvNxB06k$material3(boolean z) {
        return z ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    /* renamed from: textColor-vNxB06k$material3, reason: not valid java name */
    public final long m2141textColorvNxB06k$material3(boolean z) {
        return z ? this.textColor : this.disabledTextColor;
    }

    /* renamed from: trailingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m2142trailingIconColorvNxB06k$material3(boolean z) {
        return z ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public /* synthetic */ MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6, dq dqVar) {
        this(j, j2, j3, j4, j5, j6);
    }
}
