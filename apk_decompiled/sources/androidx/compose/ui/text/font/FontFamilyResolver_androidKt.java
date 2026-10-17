package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import defpackage.kn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context, kn knVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), knVar), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0), null, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m7146resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        State mo7145resolveDPcqOEQ = resolver.mo7145resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        mo7145resolveDPcqOEQ.getClass();
        return mo7145resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m7147resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.Companion.m7189getAllGVVA2EU();
        }
        return m7146resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i, i2);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }
}
