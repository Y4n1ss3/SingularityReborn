package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SecondaryNavigationTabTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DividerColor;
    private static final float DividerHeight;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    public static final SecondaryNavigationTabTokens INSTANCE = new SecondaryNavigationTabTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM();
        ContainerHeight = Dp.m7611constructorimpl(48.0f);
        ContainerShape = ShapeKeyTokens.CornerNone;
        DividerColor = ColorSchemeKeyTokens.SurfaceVariant;
        DividerHeight = Dp.m7611constructorimpl(1.0f);
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.TitleSmall;
        PressedLabelTextColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        FocusIconColor = colorSchemeKeyTokens;
        HoverIconColor = colorSchemeKeyTokens;
        IconSize = Dp.m7611constructorimpl(24.0f);
        InactiveIconColor = colorSchemeKeyTokens2;
        PressedIconColor = colorSchemeKeyTokens;
    }

    private SecondaryNavigationTabTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3604getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3605getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDividerColor() {
        return DividerColor;
    }

    /* renamed from: getDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3606getDividerHeightD9Ej5fM() {
        return DividerHeight;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3607getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}
