package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final float IconButtonSpace;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingSpace;
    private static final ColorSchemeKeyTokens OnScrollContainerColor;
    private static final float OnScrollContainerElevation;
    private static final ColorSchemeKeyTokens SubtitleColor;
    private static final ColorSchemeKeyTokens TitleColor;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingSpace;
    public static final AppBarTokens INSTANCE = new AppBarTokens();
    private static final float AvatarSize = Dp.m7611constructorimpl(32.0f);
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerNone;
        IconButtonSpace = Dp.m7611constructorimpl(0.0f);
        IconSize = Dp.m7611constructorimpl(24.0f);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        LeadingIconColor = colorSchemeKeyTokens;
        LeadingSpace = Dp.m7611constructorimpl(4.0f);
        OnScrollContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        OnScrollContainerElevation = elevationTokens.m3256getLevel2D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        SubtitleColor = colorSchemeKeyTokens2;
        TitleColor = colorSchemeKeyTokens;
        TrailingIconColor = colorSchemeKeyTokens2;
        TrailingSpace = Dp.m7611constructorimpl(4.0f);
    }

    private AppBarTokens() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m3014getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3015getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getIconButtonSpace-D9Ej5fM, reason: not valid java name */
    public final float m3016getIconButtonSpaceD9Ej5fM() {
        return IconButtonSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3017getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3018getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    public final ColorSchemeKeyTokens getOnScrollContainerColor() {
        return OnScrollContainerColor;
    }

    /* renamed from: getOnScrollContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3019getOnScrollContainerElevationD9Ej5fM() {
        return OnScrollContainerElevation;
    }

    public final ColorSchemeKeyTokens getSubtitleColor() {
        return SubtitleColor;
    }

    public final ColorSchemeKeyTokens getTitleColor() {
        return TitleColor;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3020getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }
}
