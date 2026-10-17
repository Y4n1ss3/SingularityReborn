package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long modalContainerColor;
    private final long modalContentColor;
    private final long modalScrimColor;

    private WideNavigationRailColors(long j, long j2, long j3, long j4, long j5) {
        this.containerColor = j;
        this.contentColor = j2;
        this.modalContainerColor = j3;
        this.modalScrimColor = j4;
        this.modalContentColor = j5;
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ WideNavigationRailColors m2836copyt635Npw$default(WideNavigationRailColors wideNavigationRailColors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wideNavigationRailColors.containerColor;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j2 = wideNavigationRailColors.contentColor;
        }
        return wideNavigationRailColors.m2837copyt635Npw(j6, j2, (i & 4) != 0 ? wideNavigationRailColors.modalContainerColor : j3, (i & 8) != 0 ? wideNavigationRailColors.modalScrimColor : j4, (i & 16) != 0 ? wideNavigationRailColors.modalContentColor : j5);
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final WideNavigationRailColors m2837copyt635Npw(long j, long j2, long j3, long j4, long j5) {
        return new WideNavigationRailColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.contentColor, j3 != 16 ? j3 : this.modalContainerColor, j4 != 16 ? j4 : this.modalScrimColor, j5 != 16 ? j5 : this.modalContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WideNavigationRailColors)) {
            return false;
        }
        WideNavigationRailColors wideNavigationRailColors = (WideNavigationRailColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, wideNavigationRailColors.containerColor) && Color.m4762equalsimpl0(this.contentColor, wideNavigationRailColors.contentColor) && Color.m4762equalsimpl0(this.modalContainerColor, wideNavigationRailColors.modalContainerColor) && Color.m4762equalsimpl0(this.modalScrimColor, wideNavigationRailColors.modalScrimColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2838getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2839getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getModalContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2840getModalContainerColor0d7_KjU() {
        return this.modalContainerColor;
    }

    /* renamed from: getModalContentColor-0d7_KjU, reason: not valid java name */
    public final long m2841getModalContentColor0d7_KjU() {
        return this.modalContentColor;
    }

    /* renamed from: getModalScrimColor-0d7_KjU, reason: not valid java name */
    public final long m2842getModalScrimColor0d7_KjU() {
        return this.modalScrimColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.modalContentColor) + kp0.d(this.modalScrimColor, kp0.d(this.modalContainerColor, kp0.d(this.contentColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31), 31);
    }

    public /* synthetic */ WideNavigationRailColors(long j, long j2, long j3, long j4, long j5, dq dqVar) {
        this(j, j2, j3, j4, j5);
    }
}
