package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, ky kyVar, ky kyVar2) {
        android.graphics.Typeface mo7200createDefaultFO1MlWM;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            mo7200createDefaultFO1MlWM = this.platformTypefaceResolver.mo7200createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            mo7200createDefaultFO1MlWM = this.platformTypefaceResolver.mo7201createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            typeface.getClass();
            mo7200createDefaultFO1MlWM = ((AndroidTypeface) typeface).mo7313getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA(), typefaceRequest.m7219getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(mo7200createDefaultFO1MlWM, false, 2, null);
    }
}
