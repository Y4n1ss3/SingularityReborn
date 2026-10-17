package androidx.compose.material3.internal;

import androidx.compose.foundation.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTooltipStrings {
    public static final int $stable = 0;
    public static final BasicTooltipStrings INSTANCE = new BasicTooltipStrings();

    private BasicTooltipStrings() {
    }

    public final String description(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1282333990, i, -1, "androidx.compose.material3.internal.BasicTooltipStrings.description (BasicTooltip.android.kt:25)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.tooltip_description, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public final String label(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966841262, i, -1, "androidx.compose.material3.internal.BasicTooltipStrings.label (BasicTooltip.android.kt:23)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.tooltip_label, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringResource;
    }
}
