package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m7124getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i) {
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0, FontStyle.m7172equalsimpl0(i, FontStyle.Companion.m7178getItalic_LCdwA()));
    }
}
