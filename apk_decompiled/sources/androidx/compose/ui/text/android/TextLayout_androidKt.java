package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import defpackage.ac;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayout_androidKt {
    private static final ThreadLocal<TextAndroidCanvas> SharedTextAndroidCanvas = new ThreadLocal<>();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i, int i2) {
        return VerticalPaddings.m7108constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) != textLayout.getLayout().getLineEnd(lineCount) || lineHeightStyleSpanArr == null || lineHeightStyleSpanArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) ac.a0(lineHeightStyleSpanArr);
        spannableString.setSpan(lineHeightStyleSpan.copy$ui_text(0, spannableString.length(), (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout create$default = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout.getIncludePadding(), textLayout.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = create$default.getLineAscent(0);
        fontMetricsInt.descent = create$default.getLineDescent(0);
        fontMetricsInt.top = create$default.getLineTop(0);
        fontMetricsInt.bottom = create$default.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i = 0;
        int i2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = Math.max(i, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = Math.max(i, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        return (i == 0 && i2 == 0) ? ZeroVerticalPadding : VerticalPaddings(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        text.getClass();
        if (!SpannedExtensions_androidKt.hasSpan((Spanned) text, LineHeightStyleSpan.class) && textLayout.getText().length() > 0) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        text2.getClass();
        return (LineHeightStyleSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
    }

    public static final ThreadLocal<TextAndroidCanvas> getSharedTextAndroidCanvas() {
        return SharedTextAndroidCanvas;
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(TextLayout textLayout) {
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text()) {
            return ZeroVerticalPadding;
        }
        TextPaint paint = textLayout.getLayout().getPaint();
        CharSequence text = textLayout.getLayout().getText();
        Rect charSequenceBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        int i = charSequenceBounds.top;
        int topPadding = i < lineAscent ? lineAscent - i : textLayout.getLayout().getTopPadding();
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        int i2 = charSequenceBounds.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : textLayout.getLayout().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? ZeroVerticalPadding : VerticalPaddings(topPadding, bottomPadding);
    }

    public static final boolean isLineEllipsized(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }

    public static /* synthetic */ void getSharedTextAndroidCanvas$annotations() {
    }
}
