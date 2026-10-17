package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SuggestionChipTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    private static final float DisabledLeadingIconOpacity;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedLabelTextColor;
    private static final ColorSchemeKeyTokens DraggedLeadingIconColor;
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
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens PressedLeadingIconColor;
    public static final SuggestionChipTokens INSTANCE = new SuggestionChipTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(32.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        DraggedLabelTextColor = colorSchemeKeyTokens2;
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
        FlatFocusOutlineColor = colorSchemeKeyTokens2;
        FlatOutlineColor = ColorSchemeKeyTokens.OutlineVariant;
        FlatOutlineWidth = Dp.m7611constructorimpl(1.0f);
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        FocusLabelTextColor = colorSchemeKeyTokens2;
        HoverLabelTextColor = colorSchemeKeyTokens2;
        LabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedLabelTextColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        DisabledLeadingIconOpacity = 0.38f;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        DraggedLeadingIconColor = colorSchemeKeyTokens3;
        FocusLeadingIconColor = colorSchemeKeyTokens3;
        HoverLeadingIconColor = colorSchemeKeyTokens3;
        LeadingIconColor = colorSchemeKeyTokens3;
        LeadingIconSize = Dp.m7611constructorimpl(18.0f);
        PressedLeadingIconColor = colorSchemeKeyTokens3;
    }

    private SuggestionChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3676getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    public final float getDisabledLeadingIconOpacity() {
        return DisabledLeadingIconOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3677getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedLabelTextColor() {
        return DraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDraggedLeadingIconColor() {
        return DraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getElevatedContainerColor() {
        return ElevatedContainerColor;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3678getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3679getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    public final float getElevatedDisabledContainerOpacity() {
        return ElevatedDisabledContainerOpacity;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3680getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3681getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3682getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3683getFlatContainerElevationD9Ej5fM() {
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
    public final float m3684getFlatOutlineWidthD9Ej5fM() {
        return FlatOutlineWidth;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return HoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3685getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPressedLeadingIconColor() {
        return PressedLeadingIconColor;
    }
}
