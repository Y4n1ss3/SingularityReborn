package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        Canvas canvas2;
        Throwable th;
        Canvas canvas3;
        float alpha;
        boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m7537equalsimpl0(textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8(), TextOverflow.Companion.m7550getVisiblegIe3tQ8());
        if (z) {
            float m7031getSizeYbymL2g = (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32);
            float m7031getSizeYbymL2g2 = (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L);
            Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), Size.m4576constructorimpl((Float.floatToRawIntBits(m7031getSizeYbymL2g2) & 4294967295L) | (Float.floatToRawIntBits(m7031getSizeYbymL2g) << 32)));
            canvas.save();
            canvas2 = null;
            Canvas.m4734clipRectmtrdDE$default(canvas, m4556Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text();
        TextDecoration textDecoration = spanStyle$ui_text.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text.getBrush();
            try {
                if (brush != null) {
                    if (spanStyle$ui_text.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE) {
                        try {
                            alpha = spanStyle$ui_text.getTextForegroundStyle$ui_text().getAlpha();
                        } catch (Throwable th2) {
                            th = th2;
                            canvas2 = canvas;
                            if (z) {
                            }
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    canvas3 = canvas;
                    MultiParagraph.m6919painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas3, brush, alpha, shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    canvas3 = canvas;
                    textLayoutResult.getMultiParagraph().m6924paintLG529CI(canvas3, (r14 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : spanStyle$ui_text.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle$ui_text.getTextForegroundStyle$ui_text().mo7369getColor0d7_KjU() : Color.Companion.m4787getBlack0d7_KjU(), (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas3.restore();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (z) {
                    throw th;
                }
                canvas2.restore();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }
}
