package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.StandardIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    /* renamed from: smallContainerSize-N-wlBFI$material3$default, reason: not valid java name */
    public static /* synthetic */ long m2025smallContainerSizeNwlBFI$material3$default(IconButtonDefaults iconButtonDefaults, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = IconButtonWidthOption.Companion.m2051getUniformrc6NtMs();
        }
        return iconButtonDefaults.m2042smallContainerSizeNwlBFI$material3(i);
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconButtonColors m2026defaultIconButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j) {
        IconButtonColors defaultIconButtonColorsCached$material3 = colorScheme.getDefaultIconButtonColorsCached$material3();
        if (defaultIconButtonColorsCached$material3 != null) {
            return defaultIconButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m4796getTransparent0d7_KjU(), j, companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(j, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconButtonColors defaultIconButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultIconButtonVibrantColorsCached$material3 = colorScheme.getDefaultIconButtonVibrantColorsCached$material3();
        if (defaultIconButtonVibrantColorsCached$material3 != null) {
            return defaultIconButtonVibrantColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        StandardIconButtonTokens standardIconButtonTokens = StandardIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getDisabledColor()), standardIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonVibrantColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconToggleButtonColors m2027defaultIconToggleButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3 = colorScheme.getDefaultIconToggleButtonColorsCached$material3();
        if (defaultIconToggleButtonColorsCached$material3 != null) {
            return defaultIconToggleButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        long m4796getTransparent0d7_KjU2 = companion.m4796getTransparent0d7_KjU();
        StandardIconButtonTokens standardIconButtonTokens = StandardIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(m4796getTransparent0d7_KjU, j, m4796getTransparent0d7_KjU2, Color.m4760copywmQWz5c$default(j, standardIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getSelectedColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors defaultIconToggleButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultIconToggleButtonVibrantColorsCached$material3 = colorScheme.getDefaultIconToggleButtonVibrantColorsCached$material3();
        if (defaultIconToggleButtonVibrantColorsCached$material3 != null) {
            return defaultIconToggleButtonVibrantColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        StandardIconButtonTokens standardIconButtonTokens = StandardIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getUnselectedColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getDisabledColor()), standardIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, standardIconButtonTokens.getSelectedColor()), null);
        colorScheme.setDefaultIconToggleButtonVibrantColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconButtonColors m2028defaultOutlinedIconButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j) {
        IconButtonColors defaultOutlinedIconButtonColorsCached$material3 = colorScheme.getDefaultOutlinedIconButtonColorsCached$material3();
        if (defaultOutlinedIconButtonColorsCached$material3 != null) {
            return defaultOutlinedIconButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m4796getTransparent0d7_KjU(), j, companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(j, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconButtonColors defaultOutlinedIconButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultOutlinedIconButtonVibrantColorsCached$material3 = colorScheme.getDefaultOutlinedIconButtonVibrantColorsCached$material3();
        if (defaultOutlinedIconButtonVibrantColorsCached$material3 != null) {
            return defaultOutlinedIconButtonVibrantColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getDisabledColor()), outlinedIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonVibrantColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconToggleButtonColors m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3 = colorScheme.getDefaultIconToggleButtonColorsCached$material3();
        if (defaultIconToggleButtonColorsCached$material3 != null) {
            return defaultIconToggleButtonColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        long m4796getTransparent0d7_KjU2 = companion.m4796getTransparent0d7_KjU();
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(m4796getTransparent0d7_KjU, j, m4796getTransparent0d7_KjU2, Color.m4760copywmQWz5c$default(j, outlinedIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m1796contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColorsCached$material3 = colorScheme.getDefaultOutlinedIconToggleButtonVibrantColorsCached$material3();
        if (defaultOutlinedIconToggleButtonVibrantColorsCached$material3 != null) {
            return defaultOutlinedIconToggleButtonVibrantColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getUnselectedColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getDisabledColor()), outlinedIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedColor()), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors filledIconButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-958304265, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:300)");
        }
        IconButtonColors defaultFilledIconButtonColors$material3 = getDefaultFilledIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconButtonColors$material3;
    }

    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2030filledIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = ColorSchemeKt.m1797contentColorForek8zF_U(j, composer, i & 14);
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245481051, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:317)");
        }
        long j5 = j2;
        long j6 = j;
        IconButtonColors m2020copyjRlVdoo = getDefaultFilledIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2020copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final IconToggleButtonColors filledIconToggleButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1455160689, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:346)");
        }
        IconToggleButtonColors defaultFilledIconToggleButtonColors$material3 = getDefaultFilledIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconToggleButtonColors$material3;
    }

    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2031filledIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m1797contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU5, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            j7 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1473292947, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:370)");
        } else {
            j7 = m4797getUnspecified0d7_KjU;
        }
        IconToggleButtonColors m2058copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2058copytNS2XkQ(j7, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m1797contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    public final IconButtonColors filledTonalIconButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1145002745, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:407)");
        }
        IconButtonColors defaultFilledTonalIconButtonColors$material3 = getDefaultFilledTonalIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconButtonColors$material3;
    }

    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2032filledTonalIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = ColorSchemeKt.m1797contentColorForek8zF_U(j, composer, i & 14);
        }
        if ((i2 & 4) != 0) {
            j3 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j4 = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(562762851, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:425)");
        }
        long j5 = j2;
        long j6 = j;
        IconButtonColors m2020copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2020copyjRlVdoo(j6, j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(656374417, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:454)");
        }
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColors$material3 = getDefaultFilledTonalIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconToggleButtonColors$material3;
    }

    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2033filledTonalIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU, composer, i & 14) : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU3 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU4 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m1797contentColorForek8zF_U2 = (i2 & 32) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU4, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            j7 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(2130748241, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:476)");
        } else {
            j7 = m4797getUnspecified0d7_KjU;
        }
        IconToggleButtonColors m2058copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2058copytNS2XkQ(j7, m1797contentColorForek8zF_U, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m1797contentColorForek8zF_U2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached$material3 = colorScheme.getDefaultFilledIconButtonColorsCached$material3();
        if (defaultFilledIconButtonColorsCached$material3 != null) {
            return defaultFilledIconButtonColorsCached$material3;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached$material3 = colorScheme.getDefaultFilledIconToggleButtonColorsCached$material3();
        if (defaultFilledIconToggleButtonColorsCached$material3 != null) {
            return defaultFilledIconToggleButtonColorsCached$material3;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getUnselectedColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedColor()), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalIconButtonColorsCached$material3();
        if (defaultFilledTonalIconButtonColorsCached$material3 != null) {
            return defaultFilledTonalIconButtonColorsCached$material3;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached$material3();
        if (defaultFilledTonalIconToggleButtonColorsCached$material3 != null) {
            return defaultFilledTonalIconToggleButtonColorsCached$material3;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getSelectedColor()), null);
        colorScheme.setDefaultFilledTonalIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1542796069, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButtonDefaults.kt:853)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1706356635, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButtonDefaults.kt:857)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getStandardShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-377108005, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final IconButtonColors iconButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1037266503, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
        }
        long m4771unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        IconButtonColors m2026defaultIconButtonColors4WTKRHQ$material3 = m2026defaultIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), m4771unboximpl);
        if (!Color.m4762equalsimpl0(m2026defaultIconButtonColors4WTKRHQ$material3.m2022getContentColor0d7_KjU(), m4771unboximpl)) {
            m2026defaultIconButtonColors4WTKRHQ$material3 = IconButtonColors.m2017copyjRlVdoo$default(m2026defaultIconButtonColors4WTKRHQ$material3, 0L, m4771unboximpl, 0L, Color.m4760copywmQWz5c$default(m4771unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2026defaultIconButtonColors4WTKRHQ$material3;
    }

    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2034iconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        long m4771unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl() : j2;
        long m4797getUnspecified0d7_KjU = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(m4771unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1639168605, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:78)");
        }
        IconButtonColors m2020copyjRlVdoo = m2026defaultIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()).m2020copyjRlVdoo(j, m4771unboximpl, m4797getUnspecified0d7_KjU, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final IconButtonColors iconButtonVibrantColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(111454247, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:110)");
        }
        IconButtonColors defaultIconButtonVibrantColors$material3 = defaultIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultIconButtonVibrantColors$material3;
    }

    /* renamed from: iconButtonVibrantColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2035iconButtonVibrantColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        long m4797getUnspecified0d7_KjU = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(m4797getUnspecified0d7_KjU, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1036440437, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:132)");
        }
        IconButtonColors m2020copyjRlVdoo = defaultIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2020copyjRlVdoo(j, m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i) {
        composer.startReplaceGroup(-1355771567);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355771567, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:164)");
        }
        long m4771unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        IconToggleButtonColors m2027defaultIconToggleButtonColors4WTKRHQ$material3 = m2027defaultIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), m4771unboximpl);
        if (Color.m4762equalsimpl0(m2027defaultIconToggleButtonColors4WTKRHQ$material3.m2062getContentColor0d7_KjU(), m4771unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return m2027defaultIconToggleButtonColors4WTKRHQ$material3;
        }
        IconToggleButtonColors m2057copytNS2XkQ$default = IconToggleButtonColors.m2057copytNS2XkQ$default(m2027defaultIconToggleButtonColors4WTKRHQ$material3, 0L, m4771unboximpl, 0L, Color.m4760copywmQWz5c$default(m4771unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m2057copytNS2XkQ$default;
    }

    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2036iconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4771unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl() : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j10 = m4771unboximpl;
            j8 = Color.m4760copywmQWz5c$default(j10, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j10;
        } else {
            j7 = m4771unboximpl;
            j8 = j4;
        }
        long m4797getUnspecified0d7_KjU3 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU4 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            j9 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1402082449, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:203)");
        } else {
            j9 = m4797getUnspecified0d7_KjU;
        }
        IconToggleButtonColors m2058copytNS2XkQ = m2027defaultIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()).m2058copytNS2XkQ(j9, j7, m4797getUnspecified0d7_KjU2, j8, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    public final IconToggleButtonColors iconToggleButtonVibrantColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1755001127, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:241)");
        }
        IconToggleButtonColors defaultIconToggleButtonVibrantColors$material3 = defaultIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultIconToggleButtonVibrantColors$material3;
    }

    /* renamed from: iconToggleButtonVibrantColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2037iconToggleButtonVibrantColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j9 = m4797getUnspecified0d7_KjU2;
            j8 = Color.m4760copywmQWz5c$default(j9, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j9;
        } else {
            j7 = m4797getUnspecified0d7_KjU2;
            j8 = j4;
        }
        long m4797getUnspecified0d7_KjU4 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU5 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1027328773, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:267)");
        }
        IconToggleButtonColors m2058copytNS2XkQ = defaultIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2058copytNS2XkQ(m4797getUnspecified0d7_KjU, j7, m4797getUnspecified0d7_KjU3, j8, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    public final BorderStroke outlinedIconButtonBorder(boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1270640488, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButtonDefaults.kt:818)");
        }
        long m4771unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        if (!z) {
            m4771unboximpl = Color.m4760copywmQWz5c$default(m4771unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean changed = composer.changed(m4771unboximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m253BorderStrokecXLIe8U(SmallIconButtonTokens.INSTANCE.m3634getOutlinedOutlineWidthD9Ej5fM(), m4771unboximpl);
            composer.updateRememberedValue(rememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final IconButtonColors outlinedIconButtonColors(Composer composer, int i) {
        composer.startReplaceGroup(1591384183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1591384183, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:513)");
        }
        long m4771unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        IconButtonColors m2028defaultOutlinedIconButtonColors4WTKRHQ$material3 = m2028defaultOutlinedIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), m4771unboximpl);
        if (Color.m4762equalsimpl0(m2028defaultOutlinedIconButtonColors4WTKRHQ$material3.m2022getContentColor0d7_KjU(), m4771unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return m2028defaultOutlinedIconButtonColors4WTKRHQ$material3;
        }
        IconButtonColors m2017copyjRlVdoo$default = IconButtonColors.m2017copyjRlVdoo$default(m2028defaultOutlinedIconButtonColors4WTKRHQ$material3, 0L, m4771unboximpl, 0L, Color.m4760copywmQWz5c$default(m4771unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m2017copyjRlVdoo$default;
    }

    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2038outlinedIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        long m4771unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl() : j2;
        long m4797getUnspecified0d7_KjU = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(m4771unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1335916251, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:547)");
        }
        IconButtonColors m2020copyjRlVdoo = m2028defaultOutlinedIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()).m2020copyjRlVdoo(j, m4771unboximpl, m4797getUnspecified0d7_KjU, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final BorderStroke outlinedIconButtonVibrantBorder(boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2139728858, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantBorder (IconButtonDefaults.kt:836)");
        }
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        long value = ColorSchemeKt.getValue(outlinedIconButtonTokens.getOutlineColor(), composer, 6);
        if (!z) {
            value = Color.m4760copywmQWz5c$default(value, outlinedIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean changed = composer.changed(value);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m253BorderStrokecXLIe8U(SmallIconButtonTokens.INSTANCE.m3634getOutlinedOutlineWidthD9Ej5fM(), value);
            composer.updateRememberedValue(rememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final IconButtonColors outlinedIconButtonVibrantColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-899469399, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:581)");
        }
        IconButtonColors defaultOutlinedIconButtonVibrantColors$material3 = defaultOutlinedIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedIconButtonVibrantColors$material3;
    }

    /* renamed from: outlinedIconButtonVibrantColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2039outlinedIconButtonVibrantColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        long m4797getUnspecified0d7_KjU = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4760copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4760copywmQWz5c$default(m4797getUnspecified0d7_KjU, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278201933, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:603)");
        }
        IconButtonColors m2020copyjRlVdoo = defaultOutlinedIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2020copyjRlVdoo(j, m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4760copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2020copyjRlVdoo;
    }

    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceGroup(1933433512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1933433512, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButtonDefaults.kt:786)");
        }
        if (z2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        BorderStroke outlinedIconButtonBorder = outlinedIconButtonBorder(z, composer, (i & 14) | ((i >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return outlinedIconButtonBorder;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer composer, int i) {
        composer.startReplaceGroup(-834376945);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-834376945, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:636)");
        }
        long m4771unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        IconToggleButtonColors m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3 = m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), m4771unboximpl);
        if (Color.m4762equalsimpl0(m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3.m2062getContentColor0d7_KjU(), m4771unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3;
        }
        IconToggleButtonColors m2057copytNS2XkQ$default = IconToggleButtonColors.m2057copytNS2XkQ$default(m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3, 0L, m4771unboximpl, 0L, Color.m4760copywmQWz5c$default(m4771unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m2057copytNS2XkQ$default;
    }

    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2040outlinedIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4771unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl() : j2;
        long m4797getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j10 = m4771unboximpl;
            j8 = Color.m4760copywmQWz5c$default(j10, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j10;
        } else {
            j7 = m4771unboximpl;
            j8 = j4;
        }
        long m4797getUnspecified0d7_KjU3 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m1797contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU3, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            j9 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-514625005, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:675)");
        } else {
            j9 = m4797getUnspecified0d7_KjU;
        }
        IconToggleButtonColors m2058copytNS2XkQ = m2029defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()).m2058copytNS2XkQ(j9, j7, m4797getUnspecified0d7_KjU2, j8, m4797getUnspecified0d7_KjU3, m1797contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    public final BorderStroke outlinedIconToggleButtonVibrantBorder(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceGroup(394022990);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394022990, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantBorder (IconButtonDefaults.kt:801)");
        }
        if (z2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        BorderStroke outlinedIconButtonVibrantBorder = outlinedIconButtonVibrantBorder(z, composer, (i & 14) | ((i >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return outlinedIconButtonVibrantBorder;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonVibrantColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236236887, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:719)");
        }
        IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColors$material3 = defaultOutlinedIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedIconToggleButtonVibrantColors$material3;
    }

    /* renamed from: outlinedIconToggleButtonVibrantColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2041outlinedIconToggleButtonVibrantColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j10 = m4797getUnspecified0d7_KjU2;
            j8 = Color.m4760copywmQWz5c$default(j10, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j10;
        } else {
            j7 = m4797getUnspecified0d7_KjU2;
            j8 = j4;
        }
        long m4797getUnspecified0d7_KjU4 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m1797contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m4797getUnspecified0d7_KjU4, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            j9 = m4797getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-142016199, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:745)");
        } else {
            j9 = m4797getUnspecified0d7_KjU;
        }
        IconToggleButtonColors m2058copytNS2XkQ = defaultOutlinedIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2058copytNS2XkQ(j9, j7, m4797getUnspecified0d7_KjU3, j8, m4797getUnspecified0d7_KjU4, m1797contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2058copytNS2XkQ;
    }

    /* renamed from: smallContainerSize-N-wlBFI$material3, reason: not valid java name */
    public final long m2042smallContainerSizeNwlBFI$material3(int i) {
        float m7611constructorimpl;
        IconButtonWidthOption.Companion companion = IconButtonWidthOption.Companion;
        if (IconButtonWidthOption.m2046equalsimpl0(i, companion.m2050getNarrowrc6NtMs())) {
            SmallIconButtonTokens smallIconButtonTokens = SmallIconButtonTokens.INSTANCE;
            m7611constructorimpl = Dp.m7611constructorimpl(smallIconButtonTokens.m3633getNarrowTrailingSpaceD9Ej5fM() + smallIconButtonTokens.m3632getNarrowLeadingSpaceD9Ej5fM());
        } else if (IconButtonWidthOption.m2046equalsimpl0(i, companion.m2051getUniformrc6NtMs())) {
            SmallIconButtonTokens smallIconButtonTokens2 = SmallIconButtonTokens.INSTANCE;
            m7611constructorimpl = Dp.m7611constructorimpl(smallIconButtonTokens2.m3629getDefaultLeadingSpaceD9Ej5fM() + smallIconButtonTokens2.m3629getDefaultLeadingSpaceD9Ej5fM());
        } else if (IconButtonWidthOption.m2046equalsimpl0(i, companion.m2052getWiderc6NtMs())) {
            SmallIconButtonTokens smallIconButtonTokens3 = SmallIconButtonTokens.INSTANCE;
            m7611constructorimpl = Dp.m7611constructorimpl(smallIconButtonTokens3.m3636getWideTrailingSpaceD9Ej5fM() + smallIconButtonTokens3.m3635getWideLeadingSpaceD9Ej5fM());
        } else {
            m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
        }
        SmallIconButtonTokens smallIconButtonTokens4 = SmallIconButtonTokens.INSTANCE;
        return DpKt.m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(smallIconButtonTokens4.m3631getIconSizeD9Ej5fM() + m7611constructorimpl), smallIconButtonTokens4.m3628getContainerHeightD9Ej5fM());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class IconButtonWidthOption {
        public static final Companion Companion = new Companion(null);
        private static final int Narrow = m2044constructorimpl(0);
        private static final int Uniform = m2044constructorimpl(1);
        private static final int Wide = m2044constructorimpl(2);
        private final int value;

        private /* synthetic */ IconButtonWidthOption(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IconButtonWidthOption m2043boximpl(int i) {
            return new IconButtonWidthOption(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2045equalsimpl(int i, Object obj) {
            return (obj instanceof IconButtonWidthOption) && i == ((IconButtonWidthOption) obj).m2049unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2046equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2047hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2048toStringimpl(int i) {
            return m2046equalsimpl0(i, Narrow) ? "Narrow" : m2046equalsimpl0(i, Uniform) ? "Uniform" : m2046equalsimpl0(i, Wide) ? "Wide" : "Unknown";
        }

        public boolean equals(Object obj) {
            return m2045equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2047hashCodeimpl(this.value);
        }

        public String toString() {
            return m2048toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2049unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getNarrow-rc6NtMs, reason: not valid java name */
            public final int m2050getNarrowrc6NtMs() {
                return IconButtonWidthOption.Narrow;
            }

            /* renamed from: getUniform-rc6NtMs, reason: not valid java name */
            public final int m2051getUniformrc6NtMs() {
                return IconButtonWidthOption.Uniform;
            }

            /* renamed from: getWide-rc6NtMs, reason: not valid java name */
            public final int m2052getWiderc6NtMs() {
                return IconButtonWidthOption.Wide;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m2044constructorimpl(int i) {
            return i;
        }
    }
}
