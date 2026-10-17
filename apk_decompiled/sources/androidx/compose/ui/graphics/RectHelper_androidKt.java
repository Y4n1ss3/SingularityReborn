package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectHelper_androidKt {
    @er
    public static final Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    public static final RectF toAndroidRectF(androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    public static final IntRect toComposeIntRect(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect toComposeRect(Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect toComposeRect(RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Rect toAndroidRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
