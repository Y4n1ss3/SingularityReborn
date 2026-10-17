package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class XSmallIconButtonTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float DefaultLeadingSpace;
    private static final float DefaultTrailingSpace;
    private static final float IconSize;
    private static final float NarrowLeadingSpace;
    private static final float NarrowTrailingSpace;
    private static final float OutlinedOutlineWidth;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float WideLeadingSpace;
    private static final float WideTrailingSpace;
    public static final XSmallIconButtonTokens INSTANCE = new XSmallIconButtonTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(32.0f);

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        DefaultLeadingSpace = Dp.m7611constructorimpl(6.0f);
        DefaultTrailingSpace = Dp.m7611constructorimpl(6.0f);
        IconSize = Dp.m7611constructorimpl(20.0f);
        NarrowLeadingSpace = Dp.m7611constructorimpl(4.0f);
        NarrowTrailingSpace = Dp.m7611constructorimpl(4.0f);
        OutlinedOutlineWidth = Dp.m7611constructorimpl(1.0f);
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        SelectedContainerShapeRound = shapeKeyTokens2;
        SelectedContainerShapeSquare = shapeKeyTokens;
        WideLeadingSpace = Dp.m7611constructorimpl(10.0f);
        WideTrailingSpace = Dp.m7611constructorimpl(10.0f);
    }

    private XSmallIconButtonTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3824getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    /* renamed from: getDefaultLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3825getDefaultLeadingSpaceD9Ej5fM() {
        return DefaultLeadingSpace;
    }

    /* renamed from: getDefaultTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3826getDefaultTrailingSpaceD9Ej5fM() {
        return DefaultTrailingSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3827getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getNarrowLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3828getNarrowLeadingSpaceD9Ej5fM() {
        return NarrowLeadingSpace;
    }

    /* renamed from: getNarrowTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3829getNarrowTrailingSpaceD9Ej5fM() {
        return NarrowTrailingSpace;
    }

    /* renamed from: getOutlinedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3830getOutlinedOutlineWidthD9Ej5fM() {
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

    /* renamed from: getWideLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3831getWideLeadingSpaceD9Ej5fM() {
        return WideLeadingSpace;
    }

    /* renamed from: getWideTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3832getWideTrailingSpaceD9Ej5fM() {
        return WideTrailingSpace;
    }
}
