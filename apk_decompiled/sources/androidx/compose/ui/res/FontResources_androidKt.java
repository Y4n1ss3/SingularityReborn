package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import defpackage.er;
import defpackage.fb0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();
    private static final fb0 syncLoadedTypefaces = new fb0();

    @er
    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface fontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fontResourceFromContext;
    }

    @er
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            try {
                fb0 fb0Var = syncLoadedTypefaces;
                Object d = fb0Var.d(fontFamily);
                if (d == null) {
                    d = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    fb0Var.l(fontFamily, d);
                }
                typeface = (Typeface) d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typeface;
    }
}
