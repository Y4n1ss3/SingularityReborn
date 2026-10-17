package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrefetchScheduler_androidKt {
    private static final PrefetchScheduler_androidKt$RobolectricImpl$1 RobolectricImpl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1] */
    static {
        PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                prefetchScheduler_androidKt$RobolectricImpl$1 = new PrefetchScheduler() { // from class: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1
                    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
                    public void schedulePrefetch(PrefetchRequest prefetchRequest) {
                    }
                };
                RobolectricImpl = prefetchScheduler_androidKt$RobolectricImpl$1;
            }
        }
        prefetchScheduler_androidKt$RobolectricImpl$1 = null;
        RobolectricImpl = prefetchScheduler_androidKt$RobolectricImpl$1;
    }

    public static final PrefetchScheduler rememberDefaultPrefetchScheduler(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141871251, i, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        PrefetchScheduler prefetchScheduler = RobolectricImpl;
        if (prefetchScheduler != null) {
            composer.startReplaceGroup(1345554384);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1345603457);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean changed = composer.changed(view);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                Object obj = tag instanceof PrefetchScheduler ? (PrefetchScheduler) tag : null;
                if (obj == null) {
                    obj = new AndroidPrefetchScheduler(view);
                    view.setTag(R.id.compose_prefetch_scheduler, obj);
                }
                rememberedValue = obj;
                composer.updateRememberedValue(rememberedValue);
            }
            prefetchScheduler = (PrefetchScheduler) rememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return prefetchScheduler;
    }

    private static /* synthetic */ void getRobolectricImpl$annotations() {
    }
}
