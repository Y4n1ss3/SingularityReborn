package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontWeightAdjustmentHelper {
    public static final int $stable = 0;
    public static final FontWeightAdjustmentHelper INSTANCE = new FontWeightAdjustmentHelper();

    private FontWeightAdjustmentHelper() {
    }

    public final int getFontWeightAdjustment(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context);
        }
        return 0;
    }
}
