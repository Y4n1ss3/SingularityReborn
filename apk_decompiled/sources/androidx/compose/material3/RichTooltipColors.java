package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    private RichTooltipColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.titleContentColor = j3;
        this.actionContentColor = j4;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m2289copyjRlVdoo$default(RichTooltipColors richTooltipColors, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = richTooltipColors.containerColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = richTooltipColors.contentColor;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = richTooltipColors.titleContentColor;
        }
        return richTooltipColors.m2290copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? richTooltipColors.actionContentColor : j4);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m2290copyjRlVdoo(long j, long j2, long j3, long j4) {
        return new RichTooltipColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.contentColor, j3 != 16 ? j3 : this.titleContentColor, j4 != 16 ? j4 : this.actionContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m4762equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m4762equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m4762equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    /* renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m2291getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2292getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2293getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2294getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.actionContentColor) + kp0.d(this.titleContentColor, kp0.d(this.contentColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31);
    }

    public /* synthetic */ RichTooltipColors(long j, long j2, long j3, long j4, dq dqVar) {
        this(j, j2, j3, j4);
    }
}
