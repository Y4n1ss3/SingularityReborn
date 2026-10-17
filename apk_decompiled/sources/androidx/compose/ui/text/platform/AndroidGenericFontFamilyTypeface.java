package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface create = Typeface.create(genericFontFamily.getName(), 0);
        create.getClass();
        this.nativeTypeface = create;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m7314buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i) {
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m7172equalsimpl0(i, FontStyle.Companion.m7178getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo7313getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        return m7314buildStyledTypefaceFO1MlWM(fontWeight, i);
    }
}
