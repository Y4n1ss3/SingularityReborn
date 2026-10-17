package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    public static final WindowInsets getSystemBarsForVisualComponents(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2011811170, i, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i2 = i & 14;
        WindowInsets union = WindowInsetsKt.union(WindowInsets_androidKt.getSystemBars(companion, composer, i2), WindowInsets_androidKt.getDisplayCutout(companion, composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return union;
    }
}
