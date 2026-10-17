package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();
    private static final float StrokeWidth = Dp.m7611constructorimpl(2.0f);

    private CheckboxDefaults() {
    }

    public final CheckboxColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:315)");
        }
        CheckboxColors defaultCheckboxColors$material3 = getDefaultCheckboxColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors$material3;
    }

    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m1698colors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:341)");
        }
        CheckboxColors defaultCheckboxColors$material3 = getDefaultCheckboxColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        CheckboxColors m1685copy2qZNXz8 = defaultCheckboxColors$material3.m1685copy2qZNXz8(m4797getUnspecified0d7_KjU3, companion.m4796getTransparent0d7_KjU(), m4797getUnspecified0d7_KjU, companion.m4796getTransparent0d7_KjU(), m4797getUnspecified0d7_KjU4, companion.m4796getTransparent0d7_KjU(), m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1685copy2qZNXz8;
    }

    public final CheckboxColors getDefaultCheckboxColors$material3(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached$material3 = colorScheme.getDefaultCheckboxColorsCached$material3();
        if (defaultCheckboxColorsCached$material3 != null) {
            return defaultCheckboxColorsCached$material3;
        }
        CheckboxTokens checkboxTokens = CheckboxTokens.INSTANCE;
        long fromToken = ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedIconColor());
        Color.Companion companion = Color.Companion;
        CheckboxColors checkboxColors = new CheckboxColors(fromToken, companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedOutlineColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCheckboxColorsCached$material3(checkboxColors);
        return checkboxColors;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1699getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }
}
