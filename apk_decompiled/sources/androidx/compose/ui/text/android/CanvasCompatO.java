package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class CanvasCompatO {
    public static final CanvasCompatO INSTANCE = new CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean clipOutPath(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean clipOutRect(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public final boolean clipOutRect(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean clipOutRect(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public final boolean clipOutRect(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }
}
