package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortNavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final ShortNavigationBarItemDefaults INSTANCE = new ShortNavigationBarItemDefaults();

    private ShortNavigationBarItemDefaults() {
    }

    public final NavigationItemColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(954437293, i, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:287)");
        }
        NavigationItemColors defaultShortNavigationBarItemColors$material3 = getDefaultShortNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultShortNavigationBarItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationItemColors m2384colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i, int i2) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIconColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveIconColor(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor(), composer, 6) : j5;
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
            ComposerKt.traceEventStart(1801697574, i, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:312)");
        } else {
            j12 = value;
        }
        NavigationItemColors m2187copy4JmcsL4 = getDefaultShortNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2187copy4JmcsL4(j12, value2, value3, j8, j10, j9, j11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2187copy4JmcsL4;
    }

    public final NavigationItemColors getDefaultShortNavigationBarItemColors$material3(ColorScheme colorScheme) {
        NavigationItemColors defaultShortNavigationBarItemColorsCached$material3 = colorScheme.getDefaultShortNavigationBarItemColorsCached$material3();
        if (defaultShortNavigationBarItemColorsCached$material3 != null) {
            return defaultShortNavigationBarItemColorsCached$material3;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationItemColors navigationItemColors = new NavigationItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultShortNavigationBarItemColorsCached$material3(navigationItemColors);
        return navigationItemColors;
    }
}
