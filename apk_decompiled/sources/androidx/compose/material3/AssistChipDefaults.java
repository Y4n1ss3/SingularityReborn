package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m3021getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m3030getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @er
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1630assistChipBorderd_3_b6Q(long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        if ((i2 & 2) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            j3 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j3 = j2;
        }
        float m3029getFlatOutlineWidthD9Ej5fM = (i2 & 4) != 0 ? AssistChipTokens.INSTANCE.m3029getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1146)");
        }
        ChipBorder chipBorder = new ChipBorder(value, j3, m3029getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m1631assistChipBorderh1eTWw(boolean z, long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long value = (i2 & 2) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        if ((i2 & 4) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            j3 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j3 = j2;
        }
        float m3029getFlatOutlineWidthD9Ej5fM = (i2 & 8) != 0 ? AssistChipTokens.INSTANCE.m3029getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1118)");
        }
        if (!z) {
            value = j3;
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(m3029getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final ChipColors assistChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1013)");
        }
        ChipColors defaultAssistChipColors$material3 = getDefaultAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultAssistChipColors$material3;
    }

    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1632assistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        long j9;
        long j10;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i2 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        if (ComposerKt.isTraceInProgress()) {
            j9 = m4797getUnspecified0d7_KjU;
            j10 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1039)");
        } else {
            j9 = m4797getUnspecified0d7_KjU;
            j10 = m4797getUnspecified0d7_KjU2;
        }
        ChipColors m1704copyFD3wquc = getDefaultAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1704copyFD3wquc(j9, j10, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1704copyFD3wquc;
    }

    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1633assistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = AssistChipTokens.INSTANCE.m3028getFlatContainerElevationD9Ej5fM();
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
            f5 = AssistChipTokens.INSTANCE.m3022getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1092)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        ChipElevation chipElevation = new ChipElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    public final ChipColors elevatedAssistChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1157)");
        }
        ChipColors defaultElevatedAssistChipColors$material3 = getDefaultElevatedAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedAssistChipColors$material3;
    }

    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1634elevatedAssistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        long j9;
        long j10;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i2 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        if (ComposerKt.isTraceInProgress()) {
            j9 = m4797getUnspecified0d7_KjU;
            j10 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1183)");
        } else {
            j9 = m4797getUnspecified0d7_KjU;
            j10 = m4797getUnspecified0d7_KjU2;
        }
        ChipColors m1704copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1704copyFD3wquc(j9, j10, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1704copyFD3wquc;
    }

    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1635elevatedAssistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = AssistChipTokens.INSTANCE.m3023getElevatedContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = AssistChipTokens.INSTANCE.m3027getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = AssistChipTokens.INSTANCE.m3025getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = AssistChipTokens.INSTANCE.m3026getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = AssistChipTokens.INSTANCE.m3022getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = AssistChipTokens.INSTANCE.m3024getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1238)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        ChipElevation chipElevation = new ChipElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    public final ChipColors getDefaultAssistChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached$material3 = colorScheme.getDefaultAssistChipColorsCached$material3();
        if (defaultAssistChipColorsCached$material3 != null) {
            return defaultAssistChipColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3(chipColors);
        return chipColors;
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached$material3 = colorScheme.getDefaultElevatedAssistChipColorsCached$material3();
        if (defaultElevatedAssistChipColorsCached$material3 != null) {
            return defaultElevatedAssistChipColorsCached$material3;
        }
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedDisabledContainerColor()), assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1636getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1637getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1249)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
