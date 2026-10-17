package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class CanvasCompatM {
    public static final CanvasCompatM INSTANCE = new CanvasCompatM();

    private CanvasCompatM() {
    }

    public final void drawTextRun(Canvas canvas, char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public final void drawTextRun(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }
}
