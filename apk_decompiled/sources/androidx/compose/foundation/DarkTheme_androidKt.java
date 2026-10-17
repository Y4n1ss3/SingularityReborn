package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DarkTheme_androidKt {
    public static final boolean _isSystemInDarkTheme(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z = (((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }
}
