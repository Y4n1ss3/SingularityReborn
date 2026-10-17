package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:344)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3 = getDefaultNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationBarItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m2167colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i, int i2) {
        long j8;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:369)");
        } else {
            j8 = m4797getUnspecified0d7_KjU;
        }
        NavigationBarItemColors m2156copy4JmcsL4 = getDefaultNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2156copy4JmcsL4(j8, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2156copy4JmcsL4;
    }

    @er
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m2168colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIconColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveIconColor(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor(), composer, 6) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:412)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value, value2, value3, value4, value5, Color.m4760copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached$material3 = colorScheme.getDefaultNavigationBarItemColorsCached$material3();
        if (defaultNavigationBarItemColorsCached$material3 != null) {
            return defaultNavigationBarItemColorsCached$material3;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getItemInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
