package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistChipTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledIconColor;
    private static final float DisabledIconOpacity;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedIconColor;
    private static final ColorSchemeKeyTokens DraggedLabelTextColor;
    private static final ColorSchemeKeyTokens ElevatedContainerColor;
    private static final float ElevatedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;
    private static final float ElevatedDisabledContainerElevation;
    private static final float ElevatedDisabledContainerOpacity;
    private static final float ElevatedFocusContainerElevation;
    private static final float ElevatedHoverContainerElevation;
    private static final float ElevatedPressedContainerElevation;
    private static final float FlatContainerElevation;
    private static final ColorSchemeKeyTokens FlatDisabledOutlineColor;
    private static final float FlatDisabledOutlineOpacity;
    private static final ColorSchemeKeyTokens FlatFocusOutlineColor;
    private static final ColorSchemeKeyTokens FlatOutlineColor;
    private static final float FlatOutlineWidth;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    public static final AssistChipTokens INSTANCE = new AssistChipTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(32.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        DraggedLabelTextColor = colorSchemeKeyTokens;
        ElevatedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
        ElevatedContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ElevatedDisabledContainerOpacity = 0.12f;
        ElevatedFocusContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m3256getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        FlatContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FlatDisabledOutlineColor = colorSchemeKeyTokens;
        FlatDisabledOutlineOpacity = 0.12f;
        FlatFocusOutlineColor = colorSchemeKeyTokens;
        FlatOutlineColor = ColorSchemeKeyTokens.OutlineVariant;
        FlatOutlineWidth = Dp.m7611constructorimpl(1.0f);
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        LabelTextColor = colorSchemeKeyTokens;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedLabelTextColor = colorSchemeKeyTokens;
        DisabledIconColor = colorSchemeKeyTokens;
        DisabledIconOpacity = 0.38f;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        DraggedIconColor = colorSchemeKeyTokens2;
        FocusIconColor = colorSchemeKeyTokens2;
        HoverIconColor = colorSchemeKeyTokens2;
        IconColor = colorSchemeKeyTokens2;
        IconSize = Dp.m7611constructorimpl(18.0f);
        PressedIconColor = colorSchemeKeyTokens2;
    }

    private AssistChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3021getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final float getDisabledIconOpacity() {
        return DisabledIconOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3022getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedIconColor() {
        return DraggedIconColor;
    }

    public final ColorSchemeKeyTokens getDraggedLabelTextColor() {
        return DraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getElevatedContainerColor() {
        return ElevatedContainerColor;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3023getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3024getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    public final float getElevatedDisabledContainerOpacity() {
        return ElevatedDisabledContainerOpacity;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3025getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3026getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3027getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3028getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledOutlineColor() {
        return FlatDisabledOutlineColor;
    }

    public final float getFlatDisabledOutlineOpacity() {
        return FlatDisabledOutlineOpacity;
    }

    public final ColorSchemeKeyTokens getFlatFocusOutlineColor() {
        return FlatFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getFlatOutlineColor() {
        return FlatOutlineColor;
    }

    /* renamed from: getFlatOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3029getFlatOutlineWidthD9Ej5fM() {
        return FlatOutlineWidth;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
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

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3030getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
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
