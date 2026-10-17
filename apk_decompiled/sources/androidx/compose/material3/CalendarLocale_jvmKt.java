package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalendarLocale_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    private static final NumberFormat getCachedDateTimeFormatter(int i, int i2, boolean z, Locale locale) {
        String str = i + '.' + i2 + '.' + z + '.' + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat numberFormat = weakHashMap.get(str);
        if (numberFormat == null) {
            numberFormat = NumberFormat.getIntegerInstance(locale);
            numberFormat.setGroupingUsed(z);
            numberFormat.setMinimumIntegerDigits(i);
            numberFormat.setMaximumIntegerDigits(i2);
            weakHashMap.put(str, numberFormat);
        }
        return numberFormat;
    }

    public static final String toLocalString(int i, int i2, int i3, boolean z, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return getCachedDateTimeFormatter(i2, i3, z, locale).format(Integer.valueOf(i));
    }

    public static /* synthetic */ String toLocalString$default(int i, int i2, int i3, boolean z, Locale locale, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 1;
        }
        if ((i4 & 2) != 0) {
            i3 = 40;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            locale = null;
        }
        return toLocalString(i, i2, i3, z, locale);
    }
}
