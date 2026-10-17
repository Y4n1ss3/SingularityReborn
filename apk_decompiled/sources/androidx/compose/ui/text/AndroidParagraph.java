package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.j50;
import defpackage.kp0;
import defpackage.o;
import defpackage.ut;
import defpackage.w5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j) {
        boolean shouldAttachIndentationFixSpan;
        int m6889toLayoutAlignaXe7zB0;
        int m6891toLayoutHyphenationFrequency3fSNIE;
        int m6890toLayoutBreakStrategyxImikfE;
        int m6892toLayoutLineBreakStylehpcqdu8;
        int m6893toLayoutLineBreakWordStylewPN0Rpw;
        int i3;
        AndroidParagraph androidParagraph;
        ?? r12;
        List<Rect> list;
        Rect rect;
        float secondaryHorizontal;
        int widthPx;
        float primaryHorizontal;
        int widthPx2;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        int numberOfLinesThatFitMaxHeight;
        boolean z;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.overflow = i2;
        this.constraints = j;
        if (Constraints.m7565getMinHeightimpl(j) != 0 || Constraints.m7566getMinWidthimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        TextOverflow.Companion companion = TextOverflow.Companion;
        shouldAttachIndentationFixSpan = AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, TextOverflow.m7537equalsimpl0(i2, companion.m7547getEllipsisgIe3tQ8()));
        CharSequence attachIndentationFixSpan = shouldAttachIndentationFixSpan ? AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text()) : androidParagraphIntrinsics.getCharSequence$ui_text();
        this.charSequence = attachIndentationFixSpan;
        m6889toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m6889toLayoutAlignaXe7zB0(style.m7101getTextAligne0LSkKk());
        boolean m7485equalsimpl0 = TextAlign.m7485equalsimpl0(style.m7101getTextAligne0LSkKk(), TextAlign.Companion.m7491getJustifye0LSkKk());
        m6891toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m6891toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text().m6960getHyphensvmbZdU8());
        m6890toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m6890toLayoutBreakStrategyxImikfE(LineBreak.m7394getStrategyfcGXIks(style.m7098getLineBreakrAG3T2k()));
        m6892toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m6892toLayoutLineBreakStylehpcqdu8(LineBreak.m7395getStrictnessusljTpc(style.m7098getLineBreakrAG3T2k()));
        m6893toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m6893toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m7396getWordBreakjp8hJ3c(style.m7098getLineBreakrAG3T2k()));
        CharSequence charSequence = attachIndentationFixSpan;
        TextUtils.TruncateAt truncateAt = TextOverflow.m7537equalsimpl0(i2, companion.m7547getEllipsisgIe3tQ8()) ? TextUtils.TruncateAt.END : TextOverflow.m7537equalsimpl0(i2, companion.m7548getMiddleEllipsisgIe3tQ8()) ? TextUtils.TruncateAt.MIDDLE : TextOverflow.m7537equalsimpl0(i2, companion.m7549getStartEllipsisgIe3tQ8()) ? TextUtils.TruncateAt.START : null;
        TextLayout constructTextLayout$default = constructTextLayout$default(this, m6889toLayoutAlignaXe7zB0, m7485equalsimpl0 ? 1 : 0, truncateAt, i, m6891toLayoutHyphenationFrequency3fSNIE, m6890toLayoutBreakStrategyxImikfE, m6892toLayoutLineBreakStylehpcqdu8, m6893toLayoutLineBreakWordStylewPN0Rpw, null, Fields.RotationX, null);
        if (Build.VERSION.SDK_INT >= 35 || getTextPaint$ui_text().getLetterSpacing() == 0.0f || (!(TextOverflow.m7537equalsimpl0(i2, companion.m7549getStartEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(i2, companion.m7548getMiddleEllipsisgIe3tQ8())) || constructTextLayout$default.getLineEllipsisCount(0) <= 0)) {
            i3 = i;
        } else {
            int lineEllipsisOffset = constructTextLayout$default.getLineEllipsisOffset(0);
            i3 = i;
            constructTextLayout$default = constructTextLayout(m6889toLayoutAlignaXe7zB0, m7485equalsimpl0 ? 1 : 0, truncateAt, i3, m6891toLayoutHyphenationFrequency3fSNIE, m6890toLayoutBreakStrategyxImikfE, m6892toLayoutLineBreakStylehpcqdu8, m6893toLayoutLineBreakWordStylewPN0Rpw, TextUtils.concat(charSequence.subSequence(0, lineEllipsisOffset), "…", charSequence.subSequence(constructTextLayout$default.getLineEllipsisCount(0) + lineEllipsisOffset, charSequence.length())));
        }
        if (!TextOverflow.m7537equalsimpl0(i2, companion.m7547getEllipsisgIe3tQ8()) || constructTextLayout$default.getHeight() <= Constraints.m7563getMaxHeightimpl(j) || i3 <= 1) {
            androidParagraph = this;
            r12 = 0;
            androidParagraph.layout = constructTextLayout$default;
        } else {
            numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(constructTextLayout$default, Constraints.m7563getMaxHeightimpl(j));
            if (numberOfLinesThatFitMaxHeight < 0 || numberOfLinesThatFitMaxHeight == i3) {
                androidParagraph = this;
                z = false;
            } else {
                z = false;
                androidParagraph = this;
                constructTextLayout$default = constructTextLayout$default(androidParagraph, m6889toLayoutAlignaXe7zB0, m7485equalsimpl0 ? 1 : 0, truncateAt, numberOfLinesThatFitMaxHeight < 1 ? 1 : numberOfLinesThatFitMaxHeight, m6891toLayoutHyphenationFrequency3fSNIE, m6890toLayoutBreakStrategyxImikfE, m6892toLayoutLineBreakStylehpcqdu8, m6893toLayoutLineBreakWordStylewPN0Rpw, null, Fields.RotationX, null);
            }
            androidParagraph.layout = constructTextLayout$default;
            r12 = z;
        }
        androidParagraph.getTextPaint$ui_text().m7327setBrush12SF9DM(style.getBrush(), Size.m4576constructorimpl((Float.floatToRawIntBits(androidParagraph.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << 32)), style.getAlpha());
        ShaderBrushSpan[] shaderBrushSpans = androidParagraph.getShaderBrushSpans(constructTextLayout$default);
        if (shaderBrushSpans != null) {
            int length = shaderBrushSpans.length;
            for (int i4 = r12; i4 < length; i4++) {
                shaderBrushSpans[i4].m7350setSizeuvyYCjk(Size.m4576constructorimpl((Float.floatToRawIntBits(androidParagraph.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << 32)));
            }
        }
        CharSequence charSequence2 = androidParagraph.charSequence;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            Object[] spans = spanned.getSpans(r12, charSequence2.length(), PlaceholderSpan.class);
            ArrayList arrayList = new ArrayList(spans.length);
            int length2 = spans.length;
            for (int i5 = r12; i5 < length2; i5++) {
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[i5];
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = androidParagraph.layout.getLineForOffset(spanStart);
                boolean z2 = lineForOffset >= androidParagraph.maxLines ? true : r12;
                boolean z3 = (androidParagraph.layout.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= androidParagraph.layout.getLineEllipsisOffset(lineForOffset) + androidParagraph.layout.getLineStart(lineForOffset)) ? r12 : true;
                boolean z4 = spanEnd > androidParagraph.layout.getLineEnd(lineForOffset) ? true : r12;
                if (z3 || z4 || z2) {
                    rect = null;
                } else {
                    boolean z5 = androidParagraph.layout.getParagraphDirection(lineForOffset) == 1 ? true : r12;
                    boolean isRtlCharAt = androidParagraph.layout.isRtlCharAt(spanStart);
                    if (!z5 || isRtlCharAt) {
                        if (z5 && isRtlCharAt) {
                            primaryHorizontal = androidParagraph.layout.getSecondaryHorizontal(spanStart, r12);
                            widthPx2 = placeholderSpan.getWidthPx();
                        } else {
                            TextLayout textLayout = androidParagraph.layout;
                            if (isRtlCharAt) {
                                primaryHorizontal = textLayout.getPrimaryHorizontal(spanStart, r12);
                                widthPx2 = placeholderSpan.getWidthPx();
                            } else {
                                secondaryHorizontal = textLayout.getSecondaryHorizontal(spanStart, r12);
                                widthPx = placeholderSpan.getWidthPx();
                            }
                        }
                        secondaryHorizontal = primaryHorizontal - widthPx2;
                        TextLayout textLayout2 = androidParagraph.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout2.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = textLayout2.getLineTop(lineForOffset);
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = textLayout2.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((textLayout2.getLineBottom(lineForOffset) + textLayout2.getLineTop(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 4:
                                f = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                                lineTop = lineBaseline2 + f;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineBaseline = textLayout2.getLineBaseline(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                                lineTop = lineBaseline2 + f;
                                rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            default:
                                o.f("unexpected verticalAlignment");
                                throw null;
                        }
                    } else {
                        secondaryHorizontal = androidParagraph.layout.getPrimaryHorizontal(spanStart, r12);
                        widthPx = placeholderSpan.getWidthPx();
                    }
                    primaryHorizontal = widthPx + secondaryHorizontal;
                    TextLayout textLayout22 = androidParagraph.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                    }
                }
                arrayList.add(rect);
            }
            list = arrayList;
        } else {
            list = ut.d;
        }
        androidParagraph.placeholderRects = list;
    }

    private final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), getTextPaint$ui_text(), i, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i3, i5, i6, i7, i4, i2, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text(), 196736, null);
    }

    public static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return androidParagraph.constructTextLayout(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & Fields.RotationX) != 0 ? androidParagraph.charSequence : charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect_8_6BmAI$lambda$0(TextInclusionStrategy textInclusionStrategy, RectF rectF, RectF rectF2) {
        return textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2));
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        text.getClass();
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        text2.getClass();
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo6874fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        this.layout.fillBoundingBoxes(TextRange.m7058getMinimpl(j), TextRange.m7057getMaximpl(j), fArr, i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i) {
        return this.layout.isRtlCharAt(i) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i) {
        boolean z = false;
        if (i >= 0 && i < this.charSequence.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder f = kp0.f(i, "offset(", ") is out of bounds [0,");
            f.append(this.charSequence.length());
            f.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        RectF boundingBox = this.layout.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    public final CharSequence getCharSequence$ui_text() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m6875getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i) {
        if (!(i >= 0 && i <= this.charSequence.length())) {
            StringBuilder f = kp0.f(i, "offset(", ") is out of bounds [0,");
            f.append(this.charSequence.length());
            f.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? TextLayout.getPrimaryHorizontal$default(textLayout, i, false, 2, null) : TextLayout.getSecondaryHorizontal$default(textLayout, i, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text(int i) {
        return this.layout.getLineAscent(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int i) {
        return this.layout.getLineBaseline(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text(int i) {
        return this.layout.getLineDescent(i);
    }

    public final int getLineEllipsisCount$ui_text(int i) {
        return this.layout.getLineEllipsisCount(i);
    }

    public final int getLineEllipsisOffset$ui_text(int i) {
        return this.layout.getLineEllipsisOffset(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getLineVisibleEnd(i) : textLayout.getLineEnd(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical((int) f);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i) {
        return this.layout.getLineHeight(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo6876getOffsetForPositionk4lQ0M(long j) {
        int lineForVerticalUnbounded = this.layout.getLineForVerticalUnbounded((int) Float.intBitsToFloat((int) (4294967295L & j)));
        int lineCount = getLineCount();
        TextLayout textLayout = this.layout;
        return lineForVerticalUnbounded >= lineCount ? textLayout.getText().length() : textLayout.getOffsetForHorizontal(lineForVerticalUnbounded, Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m6877getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.charSequence.length())) {
            StringBuilder j = j50.j("start(", i, ") or end(", i2, ") is out of range [0..");
            j.append(this.charSequence.length());
            j.append("], or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(j.toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i, i2, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo6878getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        int m6894toLayoutTextGranularityduNsdkg;
        TextLayout textLayout = this.layout;
        RectF androidRectF = RectHelper_androidKt.toAndroidRectF(rect);
        m6894toLayoutTextGranularityduNsdkg = AndroidParagraph_androidKt.m6894toLayoutTextGranularityduNsdkg(i);
        int[] rangeForRect = textLayout.getRangeForRect(androidRectF, m6894toLayoutTextGranularityduNsdkg, new w5(textInclusionStrategy, 0));
        return rangeForRect == null ? TextRange.Companion.m7065getZerod9O1mEE() : TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    public final Locale getTextLocale$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text().getTextLocale();
    }

    public final AndroidTextPaint getTextPaint$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m7564getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo6879getWordBoundaryjx7JFs(int i) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i), WordBoundary_androidKt.getWordEnd(wordIterator, i));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i) {
        return this.layout.isLineEllipsized(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo6880paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int m7324getBlendMode0nO6VwU = getTextPaint$ui_text().m7324getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m7329setColor8_81llA(j);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m7326setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text().m7326setBlendModes9anfk8(m7324getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo6881paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m7329setColor8_81llA(j);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo6882painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int m7324getBlendMode0nO6VwU = getTextPaint$ui_text().m7324getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        float width = getWidth();
        float height = getHeight();
        textPaint$ui_text.m7327setBrush12SF9DM(brush, Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m7326setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text().m7326setBlendModes9anfk8(m7324getBlendMode0nO6VwU);
    }

    public static /* synthetic */ void getCharSequence$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text$annotations() {
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density, dq dqVar) {
        this(str, textStyle, list, list2, i, i2, j, resolver, density);
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j, dq dqVar) {
        this(androidParagraphIntrinsics, i, i2, j);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, i2, j, null);
    }
}
