package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        return new PlatformTypefacesApi28();
    }

    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if (6 <= weight && weight < 8) {
            return str;
        }
        if (8 > weight || weight >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
    }
}
