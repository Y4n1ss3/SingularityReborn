package androidx.compose.foundation.text.input.internal;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DigitDirectionalityApi21 {
    public static final DigitDirectionalityApi21 INSTANCE = new DigitDirectionalityApi21();

    private DigitDirectionalityApi21() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
