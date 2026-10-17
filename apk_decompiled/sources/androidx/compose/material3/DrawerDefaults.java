package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    private static final float DismissibleDrawerElevation;
    private static final float MaximumDrawerWidth;
    private static final float PermanentDrawerElevation;
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float ModalDrawerElevation = ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM();

    static {
        NavigationDrawerTokens navigationDrawerTokens = NavigationDrawerTokens.INSTANCE;
        PermanentDrawerElevation = navigationDrawerTokens.m3446getStandardContainerElevationD9Ej5fM();
        DismissibleDrawerElevation = navigationDrawerTokens.m3446getStandardContainerElevationD9Ej5fM();
        MaximumDrawerWidth = navigationDrawerTokens.m3443getContainerWidthD9Ej5fM();
    }

    private DrawerDefaults() {
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1797317261, i, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:1021)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getDismissibleDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1942getDismissibleDrawerElevationD9Ej5fM() {
        return DismissibleDrawerElevation;
    }

    /* renamed from: getMaximumDrawerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1943getMaximumDrawerWidthD9Ej5fM() {
        return MaximumDrawerWidth;
    }

    public final long getModalContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(706424321, i, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:1031)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getModalDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1944getModalDrawerElevationD9Ej5fM() {
        return ModalDrawerElevation;
    }

    /* renamed from: getPermanentDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1945getPermanentDrawerElevationD9Ej5fM() {
        return PermanentDrawerElevation;
    }

    public final long getScrimColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055074989, i, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:1012)");
        }
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4760copywmQWz5c$default;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(928378975, i, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:1008)");
        }
        Shape value = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getStandardContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125949421, i, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:1027)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909973510, i, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:1040)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m845plusgK_yJZ4(companion.m860getVerticalJoeWqyM(), companion.m858getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }

    @er
    public static /* synthetic */ void getContainerColor$annotations() {
    }
}
