package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long subtitleContentColor;
    private final long titleContentColor;

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5) {
        this(j, j2, j3, j4, j5, j4, null);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m2801copytNS2XkQ$default(TopAppBarColors topAppBarColors, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = topAppBarColors.containerColor;
        }
        return topAppBarColors.m2803copytNS2XkQ(j, (i & 2) != 0 ? topAppBarColors.scrolledContainerColor : j2, (i & 4) != 0 ? topAppBarColors.navigationIconContentColor : j3, (i & 8) != 0 ? topAppBarColors.titleContentColor : j4, (i & 16) != 0 ? topAppBarColors.actionIconContentColor : j5, (i & 32) != 0 ? topAppBarColors.subtitleContentColor : j6);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m2802containerColorvNxB06k$material3(float f) {
        return ColorKt.m4812lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f));
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final TopAppBarColors m2803copytNS2XkQ(long j, long j2, long j3, long j4, long j5, long j6) {
        return new TopAppBarColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.scrolledContainerColor, j3 != 16 ? j3 : this.navigationIconContentColor, j4 != 16 ? j4 : this.titleContentColor, j5 != 16 ? j5 : this.actionIconContentColor, j6 != 16 ? j6 : this.subtitleContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m4762equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m4762equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m4762equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m4762equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor) && Color.m4762equalsimpl0(this.subtitleContentColor, topAppBarColors.subtitleContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2804getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2805getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2806getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2807getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getSubtitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2808getSubtitleContentColor0d7_KjU() {
        return this.subtitleContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2809getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.subtitleContentColor) + kp0.d(this.actionIconContentColor, kp0.d(this.titleContentColor, kp0.d(this.navigationIconContentColor, kp0.d(this.scrolledContainerColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31);
    }

    @er
    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, dq dqVar) {
        this(j, j2, j3, j4, j5);
    }

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.scrolledContainerColor = j2;
        this.navigationIconContentColor = j3;
        this.titleContentColor = j4;
        this.actionIconContentColor = j5;
        this.subtitleContentColor = j6;
    }

    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, long j6, dq dqVar) {
        this(j, j2, j3, j4, j5, j6);
    }
}
