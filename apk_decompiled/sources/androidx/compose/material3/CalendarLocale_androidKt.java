package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalendarLocale_androidKt {
    public static final Locale defaultLocale(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1612326743, i, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:30)");
        }
        composer.startReplaceGroup(2088426481);
        Locale defaultLocale = Locale24.Companion.defaultLocale(composer, 6);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultLocale;
    }
}
