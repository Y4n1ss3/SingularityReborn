package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface typeface;

    public AndroidTypefaceWrapper(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo7313getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        return this.typeface;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }
}
