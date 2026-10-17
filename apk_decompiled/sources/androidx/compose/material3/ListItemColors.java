package androidx.compose.material3;

import androidx.compose.ui.graphics.Fields;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListItemColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledHeadlineColor;
    private final long disabledLeadingIconColor;
    private final long disabledTrailingIconColor;
    private final long headlineColor;
    private final long leadingIconColor;
    private final long overlineColor;
    private final long supportingTextColor;
    private final long trailingIconColor;

    private ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j;
        this.headlineColor = j2;
        this.leadingIconColor = j3;
        this.overlineColor = j4;
        this.supportingTextColor = j5;
        this.trailingIconColor = j6;
        this.disabledHeadlineColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
    }

    /* renamed from: copy-5r9EGqc$default, reason: not valid java name */
    public static /* synthetic */ ListItemColors m2088copy5r9EGqc$default(ListItemColors listItemColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, Object obj) {
        long j10;
        long j11;
        long j12 = (i & 1) != 0 ? listItemColors.containerColor : j;
        long j13 = (i & 2) != 0 ? listItemColors.headlineColor : j2;
        long j14 = (i & 4) != 0 ? listItemColors.leadingIconColor : j3;
        long j15 = (i & 8) != 0 ? listItemColors.overlineColor : j4;
        long j16 = (i & 16) != 0 ? listItemColors.supportingTextColor : j5;
        long j17 = (i & 32) != 0 ? listItemColors.trailingIconColor : j6;
        long j18 = (i & 64) != 0 ? listItemColors.disabledHeadlineColor : j7;
        long j19 = j12;
        long j20 = (i & Fields.SpotShadowColor) != 0 ? listItemColors.disabledLeadingIconColor : j8;
        if ((i & Fields.RotationX) != 0) {
            j11 = j20;
            j10 = listItemColors.disabledTrailingIconColor;
        } else {
            j10 = j9;
            j11 = j20;
        }
        return listItemColors.m2090copy5r9EGqc(j19, j13, j14, j15, j16, j17, j18, j11, j10);
    }

    /* renamed from: containerColor-0d7_KjU$material3, reason: not valid java name */
    public final long m2089containerColor0d7_KjU$material3() {
        return this.containerColor;
    }

    /* renamed from: copy-5r9EGqc, reason: not valid java name */
    public final ListItemColors m2090copy5r9EGqc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        return new ListItemColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.headlineColor, j3 != 16 ? j3 : this.leadingIconColor, j4 != 16 ? j4 : this.overlineColor, j5 != 16 ? j5 : this.supportingTextColor, j6 != 16 ? j6 : this.trailingIconColor, j7 != 16 ? j7 : this.disabledHeadlineColor, j8 != 16 ? j8 : this.disabledLeadingIconColor, j9 != 16 ? j9 : this.disabledTrailingIconColor, null);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2091getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDisabledHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m2092getDisabledHeadlineColor0d7_KjU() {
        return this.disabledHeadlineColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2093getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2094getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m2095getHeadlineColor0d7_KjU() {
        return this.headlineColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2096getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getOverlineColor-0d7_KjU, reason: not valid java name */
    public final long m2097getOverlineColor0d7_KjU() {
        return this.overlineColor;
    }

    /* renamed from: getSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2098getSupportingTextColor0d7_KjU() {
        return this.supportingTextColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2099getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    /* renamed from: headlineColor-vNxB06k$material3, reason: not valid java name */
    public final long m2100headlineColorvNxB06k$material3(boolean z) {
        return z ? this.headlineColor : this.disabledHeadlineColor;
    }

    /* renamed from: leadingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m2101leadingIconColorvNxB06k$material3(boolean z) {
        return z ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    /* renamed from: overlineColor-0d7_KjU$material3, reason: not valid java name */
    public final long m2102overlineColor0d7_KjU$material3() {
        return this.overlineColor;
    }

    /* renamed from: supportingColor-0d7_KjU$material3, reason: not valid java name */
    public final long m2103supportingColor0d7_KjU$material3() {
        return this.supportingTextColor;
    }

    /* renamed from: trailingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m2104trailingIconColorvNxB06k$material3(boolean z) {
        return z ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public /* synthetic */ ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }
}
