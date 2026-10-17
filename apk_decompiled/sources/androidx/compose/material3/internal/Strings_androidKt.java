package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Strings_androidKt {
    public static final String formatString(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m2983getString2EP1pXo(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907677715, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    /* renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m2984getStringqBjtwXw(int i, Object[] objArr, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String m2983getString2EP1pXo = m2983getString2EP1pXo(i, composer, i2 & 14);
        Locale locale = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, m2983getString2EP1pXo, Arrays.copyOf(copyOf, copyOf.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return format;
    }
}
