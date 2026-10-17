package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.dq;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class Locale24 {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Locale defaultLocale(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(317587697, i, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
            }
            Locale locale = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales().get(0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return locale;
        }

        private Companion() {
        }
    }
}
