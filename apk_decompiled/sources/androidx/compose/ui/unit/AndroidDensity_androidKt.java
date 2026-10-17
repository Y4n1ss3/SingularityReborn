package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter forScale = FontScaleConverterFactory.INSTANCE.forScale(f);
        if (forScale == null) {
            forScale = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, forScale);
    }
}
