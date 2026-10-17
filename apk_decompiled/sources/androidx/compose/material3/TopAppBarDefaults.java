package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.AppBarLargeFlexibleTokens;
import androidx.compose.material3.tokens.AppBarLargeTokens;
import androidx.compose.material3.tokens.AppBarMediumFlexibleTokens;
import androidx.compose.material3.tokens.AppBarMediumTokens;
import androidx.compose.material3.tokens.AppBarSmallTokens;
import androidx.compose.material3.tokens.AppBarTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import defpackage.er;
import defpackage.iy;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();
    private static final float LargeAppBarCollapsedHeight;
    private static final float LargeAppBarExpandedHeight;
    private static final float LargeFlexibleAppBarWithSubtitleExpandedHeight;
    private static final float LargeFlexibleAppBarWithoutSubtitleExpandedHeight;
    private static final float MediumAppBarCollapsedHeight;
    private static final float MediumAppBarExpandedHeight;
    private static final float MediumFlexibleAppBarWithSubtitleExpandedHeight;
    private static final float MediumFlexibleAppBarWithoutSubtitleExpandedHeight;
    private static final float TopAppBarExpandedHeight;

    static {
        AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.INSTANCE;
        TopAppBarExpandedHeight = appBarSmallTokens.m3013getContainerHeightD9Ej5fM();
        MediumAppBarCollapsedHeight = appBarSmallTokens.m3013getContainerHeightD9Ej5fM();
        MediumAppBarExpandedHeight = AppBarMediumTokens.INSTANCE.m3012getContainerHeightD9Ej5fM();
        AppBarMediumFlexibleTokens appBarMediumFlexibleTokens = AppBarMediumFlexibleTokens.INSTANCE;
        MediumFlexibleAppBarWithoutSubtitleExpandedHeight = appBarMediumFlexibleTokens.m3010getContainerHeightD9Ej5fM();
        MediumFlexibleAppBarWithSubtitleExpandedHeight = appBarMediumFlexibleTokens.m3011getLargeContainerHeightD9Ej5fM();
        LargeAppBarCollapsedHeight = appBarSmallTokens.m3013getContainerHeightD9Ej5fM();
        LargeAppBarExpandedHeight = AppBarLargeTokens.INSTANCE.m3009getContainerHeightD9Ej5fM();
        AppBarLargeFlexibleTokens appBarLargeFlexibleTokens = AppBarLargeFlexibleTokens.INSTANCE;
        LargeFlexibleAppBarWithoutSubtitleExpandedHeight = appBarLargeFlexibleTokens.m3007getContainerHeightD9Ej5fM();
        LargeFlexibleAppBarWithSubtitleExpandedHeight = appBarLargeFlexibleTokens.m3008getLargeContainerHeightD9Ej5fM();
    }

    private TopAppBarDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enterAlwaysScrollBehavior$lambda$5$lambda$4() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enterAlwaysScrollBehavior$lambda$7$lambda$6() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean exitUntilCollapsedScrollBehavior$lambda$10$lambda$9() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pinnedScrollBehavior$lambda$2$lambda$1() {
        return true;
    }

    @er
    public final TopAppBarColors centerAlignedTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1540)");
        }
        TopAppBarColors defaultTopAppBarColors$material3 = getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3;
    }

    @er
    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2810centerAlignedTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1570)");
        }
        TopAppBarColors m2801copytNS2XkQ$default = TopAppBarColors.m2801copytNS2XkQ$default(getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)), m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, 0L, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2801copytNS2XkQ$default;
    }

    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, boolean z, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new sn0(15);
                composer2.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        iy iyVar2 = iyVar;
        if ((i2 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer2, 6);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(53729710, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1762)");
        }
        boolean changed = ((((i & 14) ^ 6) > 4 && composer2.changed(topAppBarState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(iyVar2)) || (i & 48) == 32) | composer2.changed(animationSpec) | composer2.changed(decayAnimationSpec) | ((((57344 & i) ^ 24576) > 16384 && composer2.changed(z)) || (i & 24576) == 16384);
        Object rememberedValue2 = composer2.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, iyVar2, z);
            composer2.updateRememberedValue(rememberedValue2);
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = (EnterAlwaysScrollBehavior) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterAlwaysScrollBehavior;
    }

    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new sn0(14);
                composer2.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        if ((i2 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer2, 6);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1801)");
        }
        boolean changed = ((((i & 14) ^ 6) > 4 && composer2.changed(topAppBarState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(iyVar)) || (i & 48) == 32) | composer2.changed(animationSpec) | composer2.changed(decayAnimationSpec);
        Object rememberedValue2 = composer2.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, iyVar);
            composer2.updateRememberedValue(rememberedValue2);
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = (ExitUntilCollapsedScrollBehavior) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitUntilCollapsedScrollBehavior;
    }

    public final TopAppBarColors getDefaultTopAppBarColors$material3(ColorScheme colorScheme) {
        TopAppBarColors defaultTopAppBarColorsCached$material3 = colorScheme.getDefaultTopAppBarColorsCached$material3();
        if (defaultTopAppBarColorsCached$material3 != null) {
            return defaultTopAppBarColorsCached$material3;
        }
        AppBarTokens appBarTokens = AppBarTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, appBarTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, appBarTokens.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, appBarTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, appBarTokens.getTitleColor()), ColorSchemeKt.fromToken(colorScheme, appBarTokens.getTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, appBarTokens.getSubtitleColor()), null);
        colorScheme.setDefaultTopAppBarColorsCached$material3(topAppBarColors);
        return topAppBarColors;
    }

    /* renamed from: getLargeAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2811getLargeAppBarCollapsedHeightD9Ej5fM() {
        return LargeAppBarCollapsedHeight;
    }

    /* renamed from: getLargeAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2812getLargeAppBarExpandedHeightD9Ej5fM() {
        return LargeAppBarExpandedHeight;
    }

    /* renamed from: getLargeFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() {
        return LargeFlexibleAppBarWithSubtitleExpandedHeight;
    }

    /* renamed from: getLargeFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2814getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM() {
        return LargeFlexibleAppBarWithoutSubtitleExpandedHeight;
    }

    /* renamed from: getMediumAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2815getMediumAppBarCollapsedHeightD9Ej5fM() {
        return MediumAppBarCollapsedHeight;
    }

    /* renamed from: getMediumAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2816getMediumAppBarExpandedHeightD9Ej5fM() {
        return MediumAppBarExpandedHeight;
    }

    /* renamed from: getMediumFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() {
        return MediumFlexibleAppBarWithSubtitleExpandedHeight;
    }

    /* renamed from: getMediumFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2818getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM() {
        return MediumFlexibleAppBarWithoutSubtitleExpandedHeight;
    }

    /* renamed from: getTopAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2819getTopAppBarExpandedHeightD9Ej5fM() {
        return TopAppBarExpandedHeight;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1526)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m845plusgK_yJZ4(companion.m855getHorizontalJoeWqyM(), companion.m859getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }

    @er
    public final TopAppBarColors largeTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1639)");
        }
        TopAppBarColors defaultTopAppBarColors$material3 = getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3;
    }

    @er
    /* renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2820largeTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1670)");
        }
        TopAppBarColors m2801copytNS2XkQ$default = TopAppBarColors.m2801copytNS2XkQ$default(getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)), m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, 0L, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2801copytNS2XkQ$default;
    }

    @er
    public final TopAppBarColors mediumTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1589)");
        }
        TopAppBarColors defaultTopAppBarColors$material3 = getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3;
    }

    @er
    /* renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2821mediumTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1620)");
        }
        TopAppBarColors m2801copytNS2XkQ$default = TopAppBarColors.m2801copytNS2XkQ$default(getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)), m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, 0L, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2801copytNS2XkQ$default;
    }

    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState topAppBarState, iy iyVar, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new sn0(16);
                composer2.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1695)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer2.changed(topAppBarState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(iyVar)) || (i & 48) == 32);
        Object rememberedValue2 = composer2.rememberedValue();
        if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new PinnedScrollBehavior(topAppBarState, iyVar);
            composer2.updateRememberedValue(rememberedValue2);
        }
        PinnedScrollBehavior pinnedScrollBehavior = (PinnedScrollBehavior) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pinnedScrollBehavior;
    }

    public final TopAppBarColors topAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1444)");
        }
        TopAppBarColors defaultTopAppBarColors$material3 = getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3;
    }

    /* renamed from: topAppBarColors-5tl4gsc, reason: not valid java name */
    public final TopAppBarColors m2822topAppBarColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1325733438, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1467)");
        }
        TopAppBarColors m2803copytNS2XkQ = getDefaultTopAppBarColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2803copytNS2XkQ(m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2803copytNS2XkQ;
    }

    @er
    /* renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ TopAppBarColors m2823topAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1499)");
        }
        TopAppBarColors m2822topAppBarColors5tl4gsc = m2822topAppBarColors5tl4gsc(m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU4, composer, (65534 & i) | ((i << 6) & 458752) | ((i << 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2822topAppBarColors5tl4gsc;
    }

    @er
    public final /* synthetic */ TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, iy iyVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        TopAppBarState topAppBarState2 = topAppBarState;
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new sn0(17);
                composer.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        iy iyVar2 = iyVar;
        if ((i2 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1723)");
        }
        TopAppBarScrollBehavior enterAlwaysScrollBehavior = enterAlwaysScrollBehavior(topAppBarState2, iyVar2, animationSpec2, decayAnimationSpec, false, composer, (i & 14) | 24576 | (i & 112) | (i & 896) | (i & 7168) | ((i << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterAlwaysScrollBehavior;
    }
}
