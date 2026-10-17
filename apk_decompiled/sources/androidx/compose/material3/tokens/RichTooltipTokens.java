package androidx.compose.material3.tokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RichTooltipTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActionFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ActionHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ActionLabelTextColor;
    private static final TypographyKeyTokens ActionLabelTextFont;
    private static final ColorSchemeKeyTokens ActionPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    public static final RichTooltipTokens INSTANCE = new RichTooltipTokens();
    private static final ColorSchemeKeyTokens SubheadColor;
    private static final TypographyKeyTokens SubheadFont;
    private static final ColorSchemeKeyTokens SupportingTextColor;
    private static final TypographyKeyTokens SupportingTextFont;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActionFocusLabelTextColor = colorSchemeKeyTokens;
        ActionHoverLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextFont = TypographyKeyTokens.LabelLarge;
        ActionPressedLabelTextColor = colorSchemeKeyTokens;
        ContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        ContainerElevation = ElevationTokens.INSTANCE.m3256getLevel2D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        SubheadColor = colorSchemeKeyTokens2;
        SubheadFont = TypographyKeyTokens.TitleSmall;
        SupportingTextColor = colorSchemeKeyTokens2;
        SupportingTextFont = TypographyKeyTokens.BodyMedium;
    }

    private RichTooltipTokens() {
    }

    public final ColorSchemeKeyTokens getActionFocusLabelTextColor() {
        return ActionFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActionHoverLabelTextColor() {
        return ActionHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActionLabelTextColor() {
        return ActionLabelTextColor;
    }

    public final TypographyKeyTokens getActionLabelTextFont() {
        return ActionLabelTextFont;
    }

    public final ColorSchemeKeyTokens getActionPressedLabelTextColor() {
        return ActionPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3597getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getSubheadColor() {
        return SubheadColor;
    }

    public final TypographyKeyTokens getSubheadFont() {
        return SubheadFont;
    }

    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return SupportingTextColor;
    }

    public final TypographyKeyTokens getSupportingTextFont() {
        return SupportingTextFont;
    }
}
