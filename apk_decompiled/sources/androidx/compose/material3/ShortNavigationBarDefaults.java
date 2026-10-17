package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortNavigationBarDefaults {
    public static final int $stable = 0;
    public static final ShortNavigationBarDefaults INSTANCE = new ShortNavigationBarDefaults();

    private ShortNavigationBarDefaults() {
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name */
    public final int m2383getArrangementLnnQw40() {
        return ShortNavigationBarArrangement.Companion.m2382getEqualWeightLnnQw40();
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-159508825, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-containerColor> (ShortNavigationBar.kt:262)");
        }
        long value = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(133067559, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-contentColor> (ShortNavigationBar.kt:266)");
        }
        long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(getContainerColor(composer, i & 14), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1797contentColorForek8zF_U;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424843026, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-windowInsets> (ShortNavigationBar.kt:276)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m845plusgK_yJZ4(companion.m855getHorizontalJoeWqyM(), companion.m853getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }
}
