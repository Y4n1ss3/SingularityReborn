package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TooltipDefaults {
    public static final int $stable = 0;
    private static final DefaultTooltipCaretShape DefaultCaretShape;
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();
    private static final long caretSize;
    private static final float plainTooltipMaxWidth;
    private static final float richTooltipMaxWidth;

    static {
        long m7633DpSizeYgX7TsA = DpKt.m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(8.0f));
        caretSize = m7633DpSizeYgX7TsA;
        plainTooltipMaxWidth = Dp.m7611constructorimpl(200.0f);
        richTooltipMaxWidth = Dp.m7611constructorimpl(320.0f);
        DefaultCaretShape = new DefaultTooltipCaretShape(m7633DpSizeYgX7TsA, null);
    }

    private TooltipDefaults() {
    }

    /* renamed from: caretShape-EaSLcWc$default, reason: not valid java name */
    public static /* synthetic */ Shape m2779caretShapeEaSLcWc$default(TooltipDefaults tooltipDefaults, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = caretSize;
        }
        return tooltipDefaults.m2780caretShapeEaSLcWc(j);
    }

    public final DefaultTooltipCaretShape caretShape() {
        return DefaultCaretShape;
    }

    /* renamed from: caretShape-EaSLcWc, reason: not valid java name */
    public final Shape m2780caretShapeEaSLcWc(long j) {
        return new DefaultTooltipCaretShape(j, null);
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m2781getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    public final DefaultTooltipCaretShape getDefaultCaretShape$material3() {
        return DefaultCaretShape;
    }

    public final RichTooltipColors getDefaultRichTooltipColors$material3(ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached$material3 = colorScheme.getDefaultRichTooltipColorsCached$material3();
        if (defaultRichTooltipColorsCached$material3 != null) {
            return defaultRichTooltipColorsCached$material3;
        }
        RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3(richTooltipColors);
        return richTooltipColors;
    }

    public final long getPlainTooltipContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:626)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getPlainTooltipContainerShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:622)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getPlainTooltipContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:630)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getPlainTooltipMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2782getPlainTooltipMaxWidthD9Ej5fM() {
        return plainTooltipMaxWidth;
    }

    public final Shape getRichTooltipContainerShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:634)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getRichTooltipMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2783getRichTooltipMaxWidthD9Ej5fM() {
        return richTooltipMaxWidth;
    }

    @er
    /* renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2784rememberPlainTooltipPositionProviderkHDZbjc(float f, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:707)");
        }
        final int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
        boolean changed = composer.changed(mo361roundToPx0680j_4);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
                    int width = ((intRect.getWidth() - ((int) (j2 >> 32))) / 2) + intRect.getLeft();
                    int top = (intRect.getTop() - ((int) (j2 & 4294967295L))) - mo361roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + mo361roundToPx0680j_4;
                    }
                    return IntOffset.m7733constructorimpl((width << 32) | (top & 4294967295L));
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    @er
    /* renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2785rememberRichTooltipPositionProviderkHDZbjc(float f, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:746)");
        }
        final int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
        boolean changed = composer.changed(mo361roundToPx0680j_4);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
                    int left = intRect.getLeft();
                    int i3 = (int) (j2 >> 32);
                    if (left + i3 > ((int) (j >> 32)) && (left = intRect.getRight() - i3) < 0) {
                        left = ((intRect.getWidth() - i3) / 2) + intRect.getLeft();
                    }
                    int top = (intRect.getTop() - ((int) (j2 & 4294967295L))) - mo361roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + mo361roundToPx0680j_4;
                    }
                    return IntOffset.m7733constructorimpl((left << 32) | (top & 4294967295L));
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 tooltipDefaults$rememberRichTooltipPositionProvider$1$1 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$1;
    }

    /* renamed from: rememberTooltipPositionProvider-Hu5FAss, reason: not valid java name */
    public final PopupPositionProvider m2786rememberTooltipPositionProviderHu5FAss(int i, float f, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-573803578, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:849)");
        }
        int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
        boolean changed = composer.changed(mo361roundToPx0680j_4) | ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TooltipPositionProviderImpl(i, mo361roundToPx0680j_4, null);
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipPositionProviderImpl tooltipPositionProviderImpl = (TooltipPositionProviderImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipPositionProviderImpl;
    }

    @er
    /* renamed from: rememberTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2787rememberTooltipPositionProviderkHDZbjc(float f, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613894159, i, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:799)");
        }
        final int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
        boolean changed = composer.changed(mo361roundToPx0680j_4);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
                    int i3 = (int) (j2 >> 32);
                    int width = ((intRect.getWidth() - i3) / 2) + intRect.getLeft();
                    if (width < 0) {
                        width = intRect.getLeft();
                    } else if (width + i3 > ((int) (j >> 32))) {
                        width = intRect.getRight() - i3;
                    }
                    int top = (intRect.getTop() - ((int) (j2 & 4294967295L))) - mo361roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + mo361roundToPx0680j_4;
                    }
                    return IntOffset.m7733constructorimpl((width << 32) | (top & 4294967295L));
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipDefaults$rememberTooltipPositionProvider$1$1 tooltipDefaults$rememberTooltipPositionProvider$1$1 = (TooltipDefaults$rememberTooltipPositionProvider$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberTooltipPositionProvider$1$1;
    }

    public final RichTooltipColors richTooltipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:660)");
        }
        RichTooltipColors defaultRichTooltipColors$material3 = getDefaultRichTooltipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRichTooltipColors$material3;
    }

    /* renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m2788richTooltipColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:673)");
        }
        long j5 = j2;
        long j6 = j;
        RichTooltipColors m2290copyjRlVdoo = getDefaultRichTooltipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2290copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2290copyjRlVdoo;
    }
}
