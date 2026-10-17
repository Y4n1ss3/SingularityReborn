package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.compose.material3.internal.colorUtil.Cam;
import androidx.compose.material3.internal.colorUtil.CamUtils;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicTonalPaletteKt {
    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicDarkColorScheme34(context) : dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long m2736getPrimary800d7_KjU = tonalPalette.m2736getPrimary800d7_KjU();
        long m2730getPrimary200d7_KjU = tonalPalette.m2730getPrimary200d7_KjU();
        long m2731getPrimary300d7_KjU = tonalPalette.m2731getPrimary300d7_KjU();
        long m2737getPrimary900d7_KjU = tonalPalette.m2737getPrimary900d7_KjU();
        long m2732getPrimary400d7_KjU = tonalPalette.m2732getPrimary400d7_KjU();
        long m2749getSecondary800d7_KjU = tonalPalette.m2749getSecondary800d7_KjU();
        long m2743getSecondary200d7_KjU = tonalPalette.m2743getSecondary200d7_KjU();
        long m2744getSecondary300d7_KjU = tonalPalette.m2744getSecondary300d7_KjU();
        long m2750getSecondary900d7_KjU = tonalPalette.m2750getSecondary900d7_KjU();
        long m2762getTertiary800d7_KjU = tonalPalette.m2762getTertiary800d7_KjU();
        long m2756getTertiary200d7_KjU = tonalPalette.m2756getTertiary200d7_KjU();
        long m2757getTertiary300d7_KjU = tonalPalette.m2757getTertiary300d7_KjU();
        long m2763getTertiary900d7_KjU = tonalPalette.m2763getTertiary900d7_KjU();
        long m2715getNeutralVariant60d7_KjU = tonalPalette.m2715getNeutralVariant60d7_KjU();
        long m2720getNeutralVariant900d7_KjU = tonalPalette.m2720getNeutralVariant900d7_KjU();
        long m2715getNeutralVariant60d7_KjU2 = tonalPalette.m2715getNeutralVariant60d7_KjU();
        long m2720getNeutralVariant900d7_KjU2 = tonalPalette.m2720getNeutralVariant900d7_KjU();
        long m2711getNeutralVariant300d7_KjU = tonalPalette.m2711getNeutralVariant300d7_KjU();
        long m2718getNeutralVariant800d7_KjU = tonalPalette.m2718getNeutralVariant800d7_KjU();
        long m2720getNeutralVariant900d7_KjU3 = tonalPalette.m2720getNeutralVariant900d7_KjU();
        long m2708getNeutralVariant200d7_KjU = tonalPalette.m2708getNeutralVariant200d7_KjU();
        long m2716getNeutralVariant600d7_KjU = tonalPalette.m2716getNeutralVariant600d7_KjU();
        long m2711getNeutralVariant300d7_KjU2 = tonalPalette.m2711getNeutralVariant300d7_KjU();
        long m2703getNeutralVariant00d7_KjU = tonalPalette.m2703getNeutralVariant00d7_KjU();
        long m2710getNeutralVariant240d7_KjU = tonalPalette.m2710getNeutralVariant240d7_KjU();
        long m2715getNeutralVariant60d7_KjU3 = tonalPalette.m2715getNeutralVariant60d7_KjU();
        return ColorSchemeKt.m1803darkColorScheme_VG5OTI$default(m2736getPrimary800d7_KjU, m2730getPrimary200d7_KjU, m2731getPrimary300d7_KjU, m2737getPrimary900d7_KjU, m2732getPrimary400d7_KjU, m2749getSecondary800d7_KjU, m2743getSecondary200d7_KjU, m2744getSecondary300d7_KjU, m2750getSecondary900d7_KjU, m2762getTertiary800d7_KjU, m2756getTertiary200d7_KjU, m2757getTertiary300d7_KjU, m2763getTertiary900d7_KjU, m2715getNeutralVariant60d7_KjU, m2720getNeutralVariant900d7_KjU, m2715getNeutralVariant60d7_KjU2, m2720getNeutralVariant900d7_KjU2, m2711getNeutralVariant300d7_KjU, m2718getNeutralVariant800d7_KjU, tonalPalette.m2736getPrimary800d7_KjU(), m2720getNeutralVariant900d7_KjU3, m2708getNeutralVariant200d7_KjU, 0L, 0L, 0L, 0L, m2716getNeutralVariant600d7_KjU, m2711getNeutralVariant300d7_KjU2, m2703getNeutralVariant00d7_KjU, m2710getNeutralVariant240d7_KjU, tonalPalette.m2706getNeutralVariant120d7_KjU(), tonalPalette.m2707getNeutralVariant170d7_KjU(), tonalPalette.m2709getNeutralVariant220d7_KjU(), tonalPalette.m2704getNeutralVariant100d7_KjU(), tonalPalette.m2712getNeutralVariant40d7_KjU(), m2715getNeutralVariant60d7_KjU3, tonalPalette.m2737getPrimary900d7_KjU(), tonalPalette.m2736getPrimary800d7_KjU(), tonalPalette.m2728getPrimary100d7_KjU(), tonalPalette.m2731getPrimary300d7_KjU(), tonalPalette.m2750getSecondary900d7_KjU(), tonalPalette.m2749getSecondary800d7_KjU(), tonalPalette.m2741getSecondary100d7_KjU(), tonalPalette.m2744getSecondary300d7_KjU(), tonalPalette.m2763getTertiary900d7_KjU(), tonalPalette.m2762getTertiary800d7_KjU(), tonalPalette.m2754getTertiary100d7_KjU(), tonalPalette.m2757getTertiary300d7_KjU(), 62914560, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long m1740getColorWaAFU9c = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long m1740getColorWaAFU9c2 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long m1740getColorWaAFU9c3 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long m1740getColorWaAFU9c4 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long m1740getColorWaAFU9c5 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_light);
        long m1740getColorWaAFU9c6 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long m1740getColorWaAFU9c7 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long m1740getColorWaAFU9c8 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long m1740getColorWaAFU9c9 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long m1740getColorWaAFU9c10 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long m1740getColorWaAFU9c11 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long m1740getColorWaAFU9c12 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long m1740getColorWaAFU9c13 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long m1740getColorWaAFU9c14 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_background_dark);
        long m1740getColorWaAFU9c15 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long m1740getColorWaAFU9c16 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long m1740getColorWaAFU9c17 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long m1740getColorWaAFU9c18 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long m1740getColorWaAFU9c19 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long m1740getColorWaAFU9c20 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_light);
        long m1740getColorWaAFU9c21 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long m1740getColorWaAFU9c22 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long m1740getColorWaAFU9c23 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long m1740getColorWaAFU9c24 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long m1740getColorWaAFU9c25 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m1803darkColorScheme_VG5OTI$default(m1740getColorWaAFU9c, m1740getColorWaAFU9c2, m1740getColorWaAFU9c3, m1740getColorWaAFU9c4, m1740getColorWaAFU9c5, m1740getColorWaAFU9c6, m1740getColorWaAFU9c7, m1740getColorWaAFU9c8, m1740getColorWaAFU9c9, m1740getColorWaAFU9c10, m1740getColorWaAFU9c11, m1740getColorWaAFU9c12, m1740getColorWaAFU9c13, m1740getColorWaAFU9c14, m1740getColorWaAFU9c15, m1740getColorWaAFU9c16, m1740getColorWaAFU9c17, m1740getColorWaAFU9c18, m1740getColorWaAFU9c19, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_dark), m1740getColorWaAFU9c20, m1740getColorWaAFU9c21, 0L, 0L, 0L, 0L, m1740getColorWaAFU9c22, m1740getColorWaAFU9c23, 0L, m1740getColorWaAFU9c24, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_dark), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), m1740getColorWaAFU9c25, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_fixed_variant), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_fixed_variant), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    public static final ColorScheme dynamicLightColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicLightColorScheme34(context) : dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long m2732getPrimary400d7_KjU = tonalPalette.m2732getPrimary400d7_KjU();
        long m2729getPrimary1000d7_KjU = tonalPalette.m2729getPrimary1000d7_KjU();
        long m2737getPrimary900d7_KjU = tonalPalette.m2737getPrimary900d7_KjU();
        long m2728getPrimary100d7_KjU = tonalPalette.m2728getPrimary100d7_KjU();
        long m2736getPrimary800d7_KjU = tonalPalette.m2736getPrimary800d7_KjU();
        long m2745getSecondary400d7_KjU = tonalPalette.m2745getSecondary400d7_KjU();
        long m2742getSecondary1000d7_KjU = tonalPalette.m2742getSecondary1000d7_KjU();
        long m2750getSecondary900d7_KjU = tonalPalette.m2750getSecondary900d7_KjU();
        long m2741getSecondary100d7_KjU = tonalPalette.m2741getSecondary100d7_KjU();
        long m2758getTertiary400d7_KjU = tonalPalette.m2758getTertiary400d7_KjU();
        long m2755getTertiary1000d7_KjU = tonalPalette.m2755getTertiary1000d7_KjU();
        long m2763getTertiary900d7_KjU = tonalPalette.m2763getTertiary900d7_KjU();
        long m2754getTertiary100d7_KjU = tonalPalette.m2754getTertiary100d7_KjU();
        long m2725getNeutralVariant980d7_KjU = tonalPalette.m2725getNeutralVariant980d7_KjU();
        long m2704getNeutralVariant100d7_KjU = tonalPalette.m2704getNeutralVariant100d7_KjU();
        long m2725getNeutralVariant980d7_KjU2 = tonalPalette.m2725getNeutralVariant980d7_KjU();
        long m2704getNeutralVariant100d7_KjU2 = tonalPalette.m2704getNeutralVariant100d7_KjU();
        long m2720getNeutralVariant900d7_KjU = tonalPalette.m2720getNeutralVariant900d7_KjU();
        long m2711getNeutralVariant300d7_KjU = tonalPalette.m2711getNeutralVariant300d7_KjU();
        long m2708getNeutralVariant200d7_KjU = tonalPalette.m2708getNeutralVariant200d7_KjU();
        long m2723getNeutralVariant950d7_KjU = tonalPalette.m2723getNeutralVariant950d7_KjU();
        long m2714getNeutralVariant500d7_KjU = tonalPalette.m2714getNeutralVariant500d7_KjU();
        long m2718getNeutralVariant800d7_KjU = tonalPalette.m2718getNeutralVariant800d7_KjU();
        long m2703getNeutralVariant00d7_KjU = tonalPalette.m2703getNeutralVariant00d7_KjU();
        long m2725getNeutralVariant980d7_KjU3 = tonalPalette.m2725getNeutralVariant980d7_KjU();
        long m2719getNeutralVariant870d7_KjU = tonalPalette.m2719getNeutralVariant870d7_KjU();
        return ColorSchemeKt.m1809lightColorScheme_VG5OTI$default(m2732getPrimary400d7_KjU, m2729getPrimary1000d7_KjU, m2737getPrimary900d7_KjU, m2728getPrimary100d7_KjU, m2736getPrimary800d7_KjU, m2745getSecondary400d7_KjU, m2742getSecondary1000d7_KjU, m2750getSecondary900d7_KjU, m2741getSecondary100d7_KjU, m2758getTertiary400d7_KjU, m2755getTertiary1000d7_KjU, m2763getTertiary900d7_KjU, m2754getTertiary100d7_KjU, m2725getNeutralVariant980d7_KjU, m2704getNeutralVariant100d7_KjU, m2725getNeutralVariant980d7_KjU2, m2704getNeutralVariant100d7_KjU2, m2720getNeutralVariant900d7_KjU, m2711getNeutralVariant300d7_KjU, tonalPalette.m2732getPrimary400d7_KjU(), m2708getNeutralVariant200d7_KjU, m2723getNeutralVariant950d7_KjU, 0L, 0L, 0L, 0L, m2714getNeutralVariant500d7_KjU, m2718getNeutralVariant800d7_KjU, m2703getNeutralVariant00d7_KjU, m2725getNeutralVariant980d7_KjU3, tonalPalette.m2722getNeutralVariant940d7_KjU(), tonalPalette.m2721getNeutralVariant920d7_KjU(), tonalPalette.m2720getNeutralVariant900d7_KjU(), tonalPalette.m2724getNeutralVariant960d7_KjU(), tonalPalette.m2705getNeutralVariant1000d7_KjU(), m2719getNeutralVariant870d7_KjU, tonalPalette.m2737getPrimary900d7_KjU(), tonalPalette.m2736getPrimary800d7_KjU(), tonalPalette.m2728getPrimary100d7_KjU(), tonalPalette.m2731getPrimary300d7_KjU(), tonalPalette.m2750getSecondary900d7_KjU(), tonalPalette.m2749getSecondary800d7_KjU(), tonalPalette.m2741getSecondary100d7_KjU(), tonalPalette.m2744getSecondary300d7_KjU(), tonalPalette.m2763getTertiary900d7_KjU(), tonalPalette.m2762getTertiary800d7_KjU(), tonalPalette.m2754getTertiary100d7_KjU(), tonalPalette.m2757getTertiary300d7_KjU(), 62914560, 0, null);
    }

    public static final ColorScheme dynamicLightColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long m1740getColorWaAFU9c = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_light);
        long m1740getColorWaAFU9c2 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long m1740getColorWaAFU9c3 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long m1740getColorWaAFU9c4 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long m1740getColorWaAFU9c5 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long m1740getColorWaAFU9c6 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long m1740getColorWaAFU9c7 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long m1740getColorWaAFU9c8 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long m1740getColorWaAFU9c9 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long m1740getColorWaAFU9c10 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long m1740getColorWaAFU9c11 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long m1740getColorWaAFU9c12 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long m1740getColorWaAFU9c13 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long m1740getColorWaAFU9c14 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_background_light);
        long m1740getColorWaAFU9c15 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long m1740getColorWaAFU9c16 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_light);
        long m1740getColorWaAFU9c17 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long m1740getColorWaAFU9c18 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long m1740getColorWaAFU9c19 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long m1740getColorWaAFU9c20 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long m1740getColorWaAFU9c21 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long m1740getColorWaAFU9c22 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_outline_light);
        long m1740getColorWaAFU9c23 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long m1740getColorWaAFU9c24 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long m1740getColorWaAFU9c25 = colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m1809lightColorScheme_VG5OTI$default(m1740getColorWaAFU9c, m1740getColorWaAFU9c2, m1740getColorWaAFU9c3, m1740getColorWaAFU9c4, m1740getColorWaAFU9c5, m1740getColorWaAFU9c6, m1740getColorWaAFU9c7, m1740getColorWaAFU9c8, m1740getColorWaAFU9c9, m1740getColorWaAFU9c10, m1740getColorWaAFU9c11, m1740getColorWaAFU9c12, m1740getColorWaAFU9c13, m1740getColorWaAFU9c14, m1740getColorWaAFU9c15, m1740getColorWaAFU9c16, m1740getColorWaAFU9c17, m1740getColorWaAFU9c18, m1740getColorWaAFU9c19, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_light), m1740getColorWaAFU9c20, m1740getColorWaAFU9c21, 0L, 0L, 0L, 0L, m1740getColorWaAFU9c22, m1740getColorWaAFU9c23, 0L, m1740getColorWaAFU9c24, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_light), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), m1740getColorWaAFU9c25, colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_primary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_primary_fixed_variant), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_secondary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_secondary_fixed_variant), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_tertiary_fixed_dim), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_fixed), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    public static final TonalPalette dynamicTonalPalette(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_0), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_10), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_50), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_100), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_200), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_300), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_400), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_500), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_700), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_800), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_900), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral1_1000), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_0), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_10), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_50), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_100), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_200), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_300), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_400), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_500), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_700), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_800), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_900), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m1946setLuminanceDxMtmZc(colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_neutral2_1000), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_0), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_10), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_50), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_100), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_200), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_300), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_400), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_500), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_600), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_700), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_800), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_900), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent1_1000), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_0), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_10), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_50), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_100), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_200), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_300), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_400), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_500), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_600), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_700), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_800), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_900), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent2_1000), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_0), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_10), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_50), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_100), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_200), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_300), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_400), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_500), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_600), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_700), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_800), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_900), colorResourceHelper.m1740getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    /* renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m1946setLuminanceDxMtmZc(long j, float f) {
        double d = f;
        if ((d < 1.0E-4d) || (d > 99.9999d)) {
            return ColorKt.Color(CamUtils.INSTANCE.argbFromLstar(d));
        }
        Cam.Companion companion = Cam.Companion;
        Cam fromInt = companion.fromInt(ColorKt.m4815toArgb8_81llA(j));
        return ColorKt.Color(companion.getInt(fromInt.getHue(), fromInt.getChroma(), f));
    }
}
