package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputChipTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens AvatarShape;
    private static final float AvatarSize;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float DisabledAvatarOpacity;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    private static final float DisabledLeadingIconOpacity;
    private static final ColorSchemeKeyTokens DisabledSelectedContainerColor;
    private static final float DisabledSelectedContainerOpacity;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;
    private static final float DisabledTrailingIconOpacity;
    private static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;
    private static final float DisabledUnselectedOutlineOpacity;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    public static final InputChipTokens INSTANCE = new InputChipTokens();
    private static final TypographyKeyTokens LabelTextFont;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
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
    private static final float SelectedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedTrailingIconColor;
    private static final float TrailingIconSize;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor;
    private static final float UnselectedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedTrailingIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ContainerHeight = Dp.m7611constructorimpl(32.0f);
        ContainerShape = ShapeKeyTokens.CornerSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledSelectedContainerOpacity = 0.12f;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineOpacity = 0.12f;
        DraggedContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        SelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens2;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens2;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens2;
        SelectedLabelTextColor = colorSchemeKeyTokens2;
        SelectedOutlineWidth = Dp.m7611constructorimpl(0.0f);
        SelectedPressedLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedOutlineColor = ColorSchemeKeyTokens.OutlineVariant;
        UnselectedOutlineWidth = Dp.m7611constructorimpl(1.0f);
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        AvatarShape = ShapeKeyTokens.CornerFull;
        AvatarSize = Dp.m7611constructorimpl(24.0f);
        DisabledAvatarOpacity = 0.38f;
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        DisabledLeadingIconOpacity = 0.38f;
        LeadingIconSize = Dp.m7611constructorimpl(18.0f);
        SelectedDraggedLeadingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Primary;
        SelectedFocusLeadingIconColor = colorSchemeKeyTokens4;
        SelectedHoverLeadingIconColor = colorSchemeKeyTokens4;
        SelectedLeadingIconColor = colorSchemeKeyTokens4;
        SelectedPressedLeadingIconColor = colorSchemeKeyTokens4;
        UnselectedDraggedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusLeadingIconColor = colorSchemeKeyTokens4;
        UnselectedHoverLeadingIconColor = colorSchemeKeyTokens4;
        UnselectedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedLeadingIconColor = colorSchemeKeyTokens4;
        DisabledTrailingIconColor = colorSchemeKeyTokens;
        DisabledTrailingIconOpacity = 0.38f;
        SelectedDraggedTrailingIconColor = colorSchemeKeyTokens4;
        SelectedFocusTrailingIconColor = colorSchemeKeyTokens2;
        SelectedHoverTrailingIconColor = colorSchemeKeyTokens2;
        SelectedPressedTrailingIconColor = colorSchemeKeyTokens2;
        SelectedTrailingIconColor = colorSchemeKeyTokens2;
        TrailingIconSize = Dp.m7611constructorimpl(18.0f);
        UnselectedDraggedTrailingIconColor = colorSchemeKeyTokens4;
        UnselectedFocusTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedTrailingIconColor = colorSchemeKeyTokens3;
    }

    private InputChipTokens() {
    }

    public final ShapeKeyTokens getAvatarShape() {
        return AvatarShape;
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m3371getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3372getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3373getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final float getDisabledAvatarOpacity() {
        return DisabledAvatarOpacity;
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

    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    public final float getDisabledSelectedContainerOpacity() {
        return DisabledSelectedContainerOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final float getDisabledTrailingIconOpacity() {
        return DisabledTrailingIconOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    public final float getDisabledUnselectedOutlineOpacity() {
        return DisabledUnselectedOutlineOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3374getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3375getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
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

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3376getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
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

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3377getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
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

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
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

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3378getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
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
