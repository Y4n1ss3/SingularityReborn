package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateInputModalTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens HeaderHeadlineColor;
    private static final TypographyKeyTokens HeaderHeadlineFont;
    private static final ColorSchemeKeyTokens HeaderSupportingTextColor;
    private static final TypographyKeyTokens HeaderSupportingTextFont;
    public static final DateInputModalTokens INSTANCE = new DateInputModalTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3257getLevel3D9Ej5fM();
    private static final float ContainerHeight = Dp.m7611constructorimpl(512.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final float ContainerWidth = Dp.m7611constructorimpl(328.0f);
    private static final float HeaderContainerHeight = Dp.m7611constructorimpl(120.0f);
    private static final float HeaderContainerWidth = Dp.m7611constructorimpl(328.0f);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeaderHeadlineColor = colorSchemeKeyTokens;
        HeaderHeadlineFont = TypographyKeyTokens.HeadlineLarge;
        HeaderSupportingTextColor = colorSchemeKeyTokens;
        HeaderSupportingTextFont = TypographyKeyTokens.LabelLarge;
    }

    private DateInputModalTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3202getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3203getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3204getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3205getHeaderContainerHeightD9Ej5fM() {
        return HeaderContainerHeight;
    }

    /* renamed from: getHeaderContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3206getHeaderContainerWidthD9Ej5fM() {
        return HeaderContainerWidth;
    }

    public final ColorSchemeKeyTokens getHeaderHeadlineColor() {
        return HeaderHeadlineColor;
    }

    public final TypographyKeyTokens getHeaderHeadlineFont() {
        return HeaderHeadlineFont;
    }

    public final ColorSchemeKeyTokens getHeaderSupportingTextColor() {
        return HeaderSupportingTextColor;
    }

    public final TypographyKeyTokens getHeaderSupportingTextFont() {
        return HeaderSupportingTextFont;
    }
}
