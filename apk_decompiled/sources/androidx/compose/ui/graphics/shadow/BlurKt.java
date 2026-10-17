package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlurKt {
    /* renamed from: configureShadow-FoewPVk, reason: not valid java name */
    public static final Paint m5469configureShadowFoewPVk(Paint paint, long j, int i, BlurMaskFilter blurMaskFilter, int i2) {
        paint.mo4637setColor8_81llA(j);
        paint.mo4636setBlendModes9anfk8(i);
        paint.mo4641setStylek9PVt8s(i2);
        Blur_androidKt.setBlurFilter(paint, blurMaskFilter);
        return paint;
    }

    /* renamed from: configureShadow-FoewPVk$default, reason: not valid java name */
    public static /* synthetic */ Paint m5470configureShadowFoewPVk$default(Paint paint, long j, int i, BlurMaskFilter blurMaskFilter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = Color.Companion.m4787getBlack0d7_KjU();
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = BlendMode.Companion.m4701getSrcOver0nO6VwU();
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i3 & 8) != 0) {
            i2 = PaintingStyle.Companion.m5042getFillTiuSbCo();
        }
        return m5469configureShadowFoewPVk(paint, j2, i4, blurMaskFilter2, i2);
    }
}
