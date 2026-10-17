package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (q10.b(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof Stroke)) {
                o.n();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
            textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
            textPaint.setStrokeJoin(DrawStyleSpan_androidKt.m7348toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m5405getJoinLxFBmk8()));
            textPaint.setStrokeCap(DrawStyleSpan_androidKt.m7347toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m5404getCapKaPHkGw()));
            PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
            textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }
}
