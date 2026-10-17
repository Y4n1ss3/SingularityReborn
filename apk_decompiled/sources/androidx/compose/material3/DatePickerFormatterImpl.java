package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import defpackage.q10;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DatePickerFormatterImpl implements DatePickerFormatter {
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final String selectedDateDescriptionSkeleton;
    private final String selectedDateSkeleton;
    private final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(String str, String str2, String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj;
        return q10.b(this.yearSelectionSkeleton, datePickerFormatterImpl.yearSelectionSkeleton) && q10.b(this.selectedDateSkeleton, datePickerFormatterImpl.selectedDateSkeleton) && q10.b(this.selectedDateDescriptionSkeleton, datePickerFormatterImpl.selectedDateDescriptionSkeleton);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatDate(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(l.longValue(), z ? this.selectedDateDescriptionSkeleton : this.selectedDateSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatMonthYear(Long l, Locale locale) {
        if (l == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(l.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public int hashCode() {
        return this.selectedDateDescriptionSkeleton.hashCode() + ((this.selectedDateSkeleton.hashCode() + (this.yearSelectionSkeleton.hashCode() * 31)) * 31);
    }
}
