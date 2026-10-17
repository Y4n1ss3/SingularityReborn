package androidx.compose.material3.tokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FabSecondaryContainerTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final float FocusedContainerElevation;
    private static final ColorSchemeKeyTokens FocusedIconColor;
    private static final float HoveredContainerElevation;
    private static final ColorSchemeKeyTokens HoveredIconColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    public static final FabSecondaryContainerTokens INSTANCE = new FabSecondaryContainerTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SecondaryContainer;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3257getLevel3D9Ej5fM();
        FocusedContainerElevation = elevationTokens.m3257getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        FocusedIconColor = colorSchemeKeyTokens;
        HoveredContainerElevation = elevationTokens.m3258getLevel4D9Ej5fM();
        HoveredIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        PressedContainerElevation = elevationTokens.m3257getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
    }

    private FabSecondaryContainerTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3310getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getFocusedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3311getFocusedContainerElevationD9Ej5fM() {
        return FocusedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusedIconColor() {
        return FocusedIconColor;
    }

    /* renamed from: getHoveredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3312getHoveredContainerElevationD9Ej5fM() {
        return HoveredContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoveredIconColor() {
        return HoveredIconColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3313getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }
}
