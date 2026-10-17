package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    public final CardColors cardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        CardColors defaultCardColors$material3 = getDefaultCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3;
    }

    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1678cardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU, composer, i & 14) : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j7 = m1797contentColorForek8zF_U;
            j6 = Color.m4760copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j5 = j7;
        } else {
            j5 = m1797contentColorForek8zF_U;
            j6 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        CardColors m1673copyjRlVdoo = getDefaultCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1673copyjRlVdoo(m4797getUnspecified0d7_KjU, j5, m4797getUnspecified0d7_KjU2, j6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1673copyjRlVdoo;
    }

    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1679cardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilledCardTokens.INSTANCE.m3329getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilledCardTokens.INSTANCE.m3335getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilledCardTokens.INSTANCE.m3332getFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilledCardTokens.INSTANCE.m3333getHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = FilledCardTokens.INSTANCE.m3331getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = FilledCardTokens.INSTANCE.m3330getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors elevatedCardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:518)");
        }
        CardColors defaultElevatedCardColors$material3 = getDefaultElevatedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3;
    }

    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1680elevatedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU, composer, i & 14) : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j7 = m1797contentColorForek8zF_U;
            j6 = Color.m4760copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j5 = j7;
        } else {
            j5 = m1797contentColorForek8zF_U;
            j6 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:536)");
        }
        CardColors m1673copyjRlVdoo = getDefaultElevatedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1673copyjRlVdoo(m4797getUnspecified0d7_KjU, j5, m4797getUnspecified0d7_KjU2, j6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1673copyjRlVdoo;
    }

    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1681elevatedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = ElevatedCardTokens.INSTANCE.m3247getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = ElevatedCardTokens.INSTANCE.m3253getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = ElevatedCardTokens.INSTANCE.m3250getFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = ElevatedCardTokens.INSTANCE.m3251getHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = ElevatedCardTokens.INSTANCE.m3249getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = ElevatedCardTokens.INSTANCE.m3248getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:430)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors getDefaultCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3 = colorScheme.getDefaultCardColorsCached$material3();
        if (defaultCardColorsCached$material3 != null) {
            return defaultCardColorsCached$material3;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m4760copywmQWz5c$default(ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultElevatedCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached$material3 = colorScheme.getDefaultElevatedCardColorsCached$material3();
        if (defaultElevatedCardColorsCached$material3 != null) {
            return defaultElevatedCardColorsCached$material3;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m4760copywmQWz5c$default(ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultOutlinedCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached$material3 = colorScheme.getDefaultOutlinedCardColorsCached$material3();
        if (defaultOutlinedCardColorsCached$material3 != null) {
            return defaultOutlinedCardColorsCached$material3;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final Shape getElevatedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:374)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:378)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i, int i2) {
        OutlinedCardTokens outlinedCardTokens;
        long m4806compositeOverOWjLjI;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:613)");
        }
        if (z) {
            composer.startReplaceGroup(2106932974);
            outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            m4806compositeOverOWjLjI = ColorSchemeKt.getValue(outlinedCardTokens.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2107012365);
            outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            m4806compositeOverOWjLjI = ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedCardTokens.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean changed = composer.changed(m4806compositeOverOWjLjI);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m253BorderStrokecXLIe8U(outlinedCardTokens.m3487getOutlineWidthD9Ej5fM(), m4806compositeOverOWjLjI);
            composer.updateRememberedValue(rememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final CardColors outlinedCardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:567)");
        }
        CardColors defaultOutlinedCardColors$material3 = getDefaultOutlinedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3;
    }

    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1682outlinedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU, composer, i & 14) : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU, composer, i & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:585)");
        }
        CardColors m1673copyjRlVdoo = getDefaultOutlinedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1673copyjRlVdoo(m4797getUnspecified0d7_KjU, m1797contentColorForek8zF_U, m4797getUnspecified0d7_KjU2, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1673copyjRlVdoo;
    }

    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1683outlinedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = OutlinedCardTokens.INSTANCE.m3481getContainerElevationD9Ej5fM();
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
            f5 = OutlinedCardTokens.INSTANCE.m3483getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = OutlinedCardTokens.INSTANCE.m3482getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:459)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }
}
