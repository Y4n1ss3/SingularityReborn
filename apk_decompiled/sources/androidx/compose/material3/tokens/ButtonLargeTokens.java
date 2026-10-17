package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ButtonLargeTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float IconLabelSpace;
    private static final float IconSize;
    private static final float LeadingSpace;
    private static final float OutlinedOutlineWidth;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float TrailingSpace;
    public static final ButtonLargeTokens INSTANCE = new ButtonLargeTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(96.0f);

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerExtraLarge;
        ContainerShapeSquare = shapeKeyTokens2;
        IconLabelSpace = Dp.m7611constructorimpl(12.0f);
        IconSize = Dp.m7611constructorimpl(32.0f);
        LeadingSpace = Dp.m7611constructorimpl(48.0f);
        OutlinedOutlineWidth = Dp.m7611constructorimpl(2.0f);
        PressedContainerShape = ShapeKeyTokens.CornerLarge;
        SelectedContainerShapeRound = shapeKeyTokens;
        SelectedContainerShapeSquare = shapeKeyTokens2;
        TrailingSpace = Dp.m7611constructorimpl(48.0f);
    }

    private ButtonLargeTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3047getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    /* renamed from: getIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m3048getIconLabelSpaceD9Ej5fM() {
        return IconLabelSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3049getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3050getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    /* renamed from: getOutlinedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3051getOutlinedOutlineWidthD9Ej5fM() {
        return OutlinedOutlineWidth;
    }

    public final ShapeKeyTokens getPressedContainerShape() {
        return PressedContainerShape;
    }

    public final ShapeKeyTokens getSelectedContainerShapeRound() {
        return SelectedContainerShapeRound;
    }

    public final ShapeKeyTokens getSelectedContainerShapeSquare() {
        return SelectedContainerShapeSquare;
    }

    /* renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3052getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }
}
