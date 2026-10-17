package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import defpackage.iy;
import defpackage.lu0;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f, float f2, int i) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Outline.Generic generic = (Outline.Generic) outline;
            Rect bounds = generic.getBounds();
            canvas.translate(f, f2 - ((bounds.getBottom() - bounds.getTop()) / 2.0f));
            Path path = generic.getPath();
            if (!(path instanceof AndroidPath)) {
                lu0.a("Unable to obtain android.graphics.Path");
                return;
            } else {
                canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
                canvas.restore();
                return;
            }
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                o.n();
                return;
            }
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            Rect rect = rectangle.getRect();
            float bottom = f2 - ((rect.getBottom() - rect.getTop()) / 2.0f);
            Rect rect2 = rectangle.getRect();
            float right = rect2.getRight() - rect2.getLeft();
            Rect rect3 = rectangle.getRect();
            canvas.drawRect(f, bottom, (right * i) + f, ((rect3.getBottom() - rect3.getTop()) / 2.0f) + f2, paint);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float intBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m4566getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f), (rounded.getRoundRect().getWidth() * i) + f, (rounded.getRoundRect().getHeight() / 2.0f) + f2, intBitsToFloat, intBitsToFloat, paint);
            return;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f));
        if (!(Path instanceof AndroidPath)) {
            lu0.a("Unable to obtain android.graphics.Path");
        } else {
            canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m7346setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f, long j, iy iyVar) {
        Integer num = null;
        if (brush == null) {
            if (!Float.isNaN(f)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            iyVar.invoke();
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setColor(ColorKt.m4815toArgb8_81llA(((SolidColor) brush).m5117getValue0d7_KjU()));
            iyVar.invoke();
            paint.setColor(color);
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            o.n();
            return;
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f)) {
            num = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f * 255.0f));
        }
        paint.setShader(((ShaderBrush) brush).mo4730createShaderuvyYCjk(j));
        iyVar.invoke();
        paint.setShader(shader);
        if (num != null) {
            paint.setAlpha(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (q10.b(drawStyle, Fill.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            o.n();
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        Stroke stroke = (Stroke) drawStyle;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(DrawStyleSpan_androidKt.m7347toAndroidCapBeK7IIE(stroke.m5404getCapKaPHkGw()));
        paint.setStrokeJoin(DrawStyleSpan_androidKt.m7348toAndroidJoinWw9F2mQ(stroke.m5405getJoinLxFBmk8()));
        PathEffect pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
    }
}
