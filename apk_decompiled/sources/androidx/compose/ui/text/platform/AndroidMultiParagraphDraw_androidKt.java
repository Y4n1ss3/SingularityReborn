package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m7315drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text().size() <= 1) {
            m7317drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush instanceof SolidColor) {
            m7317drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else {
            if (!(brush instanceof ShaderBrush)) {
                o.n();
                return;
            }
            List<ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
            int size = paragraphInfoList$ui_text.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i2);
                f3 += paragraphInfo.getParagraph().getHeight();
                f2 = Math.max(f2, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo4730createShaderuvyYCjk = ((ShaderBrush) brush).mo4730createShaderuvyYCjk(Size.m4576constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)));
            Matrix matrix = new Matrix();
            mo4730createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text2 = multiParagraph.getParagraphInfoList$ui_text();
            int size2 = paragraphInfoList$ui_text2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text2.get(i3);
                paragraphInfo2.getParagraph().mo6882painthn5TExg(canvas, BrushKt.ShaderBrush(mo4730createShaderuvyYCjk), f, shadow, textDecoration, drawStyle, i);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo4730createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m7316drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        m7315drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? BlendMode.Companion.m4701getSrcOver0nO6VwU() : i);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m7317drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        List<ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
        int size = paragraphInfoList$ui_text.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i2);
            paragraphInfo.getParagraph().mo6882painthn5TExg(canvas, brush, f, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
