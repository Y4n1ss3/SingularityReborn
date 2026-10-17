package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = Dp.m7611constructorimpl(16.0f);

    private SwitchDefaults() {
    }

    public final SwitchColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:306)");
        }
        SwitchColors defaultSwitchColors$material3 = getDefaultSwitchColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors$material3;
    }

    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m2494colorsV1nXRL4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i, int i2, int i3) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        int i4;
        long j29;
        long j30;
        long j31;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j2;
        long m4796getTransparent0d7_KjU = (i3 & 4) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j3;
        long value3 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j4;
        long value4 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j5;
        long value5 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j6;
        long value6 = (i3 & 64) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j7;
        long value7 = (i3 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j8;
        if ((i3 & Fields.RotationX) != 0) {
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            j17 = value;
            j18 = value2;
            j19 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens.getDisabledSelectedHandleColor(), composer, 6), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j17 = value;
            j18 = value2;
            j19 = j9;
        }
        if ((i3 & Fields.RotationY) != 0) {
            SwitchTokens switchTokens2 = SwitchTokens.INSTANCE;
            j20 = j19;
            j21 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens2.getDisabledSelectedTrackColor(), composer, 6), switchTokens2.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j20 = j19;
            j21 = j10;
        }
        long m4796getTransparent0d7_KjU2 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j11;
        if ((i3 & Fields.CameraDistance) != 0) {
            SwitchTokens switchTokens3 = SwitchTokens.INSTANCE;
            j22 = j21;
            j23 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens3.getDisabledSelectedIconColor(), composer, 6), switchTokens3.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j22 = j21;
            j23 = j12;
        }
        if ((i3 & Fields.TransformOrigin) != 0) {
            SwitchTokens switchTokens4 = SwitchTokens.INSTANCE;
            j24 = j23;
            j25 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens4.getDisabledUnselectedHandleColor(), composer, 6), switchTokens4.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j24 = j23;
            j25 = j13;
        }
        if ((i3 & 8192) != 0) {
            SwitchTokens switchTokens5 = SwitchTokens.INSTANCE;
            j26 = j25;
            j27 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens5.getDisabledUnselectedTrackColor(), composer, 6), switchTokens5.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j26 = j25;
            j27 = j14;
        }
        if ((i3 & Fields.Clip) != 0) {
            SwitchTokens switchTokens6 = SwitchTokens.INSTANCE;
            i4 = 6;
            j28 = j27;
            j29 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens6.getDisabledUnselectedTrackOutlineColor(), composer, 6), switchTokens6.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU());
        } else {
            j28 = j27;
            i4 = 6;
            j29 = j15;
        }
        if ((i3 & Fields.CompositingStrategy) != 0) {
            SwitchTokens switchTokens7 = SwitchTokens.INSTANCE;
            j30 = j29;
            j31 = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens7.getDisabledUnselectedIconColor(), composer, i4), switchTokens7.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i4).m1781getSurface0d7_KjU());
        } else {
            j30 = j29;
            j31 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i, i2, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:369)");
        }
        long j32 = j17;
        SwitchColors switchColors = new SwitchColors(j32, j18, m4796getTransparent0d7_KjU, value3, value4, value5, value6, value7, j20, j22, m4796getTransparent0d7_KjU2, j24, j26, j28, j30, j31, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3 = colorScheme.getDefaultSwitchColorsCached$material3();
        if (defaultSwitchColorsCached$material3 != null) {
            return defaultSwitchColorsCached$material3;
        }
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        long fromToken = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedHandleColor());
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedTrackColor());
        Color.Companion companion = Color.Companion;
        SwitchColors switchColors = new SwitchColors(fromToken, fromToken2, companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedIconColor()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedHandleColor()), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), companion.m4796getTransparent0d7_KjU(), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedIconColor()), switchTokens.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedHandleColor()), switchTokens.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackOutlineColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedIconColor()), switchTokens.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), null);
        colorScheme.setDefaultSwitchColorsCached$material3(switchColors);
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2495getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
