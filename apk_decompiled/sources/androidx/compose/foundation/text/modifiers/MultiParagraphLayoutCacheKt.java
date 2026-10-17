package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m1464timesNB67dxo(long j, long j2) {
        if (!TextUnit.m7807isEmimpl(j2)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m7812toStringimpl(j2)) + '.');
        }
        if (TextUnit.m7807isEmimpl(j)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m7812toStringimpl(j2)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m7803getRawTypeimpl(j) != 0) {
            float m7805getValueimpl = TextUnit.m7805getValueimpl(j2);
            TextUnitKt.m7818checkArithmeticR2X_6o(j);
            return TextUnitKt.pack(TextUnit.m7803getRawTypeimpl(j), TextUnit.m7805getValueimpl(j) * m7805getValueimpl);
        }
        long j3 = DefaultFontSize;
        float m7805getValueimpl2 = TextUnit.m7805getValueimpl(j2);
        TextUnitKt.m7818checkArithmeticR2X_6o(j3);
        return TextUnitKt.pack(TextUnit.m7803getRawTypeimpl(j3), TextUnit.m7805getValueimpl(j3) * m7805getValueimpl2);
    }
}
