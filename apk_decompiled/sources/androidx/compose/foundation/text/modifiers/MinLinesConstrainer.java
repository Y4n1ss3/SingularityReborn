package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache = Float.NaN;
    private float oneLineHeightCache = Float.NaN;
    private final TextStyle resolvedStyle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation, reason: not valid java name */
    public final long m1450coerceMinLinesOh53vG4$foundation(long j, int i) {
        String str;
        String str2;
        int m7565getMinHeightimpl;
        float f = this.oneLineHeightCache;
        float f2 = this.lineHeightCache;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            str = MinLinesConstrainerKt.EmptyTextReplacement;
            TextStyle textStyle = this.resolvedStyle;
            long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            Density density = this.density;
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            TextOverflow.Companion companion = TextOverflow.Companion;
            float height = ParagraphKt.m6940ParagraphUl8oQg4$default(str, textStyle, Constraints$default, density, resolver, null, null, 1, companion.m7546getClipgIe3tQ8(), 96, null).getHeight();
            str2 = MinLinesConstrainerKt.TwoLineTextReplacement;
            float height2 = ParagraphKt.m6940ParagraphUl8oQg4$default(str2, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, companion.m7546getClipgIe3tQ8(), 96, null).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f2 = height2;
            f = height;
        }
        if (i != 1) {
            m7565getMinHeightimpl = Math.round((f2 * (i - 1)) + f);
            if (m7565getMinHeightimpl < 0) {
                m7565getMinHeightimpl = 0;
            }
            int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            if (m7565getMinHeightimpl > m7563getMaxHeightimpl) {
                m7565getMinHeightimpl = m7563getMaxHeightimpl;
            }
        } else {
            m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        }
        return ConstraintsKt.Constraints(Constraints.m7566getMinWidthimpl(j), Constraints.m7564getMaxWidthimpl(j), m7565getMinHeightimpl, Constraints.m7563getMaxHeightimpl(j));
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && q10.b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && q10.b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), DensityKt.Density(density.getDensity(), density.getFontScale()), resolver);
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }

        private Companion() {
        }
    }
}
