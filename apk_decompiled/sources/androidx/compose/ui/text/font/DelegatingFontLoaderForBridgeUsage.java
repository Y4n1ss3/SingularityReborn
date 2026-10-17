package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey = new Object();
    private final Context context;
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(Font.ResourceLoader resourceLoader, Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, hm hmVar) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, hmVar);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
