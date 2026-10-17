package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class y90 {
    public static final MutableState a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorScheme a(Composer composer) {
        Integer num;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1537098700, 6, -1, "com.lumi.singularity.ui.theme.ModuleTheme.colorScheme (ModuleTheme.kt:106)");
        }
        x90 x90Var = (x90) a.getValue();
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
        if (x90Var != null && (num = x90Var.a) != null) {
            isSystemInDarkTheme = ColorKt.m4813luminance8_81llA(ColorKt.Color(num.intValue())) < 0.5f;
        }
        ColorScheme m1803darkColorScheme_VG5OTI$default = ((x90Var != null ? x90Var.a : null) != null || Build.VERSION.SDK_INT < 31) ? isSystemInDarkTheme ? ColorSchemeKt.m1803darkColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : ColorSchemeKt.m1809lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : isSystemInDarkTheme ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
        if (x90Var != null) {
            Integer num2 = x90Var.a;
            Color m4751boximpl = num2 != null ? Color.m4751boximpl(ColorKt.Color(num2.intValue())) : null;
            Integer num3 = x90Var.b;
            Color m4751boximpl2 = num3 != null ? Color.m4751boximpl(ColorKt.Color(num3.intValue())) : null;
            if (m4751boximpl != null) {
                long m4771unboximpl = m4751boximpl2 != null ? m4751boximpl2.m4771unboximpl() : b(m4751boximpl.m4771unboximpl());
                m1803darkColorScheme_VG5OTI$default = ColorScheme.m1743copy_VG5OTI$default(m1803darkColorScheme_VG5OTI$default, 0L, 0L, 0L, m4771unboximpl, 0L, 0L, 0L, 0L, m4771unboximpl, 0L, 0L, 0L, 0L, m4751boximpl.m4771unboximpl(), m4771unboximpl, m4751boximpl.m4771unboximpl(), m4771unboximpl, ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.12f), Color.m4760copywmQWz5c$default(m4771unboximpl, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.5f), ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.2f), 0L, 0L, 0L, ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.07f), ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.1f), ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.14f), ColorKt.m4812lerpjxsXWHM(m4751boximpl.m4771unboximpl(), m4771unboximpl, 0.04f), m4751boximpl.m4771unboximpl(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1945640695, 65520, null);
            } else if (m4751boximpl2 != null) {
                m1803darkColorScheme_VG5OTI$default = ColorScheme.m1743copy_VG5OTI$default(m1803darkColorScheme_VG5OTI$default, 0L, 0L, 0L, m4751boximpl2.m4771unboximpl(), 0L, 0L, 0L, 0L, m4751boximpl2.m4771unboximpl(), 0L, 0L, 0L, 0L, 0L, m4751boximpl2.m4771unboximpl(), 0L, m4751boximpl2.m4771unboximpl(), 0L, Color.m4760copywmQWz5c$default(m4751boximpl2.m4771unboximpl(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -344329, 65535, null);
            }
            ColorScheme colorScheme = m1803darkColorScheme_VG5OTI$default;
            Integer num4 = x90Var.c;
            if (num4 != null) {
                long Color = ColorKt.Color(num4.intValue());
                long m4771unboximpl2 = m4751boximpl != null ? m4751boximpl.m4771unboximpl() : colorScheme.m1747getBackground0d7_KjU();
                m1803darkColorScheme_VG5OTI$default = ColorScheme.m1743copy_VG5OTI$default(colorScheme, Color, b(Color), ColorKt.m4812lerpjxsXWHM(m4771unboximpl2, Color, 0.3f), 0L, Color, Color, b(Color), ColorKt.m4812lerpjxsXWHM(m4771unboximpl2, Color, 0.2f), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Color, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -524536, 65535, null);
            } else {
                m1803darkColorScheme_VG5OTI$default = colorScheme;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1803darkColorScheme_VG5OTI$default;
    }

    public static long b(long j) {
        return ColorKt.m4813luminance8_81llA(j) < 0.5f ? Color.Companion.m4798getWhite0d7_KjU() : Color.Companion.m4787getBlack0d7_KjU();
    }

    public static final Integer c(ContentResolver contentResolver, String str) {
        String obj;
        try {
            String string = Settings.Global.getString(contentResolver, str);
            if (string != null && (obj = ds0.E0(string).toString()) != null) {
                int parseInt = Integer.parseInt(obj);
                Integer valueOf = Integer.valueOf(parseInt);
                if (parseInt == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    return Integer.valueOf(valueOf.intValue() | (-16777216));
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(vu0 vu0Var) {
        Integer num;
        x90 x90Var = null;
        try {
            vu0Var.getPackageManager().getPackageInfo("com.lumi.uxpatcher", 0);
            ContentResolver contentResolver = vu0Var.getContentResolver();
            Integer c = c(contentResolver, "uxpatcher_bg_color");
            Integer c2 = c(contentResolver, "uxpatcher_text_color");
            Integer c3 = c(contentResolver, "uxpatcher_accent_color");
            x90 x90Var2 = new x90(c, c2, c3);
            if (c != null || c2 != null || c3 != null) {
                x90Var = x90Var2;
            }
        } catch (Exception unused) {
        }
        MutableState mutableState = a;
        if (!q10.b(x90Var, (x90) mutableState.getValue())) {
            mutableState.setValue(x90Var);
        }
        if (x90Var == null || (num = x90Var.a) == null) {
            return;
        }
        int intValue = num.intValue();
        Window window = vu0Var.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(intValue));
        window.setStatusBarColor(intValue);
        window.setNavigationBarColor(intValue);
        boolean z = ColorKt.m4813luminance8_81llA(ColorKt.Color(intValue)) > 0.5f;
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        p10 s31Var = i >= 35 ? new s31(window) : i >= 30 ? new r31(window) : new q31(window);
        s31Var.M(z);
        s31Var.L(z);
    }
}
