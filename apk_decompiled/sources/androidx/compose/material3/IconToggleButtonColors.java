package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
        this.checkedContainerColor = j5;
        this.checkedContentColor = j6;
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m2057copytNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = iconToggleButtonColors.containerColor;
        }
        return iconToggleButtonColors.m2058copytNS2XkQ(j, (i & 2) != 0 ? iconToggleButtonColors.contentColor : j2, (i & 4) != 0 ? iconToggleButtonColors.disabledContainerColor : j3, (i & 8) != 0 ? iconToggleButtonColors.disabledContentColor : j4, (i & 16) != 0 ? iconToggleButtonColors.checkedContainerColor : j5, (i & 32) != 0 ? iconToggleButtonColors.checkedContentColor : j6);
    }

    public final State<Color> containerColor$material3(boolean z, boolean z2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:882)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(!z ? this.disabledContainerColor : !z2 ? this.containerColor : this.checkedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final State<Color> contentColor$material3(boolean z, boolean z2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:899)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(!z ? this.disabledContentColor : !z2 ? this.contentColor : this.checkedContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m2058copytNS2XkQ(long j, long j2, long j3, long j4, long j5, long j6) {
        return new IconToggleButtonColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.contentColor, j3 != 16 ? j3 : this.disabledContainerColor, j4 != 16 ? j4 : this.disabledContentColor, j5 != 16 ? j5 : this.checkedContainerColor, j6 != 16 ? j6 : this.checkedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m4762equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m4762equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m4762equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m4762equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m4762equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2059getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2060getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2061getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2062getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2063getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m2064getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.checkedContentColor) + kp0.d(this.checkedContainerColor, kp0.d(this.disabledContentColor, kp0.d(this.disabledContainerColor, kp0.d(this.contentColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6, dq dqVar) {
        this(j, j2, j3, j4, j5, j6);
    }
}
