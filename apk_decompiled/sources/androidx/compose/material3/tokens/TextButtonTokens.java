package androidx.compose.material3.tokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextButtonTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledIconColor;
    private static final float DisabledIconOpacity;
    private static final ColorSchemeKeyTokens DisabledLabelColor;
    private static final float DisabledLabelOpacity;
    private static final ColorSchemeKeyTokens FocusedIconColor;
    private static final ColorSchemeKeyTokens FocusedLabelColor;
    private static final ColorSchemeKeyTokens HoveredIconColor;
    private static final ColorSchemeKeyTokens HoveredLabelColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final ColorSchemeKeyTokens LabelColor;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelColor;
    public static final TextButtonTokens INSTANCE = new TextButtonTokens();
    private static final ColorSchemeKeyTokens DisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledContainerOpacity = 0.1f;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        DisabledIconColor = colorSchemeKeyTokens;
        DisabledIconOpacity = 0.38f;
        DisabledLabelColor = colorSchemeKeyTokens;
        DisabledLabelOpacity = 0.38f;
        FocusedIconColor = colorSchemeKeyTokens;
        FocusedLabelColor = colorSchemeKeyTokens;
        HoveredIconColor = colorSchemeKeyTokens;
        HoveredLabelColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        LabelColor = colorSchemeKeyTokens;
        PressedIconColor = colorSchemeKeyTokens;
        PressedLabelColor = colorSchemeKeyTokens;
    }

    private TextButtonTokens() {
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final float getDisabledIconOpacity() {
        return DisabledIconOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return DisabledLabelColor;
    }

    public final float getDisabledLabelOpacity() {
        return DisabledLabelOpacity;
    }

    public final ColorSchemeKeyTokens getFocusedIconColor() {
        return FocusedIconColor;
    }

    public final ColorSchemeKeyTokens getFocusedLabelColor() {
        return FocusedLabelColor;
    }

    public final ColorSchemeKeyTokens getHoveredIconColor() {
        return HoveredIconColor;
    }

    public final ColorSchemeKeyTokens getHoveredLabelColor() {
        return HoveredLabelColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    public final ColorSchemeKeyTokens getLabelColor() {
        return LabelColor;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelColor() {
        return PressedLabelColor;
    }
}
