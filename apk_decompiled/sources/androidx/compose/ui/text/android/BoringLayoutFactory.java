package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative width");
        }
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2) : BoringLayoutFactoryDefault.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics measure(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic) : BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
