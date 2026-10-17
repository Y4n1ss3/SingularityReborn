package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final String capitalize(String str, LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String decapitalize(String str, LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toLowerCase(String str, LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toUpperCase(String str, LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String capitalize(String str, Locale locale) {
        return stringDelegate.capitalize(str, locale);
    }

    public static final String decapitalize(String str, Locale locale) {
        return stringDelegate.decapitalize(str, locale);
    }

    public static final String toLowerCase(String str, Locale locale) {
        return stringDelegate.toLowerCase(str, locale);
    }

    public static final String toUpperCase(String str, Locale locale) {
        return stringDelegate.toUpperCase(str, locale);
    }
}
