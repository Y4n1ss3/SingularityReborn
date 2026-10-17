package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonLeadingSpace;
    private static final float ButtonTrailingSpace;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconStartpadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float SmallEndPadding;
    private static final float SmallStartPadding;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        BaselineButtonTokens baselineButtonTokens = BaselineButtonTokens.INSTANCE;
        float m3040getLeadingSpaceD9Ej5fM = baselineButtonTokens.m3040getLeadingSpaceD9Ej5fM();
        ButtonLeadingSpace = m3040getLeadingSpaceD9Ej5fM;
        float m3042getTrailingSpaceD9Ej5fM = baselineButtonTokens.m3042getTrailingSpaceD9Ej5fM();
        ButtonTrailingSpace = m3042getTrailingSpaceD9Ej5fM;
        float m7611constructorimpl = Dp.m7611constructorimpl(16.0f);
        ButtonWithIconStartpadding = m7611constructorimpl;
        ButtonSmallTokens buttonSmallTokens = ButtonSmallTokens.INSTANCE;
        SmallStartPadding = buttonSmallTokens.m3062getLeadingSpaceD9Ej5fM();
        SmallEndPadding = buttonSmallTokens.m3064getTrailingSpaceD9Ej5fM();
        float m7611constructorimpl2 = Dp.m7611constructorimpl(8.0f);
        ButtonVerticalPadding = m7611constructorimpl2;
        PaddingValues m758PaddingValuesa9UjIt4 = PaddingKt.m758PaddingValuesa9UjIt4(m3040getLeadingSpaceD9Ej5fM, m7611constructorimpl2, m3042getTrailingSpaceD9Ej5fM, m7611constructorimpl2);
        ContentPadding = m758PaddingValuesa9UjIt4;
        ButtonWithIconContentPadding = PaddingKt.m758PaddingValuesa9UjIt4(m7611constructorimpl, m7611constructorimpl2, m3042getTrailingSpaceD9Ej5fM, m7611constructorimpl2);
        float m7611constructorimpl3 = Dp.m7611constructorimpl(12.0f);
        TextButtonHorizontalPadding = m7611constructorimpl3;
        TextButtonContentPadding = PaddingKt.m758PaddingValuesa9UjIt4(m7611constructorimpl3, m758PaddingValuesa9UjIt4.mo714calculateTopPaddingD9Ej5fM(), m7611constructorimpl3, m758PaddingValuesa9UjIt4.mo711calculateBottomPaddingD9Ej5fM());
        float m7611constructorimpl4 = Dp.m7611constructorimpl(16.0f);
        TextButtonWithIconHorizontalEndPadding = m7611constructorimpl4;
        TextButtonWithIconContentPadding = PaddingKt.m758PaddingValuesa9UjIt4(m7611constructorimpl3, m758PaddingValuesa9UjIt4.mo714calculateTopPaddingD9Ej5fM(), m7611constructorimpl4, m758PaddingValuesa9UjIt4.mo711calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m7611constructorimpl(58.0f);
        MinHeight = buttonSmallTokens.m3059getContainerHeightD9Ej5fM();
        IconSize = Dp.m7611constructorimpl(18.0f);
        IconSpacing = buttonSmallTokens.m3060getIconLabelSpaceD9Ej5fM();
    }

    private ButtonDefaults() {
    }

    public final ButtonColors buttonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        ButtonColors defaultButtonColors$material3 = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors$material3;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1658buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:590)");
        }
        long j5 = j2;
        long j6 = j;
        ButtonColors m1653copyjRlVdoo = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1653copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1653copyjRlVdoo;
    }

    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1659buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilledButtonTokens.INSTANCE.m3324getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilledButtonTokens.INSTANCE.m3328getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilledButtonTokens.INSTANCE.m3326getFocusedContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilledButtonTokens.INSTANCE.m3327getHoveredContainerElevationD9Ej5fM();
        }
        float f6 = f4;
        if ((i2 & 16) != 0) {
            f5 = FilledButtonTokens.INSTANCE.m3325getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        float f7 = f5;
        float f8 = f3;
        ButtonElevation buttonElevation = new ButtonElevation(f, f2, f8, f6, f7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final ButtonColors elevatedButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:617)");
        }
        ButtonColors defaultElevatedButtonColors$material3 = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedButtonColors$material3;
    }

    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1660elevatedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:635)");
        }
        long j5 = j2;
        long j6 = j;
        ButtonColors m1653copyjRlVdoo = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1653copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1653copyjRlVdoo;
    }

    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1661elevatedButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = ElevatedButtonTokens.INSTANCE.m3242getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = ElevatedButtonTokens.INSTANCE.m3246getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = ElevatedButtonTokens.INSTANCE.m3244getFocusedContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = ElevatedButtonTokens.INSTANCE.m3245getHoveredContainerElevationD9Ej5fM();
        }
        float f6 = f4;
        if ((i2 & 16) != 0) {
            f5 = ElevatedButtonTokens.INSTANCE.m3243getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:838)");
        }
        float f7 = f5;
        float f8 = f3;
        ButtonElevation buttonElevation = new ButtonElevation(f, f2, f8, f6, f7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final ButtonColors filledTonalButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:663)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3 = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalButtonColors$material3;
    }

    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1662filledTonalButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:682)");
        }
        long j5 = j2;
        long j6 = j;
        ButtonColors m1653copyjRlVdoo = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1653copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1653copyjRlVdoo;
    }

    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1663filledTonalButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilledTonalButtonTokens.INSTANCE.m3342getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilledTonalButtonTokens.INSTANCE.m3348getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilledTonalButtonTokens.INSTANCE.m3345getFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilledTonalButtonTokens.INSTANCE.m3346getHoverContainerElevationD9Ej5fM();
        }
        float f6 = f4;
        if ((i2 & 16) != 0) {
            f5 = Dp.m7611constructorimpl(0.0f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:868)");
        }
        float f7 = f5;
        float f8 = f3;
        ButtonElevation buttonElevation = new ButtonElevation(f, f2, f8, f6, f7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ButtonColors getDefaultButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3 = colorScheme.getDefaultButtonColorsCached$material3();
        if (defaultButtonColorsCached$material3 != null) {
            return defaultButtonColorsCached$material3;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), filledButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), filledButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached$material3 = colorScheme.getDefaultElevatedButtonColorsCached$material3();
        if (defaultElevatedButtonColorsCached$material3 != null) {
            return defaultElevatedButtonColorsCached$material3;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), elevatedButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), elevatedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalButtonColorsCached$material3();
        if (defaultFilledTonalButtonColorsCached$material3 != null) {
            return defaultFilledTonalButtonColorsCached$material3;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached$material3 = colorScheme.getDefaultOutlinedButtonColorsCached$material3();
        if (defaultOutlinedButtonColorsCached$material3 != null) {
            return defaultOutlinedButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), outlinedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultTextButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3 = colorScheme.getDefaultTextButtonColorsCached$material3();
        if (defaultTextButtonColorsCached$material3 != null) {
            return defaultTextButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        long fromToken = ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.Primary);
        long m4796getTransparent0d7_KjU2 = companion.m4796getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(m4796getTransparent0d7_KjU, fromToken, m4796getTransparent0d7_KjU2, Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelColor()), textButtonTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final Shape getElevatedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:554)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getFilledTonalShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:558)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1664getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1665getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1666getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1667getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @er
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:886)");
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(ButtonSmallTokens.INSTANCE.m3063getOutlinedOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:562)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    public final Shape getTextShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final BorderStroke outlinedButtonBorder(boolean z, Composer composer, int i, int i2) {
        long m4760copywmQWz5c$default;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:898)");
        }
        float m3063getOutlinedOutlineWidthD9Ej5fM = ButtonSmallTokens.INSTANCE.m3063getOutlinedOutlineWidthD9Ej5fM();
        if (z) {
            composer.startReplaceGroup(-112346942);
            m4760copywmQWz5c$default = ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-112259336);
            OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
            m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6), outlinedButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(m3063getOutlinedOutlineWidthD9Ej5fM, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final ButtonColors outlinedButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:709)");
        }
        ButtonColors defaultOutlinedButtonColors$material3 = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedButtonColors$material3;
    }

    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1668outlinedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:727)");
        }
        long j5 = j2;
        long j6 = j;
        ButtonColors m1653copyjRlVdoo = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1653copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1653copyjRlVdoo;
    }

    public final ButtonColors textButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
        }
        ButtonColors defaultTextButtonColors$material3 = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextButtonColors$material3;
    }

    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1669textButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:770)");
        }
        long j5 = j2;
        long j6 = j;
        ButtonColors m1653copyjRlVdoo = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1653copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1653copyjRlVdoo;
    }
}
