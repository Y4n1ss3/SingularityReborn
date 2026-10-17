package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBar_androidKt {
    public static final float getWindowContainerHeight(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1909557323, i, -1, "androidx.compose.material3.getWindowContainerHeight (SearchBar.android.kt:27)");
        }
        float m7611constructorimpl = Dp.m7611constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m7611constructorimpl;
    }
}
