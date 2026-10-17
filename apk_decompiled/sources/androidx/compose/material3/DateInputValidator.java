package androidx.compose.material3;

import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import defpackage.k10;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final k10 yearRange;

    public DateInputValidator(k10 k10Var, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.yearRange = k10Var;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
    }

    public final Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    public final Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentEndDateMillis(Long l) {
        this.currentEndDateMillis = l;
    }

    public final void setCurrentStartDateMillis(Long l) {
        this.currentStartDateMillis = l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r0 <= (r2 != null ? r2.longValue() : androidx.compose.runtime.snapshots.SnapshotId_jvmKt.SnapshotIdMax)) goto L22;
     */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1850validateXivgLIo(CalendarDate calendarDate, int i, Locale locale) {
        if (calendarDate == null) {
            String str = this.errorDatePattern;
            String upperCase = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return Strings_androidKt.formatString(str, upperCase);
        }
        if (!this.yearRange.a(calendarDate.getYear())) {
            return Strings_androidKt.formatString(this.errorDateOutOfYearRange, CalendarLocale_jvmKt.toLocalString$default(this.yearRange.d, 0, 0, false, locale, 7, null), CalendarLocale_jvmKt.toLocalString$default(this.yearRange.e, 0, 0, false, locale, 7, null));
        }
        SelectableDates selectableDates = this.selectableDates;
        if (!selectableDates.isSelectableYear(calendarDate.getYear()) || !selectableDates.isSelectableDate(calendarDate.getUtcTimeMillis())) {
            return Strings_androidKt.formatString(this.errorInvalidNotAllowed, DatePickerFormatter.formatDate$default(this.dateFormatter, Long.valueOf(calendarDate.getUtcTimeMillis()), locale, false, 4, null));
        }
        InputIdentifier.Companion companion = InputIdentifier.Companion;
        if (InputIdentifier.m2081equalsimpl0(i, companion.m2087getStartDateInputJ2x2o4M())) {
            long utcTimeMillis = calendarDate.getUtcTimeMillis();
            Long l = this.currentEndDateMillis;
        }
        if (!InputIdentifier.m2081equalsimpl0(i, companion.m2085getEndDateInputJ2x2o4M())) {
            return "";
        }
        long utcTimeMillis2 = calendarDate.getUtcTimeMillis();
        Long l2 = this.currentStartDateMillis;
        if (utcTimeMillis2 >= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
            return "";
        }
        return this.errorInvalidRangeInput;
    }
}
