package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
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
import defpackage.ut;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private long historyFlag;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.lastDensity = InlineDensity.Companion.m1434getUnspecifiedL26CHvs();
        this.layoutSize = IntSize.m7777constructorimpl(0L);
        this.prevConstraints = Constraints.Companion.m7574fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m7574fixedJhjzzOo(0, 0);
        this.layoutSize = IntSize.m7777constructorimpl(0L);
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m1465newLayoutWillBeDifferentK40F9xA(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m7557equalsimpl0(j, this.prevConstraints)) {
            return false;
        }
        return Constraints.m7564getMaxWidthimpl(j) != Constraints.m7564getMaxWidthimpl(this.prevConstraints) || Constraints.m7566getMinWidthimpl(j) != Constraints.m7566getMinWidthimpl(this.prevConstraints) || ((float) Constraints.m7563getMaxHeightimpl(j)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    /* renamed from: recordHistory-4ETZmGE, reason: not valid java name */
    private final void m1466recordHistory4ETZmGE(long j) {
        this.historyFlag = j | (this.historyFlag << 2);
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            density.getClass();
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            ut utVar = ut.d;
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, resolveDefaults, utVar, density, resolver, utVar);
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m1467useMinLinesConstrainereuUD3Qg(long j, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        density.getClass();
        MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = from;
        return from.m1450coerceMinLinesOh53vG4$foundation(j, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    public static /* synthetic */ long m1468useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j, LayoutDirection layoutDirection, TextStyle textStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m1467useMinLinesConstrainereuUD3Qg(j, layoutDirection, textStyle);
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation() {
        return this.didOverflow;
    }

    public final long getHistoryFlag$foundation() {
        return this.historyFlag;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation, reason: not valid java name */
    public final long m1469getLayoutSizeYbymL2g$foundation() {
        return this.layoutSize;
    }

    public final w01 getObserveFontChanges$foundation() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return w01.a;
    }

    public final Paragraph getParagraph$foundation() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long Constraints = ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            Constraints = m1468useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, Constraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(paragraphLayoutCache.m1470layoutTextK40F9xA$foundation(Constraints, layoutDirection2).getHeight());
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(Constraints);
        if (ceilToIntPx < m7565getMinHeightimpl) {
            ceilToIntPx = m7565getMinHeightimpl;
        }
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = i;
        paragraphLayoutCache.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutText-K40F9xA$foundation, reason: not valid java name */
    public final Paragraph m1470layoutTextK40F9xA$foundation(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m6943ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m1446finalConstraintstfFHcEY(j, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1447finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1471layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        m1466recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1442getLayoutWithConstraintsDEKiAbY());
        boolean z = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            j = m1468useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, j, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z2 = false;
        if (paragraphLayoutCache.m1465newLayoutWillBeDifferentK40F9xA(j, layoutDirection2)) {
            Paragraph m1470layoutTextK40F9xA$foundation = paragraphLayoutCache.m1470layoutTextK40F9xA$foundation(j, layoutDirection2);
            paragraphLayoutCache.prevConstraints = j;
            paragraphLayoutCache.layoutSize = ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(m1470layoutTextK40F9xA$foundation.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(m1470layoutTextK40F9xA$foundation.getWidth()) << 32)));
            if (!TextOverflow.m7537equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m7550getVisiblegIe3tQ8()) && (((int) (r10 >> 32)) < m1470layoutTextK40F9xA$foundation.getWidth() || ((int) (r10 & 4294967295L)) < m1470layoutTextK40F9xA$foundation.getHeight())) {
                z2 = true;
            }
            paragraphLayoutCache.didOverflow = z2;
            paragraphLayoutCache.paragraph = m1470layoutTextK40F9xA$foundation;
            return true;
        }
        if (!Constraints.m7557equalsimpl0(j, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            paragraph.getClass();
            paragraphLayoutCache.layoutSize = ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32)));
            if (TextOverflow.m7537equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m7550getVisiblegIe3tQ8()) || (((int) (r5 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r5)) >= paragraph.getHeight())) {
                z = false;
            }
            paragraphLayoutCache.didOverflow = z;
            paragraphLayoutCache.prevConstraints = j;
        }
        return false;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation(Density density) {
        Density density2 = this.density;
        long m1426constructorimpl = density != null ? InlineDensity.m1426constructorimpl(density) : InlineDensity.Companion.m1434getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m1426constructorimpl;
        } else if (density == null || !InlineDensity.m1428equalsimpl0(this.lastDensity, m1426constructorimpl)) {
            this.density = density;
            this.lastDensity = m1426constructorimpl;
            m1466recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1443getMarkDirtyDensityDEKiAbY());
            markDirty();
        }
    }

    public final void setDidOverflow$foundation(boolean z) {
        this.didOverflow = z;
    }

    public final void setHistoryFlag$foundation(long j) {
        this.historyFlag = j;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation, reason: not valid java name */
    public final void m1472setLayoutSizeozmzZPI$foundation(long j) {
        this.layoutSize = j;
    }

    public final void setParagraph$foundation(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m7552constructorimpl = Constraints.m7552constructorimpl(this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        int i = this.maxLines;
        boolean z = this.softWrap;
        int i2 = this.overflow;
        FontFamily.Resolver resolver = this.fontFamilyResolver;
        ut utVar = ut.d;
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, utVar, i, z, i2, density, layoutDirection, resolver, m7552constructorimpl, (dq) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, utVar, density, this.fontFamilyResolver), m7552constructorimpl, this.maxLines, this.overflow, (dq) null), this.layoutSize, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m1432toStringimpl(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m1473updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        m1466recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1444getMarkDirtyNodeDEKiAbY());
        markDirty();
    }

    public static /* synthetic */ void getHistoryFlag$foundation$annotations() {
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, dq dqVar) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, int i4, dq dqVar) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }
}
