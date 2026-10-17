package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuStrings_androidKt {
    /* renamed from: getString-tk4Tqcs, reason: not valid java name */
    public static final String m1111getStringtk4Tqcs(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2083411200, i2, -1, "androidx.compose.foundation.text.getString (ContextMenuStrings.android.kt:55)");
        }
        String string = ((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getString(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
