package androidx.compose.ui.text.font;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text() {
            return Default;
        }
    }

    default FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    default int m7198interceptFontStyleT2F_aPo(int i) {
        return i;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    default int m7199interceptFontSynthesisMscr08Y(int i) {
        return i;
    }

    default FontWeight interceptFontWeight(FontWeight fontWeight) {
        return fontWeight;
    }
}
