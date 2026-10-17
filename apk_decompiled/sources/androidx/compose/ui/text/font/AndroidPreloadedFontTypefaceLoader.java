package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, hm hmVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont = androidFont instanceof AndroidPreloadedFont ? (AndroidPreloadedFont) androidFont : null;
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.loadCached$ui_text(context);
        }
        return null;
    }
}
