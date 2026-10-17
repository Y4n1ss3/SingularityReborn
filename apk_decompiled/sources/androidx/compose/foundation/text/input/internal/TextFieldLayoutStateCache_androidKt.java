package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.style.TextDirection;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(Locale locale) {
        byte resolve = DigitDirectionalityApi28.INSTANCE.resolve(locale);
        return (resolve == 1 || resolve == 2) ? TextDirection.Companion.m7510getRtls_7Xco() : TextDirection.Companion.m7509getLtrs_7Xco();
    }
}
