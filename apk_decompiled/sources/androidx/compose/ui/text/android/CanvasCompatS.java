package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class CanvasCompatS {
    public static final CanvasCompatS INSTANCE = new CanvasCompatS();

    private CanvasCompatS() {
    }

    public final void drawGlyphs(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public final void drawPatch(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void drawPatch(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
