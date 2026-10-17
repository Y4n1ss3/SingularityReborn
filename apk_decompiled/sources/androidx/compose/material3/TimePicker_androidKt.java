package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePicker_androidKt {
    public static final int defaultTimePickerLayoutType(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721362352, i, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        int m2668getHorizontalQJTpgSE = configuration.screenHeightDp < configuration.screenWidthDp ? TimePickerLayoutType.Companion.m2668getHorizontalQJTpgSE() : TimePickerLayoutType.Companion.m2669getVerticalQJTpgSE();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2668getHorizontalQJTpgSE;
    }
}
