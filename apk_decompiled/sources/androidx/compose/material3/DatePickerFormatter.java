package androidx.compose.material3;

import defpackage.lu0;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DatePickerFormatter {
    static /* synthetic */ String formatDate$default(DatePickerFormatter datePickerFormatter, Long l, Locale locale, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: formatDate");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return datePickerFormatter.formatDate(l, locale, z);
    }

    String formatDate(Long l, Locale locale, boolean z);

    String formatMonthYear(Long l, Locale locale);
}
