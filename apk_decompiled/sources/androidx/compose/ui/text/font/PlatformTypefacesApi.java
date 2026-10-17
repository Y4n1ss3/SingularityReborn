package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        if (FontStyle.m7172equalsimpl0(i, FontStyle.Companion.m7179getNormal_LCdwA()) && q10.b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m7124getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m7124getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(m7124getAndroidTypefaceStyleFO1MlWM) : android.graphics.Typeface.create(str, m7124getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m7204createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        return platformTypefacesApi.m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m7205loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg = m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        if (q10.b(m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m7124getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || q10.b(m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg, m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i))) {
            return null;
        }
        return m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo7200createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo7201createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        android.graphics.Typeface m7205loadNamedFromTypefaceCacheOrNullRetOiIg = m7205loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i);
        return m7205loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m7203createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i) : m7205loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo7202optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(q10.b(str, companion.getSansSerif().getName()) ? mo7201createNamedRetOiIg(companion.getSansSerif(), fontWeight, i) : q10.b(str, companion.getSerif().getName()) ? mo7201createNamedRetOiIg(companion.getSerif(), fontWeight, i) : q10.b(str, companion.getMonospace().getName()) ? mo7201createNamedRetOiIg(companion.getMonospace(), fontWeight, i) : q10.b(str, companion.getCursive().getName()) ? mo7201createNamedRetOiIg(companion.getCursive(), fontWeight, i) : m7205loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i), settings, context);
    }
}
