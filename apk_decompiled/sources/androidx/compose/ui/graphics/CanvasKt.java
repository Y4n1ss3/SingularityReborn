package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(Canvas canvas, float f, float f2, float f3) {
        if (f == 0.0f) {
            return;
        }
        canvas.translate(f2, f3);
        canvas.rotate(f);
        canvas.translate(-f2, -f3);
    }

    public static final void rotateRad(Canvas canvas, float f, float f2, float f3) {
        rotate(canvas, DegreesKt.degrees(f), f2, f3);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        rotateRad(canvas, f, f2, f3);
    }

    public static final void scale(Canvas canvas, float f, float f2, float f3, float f4) {
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        canvas.translate(f3, f4);
        canvas.scale(f, f2);
        canvas.translate(-f3, -f4);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        scale(canvas, f, f2, f3, f4);
    }

    public static final void withSave(Canvas canvas, iy iyVar) {
        try {
            canvas.save();
            iyVar.invoke();
        } finally {
            canvas.restore();
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, iy iyVar) {
        try {
            canvas.saveLayer(rect, paint);
            iyVar.invoke();
        } finally {
            canvas.restore();
        }
    }
}
