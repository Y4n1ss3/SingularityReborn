package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m3373getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m3375getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m3371getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2072getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached$material3 = colorScheme.getDefaultInputChipColorsCached$material3();
        if (defaultInputChipColorsCached$material3 != null) {
            return defaultInputChipColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedTrailingIconColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLabelTextColor()), inputChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLeadingIconColor()), inputChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledTrailingIconColor()), inputChipTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledSelectedContainerColor()), inputChipTokens.getDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2073getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2074getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1715)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m2075inputChipBorder_7El2pE(boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, Composer composer, int i, int i2) {
        long j5;
        long value = (i2 & 4) != 0 ? ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j;
        long m4796getTransparent0d7_KjU = (i2 & 8) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j2;
        if ((i2 & 16) != 0) {
            InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
            j5 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(inputChipTokens.getDisabledUnselectedOutlineColor(), composer, 6), inputChipTokens.getDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j5 = j3;
        }
        long m4796getTransparent0d7_KjU2 = (i2 & 32) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j4;
        float m3378getUnselectedOutlineWidthD9Ej5fM = (i2 & 64) != 0 ? InputChipTokens.INSTANCE.m3378getUnselectedOutlineWidthD9Ej5fM() : f;
        float m3376getSelectedOutlineWidthD9Ej5fM = (i2 & Fields.SpotShadowColor) != 0 ? InputChipTokens.INSTANCE.m3376getSelectedOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1703)");
        }
        if (!z) {
            value = z2 ? m4796getTransparent0d7_KjU2 : j5;
        } else if (z2) {
            value = m4796getTransparent0d7_KjU;
        }
        if (z2) {
            m3378getUnselectedOutlineWidthD9Ej5fM = m3376getSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(m3378getUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final SelectableChipColors inputChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1562)");
        }
        SelectableChipColors defaultInputChipColors$material3 = getDefaultInputChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultInputChipColors$material3;
    }

    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m2076inputChipColorskwJvTHA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        long j14;
        long j15;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j16 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i3 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        long m4797getUnspecified0d7_KjU13 = (i3 & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j13;
        if (ComposerKt.isTraceInProgress()) {
            j14 = m4797getUnspecified0d7_KjU12;
            j15 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1312840646, i, i2, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1599)");
        } else {
            j14 = m4797getUnspecified0d7_KjU12;
            j15 = m4797getUnspecified0d7_KjU2;
        }
        SelectableChipColors m2361copydaRQuJA = getDefaultInputChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2361copydaRQuJA(j16, j15, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, m4797getUnspecified0d7_KjU11, j14, m4797getUnspecified0d7_KjU13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2361copydaRQuJA;
    }

    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2077inputChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = InputChipTokens.INSTANCE.m3372getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = f;
        }
        if ((i2 & 4) != 0) {
            f3 = f;
        }
        if ((i2 & 8) != 0) {
            f4 = f;
        }
        if ((i2 & 16) != 0) {
            f5 = InputChipTokens.INSTANCE.m3374getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1666)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }
}
