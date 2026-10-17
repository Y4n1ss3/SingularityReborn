package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    android.graphics.Typeface mo7200createDefaultFO1MlWM(FontWeight fontWeight, int i);

    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    android.graphics.Typeface mo7201createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    android.graphics.Typeface mo7202optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context);
}
