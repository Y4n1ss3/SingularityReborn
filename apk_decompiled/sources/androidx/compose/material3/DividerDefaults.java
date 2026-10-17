package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DividerDefaults {
    public static final int $stable = 0;
    public static final DividerDefaults INSTANCE = new DividerDefaults();
    private static final float Thickness = DividerTokens.INSTANCE.m3226getThicknessD9Ej5fM();

    private DividerDefaults() {
    }

    public final long getColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(77461041, i, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:116)");
        }
        long value = ColorSchemeKt.getValue(DividerTokens.INSTANCE.getColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m1932getThicknessD9Ej5fM() {
        return Thickness;
    }
}
