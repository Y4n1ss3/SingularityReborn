package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Blur_androidKt {
    public static final BlurMaskFilter BlurFilter(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void setBlurFilter(Paint paint, BlurMaskFilter blurMaskFilter) {
        AndroidPaint_androidKt.getNativePaint(paint).setMaskFilter(blurMaskFilter);
    }
}
