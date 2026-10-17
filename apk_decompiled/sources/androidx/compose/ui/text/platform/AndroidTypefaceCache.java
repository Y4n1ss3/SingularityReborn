package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import defpackage.aq0;
import defpackage.er;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final aq0 cache = new aq0();
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    private final String getKey(Context context, Font font) {
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            o.e(font, "Unknown font type: ");
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        CharSequence charSequence = typedValue.string;
        String obj = charSequence != null ? charSequence.toString() : null;
        obj.getClass();
        return "res:".concat(obj);
    }

    public final Typeface getOrCreate(Context context, Font font) {
        Typeface loadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = (Typeface) cache.b(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            loadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
        } else {
            if (!(font instanceof AndroidFont)) {
                o.e(font, "Unknown font type: ");
                return null;
            }
            AndroidFont androidFont = (AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (loadBlocking == null) {
            o.e(font, "Unable to load font ");
            return null;
        }
        if (key != null) {
            cache.d(key, loadBlocking);
        }
        return loadBlocking;
    }
}
