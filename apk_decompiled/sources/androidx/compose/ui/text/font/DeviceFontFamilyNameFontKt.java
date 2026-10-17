package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m7142Fontvxs03AY(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new DeviceFontFamilyNameFont(str, fontWeight, i, settings, null);
    }

    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m7143Fontvxs03AY$default(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m7142Fontvxs03AY(str, fontWeight, i, settings);
    }
}
