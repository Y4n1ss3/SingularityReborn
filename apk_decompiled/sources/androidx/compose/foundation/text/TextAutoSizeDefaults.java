package androidx.compose.foundation.text;

import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;
    public static final TextAutoSizeDefaults INSTANCE = new TextAutoSizeDefaults();
    private static final long MinFontSize = TextUnitKt.getSp(12);
    private static final long MaxFontSize = TextUnitKt.getSp(112);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m1160getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m1161getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }
}
