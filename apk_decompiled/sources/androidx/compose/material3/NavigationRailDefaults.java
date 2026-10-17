package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;
    public static final NavigationRailDefaults INSTANCE = new NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1949394041, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:329)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1546379058, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:335)");
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
