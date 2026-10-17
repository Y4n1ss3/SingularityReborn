package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7194synthesizeTypefaceFxwP2eA(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        boolean z;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if (FontSynthesis.m7186isWeightOnimpl$ui_text(i) && !q10.b(font.getWeight(), fontWeight)) {
            FontWeight.Companion companion = FontWeight.Companion;
            if (fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) < 0) {
                z = true;
                if (FontSynthesis.m7185isStyleOnimpl$ui_text(i) && !FontStyle.m7172equalsimpl0(i2, font.mo7125getStyle_LCdwA())) {
                    z2 = true;
                }
                if (!z2 || z) {
                    return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, !z ? fontWeight.getWeight() : font.getWeight().getWeight(), !z2 ? FontStyle.m7172equalsimpl0(i2, FontStyle.Companion.m7178getItalic_LCdwA()) : FontStyle.m7172equalsimpl0(font.mo7125getStyle_LCdwA(), FontStyle.Companion.m7178getItalic_LCdwA()));
                }
                return obj;
            }
        }
        z = false;
        if (FontSynthesis.m7185isStyleOnimpl$ui_text(i)) {
            z2 = true;
        }
        if (z2) {
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, !z ? fontWeight.getWeight() : font.getWeight().getWeight(), !z2 ? FontStyle.m7172equalsimpl0(i2, FontStyle.Companion.m7178getItalic_LCdwA()) : FontStyle.m7172equalsimpl0(font.mo7125getStyle_LCdwA(), FontStyle.Companion.m7178getItalic_LCdwA()));
    }
}
