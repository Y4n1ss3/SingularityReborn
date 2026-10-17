package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
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
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.o;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private long historyFlag;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            Density density$foundation = MultiParagraphLayoutCache.this.getDensity$foundation();
            density$foundation.getClass();
            return density$foundation.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            Density density$foundation = MultiParagraphLayoutCache.this.getDensity$foundation();
            density$foundation.getClass();
            return density$foundation.getFontScale();
        }

        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        /* renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo1462performLayout5ZSfY2I(long j, AnnotatedString annotatedString, long j2) {
            long j3;
            long j4;
            long m1464timesNB67dxo;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            if (TextUnit.m7807isEmimpl(j2)) {
                m1464timesNB67dxo = MultiParagraphLayoutCacheKt.m1464timesNB67dxo(MultiParagraphLayoutCache.this.style.m7091getFontSizeXSAIIZE(), j2);
                j3 = m1464timesNB67dxo;
            } else {
                j3 = j2;
            }
            if (!TextUnit.m7802equalsimpl0(j3, MultiParagraphLayoutCache.this.style.m7091getFontSizeXSAIIZE())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.setStyle(TextStyle.m7073copyp1EtxEg$default(multiParagraphLayoutCache.style, 0L, j3, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                layoutDirection.getClass();
                j4 = multiParagraphLayoutCache2.m1459useMinLinesConstrainerOh53vG4(j, layoutDirection);
            } else {
                j4 = j;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            layoutDirection2.getClass();
            MultiParagraph m1455layoutTextK40F9xA = multiParagraphLayoutCache3.m1455layoutTextK40F9xA(j4, layoutDirection2);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            layoutDirection3.getClass();
            TextLayoutResult m1458textLayoutResultVKLhPVY = multiParagraphLayoutCache4.m1458textLayoutResultVKLhPVY(layoutDirection3, j4, m1455layoutTextK40F9xA);
            this.lastLayoutResult = m1458textLayoutResultVKLhPVY;
            MultiParagraphLayoutCache.this.setStyle(textStyle);
            return m1458textLayoutResultVKLhPVY;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo366toPxR2X_6o(long j) {
            if (!TextUnit.m7807isEmimpl(j)) {
                return mo367toPx0680j_4(mo362toDpGaN1DYA(j));
            }
            if (TextUnit.m7807isEmimpl(MultiParagraphLayoutCache.this.style.m7091getFontSizeXSAIIZE())) {
                o.f("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
                return 0.0f;
            }
            if (TextUnit.m7802equalsimpl0(MultiParagraphLayoutCache.this.style.m7091getFontSizeXSAIIZE(), TextUnit.Companion.m7816getUnspecifiedXSAIIZE())) {
                o.f("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                return 0.0f;
            }
            return TextUnit.m7805getValueimpl(j) * mo366toPxR2X_6o(MultiParagraphLayoutCache.this.style.m7091getFontSizeXSAIIZE());
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list, TextAutoSize textAutoSize, int i4, dq dqVar) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & Fields.SpotShadowColor) != 0 ? null : list, (i4 & Fields.RotationX) != 0 ? null : textAutoSize, null);
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        if (textAutoSizeLayoutScopeImpl == null) {
            textAutoSizeLayoutScopeImpl = new TextAutoSizeLayoutScopeImpl();
            this._textAutoSizeLayoutScope = textAutoSizeLayoutScopeImpl;
        }
        textAutoSizeLayoutScopeImpl.getClass();
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    public final MultiParagraph m1455layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m1446finalConstraintstfFHcEY(j, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1447finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow, (dq) null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        m1457recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1445getMarkDirtyStyleDEKiAbY());
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m1456newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m7557equalsimpl0(j, textLayoutResult.getLayoutInput().m7026getConstraintsmsEJaDk())) {
            return false;
        }
        return Constraints.m7564getMaxWidthimpl(j) != Constraints.m7564getMaxWidthimpl(textLayoutResult.getLayoutInput().m7026getConstraintsmsEJaDk()) || Constraints.m7566getMinWidthimpl(j) != Constraints.m7566getMinWidthimpl(textLayoutResult.getLayoutInput().m7026getConstraintsmsEJaDk()) || ((float) Constraints.m7563getMaxHeightimpl(j)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    /* renamed from: recordHistory-4ETZmGE, reason: not valid java name */
    private final void m1457recordHistory4ETZmGE(long j) {
        this.historyFlag = j | (this.historyFlag << 2);
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            density.getClass();
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List list = this.placeholders;
            if (list == null) {
                list = ut.d;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, (List<AnnotatedString.Range<Placeholder>>) list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(TextStyle textStyle) {
        boolean hasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (hasSameLayoutAffectingAttributes) {
            return;
        }
        markStyleAffectedDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m1458textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List list = this.placeholders;
        if (list == null) {
            list = ut.d;
        }
        int i = this.maxLines;
        boolean z = this.softWrap;
        int i2 = this.overflow;
        Density density = this.density;
        density.getClass();
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.fontFamilyResolver, j, (dq) null), multiParagraph, ConstraintsKt.m7578constrain4WqzIAM(j, IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(min) << 32))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public final long m1459useMinLinesConstrainerOh53vG4(long j, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        density.getClass();
        MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = from;
        return from.m1450coerceMinLinesOh53vG4$foundation(j, this.minLines);
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final long getHistoryFlag$foundation() {
        return this.historyFlag;
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        o.l(this, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
        return null;
    }

    public final int intrinsicHeight(int i, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long Constraints = ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            Constraints = m1459useMinLinesConstrainerOh53vG4(Constraints, layoutDirection);
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m1455layoutTextK40F9xA(Constraints, layoutDirection).getHeight());
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(Constraints);
        if (ceilToIntPx < m7565getMinHeightimpl) {
            ceilToIntPx = m7565getMinHeightimpl;
        }
        this.cachedIntrinsicHeightInputWidth = i;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1460layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        m1457recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1442getLayoutWithConstraintsDEKiAbY());
        long m1459useMinLinesConstrainerOh53vG4 = this.minLines > 1 ? m1459useMinLinesConstrainerOh53vG4(j, layoutDirection) : j;
        if (!m1456newLayoutWillBeDifferentVKLhPVY(this.layoutCache, m1459useMinLinesConstrainerOh53vG4, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            textLayoutResult.getClass();
            if (Constraints.m7557equalsimpl0(m1459useMinLinesConstrainerOh53vG4, textLayoutResult.getLayoutInput().m7026getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            textLayoutResult2.getClass();
            this.layoutCache = m1458textLayoutResultVKLhPVY(layoutDirection, m1459useMinLinesConstrainerOh53vG4, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long m7091getFontSizeXSAIIZE = this.style.m7091getFontSizeXSAIIZE();
            TextAutoSize textAutoSize = this.autoSize;
            textAutoSize.getClass();
            long mo1060getFontSizeCi0_558 = textAutoSize.mo1060getFontSizeCi0_558(getFontSizeSearchScope(), j, this.text);
            if (TextUnit.m7807isEmimpl(mo1060getFontSizeCi0_558)) {
                mo1060getFontSizeCi0_558 = MultiParagraphLayoutCacheKt.m1464timesNB67dxo(m7091getFontSizeXSAIIZE, mo1060getFontSizeCi0_558);
            }
            long j2 = mo1060getFontSizeCi0_558;
            TextLayoutResult lastLayoutResult = getFontSizeSearchScope().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.m7802equalsimpl0(j2, lastLayoutResult.getLayoutInput().getStyle().m7091getFontSizeXSAIIZE()) && TextOverflow.m7537equalsimpl0(lastLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            setStyle(TextStyle.m7073copyp1EtxEg$default(this.style, 0L, j2, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = m1458textLayoutResultVKLhPVY(layoutDirection, m1459useMinLinesConstrainerOh53vG4, m1455layoutTextK40F9xA(m1459useMinLinesConstrainerOh53vG4, layoutDirection));
        return true;
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
            m1457recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1443getMarkDirtyDensityDEKiAbY());
            markDirty();
        }
    }

    public final void setHistoryFlag$foundation(long j) {
        this.historyFlag = j;
    }

    public String toString() {
        TextLayoutInput layoutInput;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        sb.append(this.layoutCache != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m1432toStringimpl(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=");
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            obj = Constraints.m7551boximpl(layoutInput.m7026getConstraintsmsEJaDk());
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m1461updateJ2qo7bo(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        setStyle(textStyle);
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        m1457recordHistory4ETZmGE(LayoutCacheOperation.Companion.m1444getMarkDirtyNodeDEKiAbY());
        markDirty();
    }

    public static /* synthetic */ void getHistoryFlag$foundation$annotations() {
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.Companion.m1434getUnspecifiedL26CHvs();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list, TextAutoSize textAutoSize, dq dqVar) {
        this(annotatedString, textStyle, resolver, i, z, i2, i3, list, textAutoSize);
    }
}
