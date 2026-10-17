package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
