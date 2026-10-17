package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SplitButtonXLargeTokens {
    public static final int $stable = 0;
    private static final CornerSize InnerCornerCornerSize;
    private static final CornerSize InnerHoveredCornerCornerSize;
    private static final CornerSize InnerPressedCornerCornerSize;
    private static final float LeadingButtonLeadingSpace;
    private static final float LeadingButtonTrailingSpace;
    private static final float TrailingButtonLeadingSpace;
    private static final float TrailingButtonTrailingSpace;
    private static final float TrailingIconSize;
    private static final float TrailingInnerSelectedCornerCornerSizePercent;
    public static final SplitButtonXLargeTokens INSTANCE = new SplitButtonXLargeTokens();
    private static final float BetweenSpace = Dp.m7611constructorimpl(2.0f);
    private static final float ContainerHeight = Dp.m7611constructorimpl(136.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        InnerCornerCornerSize = shapeTokens.getCornerValueMedium();
        InnerHoveredCornerCornerSize = shapeTokens.getCornerValueLargeIncreased();
        InnerPressedCornerCornerSize = shapeTokens.getCornerValueLargeIncreased();
        LeadingButtonLeadingSpace = Dp.m7611constructorimpl(64.0f);
        LeadingButtonTrailingSpace = Dp.m7611constructorimpl(64.0f);
        TrailingIconSize = Dp.m7611constructorimpl(50.0f);
        TrailingInnerSelectedCornerCornerSizePercent = 50.0f;
        TrailingButtonLeadingSpace = Dp.m7611constructorimpl(43.0f);
        TrailingButtonTrailingSpace = Dp.m7611constructorimpl(43.0f);
    }

    private SplitButtonXLargeTokens() {
    }

    /* renamed from: getBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m3662getBetweenSpaceD9Ej5fM() {
        return BetweenSpace;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3663getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final CornerSize getInnerCornerCornerSize() {
        return InnerCornerCornerSize;
    }

    public final CornerSize getInnerHoveredCornerCornerSize() {
        return InnerHoveredCornerCornerSize;
    }

    public final CornerSize getInnerPressedCornerCornerSize() {
        return InnerPressedCornerCornerSize;
    }

    /* renamed from: getLeadingButtonLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3664getLeadingButtonLeadingSpaceD9Ej5fM() {
        return LeadingButtonLeadingSpace;
    }

    /* renamed from: getLeadingButtonTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3665getLeadingButtonTrailingSpaceD9Ej5fM() {
        return LeadingButtonTrailingSpace;
    }

    /* renamed from: getTrailingButtonLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3666getTrailingButtonLeadingSpaceD9Ej5fM() {
        return TrailingButtonLeadingSpace;
    }

    /* renamed from: getTrailingButtonTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3667getTrailingButtonTrailingSpaceD9Ej5fM() {
        return TrailingButtonTrailingSpace;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3668getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    public final float getTrailingInnerSelectedCornerCornerSizePercent() {
        return TrailingInnerSelectedCornerCornerSizePercent;
    }
}
