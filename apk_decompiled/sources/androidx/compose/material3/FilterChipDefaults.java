package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m3349getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m3365getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1424)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3 = getDefaultElevatedFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedFilterChipColors$material3;
    }

    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1991elevatedFilterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        long j13;
        long j14;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j15 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i3 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-915841711, i, i2, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1459)");
        } else {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
        }
        SelectableChipColors m2361copydaRQuJA = getDefaultElevatedFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2361copydaRQuJA(j15, j14, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, j13, m4797getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2361copydaRQuJA;
    }

    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1992elevatedFilterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilterChipTokens.INSTANCE.m3351getElevatedContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilterChipTokens.INSTANCE.m3355getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilterChipTokens.INSTANCE.m3353getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilterChipTokens.INSTANCE.m3354getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = FilterChipTokens.INSTANCE.m3350getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = FilterChipTokens.INSTANCE.m3352getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1530)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }

    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m1993filterChipBorder_7El2pE(boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, Composer composer, int i, int i2) {
        long j5;
        long value = (i2 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j;
        long m4796getTransparent0d7_KjU = (i2 & 8) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j2;
        if ((i2 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            j5 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filterChipTokens.getFlatDisabledUnselectedOutlineColor(), composer, 6), filterChipTokens.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j5 = j3;
        }
        long m4796getTransparent0d7_KjU2 = (i2 & 32) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j4;
        float m3363getFlatUnselectedOutlineWidthD9Ej5fM = (i2 & 64) != 0 ? FilterChipTokens.INSTANCE.m3363getFlatUnselectedOutlineWidthD9Ej5fM() : f;
        float m3359getFlatSelectedOutlineWidthD9Ej5fM = (i2 & Fields.SpotShadowColor) != 0 ? FilterChipTokens.INSTANCE.m3359getFlatSelectedOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1409)");
        }
        if (!z) {
            value = z2 ? m4796getTransparent0d7_KjU2 : j5;
        } else if (z2) {
            value = m4796getTransparent0d7_KjU;
        }
        if (z2) {
            m3363getFlatUnselectedOutlineWidthD9Ej5fM = m3359getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(m3363getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m253BorderStrokecXLIe8U;
    }

    public final SelectableChipColors filterChipColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1267)");
        }
        SelectableChipColors defaultFilterChipColors$material3 = getDefaultFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilterChipColors$material3;
    }

    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1994filterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        long j13;
        long j14;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j15 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i3 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-1831479801, i, i2, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1302)");
        } else {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
        }
        SelectableChipColors m2361copydaRQuJA = getDefaultFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2361copydaRQuJA(j15, j14, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, j13, m4797getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2361copydaRQuJA;
    }

    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1995filterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilterChipTokens.INSTANCE.m3356getFlatContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilterChipTokens.INSTANCE.m3360getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilterChipTokens.INSTANCE.m3357getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilterChipTokens.INSTANCE.m3358getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = FilterChipTokens.INSTANCE.m3350getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1372)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached$material3 = colorScheme.getDefaultElevatedFilterChipColorsCached$material3();
        if (defaultElevatedFilterChipColorsCached$material3 != null) {
            return defaultElevatedFilterChipColorsCached$material3;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedTrailingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledTrailingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached$material3 = colorScheme.getDefaultFilterChipColorsCached$material3();
        if (defaultFilterChipColorsCached$material3 != null) {
            return defaultFilterChipColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedTrailingIconColor()), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledTrailingIconColor()), filterChipTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), filterChipTokens.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1996getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1997getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1541)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
