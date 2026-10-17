package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m3676getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m3685getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    public final ChipColors elevatedSuggestionChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1851)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3 = getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedSuggestionChipColors$material3;
    }

    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2456elevatedSuggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1873)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3 = getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors m1704copyFD3wquc = defaultElevatedSuggestionChipColors$material3.m1704copyFD3wquc(m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, companion.m4797getUnspecified0d7_KjU(), m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, companion.m4797getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1704copyFD3wquc;
    }

    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2457elevatedSuggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = SuggestionChipTokens.INSTANCE.m3678getElevatedContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m3682getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = SuggestionChipTokens.INSTANCE.m3680getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = SuggestionChipTokens.INSTANCE.m3681getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = SuggestionChipTokens.INSTANCE.m3677getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = SuggestionChipTokens.INSTANCE.m3679getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1926)");
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

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached$material3 = colorScheme.getDefaultElevatedSuggestionChipColorsCached$material3();
        if (defaultElevatedSuggestionChipColorsCached$material3 != null) {
            return defaultElevatedSuggestionChipColorsCached$material3;
        }
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        long fromToken = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedContainerColor());
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor());
        long fromToken3 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor());
        Color.Companion companion = Color.Companion;
        long m4797getUnspecified0d7_KjU = companion.m4797getUnspecified0d7_KjU();
        long fromToken4 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedDisabledContainerColor());
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(fromToken, fromToken2, fromToken3, m4797getUnspecified0d7_KjU, Color.m4760copywmQWz5c$default(fromToken4, assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), suggestionChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m4797getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2458getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2459getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1937)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @er
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m2460suggestionChipBorderd_3_b6Q(long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        if ((i2 & 2) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            j3 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j3 = j2;
        }
        float m3684getFlatOutlineWidthD9Ej5fM = (i2 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m3684getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1839)");
        }
        ChipBorder chipBorder = new ChipBorder(value, j3, m3684getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m2461suggestionChipBorderh1eTWw(boolean z, long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long value = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        if ((i2 & 4) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            j3 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j3 = j2;
        }
        float m3684getFlatOutlineWidthD9Ej5fM = (i2 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m3684getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1812)");
        }
        if (!z) {
            value = j3;
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(m3684getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final ChipColors suggestionChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1733)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSuggestionChipColors;
    }

    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2462suggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1755)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors m1704copyFD3wquc = defaultSuggestionChipColors.m1704copyFD3wquc(m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, companion.m4797getUnspecified0d7_KjU(), m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, companion.m4797getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1704copyFD3wquc;
    }

    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2463suggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = SuggestionChipTokens.INSTANCE.m3683getFlatContainerElevationD9Ej5fM();
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
            f5 = SuggestionChipTokens.INSTANCE.m3677getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1786)");
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
}
