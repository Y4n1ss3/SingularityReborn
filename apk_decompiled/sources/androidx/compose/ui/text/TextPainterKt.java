package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.kf0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m7537equalsimpl0(textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8(), TextOverflow.Companion.m7550getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m5392clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32), (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L), 0, 16, null);
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m7039drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j2, int i3) {
        TextLayoutResult m7034measurexDpz5zY$default = TextMeasurer.m7034measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i, z, i2, list, m7047textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            clip(transform, m7034measurexDpz5zY$default);
            m7034measurexDpz5zY$default.getMultiParagraph().m6924paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m7041drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m6926painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m7043drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        TextLayoutResult m7034measurexDpz5zY$default = TextMeasurer.m7034measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, i, z, i2, null, m7047textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            clip(transform, m7034measurexDpz5zY$default);
            m7034measurexDpz5zY$default.getMultiParagraph().m6924paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m7045drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        float alpha;
        int i2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Canvas canvas;
        MultiParagraph multiParagraph;
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j != 16) {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (j == 16) {
                    j = textLayoutResult.getLayoutInput().getStyle().m7090getColor0d7_KjU();
                }
                multiParagraph2.m6924paintLG529CI(canvas2, TextDrawStyleKt.m7515modulateDxMtmZc(j, f), shadow3, textDecoration3, drawStyle3, i);
            } else {
                MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
                Canvas canvas3 = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(f)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                    i2 = i;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                } else {
                    alpha = f;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                    i2 = i;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                }
                multiParagraph.m6926painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i2);
            }
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        } catch (Throwable th) {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r8 < 0) goto L21;
     */
    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long m7047textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int i;
        int i2;
        int round;
        int i3 = 0;
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j >> 32)))) {
            int round2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))));
            if (round2 < 0) {
                round2 = 0;
            }
            i = round2;
            i2 = 0;
        } else {
            i2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j >> 32))));
            i = i2;
        }
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j & 4294967295L)))) {
            round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))));
        } else {
            i3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        round = i3;
        return ConstraintsKt.Constraints(i2, i, i3, round);
    }
}
