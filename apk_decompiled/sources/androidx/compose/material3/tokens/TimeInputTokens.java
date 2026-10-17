package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimeInputTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens HeadlineColor;
    private static final TypographyKeyTokens HeadlineFont;
    private static final float PeriodSelectorContainerHeight;
    private static final ShapeKeyTokens PeriodSelectorContainerShape;
    private static final float PeriodSelectorContainerWidth;
    private static final TypographyKeyTokens PeriodSelectorLabelTextFont;
    private static final ColorSchemeKeyTokens PeriodSelectorOutlineColor;
    private static final float PeriodSelectorOutlineWidth;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedContainerColor;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens TimeFieldContainerColor;
    private static final float TimeFieldContainerHeight;
    private static final ShapeKeyTokens TimeFieldContainerShape;
    private static final float TimeFieldContainerWidth;
    private static final ColorSchemeKeyTokens TimeFieldFocusContainerColor;
    private static final ColorSchemeKeyTokens TimeFieldFocusLabelTextColor;
    private static final ColorSchemeKeyTokens TimeFieldFocusOutlineColor;
    private static final float TimeFieldFocusOutlineWidth;
    private static final ColorSchemeKeyTokens TimeFieldHoverLabelTextColor;
    private static final ColorSchemeKeyTokens TimeFieldLabelTextColor;
    private static final TypographyKeyTokens TimeFieldLabelTextFont;
    private static final ColorSchemeKeyTokens TimeFieldSeparatorColor;
    private static final TypographyKeyTokens TimeFieldSeparatorFont;
    private static final ColorSchemeKeyTokens TimeFieldSupportingTextColor;
    private static final TypographyKeyTokens TimeFieldSupportingTextFont;
    public static final TimeInputTokens INSTANCE = new TimeInputTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHigh;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3257getLevel3D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeadlineColor = colorSchemeKeyTokens;
        HeadlineFont = TypographyKeyTokens.LabelMedium;
        PeriodSelectorContainerHeight = Dp.m7611constructorimpl(72.0f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerSmall;
        PeriodSelectorContainerShape = shapeKeyTokens;
        PeriodSelectorContainerWidth = Dp.m7611constructorimpl(52.0f);
        PeriodSelectorLabelTextFont = TypographyKeyTokens.TitleMedium;
        PeriodSelectorOutlineColor = ColorSchemeKeyTokens.Outline;
        PeriodSelectorOutlineWidth = Dp.m7611constructorimpl(1.0f);
        PeriodSelectorSelectedContainerColor = ColorSchemeKeyTokens.TertiaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnTertiaryContainer;
        PeriodSelectorSelectedFocusLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedHoverLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedPressedLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorUnselectedFocusLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedHoverLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedPressedLabelTextColor = colorSchemeKeyTokens;
        TimeFieldContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;
        TimeFieldContainerHeight = Dp.m7611constructorimpl(72.0f);
        TimeFieldContainerShape = shapeKeyTokens;
        TimeFieldContainerWidth = Dp.m7611constructorimpl(96.0f);
        TimeFieldFocusContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
        TimeFieldFocusLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        TimeFieldFocusOutlineColor = ColorSchemeKeyTokens.Primary;
        TimeFieldFocusOutlineWidth = Dp.m7611constructorimpl(2.0f);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        TimeFieldHoverLabelTextColor = colorSchemeKeyTokens3;
        TimeFieldLabelTextColor = colorSchemeKeyTokens3;
        TimeFieldLabelTextFont = TypographyKeyTokens.DisplayMedium;
        TimeFieldSeparatorColor = colorSchemeKeyTokens3;
        TimeFieldSeparatorFont = TypographyKeyTokens.DisplayLarge;
        TimeFieldSupportingTextColor = colorSchemeKeyTokens;
        TimeFieldSupportingTextFont = TypographyKeyTokens.BodySmall;
    }

    private TimeInputTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3700getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    /* renamed from: getPeriodSelectorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3701getPeriodSelectorContainerHeightD9Ej5fM() {
        return PeriodSelectorContainerHeight;
    }

    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return PeriodSelectorContainerShape;
    }

    /* renamed from: getPeriodSelectorContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3702getPeriodSelectorContainerWidthD9Ej5fM() {
        return PeriodSelectorContainerWidth;
    }

    public final TypographyKeyTokens getPeriodSelectorLabelTextFont() {
        return PeriodSelectorLabelTextFont;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorOutlineColor() {
        return PeriodSelectorOutlineColor;
    }

    /* renamed from: getPeriodSelectorOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3703getPeriodSelectorOutlineWidthD9Ej5fM() {
        return PeriodSelectorOutlineWidth;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedContainerColor() {
        return PeriodSelectorSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedFocusLabelTextColor() {
        return PeriodSelectorSelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedHoverLabelTextColor() {
        return PeriodSelectorSelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedLabelTextColor() {
        return PeriodSelectorSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedPressedLabelTextColor() {
        return PeriodSelectorSelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedFocusLabelTextColor() {
        return PeriodSelectorUnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedHoverLabelTextColor() {
        return PeriodSelectorUnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedLabelTextColor() {
        return PeriodSelectorUnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedPressedLabelTextColor() {
        return PeriodSelectorUnselectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeFieldContainerColor() {
        return TimeFieldContainerColor;
    }

    /* renamed from: getTimeFieldContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3704getTimeFieldContainerHeightD9Ej5fM() {
        return TimeFieldContainerHeight;
    }

    public final ShapeKeyTokens getTimeFieldContainerShape() {
        return TimeFieldContainerShape;
    }

    /* renamed from: getTimeFieldContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3705getTimeFieldContainerWidthD9Ej5fM() {
        return TimeFieldContainerWidth;
    }

    public final ColorSchemeKeyTokens getTimeFieldFocusContainerColor() {
        return TimeFieldFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getTimeFieldFocusLabelTextColor() {
        return TimeFieldFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeFieldFocusOutlineColor() {
        return TimeFieldFocusOutlineColor;
    }

    /* renamed from: getTimeFieldFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3706getTimeFieldFocusOutlineWidthD9Ej5fM() {
        return TimeFieldFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getTimeFieldHoverLabelTextColor() {
        return TimeFieldHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeFieldLabelTextColor() {
        return TimeFieldLabelTextColor;
    }

    public final TypographyKeyTokens getTimeFieldLabelTextFont() {
        return TimeFieldLabelTextFont;
    }

    public final ColorSchemeKeyTokens getTimeFieldSeparatorColor() {
        return TimeFieldSeparatorColor;
    }

    public final TypographyKeyTokens getTimeFieldSeparatorFont() {
        return TimeFieldSeparatorFont;
    }

    public final ColorSchemeKeyTokens getTimeFieldSupportingTextColor() {
        return TimeFieldSupportingTextColor;
    }

    public final TypographyKeyTokens getTimeFieldSupportingTextFont() {
        return TimeFieldSupportingTextFont;
    }
}
