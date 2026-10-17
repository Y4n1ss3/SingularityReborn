package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.DockedToolbarTokens;
import androidx.compose.material3.tokens.FabSecondaryContainerTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomAppBarDefaults {
    public static final int $stable = 0;
    private static final PaddingValues ContentPadding;
    private static final float FlexibleBottomAppBarHeight;
    private static final PaddingValues FlexibleContentPadding;
    private static final Arrangement.Horizontal FlexibleFixedHorizontalArrangement;
    private static final Arrangement.Horizontal FlexibleHorizontalArrangement;
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();
    private static final float ContainerElevation = Dp.m7611constructorimpl(0.0f);

    static {
        float f;
        float f2;
        f = AppBarKt.BottomAppBarHorizontalPadding;
        float bottomAppBarVerticalPadding = AppBarKt.getBottomAppBarVerticalPadding();
        f2 = AppBarKt.BottomAppBarHorizontalPadding;
        ContentPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(f, bottomAppBarVerticalPadding, f2, 0.0f, 8, null);
        DockedToolbarTokens dockedToolbarTokens = DockedToolbarTokens.INSTANCE;
        FlexibleContentPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(dockedToolbarTokens.m3228getContainerLeadingSpaceD9Ej5fM(), 0.0f, dockedToolbarTokens.m3231getContainerTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
        FlexibleBottomAppBarHeight = dockedToolbarTokens.m3227getContainerHeightD9Ej5fM();
        Arrangement arrangement = Arrangement.INSTANCE;
        FlexibleHorizontalArrangement = arrangement.getSpaceBetween();
        FlexibleFixedHorizontalArrangement = arrangement.m648spacedByD5KLDUw(dockedToolbarTokens.m3229getContainerMaxSpacingD9Ej5fM(), Alignment.Companion.getCenterHorizontally());
    }

    private BottomAppBarDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean exitAlwaysScrollBehavior$lambda$1$lambda$0() {
        return true;
    }

    public final BottomAppBarScrollBehavior exitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            bottomAppBarState = AppBarKt.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new defpackage.e1(10);
                composer2.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        if ((i2 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(457144034, i, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:2208)");
        }
        boolean changed = ((((i & 14) ^ 6) > 4 && composer2.changed(bottomAppBarState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(iyVar)) || (i & 48) == 32) | composer2.changed(animationSpec) | composer2.changed(decayAnimationSpec);
        Object rememberedValue2 = composer2.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ExitAlwaysScrollBehavior(bottomAppBarState, animationSpec, decayAnimationSpec, iyVar);
            composer2.updateRememberedValue(rememberedValue2);
        }
        ExitAlwaysScrollBehavior exitAlwaysScrollBehavior = (ExitAlwaysScrollBehavior) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitAlwaysScrollBehavior;
    }

    public final long getBottomAppBarFabColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:2155)");
        }
        long value = ColorSchemeKt.getValue(FabSecondaryContainerTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:2128)");
        }
        long value = ColorSchemeKt.getValue(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1639getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getFlexibleBottomAppBarHeight-D9Ej5fM$material3, reason: not valid java name */
    public final float m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3() {
        return FlexibleBottomAppBarHeight;
    }

    public final PaddingValues getFlexibleContentPadding$material3() {
        return FlexibleContentPadding;
    }

    public final Arrangement.Horizontal getFlexibleFixedHorizontalArrangement$material3() {
        return FlexibleFixedHorizontalArrangement;
    }

    public final Arrangement.Horizontal getFlexibleHorizontalArrangement$material3() {
        return FlexibleHorizontalArrangement;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:2147)");
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
