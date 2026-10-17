package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BaselineButtonTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    private static final float DisabledContainerOpacity;
    private static final ColorSchemeKeyTokens DisabledIconColor;
    private static final float DisabledIconOpacity;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final float FocusedContainerElevation;
    private static final ColorSchemeKeyTokens FocusedIconColor;
    private static final ColorSchemeKeyTokens FocusedLabelTextColor;
    private static final float HoveredContainerElevation;
    private static final ColorSchemeKeyTokens HoveredIconColor;
    private static final ColorSchemeKeyTokens HoveredLabelTextColor;
    public static final BaselineButtonTokens INSTANCE = new BaselineButtonTokens();
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconLabelSpace;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final ColorSchemeKeyTokens LabelTextSelectedColor;
    private static final ColorSchemeKeyTokens LabelTextUnselectedColor;
    private static final float LeadingSpace;
    private static final float PressedContainerElevation;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final ColorSchemeKeyTokens SelectedFocusedIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedHoveredIconColor;
    private static final ColorSchemeKeyTokens SelectedHoveredLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final float TrailingSpace;
    private static final ColorSchemeKeyTokens UnselectedContainerColor;
    private static final ColorSchemeKeyTokens UnselectedFocusedIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoveredIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoveredLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ContainerHeight = Dp.m7611constructorimpl(40.0f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        DisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        DisabledContainerOpacity = 0.1f;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        DisabledIconColor = colorSchemeKeyTokens2;
        DisabledIconOpacity = 0.38f;
        DisabledLabelTextColor = colorSchemeKeyTokens2;
        DisabledLabelTextOpacity = 0.38f;
        FocusedContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        FocusedIconColor = colorSchemeKeyTokens3;
        FocusedLabelTextColor = colorSchemeKeyTokens3;
        HoveredContainerElevation = elevationTokens.m3255getLevel1D9Ej5fM();
        HoveredIconColor = colorSchemeKeyTokens3;
        HoveredLabelTextColor = colorSchemeKeyTokens3;
        IconColor = colorSchemeKeyTokens3;
        IconLabelSpace = Dp.m7611constructorimpl(8.0f);
        IconSize = Dp.m7611constructorimpl(20.0f);
        LabelTextColor = colorSchemeKeyTokens3;
        LabelTextSelectedColor = colorSchemeKeyTokens3;
        LabelTextUnselectedColor = colorSchemeKeyTokens2;
        LeadingSpace = Dp.m7611constructorimpl(24.0f);
        PressedContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        PressedIconColor = colorSchemeKeyTokens3;
        PressedLabelTextColor = colorSchemeKeyTokens3;
        SelectedContainerColor = colorSchemeKeyTokens;
        SelectedContainerShapeRound = shapeKeyTokens;
        SelectedContainerShapeSquare = shapeKeyTokens2;
        SelectedFocusedIconColor = colorSchemeKeyTokens3;
        SelectedFocusedLabelTextColor = colorSchemeKeyTokens3;
        SelectedHoveredIconColor = colorSchemeKeyTokens3;
        SelectedHoveredLabelTextColor = colorSchemeKeyTokens3;
        SelectedIconColor = colorSchemeKeyTokens3;
        SelectedPressedIconColor = colorSchemeKeyTokens3;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens3;
        TrailingSpace = Dp.m7611constructorimpl(24.0f);
        UnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        UnselectedFocusedIconColor = colorSchemeKeyTokens2;
        UnselectedFocusedLabelTextColor = colorSchemeKeyTokens2;
        UnselectedHoveredIconColor = colorSchemeKeyTokens2;
        UnselectedHoveredLabelTextColor = colorSchemeKeyTokens2;
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedPressedIconColor = colorSchemeKeyTokens2;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens2;
    }

    private BaselineButtonTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3033getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3034getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3035getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
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

    /* renamed from: getFocusedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3036getFocusedContainerElevationD9Ej5fM() {
        return FocusedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusedIconColor() {
        return FocusedIconColor;
    }

    public final ColorSchemeKeyTokens getFocusedLabelTextColor() {
        return FocusedLabelTextColor;
    }

    /* renamed from: getHoveredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3037getHoveredContainerElevationD9Ej5fM() {
        return HoveredContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoveredIconColor() {
        return HoveredIconColor;
    }

    public final ColorSchemeKeyTokens getHoveredLabelTextColor() {
        return HoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m3038getIconLabelSpaceD9Ej5fM() {
        return IconLabelSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3039getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final ColorSchemeKeyTokens getLabelTextSelectedColor() {
        return LabelTextSelectedColor;
    }

    public final ColorSchemeKeyTokens getLabelTextUnselectedColor() {
        return LabelTextUnselectedColor;
    }

    /* renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3040getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3041getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ShapeKeyTokens getPressedContainerShape() {
        return PressedContainerShape;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ShapeKeyTokens getSelectedContainerShapeRound() {
        return SelectedContainerShapeRound;
    }

    public final ShapeKeyTokens getSelectedContainerShapeSquare() {
        return SelectedContainerShapeSquare;
    }

    public final ColorSchemeKeyTokens getSelectedFocusedIconColor() {
        return SelectedFocusedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusedLabelTextColor() {
        return SelectedFocusedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoveredIconColor() {
        return SelectedHoveredIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoveredLabelTextColor() {
        return SelectedHoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    /* renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3042getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }

    public final ColorSchemeKeyTokens getUnselectedContainerColor() {
        return UnselectedContainerColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusedIconColor() {
        return UnselectedFocusedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusedLabelTextColor() {
        return UnselectedFocusedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoveredIconColor() {
        return UnselectedHoveredIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoveredLabelTextColor() {
        return UnselectedHoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }
}
