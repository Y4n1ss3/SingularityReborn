package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.Font;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey = new Object();
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(Font.ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, hm hmVar) {
        return this.loader.load(font);
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
        return this.loader.load(font);
    }
}
