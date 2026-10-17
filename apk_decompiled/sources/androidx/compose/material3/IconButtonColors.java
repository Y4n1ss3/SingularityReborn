package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private IconButtonColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ IconButtonColors m2017copyjRlVdoo$default(IconButtonColors iconButtonColors, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = iconButtonColors.containerColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = iconButtonColors.contentColor;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = iconButtonColors.disabledContainerColor;
        }
        return iconButtonColors.m2020copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? iconButtonColors.disabledContentColor : j4);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m2018containerColorvNxB06k$material3(boolean z) {
        return z ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: contentColor-vNxB06k$material3, reason: not valid java name */
    public final long m2019contentColorvNxB06k$material3(boolean z) {
        return z ? this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final IconButtonColors m2020copyjRlVdoo(long j, long j2, long j3, long j4) {
        return new IconButtonColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.contentColor, j3 != 16 ? j3 : this.disabledContainerColor, j4 != 16 ? j4 : this.disabledContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, iconButtonColors.containerColor) && Color.m4762equalsimpl0(this.contentColor, iconButtonColors.contentColor) && Color.m4762equalsimpl0(this.disabledContainerColor, iconButtonColors.disabledContainerColor) && Color.m4762equalsimpl0(this.disabledContentColor, iconButtonColors.disabledContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2021getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2022getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2023getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m2024getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledContentColor) + kp0.d(this.disabledContainerColor, kp0.d(this.contentColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31);
    }

    public /* synthetic */ IconButtonColors(long j, long j2, long j3, long j4, dq dqVar) {
        this(j, j2, j3, j4);
    }
}
