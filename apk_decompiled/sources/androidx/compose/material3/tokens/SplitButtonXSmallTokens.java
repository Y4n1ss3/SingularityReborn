package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SplitButtonXSmallTokens {
    public static final int $stable = 0;
    private static final CornerSize InnerCornerCornerSize;
    private static final CornerSize InnerHoveredCornerCornerSize;
    private static final CornerSize InnerPressedCornerCornerSize;
    private static final float LeadingButtonLeadingSpace;
    private static final float LeadingButtonTrailingSpace;
    private static final float OuterCornerCornerSizePercent;
    private static final float TrailingButtonLeadingSpace;
    private static final float TrailingButtonTrailingSpace;
    private static final float TrailingIconSize;
    private static final float TrailingInnerSelectedCornerCornerSizePercent;
    public static final SplitButtonXSmallTokens INSTANCE = new SplitButtonXSmallTokens();
    private static final float BetweenSpace = Dp.m7611constructorimpl(2.0f);
    private static final float ContainerHeight = Dp.m7611constructorimpl(32.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        InnerCornerCornerSize = shapeTokens.getCornerValueExtraSmall();
        InnerHoveredCornerCornerSize = shapeTokens.getCornerValueSmall();
        InnerPressedCornerCornerSize = shapeTokens.getCornerValueSmall();
        LeadingButtonLeadingSpace = Dp.m7611constructorimpl(12.0f);
        LeadingButtonTrailingSpace = Dp.m7611constructorimpl(10.0f);
        OuterCornerCornerSizePercent = 50.0f;
        TrailingIconSize = Dp.m7611constructorimpl(22.0f);
        TrailingInnerSelectedCornerCornerSizePercent = 50.0f;
        TrailingButtonLeadingSpace = Dp.m7611constructorimpl(13.0f);
        TrailingButtonTrailingSpace = Dp.m7611constructorimpl(13.0f);
    }

    private SplitButtonXSmallTokens() {
    }

    /* renamed from: getBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m3669getBetweenSpaceD9Ej5fM() {
        return BetweenSpace;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3670getContainerHeightD9Ej5fM() {
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
    public final float m3671getLeadingButtonLeadingSpaceD9Ej5fM() {
        return LeadingButtonLeadingSpace;
    }

    /* renamed from: getLeadingButtonTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3672getLeadingButtonTrailingSpaceD9Ej5fM() {
        return LeadingButtonTrailingSpace;
    }

    public final float getOuterCornerCornerSizePercent() {
        return OuterCornerCornerSizePercent;
    }

    /* renamed from: getTrailingButtonLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3673getTrailingButtonLeadingSpaceD9Ej5fM() {
        return TrailingButtonLeadingSpace;
    }

    /* renamed from: getTrailingButtonTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3674getTrailingButtonTrailingSpaceD9Ej5fM() {
        return TrailingButtonTrailingSpace;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3675getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    public final float getTrailingInnerSelectedCornerCornerSizePercent() {
        return TrailingInnerSelectedCornerCornerSizePercent;
    }
}
