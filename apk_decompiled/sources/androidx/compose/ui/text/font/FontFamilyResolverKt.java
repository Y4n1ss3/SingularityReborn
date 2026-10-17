package androidx.compose.ui.text.font;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontFamilyResolverKt {
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }

    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }
}
