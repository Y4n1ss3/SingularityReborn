package androidx.compose.material3.tokens;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.GenericFontFamily;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TypographyTokens {
    public static final int $stable = 0;
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyLargeEmphasized;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodyMediumEmphasized;
    private static final TextStyle BodySmall;
    private static final TextStyle BodySmallEmphasized;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayLargeEmphasized;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplayMediumEmphasized;
    private static final TextStyle DisplaySmall;
    private static final TextStyle DisplaySmallEmphasized;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineLargeEmphasized;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineMediumEmphasized;
    private static final TextStyle HeadlineSmall;
    private static final TextStyle HeadlineSmallEmphasized;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelLargeEmphasized;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelMediumEmphasized;
    private static final TextStyle LabelSmall;
    private static final TextStyle LabelSmallEmphasized;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleLargeEmphasized;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleMediumEmphasized;
    private static final TextStyle TitleSmall;
    private static final TextStyle TitleSmallEmphasized;

    static {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        BodyLarge = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle, 0L, typeScaleTokens.m3729getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), null, null, bodyLargeFont, null, typeScaleTokens.m3730getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3728getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        BodyMedium = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle2, 0L, typeScaleTokens.m3735getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), null, null, bodyMediumFont, null, typeScaleTokens.m3736getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3734getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        BodySmall = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle3, 0L, typeScaleTokens.m3741getBodySmallSizeXSAIIZE(), typeScaleTokens.getBodySmallWeight(), null, null, bodySmallFont, null, typeScaleTokens.m3742getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3740getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle4, 0L, typeScaleTokens.m3747getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), null, null, displayLargeFont, null, typeScaleTokens.m3748getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3746getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        DisplayMedium = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle5, 0L, typeScaleTokens.m3753getDisplayMediumSizeXSAIIZE(), typeScaleTokens.getDisplayMediumWeight(), null, null, displayMediumFont, null, typeScaleTokens.m3754getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3752getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle6, 0L, typeScaleTokens.m3759getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), null, null, displaySmallFont, null, typeScaleTokens.m3760getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3758getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        HeadlineLarge = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle7, 0L, typeScaleTokens.m3765getHeadlineLargeSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeWeight(), null, null, headlineLargeFont, null, typeScaleTokens.m3766getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3764getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle8, 0L, typeScaleTokens.m3771getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), null, null, headlineMediumFont, null, typeScaleTokens.m3772getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3770getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        HeadlineSmall = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle9, 0L, typeScaleTokens.m3777getHeadlineSmallSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallWeight(), null, null, headlineSmallFont, null, typeScaleTokens.m3778getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3776getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle10, 0L, typeScaleTokens.m3783getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), null, null, labelLargeFont, null, typeScaleTokens.m3784getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3782getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        LabelMedium = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle11, 0L, typeScaleTokens.m3789getLabelMediumSizeXSAIIZE(), typeScaleTokens.getLabelMediumWeight(), null, null, labelMediumFont, null, typeScaleTokens.m3790getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3788getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle12, 0L, typeScaleTokens.m3795getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), null, null, labelSmallFont, null, typeScaleTokens.m3796getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3794getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        TitleLarge = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle13, 0L, typeScaleTokens.m3801getTitleLargeSizeXSAIIZE(), typeScaleTokens.getTitleLargeWeight(), null, null, titleLargeFont, null, typeScaleTokens.m3802getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3800getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle14, 0L, typeScaleTokens.m3807getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), null, null, titleMediumFont, null, typeScaleTokens.m3808getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3806getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        TitleSmall = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle15, 0L, typeScaleTokens.m3813getTitleSmallSizeXSAIIZE(), typeScaleTokens.getTitleSmallWeight(), null, null, titleSmallFont, null, typeScaleTokens.m3814getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3812getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle16 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyLargeEmphasizedFont = typeScaleTokens.getBodyLargeEmphasizedFont();
        BodyLargeEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle16, 0L, typeScaleTokens.m3726getBodyLargeEmphasizedSizeXSAIIZE(), typeScaleTokens.getBodyLargeEmphasizedWeight(), null, null, bodyLargeEmphasizedFont, null, typeScaleTokens.m3727getBodyLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3725getBodyLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle17 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyMediumEmphasizedFont = typeScaleTokens.getBodyMediumEmphasizedFont();
        BodyMediumEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle17, 0L, typeScaleTokens.m3732getBodyMediumEmphasizedSizeXSAIIZE(), typeScaleTokens.getBodyMediumEmphasizedWeight(), null, null, bodyMediumEmphasizedFont, null, typeScaleTokens.m3733getBodyMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3731getBodyMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle18 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodySmallEmphasizedFont = typeScaleTokens.getBodySmallEmphasizedFont();
        BodySmallEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle18, 0L, typeScaleTokens.m3738getBodySmallEmphasizedSizeXSAIIZE(), typeScaleTokens.getBodySmallEmphasizedWeight(), null, null, bodySmallEmphasizedFont, null, typeScaleTokens.m3739getBodySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3737getBodySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle19 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayLargeEmphasizedFont = typeScaleTokens.getDisplayLargeEmphasizedFont();
        DisplayLargeEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle19, 0L, typeScaleTokens.m3744getDisplayLargeEmphasizedSizeXSAIIZE(), typeScaleTokens.getDisplayLargeEmphasizedWeight(), null, null, displayLargeEmphasizedFont, null, typeScaleTokens.m3745getDisplayLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3743getDisplayLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle20 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayMediumEmphasizedFont = typeScaleTokens.getDisplayMediumEmphasizedFont();
        DisplayMediumEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle20, 0L, typeScaleTokens.m3750getDisplayMediumEmphasizedSizeXSAIIZE(), typeScaleTokens.getDisplayMediumEmphasizedWeight(), null, null, displayMediumEmphasizedFont, null, typeScaleTokens.m3751getDisplayMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3749getDisplayMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle21 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displaySmallEmphasizedFont = typeScaleTokens.getDisplaySmallEmphasizedFont();
        DisplaySmallEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle21, 0L, typeScaleTokens.m3756getDisplaySmallEmphasizedSizeXSAIIZE(), typeScaleTokens.getDisplaySmallEmphasizedWeight(), null, null, displaySmallEmphasizedFont, null, typeScaleTokens.m3757getDisplaySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3755getDisplaySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle22 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineLargeEmphasizedFont = typeScaleTokens.getHeadlineLargeEmphasizedFont();
        HeadlineLargeEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle22, 0L, typeScaleTokens.m3762getHeadlineLargeEmphasizedSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeEmphasizedWeight(), null, null, headlineLargeEmphasizedFont, null, typeScaleTokens.m3763getHeadlineLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3761getHeadlineLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle23 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineMediumEmphasizedFont = typeScaleTokens.getHeadlineMediumEmphasizedFont();
        HeadlineMediumEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle23, 0L, typeScaleTokens.m3768getHeadlineMediumEmphasizedSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumEmphasizedWeight(), null, null, headlineMediumEmphasizedFont, null, typeScaleTokens.m3769getHeadlineMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3767getHeadlineMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle24 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineSmallEmphasizedFont = typeScaleTokens.getHeadlineSmallEmphasizedFont();
        HeadlineSmallEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle24, 0L, typeScaleTokens.m3774getHeadlineSmallEmphasizedSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallEmphasizedWeight(), null, null, headlineSmallEmphasizedFont, null, typeScaleTokens.m3775getHeadlineSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3773getHeadlineSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle25 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelLargeEmphasizedFont = typeScaleTokens.getLabelLargeEmphasizedFont();
        LabelLargeEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle25, 0L, typeScaleTokens.m3780getLabelLargeEmphasizedSizeXSAIIZE(), typeScaleTokens.getLabelLargeEmphasizedWeight(), null, null, labelLargeEmphasizedFont, null, typeScaleTokens.m3781getLabelLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3779getLabelLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle26 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelMediumEmphasizedFont = typeScaleTokens.getLabelMediumEmphasizedFont();
        LabelMediumEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle26, 0L, typeScaleTokens.m3786getLabelMediumEmphasizedSizeXSAIIZE(), typeScaleTokens.getLabelMediumEmphasizedWeight(), null, null, labelMediumEmphasizedFont, null, typeScaleTokens.m3787getLabelMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3785getLabelMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle27 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelSmallEmphasizedFont = typeScaleTokens.getLabelSmallEmphasizedFont();
        LabelSmallEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle27, 0L, typeScaleTokens.m3792getLabelSmallEmphasizedSizeXSAIIZE(), typeScaleTokens.getLabelSmallEmphasizedWeight(), null, null, labelSmallEmphasizedFont, null, typeScaleTokens.m3793getLabelSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3791getLabelSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle28 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleLargeEmphasizedFont = typeScaleTokens.getTitleLargeEmphasizedFont();
        TitleLargeEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle28, 0L, typeScaleTokens.m3798getTitleLargeEmphasizedSizeXSAIIZE(), typeScaleTokens.getTitleLargeEmphasizedWeight(), null, null, titleLargeEmphasizedFont, null, typeScaleTokens.m3799getTitleLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3797getTitleLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle29 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleMediumEmphasizedFont = typeScaleTokens.getTitleMediumEmphasizedFont();
        TitleMediumEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle29, 0L, typeScaleTokens.m3804getTitleMediumEmphasizedSizeXSAIIZE(), typeScaleTokens.getTitleMediumEmphasizedWeight(), null, null, titleMediumEmphasizedFont, null, typeScaleTokens.m3805getTitleMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3803getTitleMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle30 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleSmallEmphasizedFont = typeScaleTokens.getTitleSmallEmphasizedFont();
        TitleSmallEmphasized = TextStyle.m7073copyp1EtxEg$default(defaultTextStyle30, 0L, typeScaleTokens.m3810getTitleSmallEmphasizedSizeXSAIIZE(), typeScaleTokens.getTitleSmallEmphasizedWeight(), null, null, titleSmallEmphasizedFont, null, typeScaleTokens.m3811getTitleSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m3809getTitleSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyLargeEmphasized() {
        return BodyLargeEmphasized;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodyMediumEmphasized() {
        return BodyMediumEmphasized;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getBodySmallEmphasized() {
        return BodySmallEmphasized;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayLargeEmphasized() {
        return DisplayLargeEmphasized;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplayMediumEmphasized() {
        return DisplayMediumEmphasized;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getDisplaySmallEmphasized() {
        return DisplaySmallEmphasized;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineLargeEmphasized() {
        return HeadlineLargeEmphasized;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineMediumEmphasized() {
        return HeadlineMediumEmphasized;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getHeadlineSmallEmphasized() {
        return HeadlineSmallEmphasized;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelLargeEmphasized() {
        return LabelLargeEmphasized;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelMediumEmphasized() {
        return LabelMediumEmphasized;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getLabelSmallEmphasized() {
        return LabelSmallEmphasized;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleLargeEmphasized() {
        return TitleLargeEmphasized;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleMediumEmphasized() {
        return TitleMediumEmphasized;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }

    public final TextStyle getTitleSmallEmphasized() {
        return TitleSmallEmphasized;
    }
}
