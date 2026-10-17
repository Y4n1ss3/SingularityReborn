package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final long DefaultGlowColor = ColorKt.Color(4284900966L);
    private static final PaddingValues DefaultGlowPaddingValues = PaddingKt.m757PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
    private static final float FlingDestretchFactor = 4.0f;

    public static final OverscrollFactory defaultOverscrollFactory(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) compositionLocalAccessorScope.getCurrentValue(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) compositionLocalAccessorScope.getCurrentValue(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.m314getGlowColor0d7_KjU(), overscrollConfiguration.getDrawPadding(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destretchMultiplier-GyEprt8, reason: not valid java name */
    public static final float m224destretchMultiplierGyEprt8(int i) {
        return NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5968getSideEffectWNlRxjI()) ? 4.0f : 1.0f;
    }

    public static final OverscrollEffect rememberPlatformOverscrollEffect(Composer composer, int i) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569526143, i, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            composer.startReplaceGroup(-1555403601);
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = null;
        } else {
            composer.startReplaceGroup(-1555370896);
            boolean changed = composer.changed(context) | composer.changed(density) | composer.changed(overscrollConfiguration);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Object androidEdgeEffectOverscrollEffect2 = new AndroidEdgeEffectOverscrollEffect(context, density, overscrollConfiguration.m314getGlowColor0d7_KjU(), overscrollConfiguration.getDrawPadding(), null);
                composer.updateRememberedValue(androidEdgeEffectOverscrollEffect2);
                rememberedValue = androidEdgeEffectOverscrollEffect2;
            }
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollEffect;
    }

    /* renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final OverscrollFactory m225rememberPlatformOverscrollFactory3JVO9M(long j, PaddingValues paddingValues, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = DefaultGlowColor;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            paddingValues = DefaultGlowPaddingValues;
        }
        PaddingValues paddingValues2 = paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2017030679, i, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
        }
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = new AndroidEdgeEffectOverscrollFactory((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (Density) composer.consume(CompositionLocalsKt.getLocalDensity()), j2, paddingValues2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollFactory;
    }
}
