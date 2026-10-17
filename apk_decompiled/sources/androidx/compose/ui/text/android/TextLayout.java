package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import defpackage.ac;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayout {
    public static final int $stable = 8;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        int i9;
        boolean z3;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z4;
        Layout create;
        TextPaint textPaint2;
        LineHeightStyleSpan[] lineHeightSpans;
        boolean z5;
        long verticalPaddings;
        long VerticalPaddings;
        Paint.FontMetricsInt lastLineMetrics;
        LineHeightStyleSpan lineHeightStyleSpan;
        LineHeightStyleSpan lineHeightStyleSpan2;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z7 = z6;
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z7) {
                this.isBoringLayout = false;
                i9 = i3;
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = true;
                create = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic, alignment, i9, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
                textPaint2 = textPaint;
            } else {
                this.isBoringLayout = true;
                textPaint2 = textPaint;
                i9 = i3;
                create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, z2, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = true;
                z3 = false;
            }
            this.layout = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i9);
            this.lineCount = min;
            int i10 = min - 1;
            this.didExceedMaxLines = (min >= i9 && (create.getEllipsisCount(i10) > 0 || create.getLineEnd(i10) != charSequence.length())) ? z4 : z3;
            lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            if (lineHeightSpans == null || (lineHeightStyleSpan2 = (LineHeightStyleSpan) ac.c0(lineHeightSpans)) == null) {
                z5 = z3;
            } else {
                z5 = (lineHeightStyleSpan2.getTrimFirstLineTop() && LineHeightStyle.Mode.m7462equalsimpl0(lineHeightStyleSpan2.m7116getModelzQqcRY(), LineHeightStyle.Mode.Companion.m7468getTightlzQqcRY())) ? z4 : z3;
            }
            boolean z8 = (lineHeightSpans == null || (lineHeightStyleSpan = (LineHeightStyleSpan) ac.c0(lineHeightSpans)) == null || !lineHeightStyleSpan.getTrimLastLineBottom() || !LineHeightStyle.Mode.m7462equalsimpl0(lineHeightStyleSpan.m7116getModelzQqcRY(), LineHeightStyle.Mode.Companion.m7468getTightlzQqcRY())) ? z3 : z4;
            if (z5 && z8) {
                VerticalPaddings = TextLayout_androidKt.ZeroVerticalPadding;
            } else {
                verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
                VerticalPaddings = TextLayout_androidKt.VerticalPaddings(z5 ? z3 : VerticalPaddings.m7112getTopPaddingimpl(verticalPaddings), z8 ? z3 : VerticalPaddings.m7111getBottomPaddingimpl(verticalPaddings));
            }
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m7112getTopPaddingimpl(VerticalPaddings), VerticalPaddings.m7112getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m7111getBottomPaddingimpl(VerticalPaddings), VerticalPaddings.m7111getBottomPaddingimpl(lineHeightPaddings));
            lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i10)) : z3;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(create, i10, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(create, i10, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float getHorizontalPadding(int i) {
        if (i == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            layoutHelper.getClass();
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final void fillBoundingBoxes(int i, int i2, float[] fArr, int i3) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (!(i < length)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (!(i2 > i)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (!(i2 <= length)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i3 >= (i2 - i) * 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i);
        int lineForOffset2 = getLineForOffset(i2 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i4 = lineForOffset;
        int i5 = i3;
        while (true) {
            int lineStart = getLineStart(i4);
            int lineEnd = getLineEnd(i4);
            int min = Math.min(i2, lineEnd);
            float lineTop = getLineTop(i4);
            float lineBottom = getLineBottom(i4);
            boolean z = getParagraphDirection(i4) == 1;
            for (int max = Math.max(i, lineStart); max < min; max++) {
                boolean isRtlCharAt = isRtlCharAt(max);
                if (z && !isRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(max);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                } else if (z && isRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(max);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                } else if (z || !isRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(max);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(max);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                }
                fArr[i5] = secondaryDownstream;
                fArr[i5 + 1] = lineTop;
                fArr[i5 + 2] = secondaryUpstream;
                fArr[i5 + 3] = lineBottom;
                i5 += 4;
            }
            if (i4 == lineForOffset2) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text(int i, float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i);
        int lineEnd = getLineEnd(i);
        int i2 = 0;
        if (!(fArr.length >= (lineEnd - lineStart) * 2)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        boolean z = getParagraphDirection(i) == 1;
        while (lineStart < lineEnd) {
            boolean isRtlCharAt = isRtlCharAt(lineStart);
            if (z && !isRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z && isRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (isRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            fArr[i2] = secondaryDownstream;
            fArr[i2 + 1] = secondaryUpstream;
            i2 += 2;
            lineStart++;
        }
    }

    public final int getBottomPadding$ui_text() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int i) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(i);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i, false);
                primaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i, false);
                primaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(i, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        boolean z = this.didExceedMaxLines;
        Layout layout = this.layout;
        return (z ? layout.getLineBottom(this.lineCount - 1) : layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(i) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i) {
        return this.topPadding + ((i != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(i) : getLineTop(i) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int i) {
        if (i != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(i) + (i == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(i - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(i) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int i) {
        return this.layout.getEllipsisCount(i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.layout.getEllipsisStart(i);
    }

    public final int getLineEnd(int i) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(i);
    }

    public final int getLineForOffset(int i) {
        if (this.lineCount <= 0) {
            return 0;
        }
        int lineForOffset = this.layout.getLineForOffset(i);
        int i2 = this.lineCount - 1;
        return lineForOffset > i2 ? i2 : lineForOffset;
    }

    public final int getLineForVertical(int i) {
        if (this.lineCount <= 0) {
            return 0;
        }
        int lineForVertical = this.layout.getLineForVertical(i - this.topPadding);
        int i2 = this.lineCount - 1;
        return lineForVertical > i2 ? i2 : lineForVertical;
    }

    public final int getLineForVerticalUnbounded(int i) {
        return this.layout.getLineForVertical(i - this.topPadding);
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineLeft(int i) {
        return this.layout.getLineLeft(i) + (i == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i) {
        return this.layout.getLineRight(i) + (i == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.layout.getLineTop(i) + (i == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int i) {
        if (!TextLayout_androidKt.isLineEllipsized(this.layout, i) || this.ellipsize != TextUtils.TruncateAt.END) {
            return getLayoutHelper().getLineVisibleEnd(i);
        }
        return this.layout.getEllipsisStart(i) + this.layout.getLineStart(i);
    }

    public final float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.layout.getOffsetForHorizontal(i, ((-1.0f) * getHorizontalPadding(i)) + f);
    }

    public final int getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(i);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, true, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final int[] getRangeForRect(RectF rectF, int i, my myVar) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text(this, rectF, i, myVar) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rectF, i, myVar);
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, false, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final void getSelectionPath(int i, int i2, Path path) {
        this.layout.getSelectionPath(i, i2, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int getTopPadding$ui_text() {
        return this.topPadding;
    }

    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            layout.getClass();
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        layout2.getClass();
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, i);
    }

    public final boolean isRtlCharAt(int i) {
        return this.layout.isRtlCharAt(i);
    }

    public final void paint(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            ThreadLocal<TextAndroidCanvas> sharedTextAndroidCanvas = TextLayout_androidKt.getSharedTextAndroidCanvas();
            TextAndroidCanvas textAndroidCanvas = sharedTextAndroidCanvas.get();
            if (textAndroidCanvas == null) {
                textAndroidCanvas = new TextAndroidCanvas();
                sharedTextAndroidCanvas.set(textAndroidCanvas);
            }
            TextAndroidCanvas textAndroidCanvas2 = textAndroidCanvas;
            textAndroidCanvas2.set_nativeCanvas$ui_text(canvas);
            try {
                this.layout.draw(textAndroidCanvas2);
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                int i2 = this.topPadding;
                if (i2 != 0) {
                    canvas.translate(0.0f, (-1.0f) * i2);
                }
            } catch (Throwable th) {
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                throw th;
            }
        }
    }

    public static /* synthetic */ void getBottomPadding$ui_text$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i9, dq dqVar) {
        this(r4, f, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        CharSequence charSequence2;
        TextPaint textPaint2;
        LayoutIntrinsics layoutIntrinsics2;
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        float f4 = (i9 & 64) != 0 ? 1.0f : f2;
        float f5 = (i9 & Fields.SpotShadowColor) != 0 ? 0.0f : f3;
        boolean z3 = (i9 & Fields.RotationX) != 0 ? false : z;
        boolean z4 = (i9 & Fields.RotationY) != 0 ? true : z2;
        int i12 = (i9 & Fields.RotationZ) != 0 ? Integer.MAX_VALUE : i3;
        int i13 = (i9 & Fields.CameraDistance) != 0 ? 0 : i4;
        int i14 = (i9 & Fields.TransformOrigin) != 0 ? 0 : i5;
        int i15 = (i9 & 8192) != 0 ? 0 : i6;
        int i16 = (i9 & Fields.Clip) != 0 ? 0 : i7;
        int i17 = (32768 & i9) != 0 ? 0 : i8;
        int[] iArr3 = (65536 & i9) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i9) != 0 ? null : iArr2;
        if ((i9 & Fields.ColorFilter) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = new LayoutIntrinsics(charSequence2, textPaint2, i11);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = layoutIntrinsics;
        }
    }
}
