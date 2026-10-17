package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ut;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m7033measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        TextStyle textStyle2 = textStyle;
        if ((i3 & 4) != 0) {
            i = TextOverflow.Companion.m7546getClipgIe3tQ8();
        }
        return textMeasurer.m7035measurewNUYSr0(str, textStyle2, i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 64) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & Fields.SpotShadowColor) != 0 ? textMeasurer.defaultDensity : density, (i3 & Fields.RotationX) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & Fields.RotationY) != 0 ? false : z2);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m7034measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        return textMeasurer.m7036measurexDpz5zY(annotatedString, textStyle, (i3 & 4) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? ut.d : list, (i3 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & Fields.SpotShadowColor) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & Fields.RotationX) != 0 ? textMeasurer.defaultDensity : density, (i3 & Fields.RotationY) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & Fields.RotationZ) != 0 ? false : z2);
    }

    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m7035measurewNUYSr0(String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        return m7034measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, null), textStyle, i, z, i2, null, j, layoutDirection, density, resolver, z2, 32, null);
    }

    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m7036measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i2, z, i, density, layoutDirection, resolver, j, (dq) null);
        TextLayoutResult textLayoutResult = (z2 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m7029copyO0kMr_c(textLayoutInput, ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()) << 32) | (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L))));
        }
        TextLayoutResult layout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, layout);
        }
        return layout;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
        
            if (r1 != false) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            int m7564getMaxWidthimpl;
            int maxLines;
            boolean m7038isEllipsisMW5ApA;
            boolean m7038isEllipsisMW5ApA2;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(textLayoutInput.m7026getConstraintsmsEJaDk());
            if (!textLayoutInput.getSoftWrap()) {
                m7038isEllipsisMW5ApA2 = TextMeasurerKt.m7038isEllipsisMW5ApA(textLayoutInput.m7027getOverflowgIe3tQ8());
            }
            if (Constraints.m7560getHasBoundedWidthimpl(textLayoutInput.m7026getConstraintsmsEJaDk())) {
                m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(textLayoutInput.m7026getConstraintsmsEJaDk());
                if (!textLayoutInput.getSoftWrap()) {
                    m7038isEllipsisMW5ApA = TextMeasurerKt.m7038isEllipsisMW5ApA(textLayoutInput.m7027getOverflowgIe3tQ8());
                    if (m7038isEllipsisMW5ApA) {
                        maxLines = 1;
                        int i = maxLines;
                        if (m7566getMinWidthimpl != m7564getMaxWidthimpl) {
                            m7564getMaxWidthimpl = y80.h(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m7566getMinWidthimpl, m7564getMaxWidthimpl);
                        }
                        return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(0, m7564getMaxWidthimpl, 0, Constraints.m7563getMaxHeightimpl(textLayoutInput.m7026getConstraintsmsEJaDk())), i, textLayoutInput.m7027getOverflowgIe3tQ8(), (dq) null), ConstraintsKt.m7578constrain4WqzIAM(textLayoutInput.m7026getConstraintsmsEJaDk(), IntSize.m7777constructorimpl((((int) Math.ceil(r4.getWidth())) << 32) | (((int) Math.ceil(r4.getHeight())) & 4294967295L))), null);
                    }
                }
                maxLines = textLayoutInput.getMaxLines();
                int i2 = maxLines;
                if (m7566getMinWidthimpl != m7564getMaxWidthimpl) {
                }
                return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(0, m7564getMaxWidthimpl, 0, Constraints.m7563getMaxHeightimpl(textLayoutInput.m7026getConstraintsmsEJaDk())), i2, textLayoutInput.m7027getOverflowgIe3tQ8(), (dq) null), ConstraintsKt.m7578constrain4WqzIAM(textLayoutInput.m7026getConstraintsmsEJaDk(), IntSize.m7777constructorimpl((((int) Math.ceil(r4.getWidth())) << 32) | (((int) Math.ceil(r4.getHeight())) & 4294967295L))), null);
            }
            m7564getMaxWidthimpl = Integer.MAX_VALUE;
            if (!textLayoutInput.getSoftWrap()) {
            }
            maxLines = textLayoutInput.getMaxLines();
            int i22 = maxLines;
            if (m7566getMinWidthimpl != m7564getMaxWidthimpl) {
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(0, m7564getMaxWidthimpl, 0, Constraints.m7563getMaxHeightimpl(textLayoutInput.m7026getConstraintsmsEJaDk())), i22, textLayoutInput.m7027getOverflowgIe3tQ8(), (dq) null), ConstraintsKt.m7578constrain4WqzIAM(textLayoutInput.m7026getConstraintsmsEJaDk(), IntSize.m7777constructorimpl((((int) Math.ceil(r4.getWidth())) << 32) | (((int) Math.ceil(r4.getHeight())) & 4294967295L))), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, dq dqVar) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? 8 : i);
    }
}
