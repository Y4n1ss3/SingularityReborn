package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m3400getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    public final ListItemColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-552214416, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:546)");
        }
        ListItemColors defaultListItemColors$material3 = getDefaultListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultListItemColors$material3;
    }

    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m2105colorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        long j10;
        long j11;
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i2 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long m4797getUnspecified0d7_KjU9 = (i2 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        if (ComposerKt.isTraceInProgress()) {
            j10 = m4797getUnspecified0d7_KjU;
            j11 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-352515689, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:576)");
        } else {
            j10 = m4797getUnspecified0d7_KjU;
            j11 = m4797getUnspecified0d7_KjU2;
        }
        ListItemColors m2090copy5r9EGqc = getDefaultListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2090copy5r9EGqc(j10, j11, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2090copy5r9EGqc;
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:536)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:540)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final ListItemColors getDefaultListItemColors$material3(ColorScheme colorScheme) {
        ListItemColors defaultListItemColorsCached$material3 = colorScheme.getDefaultListItemColorsCached$material3();
        if (defaultListItemColorsCached$material3 != null) {
            return defaultListItemColorsCached$material3;
        }
        ListTokens listTokens = ListTokens.INSTANCE;
        ListItemColors listItemColors = new ListItemColors(ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemContainerColor()), ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemOverlineColor()), ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemTrailingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemDisabledLabelTextColor()), listTokens.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemDisabledLeadingIconColor()), listTokens.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, listTokens.getListItemDisabledTrailingIconColor()), listTokens.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultListItemColorsCached$material3(listItemColors);
        return listItemColors;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2106getElevationD9Ej5fM() {
        return Elevation;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:532)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
