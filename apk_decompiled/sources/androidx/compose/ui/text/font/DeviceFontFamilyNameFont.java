package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m7165getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.m7138equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && q10.b(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m7172equalsimpl0(mo7125getStyle_LCdwA(), deviceFontFamilyNameFont.mo7125getStyle_LCdwA()) && q10.b(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo7125getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + ((FontStyle.m7173hashCodeimpl(mo7125getStyle_LCdwA()) + ((getWeight().hashCode() + (DeviceFontFamilyName.m7139hashCodeimpl(this.familyName) * 31)) * 31)) * 31);
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo7202optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo7125getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m7140toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m7174toStringimpl(mo7125getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, dq dqVar) {
        this(str, fontWeight, i, settings);
    }
}
