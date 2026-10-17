package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Paint29 {
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    public static final void getTextBounds(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
