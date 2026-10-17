package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m757PaddingValuesYgX7TsA$default(Dp.m7611constructorimpl(12.0f), 0.0f, 2, null);

    private NavigationDrawerItemDefaults() {
    }

    /* renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m2177colorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        long j9;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j;
        long m4796getTransparent0d7_KjU = (i2 & 2) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j2;
        long value2 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer, 6) : j3;
        long value3 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j4;
        long value4 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j5;
        long value5 = (i2 & 32) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j6;
        long j10 = (i2 & 64) != 0 ? value4 : j7;
        long j11 = (i2 & Fields.SpotShadowColor) != 0 ? value5 : j8;
        if (ComposerKt.isTraceInProgress()) {
            j9 = value5;
            ComposerKt.traceEventStart(-1574983348, i, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1172)");
        } else {
            j9 = value5;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(value2, value3, value4, j9, value, m4796getTransparent0d7_KjU, j10, j11, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDrawerItemsColor;
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
