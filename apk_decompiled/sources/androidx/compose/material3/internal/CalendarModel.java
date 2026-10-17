package androidx.compose.material3.internal;

import defpackage.lu0;
import defpackage.xe0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class CalendarModel {
    public static final int $stable = 8;
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final Locale locale;

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
            return null;
        }
        if ((i & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel calendarModel, Locale locale, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getDateInputFormat");
            return null;
        }
        if ((i & 1) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.getDateInputFormat(locale);
    }

    public abstract String formatWithPattern(long j, String str, Locale locale);

    public final String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarMonth.getStartUtcTimeMillis(), str, locale, this.formatterCache);
    }

    public abstract CalendarDate getCanonicalDate(long j);

    public abstract DateInputFormat getDateInputFormat(Locale locale);

    public abstract int getDayOfWeek(CalendarDate calendarDate);

    public abstract int getFirstDayOfWeek();

    public final Map<String, Object> getFormatterCache$material3() {
        return this.formatterCache;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public abstract CalendarMonth getMonth(int i, int i2);

    public abstract CalendarMonth getMonth(long j);

    public abstract CalendarMonth getMonth(CalendarDate calendarDate);

    public abstract CalendarDate getToday();

    public abstract List<xe0> getWeekdayNames();

    public abstract CalendarMonth minusMonths(CalendarMonth calendarMonth, int i);

    public abstract CalendarDate parse(String str, String str2, Locale locale);

    public abstract CalendarMonth plusMonths(CalendarMonth calendarMonth, int i);

    public final String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarDate.getUtcTimeMillis(), str, locale, this.formatterCache);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
            return null;
        }
        if ((i & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }
}
