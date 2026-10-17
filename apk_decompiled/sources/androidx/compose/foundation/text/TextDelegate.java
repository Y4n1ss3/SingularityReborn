package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.o;
import defpackage.ut;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, int i4, dq dqVar) {
        this(annotatedString, textStyle, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i3, density, resolver, (i4 & Fields.RotationX) != 0 ? ut.d : list, null);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        o.f("layoutIntrinsics must be called first");
        return null;
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m1164layoutNN6EwU$default(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
        if ((i & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m1167layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1165layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = ((this.softWrap || TextOverflow.m7537equalsimpl0(this.overflow, TextOverflow.Companion.m7547getEllipsisgIe3tQ8())) && Constraints.m7560getHasBoundedWidthimpl(j)) ? Constraints.m7564getMaxWidthimpl(j) : Integer.MAX_VALUE;
        int i = (this.softWrap || !TextOverflow.m7537equalsimpl0(this.overflow, TextOverflow.Companion.m7547getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (m7566getMinWidthimpl != m7564getMaxWidthimpl) {
            m7564getMaxWidthimpl = y80.h(getMaxIntrinsicWidth(), m7566getMinWidthimpl, m7564getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(0, m7564getMaxWidthimpl, 0, Constraints.m7563getMaxHeightimpl(j)), i, this.overflow, (dq) null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m1166getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m1167layoutNN6EwU(long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m1198canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j)) {
            return textLayoutResult.m7029copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j, (dq) null), ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()) << 32))));
        }
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j, (dq) null), m1165layoutTextK40F9xA(j, layoutDirection), ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(r13.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(r13.getWidth()) << 32))), null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        private Companion() {
        }
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
        }
        if (!(i2 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no minLines");
        }
        if (i2 <= i) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, dq dqVar) {
        this(annotatedString, textStyle, i, i2, z, i3, density, resolver, list);
    }
}
