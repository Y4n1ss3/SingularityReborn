package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.dq;
import defpackage.er;
import defpackage.fb0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion(null);
    private static fb0 cache = new fb0();
    private static final SynchronizedObject lock = new SynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @er
    public Object load(Font font) {
        return FontFamily.Resolver.m7144resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo7125getStyle_LCdwA(), 0, 8, null).getValue();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = (Font.ResourceLoader) companion.getCache().d(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                companion.getCache().l(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public final fb0 getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(fb0 fb0Var) {
            DeprecatedBridgeFontResourceLoader.cache = fb0Var;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, dq dqVar) {
        this(resolver);
    }
}
