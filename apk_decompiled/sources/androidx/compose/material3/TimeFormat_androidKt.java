package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimeFormat_androidKt {
    public static final boolean is24HourFormat(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-972868615, i, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean is24HourFormat = DateFormat.is24HourFormat((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return is24HourFormat;
    }
}
