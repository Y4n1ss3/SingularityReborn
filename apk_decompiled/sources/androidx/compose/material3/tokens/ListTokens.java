package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListTokens {
    public static final int $stable = 0;
    private static final float ListItemContainerElevation;
    private static final ShapeKeyTokens ListItemContainerShape;
    private static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;
    private static final float ListItemDisabledLabelTextOpacity;
    private static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;
    private static final float ListItemDisabledLeadingIconOpacity;
    private static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;
    private static final float ListItemDisabledTrailingIconOpacity;
    private static final float ListItemDraggedContainerElevation;
    private static final ColorSchemeKeyTokens ListItemDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemLabelTextColor;
    private static final TypographyKeyTokens ListItemLabelTextFont;
    private static final float ListItemLargeLeadingVideoHeight;
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarColor;
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarLabelColor;
    private static final TypographyKeyTokens ListItemLeadingAvatarLabelFont;
    private static final ShapeKeyTokens ListItemLeadingAvatarShape;
    private static final float ListItemLeadingAvatarSize;
    private static final ColorSchemeKeyTokens ListItemLeadingIconColor;
    private static final float ListItemLeadingIconSize;
    private static final float ListItemLeadingImageHeight;
    private static final ShapeKeyTokens ListItemLeadingImageShape;
    private static final float ListItemLeadingImageWidth;
    private static final float ListItemLeadingSpace;
    private static final ShapeKeyTokens ListItemLeadingVideoShape;
    private static final float ListItemLeadingVideoWidth;
    private static final float ListItemOneLineContainerHeight;
    private static final ColorSchemeKeyTokens ListItemOverlineColor;
    private static final TypographyKeyTokens ListItemOverlineFont;
    private static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemSelectedTrailingIconColor;
    private static final float ListItemSmallLeadingVideoHeight;
    private static final ColorSchemeKeyTokens ListItemSupportingTextColor;
    private static final TypographyKeyTokens ListItemSupportingTextFont;
    private static final float ListItemThreeLineContainerHeight;
    private static final ColorSchemeKeyTokens ListItemTrailingIconColor;
    private static final float ListItemTrailingIconSize;
    private static final float ListItemTrailingSpace;
    private static final ColorSchemeKeyTokens ListItemTrailingSupportingTextColor;
    private static final TypographyKeyTokens ListItemTrailingSupportingTextFont;
    private static final float ListItemTwoLineContainerHeight;
    private static final ColorSchemeKeyTokens ListItemUnselectedTrailingIconColor;
    public static final ListTokens INSTANCE = new ListTokens();
    private static final float DividerLeadingSpace = Dp.m7611constructorimpl(16.0f);
    private static final float DividerTrailingSpace = Dp.m7611constructorimpl(16.0f);
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    private static final ColorSchemeKeyTokens ListItemContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ListItemContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ListItemContainerShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemDisabledLabelTextOpacity = 0.38f;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ListItemDisabledLeadingIconOpacity = 0.38f;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemDisabledTrailingIconOpacity = 0.38f;
        ListItemDraggedContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        ListItemDraggedLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemDraggedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemDraggedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLeadingIconColor = colorSchemeKeyTokens2;
        ListItemFocusTrailingIconColor = colorSchemeKeyTokens2;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLeadingIconColor = colorSchemeKeyTokens2;
        ListItemHoverTrailingIconColor = colorSchemeKeyTokens2;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextFont = TypographyKeyTokens.BodyLarge;
        ListItemLargeLeadingVideoHeight = Dp.m7611constructorimpl(69.0f);
        ListItemLeadingAvatarColor = ColorSchemeKeyTokens.PrimaryContainer;
        ListItemLeadingAvatarLabelColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        ListItemLeadingAvatarLabelFont = TypographyKeyTokens.TitleMedium;
        ListItemLeadingAvatarShape = ShapeKeyTokens.CornerFull;
        ListItemLeadingAvatarSize = Dp.m7611constructorimpl(40.0f);
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        ListItemLeadingIconSize = Dp.m7611constructorimpl(24.0f);
        ListItemLeadingImageHeight = Dp.m7611constructorimpl(56.0f);
        ListItemLeadingImageShape = shapeKeyTokens;
        ListItemLeadingImageWidth = Dp.m7611constructorimpl(56.0f);
        ListItemLeadingSpace = Dp.m7611constructorimpl(16.0f);
        ListItemLeadingVideoShape = shapeKeyTokens;
        ListItemLeadingVideoWidth = Dp.m7611constructorimpl(100.0f);
        ListItemOneLineContainerHeight = Dp.m7611constructorimpl(56.0f);
        ListItemOverlineColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        ListItemOverlineFont = typographyKeyTokens;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemPressedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemPressedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemSelectedTrailingIconColor = ColorSchemeKeyTokens.Primary;
        ListItemSmallLeadingVideoHeight = Dp.m7611constructorimpl(56.0f);
        ListItemSupportingTextColor = colorSchemeKeyTokens2;
        ListItemSupportingTextFont = TypographyKeyTokens.BodyMedium;
        ListItemThreeLineContainerHeight = Dp.m7611constructorimpl(88.0f);
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconSize = Dp.m7611constructorimpl(24.0f);
        ListItemTrailingSpace = Dp.m7611constructorimpl(16.0f);
        ListItemTrailingSupportingTextColor = colorSchemeKeyTokens2;
        ListItemTrailingSupportingTextFont = typographyKeyTokens;
        ListItemTwoLineContainerHeight = Dp.m7611constructorimpl(72.0f);
        ListItemUnselectedTrailingIconColor = colorSchemeKeyTokens;
    }

    private ListTokens() {
    }

    /* renamed from: getDividerLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3398getDividerLeadingSpaceD9Ej5fM() {
        return DividerLeadingSpace;
    }

    /* renamed from: getDividerTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3399getDividerTrailingSpaceD9Ej5fM() {
        return DividerTrailingSpace;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getListItemContainerColor() {
        return ListItemContainerColor;
    }

    /* renamed from: getListItemContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3400getListItemContainerElevationD9Ej5fM() {
        return ListItemContainerElevation;
    }

    public final ShapeKeyTokens getListItemContainerShape() {
        return ListItemContainerShape;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return ListItemDisabledLabelTextColor;
    }

    public final float getListItemDisabledLabelTextOpacity() {
        return ListItemDisabledLabelTextOpacity;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return ListItemDisabledLeadingIconColor;
    }

    public final float getListItemDisabledLeadingIconOpacity() {
        return ListItemDisabledLeadingIconOpacity;
    }

    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return ListItemDisabledTrailingIconColor;
    }

    public final float getListItemDisabledTrailingIconOpacity() {
        return ListItemDisabledTrailingIconOpacity;
    }

    /* renamed from: getListItemDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3401getListItemDraggedContainerElevationD9Ej5fM() {
        return ListItemDraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLabelTextColor() {
        return ListItemDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLeadingIconColor() {
        return ListItemDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedTrailingIconColor() {
        return ListItemDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLeadingIconColor() {
        return ListItemFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusTrailingIconColor() {
        return ListItemFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLeadingIconColor() {
        return ListItemHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverTrailingIconColor() {
        return ListItemHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    /* renamed from: getListItemLargeLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m3402getListItemLargeLeadingVideoHeightD9Ej5fM() {
        return ListItemLargeLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarColor() {
        return ListItemLeadingAvatarColor;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarLabelColor() {
        return ListItemLeadingAvatarLabelColor;
    }

    public final TypographyKeyTokens getListItemLeadingAvatarLabelFont() {
        return ListItemLeadingAvatarLabelFont;
    }

    public final ShapeKeyTokens getListItemLeadingAvatarShape() {
        return ListItemLeadingAvatarShape;
    }

    /* renamed from: getListItemLeadingAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m3403getListItemLeadingAvatarSizeD9Ej5fM() {
        return ListItemLeadingAvatarSize;
    }

    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* renamed from: getListItemLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3404getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    /* renamed from: getListItemLeadingImageHeight-D9Ej5fM, reason: not valid java name */
    public final float m3405getListItemLeadingImageHeightD9Ej5fM() {
        return ListItemLeadingImageHeight;
    }

    public final ShapeKeyTokens getListItemLeadingImageShape() {
        return ListItemLeadingImageShape;
    }

    /* renamed from: getListItemLeadingImageWidth-D9Ej5fM, reason: not valid java name */
    public final float m3406getListItemLeadingImageWidthD9Ej5fM() {
        return ListItemLeadingImageWidth;
    }

    /* renamed from: getListItemLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3407getListItemLeadingSpaceD9Ej5fM() {
        return ListItemLeadingSpace;
    }

    public final ShapeKeyTokens getListItemLeadingVideoShape() {
        return ListItemLeadingVideoShape;
    }

    /* renamed from: getListItemLeadingVideoWidth-D9Ej5fM, reason: not valid java name */
    public final float m3408getListItemLeadingVideoWidthD9Ej5fM() {
        return ListItemLeadingVideoWidth;
    }

    /* renamed from: getListItemOneLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3409getListItemOneLineContainerHeightD9Ej5fM() {
        return ListItemOneLineContainerHeight;
    }

    public final ColorSchemeKeyTokens getListItemOverlineColor() {
        return ListItemOverlineColor;
    }

    public final TypographyKeyTokens getListItemOverlineFont() {
        return ListItemOverlineFont;
    }

    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedLeadingIconColor() {
        return ListItemPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedTrailingIconColor() {
        return ListItemPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedTrailingIconColor() {
        return ListItemSelectedTrailingIconColor;
    }

    /* renamed from: getListItemSmallLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m3410getListItemSmallLeadingVideoHeightD9Ej5fM() {
        return ListItemSmallLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemSupportingTextColor() {
        return ListItemSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemSupportingTextFont() {
        return ListItemSupportingTextFont;
    }

    /* renamed from: getListItemThreeLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3411getListItemThreeLineContainerHeightD9Ej5fM() {
        return ListItemThreeLineContainerHeight;
    }

    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* renamed from: getListItemTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3412getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    /* renamed from: getListItemTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3413getListItemTrailingSpaceD9Ej5fM() {
        return ListItemTrailingSpace;
    }

    public final ColorSchemeKeyTokens getListItemTrailingSupportingTextColor() {
        return ListItemTrailingSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemTrailingSupportingTextFont() {
        return ListItemTrailingSupportingTextFont;
    }

    /* renamed from: getListItemTwoLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3414getListItemTwoLineContainerHeightD9Ej5fM() {
        return ListItemTwoLineContainerHeight;
    }

    public final ColorSchemeKeyTokens getListItemUnselectedTrailingIconColor() {
        return ListItemUnselectedTrailingIconColor;
    }
}
