package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.TypefaceResult;
import defpackage.dq;
import defpackage.g;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.px;
import defpackage.qo;
import defpackage.vn;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;
    private final ky createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, dq dqVar) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createDefaultTypeface$lambda$0(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        return fontFamilyResolverImpl.resolve(TypefaceRequest.m7214copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypefaceResult preload$lambda$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        TypefaceResult resolve = fontFamilyResolverImpl.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, new qo(26), fontFamilyResolverImpl.createDefaultTypeface);
        if (resolve != null) {
            return resolve;
        }
        TypefaceResult resolve2 = fontFamilyResolverImpl.platformFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, new qo(27), fontFamilyResolverImpl.createDefaultTypeface);
        if (resolve2 != null) {
            return resolve2;
        }
        o.f("Could not load font");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 preload$lambda$1$0(TypefaceResult.Immutable immutable) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 preload$lambda$1$1(TypefaceResult.Immutable immutable) {
        return w01.a;
    }

    private final State<Object> resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new g(20, this, typefaceRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypefaceResult resolve$lambda$0(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest, ky kyVar) {
        TypefaceResult resolve = fontFamilyResolverImpl.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, kyVar, fontFamilyResolverImpl.createDefaultTypeface);
        if (resolve != null) {
            return resolve;
        }
        TypefaceResult resolve2 = fontFamilyResolverImpl.platformFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, kyVar, fontFamilyResolverImpl.createDefaultTypeface);
        if (resolve2 != null) {
            return resolve2;
        }
        o.f("Could not load font");
        return null;
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[LOOP:0: B:11:0x0060->B:12:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object preload(FontFamily fontFamily, hm hmVar) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        int i;
        int size;
        int i2;
        if (hmVar instanceof FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (FontFamilyResolverImpl$preload$1) hmVar;
            int i3 = fontFamilyResolverImpl$preload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = fontFamilyResolverImpl$preload$1.result;
                i = fontFamilyResolverImpl$preload$1.label;
                w01 w01Var = w01.a;
                int i4 = 1;
                if (i != 0) {
                    p10.Q(obj);
                    if (!(fontFamily instanceof FontListFontFamily)) {
                        return w01Var;
                    }
                    FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
                    PlatformFontLoader platformFontLoader = this.platformFontLoader;
                    fontFamilyResolverImpl$preload$1.L$0 = fontFamily;
                    fontFamilyResolverImpl$preload$1.label = 1;
                    Object preload = fontListFontFamilyTypefaceAdapter.preload(fontFamily, platformFontLoader, fontFamilyResolverImpl$preload$1);
                    vn vnVar = vn.d;
                    if (preload == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fontFamily = (FontFamily) fontFamilyResolverImpl$preload$1.L$0;
                    p10.Q(obj);
                }
                List<Font> fonts = ((FontListFontFamily) fontFamily).getFonts();
                ArrayList arrayList = new ArrayList(fonts.size());
                size = fonts.size();
                for (i2 = 0; i2 < size; i2++) {
                    Font font = fonts.get(i2);
                    arrayList.add(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(font.getWeight()), this.platformResolveInterceptor.m7198interceptFontStyleT2F_aPo(font.mo7125getStyle_LCdwA()), FontSynthesis.Companion.m7189getAllGVVA2EU(), this.platformFontLoader.getCacheKey(), null));
                }
                this.typefaceRequestCache.preWarmCache(arrayList, new px(this, i4));
                return w01Var;
            }
        }
        fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, hmVar);
        Object obj2 = fontFamilyResolverImpl$preload$1.result;
        i = fontFamilyResolverImpl$preload$1.label;
        w01 w01Var2 = w01.a;
        int i42 = 1;
        if (i != 0) {
        }
        List<Font> fonts2 = ((FontListFontFamily) fontFamily).getFonts();
        ArrayList arrayList2 = new ArrayList(fonts2.size());
        size = fonts2.size();
        while (i2 < size) {
        }
        this.typefaceRequestCache.preWarmCache(arrayList2, new px(this, i42));
        return w01Var2;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo7145resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m7198interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.m7199interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), null));
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new px(this, 0);
    }
}
