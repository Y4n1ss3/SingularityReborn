package androidx.compose.material3;

import androidx.compose.material3.NavigationItemIconPosition;
import androidx.compose.material3.tokens.NavigationRailColorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final WideNavigationRailItemDefaults INSTANCE = new WideNavigationRailItemDefaults();

    private WideNavigationRailItemDefaults() {
    }

    private final NavigationItemColors getDefaultWideNavigationRailItemColors(ColorScheme colorScheme) {
        NavigationItemColors defaultWideNavigationRailItemColorsCached$material3 = colorScheme.getDefaultWideNavigationRailItemColorsCached$material3();
        if (defaultWideNavigationRailItemColorsCached$material3 != null) {
            return defaultWideNavigationRailItemColorsCached$material3;
        }
        NavigationRailColorTokens navigationRailColorTokens = NavigationRailColorTokens.INSTANCE;
        NavigationItemColors navigationItemColors = new NavigationItemColors(ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemActiveIcon()), ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemActiveLabelText()), ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemActiveIndicator()), ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemInactiveIcon()), ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemInactiveLabelText()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemInactiveIcon()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailColorTokens.getItemInactiveLabelText()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultWideNavigationRailItemColorsCached$material3(navigationItemColors);
        return navigationItemColors;
    }

    public final NavigationItemColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911821421, i, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:889)");
        }
        NavigationItemColors defaultWideNavigationRailItemColors = getDefaultWideNavigationRailItemColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideNavigationRailItemColors;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationItemColors m2844colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i, int i2) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIcon(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveLabelText(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIndicator(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveIcon(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText(), composer, 6) : j5;
        if ((i2 & 32) != 0) {
            long j13 = value4;
            j9 = Color.m4760copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j13;
        } else {
            j8 = value4;
            j9 = j6;
        }
        if ((i2 & 64) != 0) {
            long j14 = value5;
            j11 = Color.m4760copywmQWz5c$default(j14, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j10 = j14;
        } else {
            j10 = value5;
            j11 = j7;
        }
        if (ComposerKt.isTraceInProgress()) {
            j12 = value;
            ComposerKt.traceEventStart(1759081702, i, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:914)");
        } else {
            j12 = value;
        }
        NavigationItemColors m2187copy4JmcsL4 = getDefaultWideNavigationRailItemColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2187copy4JmcsL4(j12, value2, value3, j8, j10, j9, j11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2187copy4JmcsL4;
    }

    /* renamed from: iconPositionFor-s8pcRp0, reason: not valid java name */
    public final int m2845iconPositionFors8pcRp0(boolean z) {
        NavigationItemIconPosition.Companion companion = NavigationItemIconPosition.Companion;
        return z ? companion.m2204getStartxw1Ddg() : companion.m2205getTopxw1Ddg();
    }
}
