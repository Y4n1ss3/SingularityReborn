package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m7206createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m7172equalsimpl0(i, companion.m7179getNormal_LCdwA()) && q10.b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m7172equalsimpl0(i, companion.m7178getItalic_LCdwA()));
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m7207createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m7206createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m7208loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m7206createAndroidTypefaceApi28RetOiIg = m7206createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
        if (q10.b(m7206createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m7172equalsimpl0(i, FontStyle.Companion.m7178getItalic_LCdwA()))) || q10.b(m7206createAndroidTypefaceApi28RetOiIg, m7206createAndroidTypefaceApi28RetOiIg(null, fontWeight, i))) {
            return null;
        }
        return m7206createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo7200createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m7206createAndroidTypefaceApi28RetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo7201createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        return m7206createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo7202optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(q10.b(str, companion.getSansSerif().getName()) ? mo7201createNamedRetOiIg(companion.getSansSerif(), fontWeight, i) : q10.b(str, companion.getSerif().getName()) ? mo7201createNamedRetOiIg(companion.getSerif(), fontWeight, i) : q10.b(str, companion.getMonospace().getName()) ? mo7201createNamedRetOiIg(companion.getMonospace(), fontWeight, i) : q10.b(str, companion.getCursive().getName()) ? mo7201createNamedRetOiIg(companion.getCursive(), fontWeight, i) : m7208loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i), settings, context);
    }
}
