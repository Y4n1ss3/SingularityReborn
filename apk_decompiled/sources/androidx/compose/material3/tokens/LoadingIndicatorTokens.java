package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoadingIndicatorTokens {
    public static final int $stable = 0;
    public static final LoadingIndicatorTokens INSTANCE = new LoadingIndicatorTokens();
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.Primary;
    private static final float ActiveSize = Dp.m7611constructorimpl(38.0f);
    private static final ColorSchemeKeyTokens ContainedActiveColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final ColorSchemeKeyTokens ContainedContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
    private static final float ContainerHeight = Dp.m7611constructorimpl(48.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ContainerWidth = Dp.m7611constructorimpl(48.0f);

    private LoadingIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveSize-D9Ej5fM, reason: not valid java name */
    public final float m3415getActiveSizeD9Ej5fM() {
        return ActiveSize;
    }

    public final ColorSchemeKeyTokens getContainedActiveColor() {
        return ContainedActiveColor;
    }

    public final ColorSchemeKeyTokens getContainedContainerColor() {
        return ContainedContainerColor;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3416getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3417getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }
}
