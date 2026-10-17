package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.tokens.ShapeTokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShapeDefaults {
    public static final int $stable = 0;
    private static final CornerSize CornerExtraExtraLarge;
    private static final CornerSize CornerExtraLarge;
    private static final CornerSize CornerExtraLargeIncreased;
    private static final CornerSize CornerExtraSmall;
    private static final CornerSize CornerFull;
    private static final CornerSize CornerLarge;
    private static final CornerSize CornerLargeIncreased;
    private static final CornerSize CornerMedium;
    private static final CornerSize CornerNone;
    private static final CornerSize CornerSmall;
    private static final CornerBasedShape ExtraExtraLarge;
    private static final CornerBasedShape ExtraLarge;
    private static final CornerBasedShape ExtraLargeIncreased;
    private static final CornerBasedShape ExtraSmall;
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();
    private static final CornerBasedShape Large;
    private static final CornerBasedShape LargeIncreased;
    private static final CornerBasedShape Medium;
    private static final CornerBasedShape Small;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        ExtraSmall = shapeTokens.getCornerExtraSmall();
        Small = shapeTokens.getCornerSmall();
        Medium = shapeTokens.getCornerMedium();
        Large = shapeTokens.getCornerLarge();
        LargeIncreased = shapeTokens.getCornerLargeIncreased();
        ExtraLarge = shapeTokens.getCornerExtraLarge();
        ExtraLargeIncreased = shapeTokens.getCornerExtraLargeIncreased();
        ExtraExtraLarge = shapeTokens.getCornerExtraExtraLarge();
        CornerNone = shapeTokens.getCornerValueNone();
        CornerExtraSmall = shapeTokens.getCornerValueExtraSmall();
        CornerSmall = shapeTokens.getCornerValueSmall();
        CornerMedium = shapeTokens.getCornerValueMedium();
        CornerLarge = shapeTokens.getCornerValueLarge();
        CornerLargeIncreased = shapeTokens.getCornerValueLargeIncreased();
        CornerExtraLarge = shapeTokens.getCornerValueExtraLarge();
        CornerExtraLargeIncreased = shapeTokens.getCornerValueExtraLargeIncreased();
        CornerExtraExtraLarge = shapeTokens.getCornerValueExtraExtraLarge();
        CornerFull = CornerSizeKt.CornerSize(100);
    }

    private ShapeDefaults() {
    }

    public final CornerSize getCornerExtraExtraLarge$material3() {
        return CornerExtraExtraLarge;
    }

    public final CornerSize getCornerExtraLarge$material3() {
        return CornerExtraLarge;
    }

    public final CornerSize getCornerExtraLargeIncreased$material3() {
        return CornerExtraLargeIncreased;
    }

    public final CornerSize getCornerExtraSmall$material3() {
        return CornerExtraSmall;
    }

    public final CornerSize getCornerFull$material3() {
        return CornerFull;
    }

    public final CornerSize getCornerLarge$material3() {
        return CornerLarge;
    }

    public final CornerSize getCornerLargeIncreased$material3() {
        return CornerLargeIncreased;
    }

    public final CornerSize getCornerMedium$material3() {
        return CornerMedium;
    }

    public final CornerSize getCornerNone$material3() {
        return CornerNone;
    }

    public final CornerSize getCornerSmall$material3() {
        return CornerSmall;
    }

    public final CornerBasedShape getExtraExtraLarge$material3() {
        return ExtraExtraLarge;
    }

    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }

    public final CornerBasedShape getExtraLargeIncreased$material3() {
        return ExtraLargeIncreased;
    }

    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    public final CornerBasedShape getLarge() {
        return Large;
    }

    public final CornerBasedShape getLargeIncreased$material3() {
        return LargeIncreased;
    }

    public final CornerBasedShape getMedium() {
        return Medium;
    }

    public final CornerBasedShape getSmall() {
        return Small;
    }
}
