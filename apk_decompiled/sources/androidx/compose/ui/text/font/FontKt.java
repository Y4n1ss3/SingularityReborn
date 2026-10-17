package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontKt {
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m7148FontF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m7149FontF3nL8kk$default(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m7164getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = FontVariation.INSTANCE.m7195Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m7148FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    @er
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m7150FontRetOiIg(int i, FontWeight fontWeight, int i2) {
        return new ResourceFont(i, fontWeight, i2, null, FontLoadingStrategy.Companion.m7164getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m7151FontRetOiIg$default(int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        return m7150FontRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m7152FontYpTlLL0(int i, FontWeight fontWeight, int i2, int i3) {
        return new ResourceFont(i, fontWeight, i2, new FontVariation.Settings(new FontVariation.Setting[0]), i3, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m7153FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m7164getBlockingPKNRLFQ();
        }
        return m7152FontYpTlLL0(i, fontWeight, i2, i3);
    }

    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
