package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String str, Locale locale) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            java.util.Locale platformLocale = locale.getPlatformLocale();
            platformLocale.getClass();
            String valueOf2 = String.valueOf(charAt);
            valueOf2.getClass();
            valueOf = valueOf2.toUpperCase(platformLocale);
            valueOf.getClass();
            if (valueOf.length() <= 1) {
                String valueOf3 = String.valueOf(charAt);
                valueOf3.getClass();
                String upperCase = valueOf3.toUpperCase(java.util.Locale.ROOT);
                upperCase.getClass();
                if (valueOf.equals(upperCase)) {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String lowerCase = valueOf.substring(1).toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        java.util.Locale platformLocale = locale.getPlatformLocale();
        platformLocale.getClass();
        String valueOf = String.valueOf(charAt);
        valueOf.getClass();
        String lowerCase = valueOf.toLowerCase(platformLocale);
        lowerCase.getClass();
        sb.append((Object) lowerCase);
        sb.append(str.substring(1));
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale.getPlatformLocale());
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale.getPlatformLocale());
        upperCase.getClass();
        return upperCase;
    }
}
