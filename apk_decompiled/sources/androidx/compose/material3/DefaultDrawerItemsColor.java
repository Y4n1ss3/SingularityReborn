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
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private DefaultDrawerItemsColor(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.selectedIconColor = j;
        this.unselectedIconColor = j2;
        this.selectedTextColor = j3;
        this.unselectedTextColor = j4;
        this.selectedContainerColor = j5;
        this.unselectedContainerColor = j6;
        this.selectedBadgeColor = j7;
        this.unselectedBadgeColor = j8;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> badgeColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1249)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(z ? this.selectedBadgeColor : this.unselectedBadgeColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> containerColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1242)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(z ? this.selectedContainerColor : this.unselectedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.m4762equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.m4762equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.m4762equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.m4762equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.m4762equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.m4762equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.m4762equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor)) {
            return Color.m4762equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor);
        }
        return false;
    }

    /* renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1911getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1912getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1913getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1914getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1915getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    /* renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1916getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1917getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1918getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.unselectedBadgeColor) + kp0.d(this.selectedBadgeColor, kp0.d(this.unselectedContainerColor, kp0.d(this.selectedContainerColor, kp0.d(this.unselectedTextColor, kp0.d(this.selectedTextColor, kp0.d(this.unselectedIconColor, Color.m4768hashCodeimpl(this.selectedIconColor) * 31, 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> iconColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1232)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(z ? this.selectedIconColor : this.unselectedIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> textColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1237)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(z ? this.selectedTextColor : this.unselectedTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    public /* synthetic */ DefaultDrawerItemsColor(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }
}
