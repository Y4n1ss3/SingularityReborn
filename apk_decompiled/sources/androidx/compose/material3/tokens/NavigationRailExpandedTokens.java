package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailExpandedTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidthMaximum;
    private static final float ContainerWidthMinimum;
    public static final NavigationRailExpandedTokens INSTANCE = new NavigationRailExpandedTokens();
    private static final ColorSchemeKeyTokens ModalContainerColor;
    private static final float ModalContainerElevation;
    private static final ShapeKeyTokens ModalContainerShape;
    private static final float TopSpace;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerWidthMaximum = Dp.m7611constructorimpl(360.0f);
        ContainerWidthMinimum = Dp.m7611constructorimpl(220.0f);
        ModalContainerElevation = elevationTokens.m3256getLevel2D9Ej5fM();
        ModalContainerShape = ShapeKeyTokens.CornerLarge;
        TopSpace = Dp.m7611constructorimpl(44.0f);
        ModalContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
    }

    private NavigationRailExpandedTokens() {
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3459getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidthMaximum-D9Ej5fM, reason: not valid java name */
    public final float m3460getContainerWidthMaximumD9Ej5fM() {
        return ContainerWidthMaximum;
    }

    /* renamed from: getContainerWidthMinimum-D9Ej5fM, reason: not valid java name */
    public final float m3461getContainerWidthMinimumD9Ej5fM() {
        return ContainerWidthMinimum;
    }

    public final ColorSchemeKeyTokens getModalContainerColor() {
        return ModalContainerColor;
    }

    /* renamed from: getModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3462getModalContainerElevationD9Ej5fM() {
        return ModalContainerElevation;
    }

    public final ShapeKeyTokens getModalContainerShape() {
        return ModalContainerShape;
    }

    /* renamed from: getTopSpace-D9Ej5fM, reason: not valid java name */
    public final float m3463getTopSpaceD9Ej5fM() {
        return TopSpace;
    }
}
