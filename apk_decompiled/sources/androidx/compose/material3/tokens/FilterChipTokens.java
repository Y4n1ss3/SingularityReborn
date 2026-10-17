package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterChipTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    private static final float DisabledLeadingIconOpacity;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;
    private static final float DisabledTrailingIconOpacity;
    private static final float DraggedContainerElevation;
    private static final float ElevatedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;
    private static final float ElevatedDisabledContainerElevation;
    private static final float ElevatedDisabledContainerOpacity;
    private static final float ElevatedFocusContainerElevation;
    private static final float ElevatedHoverContainerElevation;
    private static final float ElevatedPressedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedSelectedContainerColor;
    private static final ColorSchemeKeyTokens ElevatedUnselectedContainerColor;
    private static final float FlatContainerElevation;
    private static final ColorSchemeKeyTokens FlatDisabledSelectedContainerColor;
    private static final float FlatDisabledSelectedContainerOpacity;
    private static final ColorSchemeKeyTokens FlatDisabledUnselectedOutlineColor;
    private static final float FlatDisabledUnselectedOutlineOpacity;
    private static final ColorSchemeKeyTokens FlatSelectedContainerColor;
    private static final float FlatSelectedFocusContainerElevation;
    private static final float FlatSelectedHoverContainerElevation;
    private static final float FlatSelectedOutlineWidth;
    private static final float FlatSelectedPressedContainerElevation;
    private static final float FlatUnselectedFocusContainerElevation;
    private static final ColorSchemeKeyTokens FlatUnselectedFocusOutlineColor;
    private static final float FlatUnselectedHoverContainerElevation;
    private static final ColorSchemeKeyTokens FlatUnselectedOutlineColor;
    private static final float FlatUnselectedOutlineWidth;
    private static final float FlatUnselectedPressedContainerElevation;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final float IconSize;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedTrailingIconColor;
    public static final FilterChipTokens INSTANCE = new FilterChipTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(32.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        ElevatedContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ElevatedDisabledContainerOpacity = 0.12f;
        ElevatedFocusContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m3256getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SecondaryContainer;
        ElevatedSelectedContainerColor = colorSchemeKeyTokens2;
        ElevatedUnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
        FlatContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FlatDisabledSelectedContainerColor = colorSchemeKeyTokens;
        FlatDisabledSelectedContainerOpacity = 0.12f;
        FlatDisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        FlatDisabledUnselectedOutlineOpacity = 0.12f;
        FlatSelectedContainerColor = colorSchemeKeyTokens2;
        FlatSelectedFocusContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FlatSelectedHoverContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        FlatSelectedOutlineWidth = Dp.m7611constructorimpl(0.0f);
        FlatSelectedPressedContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FlatUnselectedFocusContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        FlatUnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        FlatUnselectedHoverContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FlatUnselectedOutlineColor = ColorSchemeKeyTokens.OutlineVariant;
        FlatUnselectedOutlineWidth = Dp.m7611constructorimpl(1.0f);
        FlatUnselectedPressedContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens4;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens4;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens4;
        SelectedLabelTextColor = colorSchemeKeyTokens4;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens4;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        IconSize = Dp.m7611constructorimpl(18.0f);
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        DisabledLeadingIconOpacity = 0.38f;
        SelectedDraggedLeadingIconColor = colorSchemeKeyTokens4;
        SelectedFocusLeadingIconColor = colorSchemeKeyTokens4;
        SelectedHoverLeadingIconColor = colorSchemeKeyTokens4;
        SelectedLeadingIconColor = colorSchemeKeyTokens4;
        SelectedPressedLeadingIconColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        UnselectedDraggedLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedFocusLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedHoverLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedPressedLeadingIconColor = colorSchemeKeyTokens5;
        DisabledTrailingIconColor = colorSchemeKeyTokens;
        DisabledTrailingIconOpacity = 0.38f;
        SelectedDraggedTrailingIconColor = colorSchemeKeyTokens4;
        SelectedFocusTrailingIconColor = colorSchemeKeyTokens4;
        SelectedHoverTrailingIconColor = colorSchemeKeyTokens4;
        SelectedPressedTrailingIconColor = colorSchemeKeyTokens4;
        SelectedTrailingIconColor = colorSchemeKeyTokens4;
        UnselectedDraggedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedTrailingIconColor = colorSchemeKeyTokens3;
    }

    private FilterChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3349getContainerHeightD9Ej5fM() {
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

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final float getDisabledTrailingIconOpacity() {
        return DisabledTrailingIconOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3350getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3351getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3352getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    public final float getElevatedDisabledContainerOpacity() {
        return ElevatedDisabledContainerOpacity;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3353getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3354getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3355getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedSelectedContainerColor() {
        return ElevatedSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getElevatedUnselectedContainerColor() {
        return ElevatedUnselectedContainerColor;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3356getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledSelectedContainerColor() {
        return FlatDisabledSelectedContainerColor;
    }

    public final float getFlatDisabledSelectedContainerOpacity() {
        return FlatDisabledSelectedContainerOpacity;
    }

    public final ColorSchemeKeyTokens getFlatDisabledUnselectedOutlineColor() {
        return FlatDisabledUnselectedOutlineColor;
    }

    public final float getFlatDisabledUnselectedOutlineOpacity() {
        return FlatDisabledUnselectedOutlineOpacity;
    }

    public final ColorSchemeKeyTokens getFlatSelectedContainerColor() {
        return FlatSelectedContainerColor;
    }

    /* renamed from: getFlatSelectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3357getFlatSelectedFocusContainerElevationD9Ej5fM() {
        return FlatSelectedFocusContainerElevation;
    }

    /* renamed from: getFlatSelectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3358getFlatSelectedHoverContainerElevationD9Ej5fM() {
        return FlatSelectedHoverContainerElevation;
    }

    /* renamed from: getFlatSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3359getFlatSelectedOutlineWidthD9Ej5fM() {
        return FlatSelectedOutlineWidth;
    }

    /* renamed from: getFlatSelectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3360getFlatSelectedPressedContainerElevationD9Ej5fM() {
        return FlatSelectedPressedContainerElevation;
    }

    /* renamed from: getFlatUnselectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3361getFlatUnselectedFocusContainerElevationD9Ej5fM() {
        return FlatUnselectedFocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedFocusOutlineColor() {
        return FlatUnselectedFocusOutlineColor;
    }

    /* renamed from: getFlatUnselectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3362getFlatUnselectedHoverContainerElevationD9Ej5fM() {
        return FlatUnselectedHoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedOutlineColor() {
        return FlatUnselectedOutlineColor;
    }

    /* renamed from: getFlatUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3363getFlatUnselectedOutlineWidthD9Ej5fM() {
        return FlatUnselectedOutlineWidth;
    }

    /* renamed from: getFlatUnselectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3364getFlatUnselectedPressedContainerElevationD9Ej5fM() {
        return FlatUnselectedPressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3365getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return SelectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return SelectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return SelectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return SelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return SelectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return SelectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return SelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return SelectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return SelectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return SelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return SelectedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return SelectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return SelectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return SelectedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return UnselectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return UnselectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return UnselectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return UnselectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return UnselectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return UnselectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLeadingIconColor() {
        return UnselectedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return UnselectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return UnselectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrailingIconColor() {
        return UnselectedTrailingIconColor;
    }
}
