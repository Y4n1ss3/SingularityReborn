package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailCollapsedTokens {
    public static final int $stable = 0;
    public static final NavigationRailCollapsedTokens INSTANCE = new NavigationRailCollapsedTokens();
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final float ContainerWidth = Dp.m7611constructorimpl(96.0f);
    private static final float ItemVerticalSpace = Dp.m7611constructorimpl(4.0f);
    private static final float TopSpace = Dp.m7611constructorimpl(44.0f);
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float NarrowContainerWidth = Dp.m7611constructorimpl(80.0f);

    private NavigationRailCollapsedTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3454getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3455getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getItemVerticalSpace-D9Ej5fM, reason: not valid java name */
    public final float m3456getItemVerticalSpaceD9Ej5fM() {
        return ItemVerticalSpace;
    }

    /* renamed from: getNarrowContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3457getNarrowContainerWidthD9Ej5fM() {
        return NarrowContainerWidth;
    }

    /* renamed from: getTopSpace-D9Ej5fM, reason: not valid java name */
    public final float m3458getTopSpaceD9Ej5fM() {
        return TopSpace;
    }
}
