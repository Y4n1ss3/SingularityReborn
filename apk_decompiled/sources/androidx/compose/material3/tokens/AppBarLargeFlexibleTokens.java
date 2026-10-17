package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarLargeFlexibleTokens {
    public static final int $stable = 0;
    public static final AppBarLargeFlexibleTokens INSTANCE = new AppBarLargeFlexibleTokens();
    private static final float ContainerHeight = Dp.m7611constructorimpl(120.0f);
    private static final TypographyKeyTokens SubtitleFont = TypographyKeyTokens.TitleMedium;
    private static final TypographyKeyTokens TitleFont = TypographyKeyTokens.DisplaySmall;
    private static final float LargeContainerHeight = Dp.m7611constructorimpl(152.0f);

    private AppBarLargeFlexibleTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3007getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3008getLargeContainerHeightD9Ej5fM() {
        return LargeContainerHeight;
    }

    public final TypographyKeyTokens getSubtitleFont() {
        return SubtitleFont;
    }

    public final TypographyKeyTokens getTitleFont() {
        return TitleFont;
    }
}
