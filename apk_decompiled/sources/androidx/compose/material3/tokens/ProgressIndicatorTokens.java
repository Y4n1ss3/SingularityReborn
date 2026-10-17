package androidx.compose.material3.tokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProgressIndicatorTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveShape;
    public static final ProgressIndicatorTokens INSTANCE = new ProgressIndicatorTokens();
    private static final ColorSchemeKeyTokens StopColor;
    private static final ShapeKeyTokens StopShape;
    private static final ColorSchemeKeyTokens TrackColor;
    private static final ShapeKeyTokens TrackShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveShape = shapeKeyTokens;
        StopColor = colorSchemeKeyTokens;
        StopShape = shapeKeyTokens;
        TrackColor = ColorSchemeKeyTokens.SecondaryContainer;
        TrackShape = shapeKeyTokens;
    }

    private ProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    public final ColorSchemeKeyTokens getStopColor() {
        return StopColor;
    }

    public final ShapeKeyTokens getStopShape() {
        return StopShape;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }
}
