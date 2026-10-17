package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailDefaults {
    public static final int $stable = 0;
    public static final WideNavigationRailDefaults INSTANCE = new WideNavigationRailDefaults();
    private static final ModalWideNavigationRailProperties ModalExpandedProperties = WideNavigationRail_androidKt.createDefaultModalWideNavigationRailProperties();

    private WideNavigationRailDefaults() {
    }

    private final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2034736487, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-containerColor> (WideNavigationRail.kt:855)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    private final WideNavigationRailColors getDefaultWideWideNavigationRailColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1969597361, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-defaultWideWideNavigationRailColors> (WideNavigationRail.kt:862)");
        }
        WideNavigationRailColors defaultWideWideNavigationRailColorsCached$material3 = colorScheme.getDefaultWideWideNavigationRailColorsCached$material3();
        if (defaultWideWideNavigationRailColorsCached$material3 == null) {
            composer.startReplaceGroup(1297532678);
            int i2 = (i >> 3) & 14;
            defaultWideWideNavigationRailColorsCached$material3 = new WideNavigationRailColors(getContainerColor(composer, i2), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, getContainerColor(composer, i2)), getModalContainerColor(composer, i2), Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, getModalContainerColor(composer, i2)), null);
            colorScheme.setDefaultWideWideNavigationRailColorsCached$material3(defaultWideWideNavigationRailColorsCached$material3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1297515721);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideWideNavigationRailColorsCached$material3;
    }

    private final long getModalContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1008951947, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalContainerColor> (WideNavigationRail.kt:858)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WideNavigationRailColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(255272712, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:820)");
        }
        WideNavigationRailColors defaultWideWideNavigationRailColors = getDefaultWideWideNavigationRailColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideWideNavigationRailColors;
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final WideNavigationRailColors m2843colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long containerColor = (i2 & 1) != 0 ? INSTANCE.getContainerColor(composer, 6) : j;
        long m1797contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(containerColor, composer, i & 14) : j2;
        long value = (i2 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6) : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m1797contentColorForek8zF_U2 = (i2 & 16) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(value, composer, (i >> 6) & 14) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239918099, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:846)");
        }
        WideNavigationRailColors m2837copyt635Npw = getDefaultWideWideNavigationRailColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i >> 12) & 112).m2837copyt635Npw(containerColor, m1797contentColorForek8zF_U, value, m4760copywmQWz5c$default, m1797contentColorForek8zF_U2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2837copyt635Npw;
    }

    public final Arrangement.Vertical getArrangement() {
        return Arrangement.INSTANCE.getTop();
    }

    public final Shape getModalCollapsedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(926228775, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalCollapsedShape> (WideNavigationRail.kt:806)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    public final ModalWideNavigationRailProperties getModalExpandedProperties() {
        return ModalExpandedProperties;
    }

    public final Shape getModalExpandedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1865689797, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalExpandedShape> (WideNavigationRail.kt:810)");
        }
        Shape value = ShapesKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756160851, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-shape> (WideNavigationRail.kt:790)");
        }
        Shape value = ShapesKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1769402286, i, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-windowInsets> (WideNavigationRail.kt:800)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m845plusgK_yJZ4(companion.m860getVerticalJoeWqyM(), companion.m858getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }
}
