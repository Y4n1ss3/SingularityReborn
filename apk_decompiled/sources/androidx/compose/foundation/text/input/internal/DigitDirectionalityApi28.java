package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DigitDirectionalityApi28 {
    public static final DigitDirectionalityApi28 INSTANCE = new DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(CodepointHelpers_jvmKt.codePointAt(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
    }
}
