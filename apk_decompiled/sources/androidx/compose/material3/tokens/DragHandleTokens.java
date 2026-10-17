package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragHandleTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DraggedColor;
    private static final float DraggedElevation;
    private static final float DraggedHeight;
    private static final ShapeKeyTokens DraggedShape;
    private static final float DraggedWidth;
    private static final float Elevation;
    private static final float Height;
    private static final ColorSchemeKeyTokens PressedColor;
    private static final float PressedElevation;
    private static final float PressedHeight;
    private static final ShapeKeyTokens PressedShape;
    private static final float PressedWidth;
    private static final ShapeKeyTokens Shape;
    private static final float Width;
    public static final DragHandleTokens INSTANCE = new DragHandleTokens();
    private static final ColorSchemeKeyTokens Color = ColorSchemeKeyTokens.Outline;
    private static final float ContainerWidth = Dp.m7611constructorimpl(24.0f);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DraggedColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        DraggedHeight = Dp.m7611constructorimpl(52.0f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerMedium;
        DraggedShape = shapeKeyTokens;
        DraggedWidth = Dp.m7611constructorimpl(12.0f);
        Elevation = elevationTokens.m3254getLevel0D9Ej5fM();
        Height = Dp.m7611constructorimpl(48.0f);
        PressedColor = colorSchemeKeyTokens;
        PressedElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        PressedHeight = Dp.m7611constructorimpl(52.0f);
        PressedShape = shapeKeyTokens;
        PressedWidth = Dp.m7611constructorimpl(12.0f);
        Shape = ShapeKeyTokens.CornerFull;
        Width = Dp.m7611constructorimpl(4.0f);
    }

    private DragHandleTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3232getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final ColorSchemeKeyTokens getDraggedColor() {
        return DraggedColor;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3233getDraggedElevationD9Ej5fM() {
        return DraggedElevation;
    }

    /* renamed from: getDraggedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3234getDraggedHeightD9Ej5fM() {
        return DraggedHeight;
    }

    public final ShapeKeyTokens getDraggedShape() {
        return DraggedShape;
    }

    /* renamed from: getDraggedWidth-D9Ej5fM, reason: not valid java name */
    public final float m3235getDraggedWidthD9Ej5fM() {
        return DraggedWidth;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3236getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m3237getHeightD9Ej5fM() {
        return Height;
    }

    public final ColorSchemeKeyTokens getPressedColor() {
        return PressedColor;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3238getPressedElevationD9Ej5fM() {
        return PressedElevation;
    }

    /* renamed from: getPressedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3239getPressedHeightD9Ej5fM() {
        return PressedHeight;
    }

    public final ShapeKeyTokens getPressedShape() {
        return PressedShape;
    }

    /* renamed from: getPressedWidth-D9Ej5fM, reason: not valid java name */
    public final float m3240getPressedWidthD9Ej5fM() {
        return PressedWidth;
    }

    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m3241getWidthD9Ej5fM() {
        return Width;
    }
}
