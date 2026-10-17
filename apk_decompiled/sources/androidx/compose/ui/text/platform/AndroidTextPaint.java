package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import defpackage.n6;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint asComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = asComposePaint;
        return asComposePaint;
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m7323setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m7327setBrush12SF9DM(brush, j, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader setBrush_12SF9DM$lambda$0(Brush brush, long j) {
        return ((ShaderBrush) brush).mo4730createShaderuvyYCjk(j);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m7324getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    public final Brush getBrush$ui_text() {
        return this.brush;
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text, reason: not valid java name */
    public final Size m7325getBrushSizeVsRJwc0$ui_text() {
        return this.brushSize;
    }

    public final State<Shader> getShaderState$ui_text() {
        return this.shaderState;
    }

    public final Shadow getShadow$ui_text() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m7326setBlendModes9anfk8(int i) {
        if (BlendMode.m4670equalsimpl0(i, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo4636setBlendModes9anfk8(i);
        this.backingBlendMode = i;
    }

    public final void setBrush$ui_text(Brush brush) {
        this.brush = brush;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if ((r0 == null ? false : androidx.compose.ui.geometry.Size.m4581equalsimpl0(r0.m4590unboximpl(), r6)) == false) goto L18;
     */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7327setBrush12SF9DM(Brush brush, long j, float f) {
        if (brush == null) {
            clearShader();
            return;
        }
        if (brush instanceof SolidColor) {
            m7329setColor8_81llA(TextDrawStyleKt.m7515modulateDxMtmZc(((SolidColor) brush).m5117getValue0d7_KjU(), f));
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            o.n();
            return;
        }
        int i = 0;
        if (q10.b(this.brush, brush)) {
            Size size = this.brushSize;
        }
        if (j != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.brush = brush;
            this.brushSize = Size.m4573boximpl(j);
            this.shaderState = SnapshotStateKt.derivedStateOf(new n6(i, j, brush));
        }
        Paint composePaint = getComposePaint();
        State<? extends Shader> state = this.shaderState;
        composePaint.setShader(state != null ? state.getValue() : null);
        this.lastColor = null;
        AndroidTextPaint_androidKt.setAlpha(this, f);
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text, reason: not valid java name */
    public final void m7328setBrushSizeiaC8Vc4$ui_text(Size size) {
        this.brushSize = size;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m7329setColor8_81llA(long j) {
        Color color = this.lastColor;
        if ((color == null ? false : Color.m4762equalsimpl0(color.m4771unboximpl(), j)) || j == 16) {
            return;
        }
        this.lastColor = Color.m4751boximpl(j);
        setColor(ColorKt.m4815toArgb8_81llA(j));
        clearShader();
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || q10.b(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (drawStyle.equals(Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            o.n();
            return;
        }
        getComposePaint().mo4641setStylek9PVt8s(PaintingStyle.Companion.m5043getStrokeTiuSbCo());
        Stroke stroke = (Stroke) drawStyle;
        getComposePaint().setStrokeWidth(stroke.getWidth());
        getComposePaint().setStrokeMiterLimit(stroke.getMiter());
        getComposePaint().mo4640setStrokeJoinWw9F2mQ(stroke.m5405getJoinLxFBmk8());
        getComposePaint().mo4639setStrokeCapBeK7IIE(stroke.m5404getCapKaPHkGw());
        getComposePaint().setPathEffect(stroke.getPathEffect());
    }

    public final void setShaderState$ui_text(State<? extends Shader> state) {
        this.shaderState = state;
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || q10.b(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (q10.b(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.m5106getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (this.shadow.m5106getOffsetF1C5BW0() & 4294967295L)), ColorKt.m4815toArgb8_81llA(this.shadow.m5105getColor0d7_KjU()));
        }
    }

    public final void setShadow$ui_text(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || q10.b(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }

    public static /* synthetic */ void getBrush$ui_text$annotations() {
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text$annotations, reason: not valid java name */
    public static /* synthetic */ void m7322getBrushSizeVsRJwc0$ui_text$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text$annotations() {
    }
}
