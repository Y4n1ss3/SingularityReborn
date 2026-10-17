package androidx.compose.material3.internal;

import defpackage.ac;
import defpackage.dq;
import defpackage.m50;
import defpackage.xe0;
import defpackage.y80;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyCalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<xe0> weekdayNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        m50 o = y80.o();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List W = ac.W(2, weekdays);
        int size = W.size();
        for (int i = 0; i < size; i++) {
            o.add(new xe0((String) W.get(i), shortWeekdays[i + 2]));
        }
        o.add(new xe0(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = y80.d(o);
    }

    private final int dayInISO8601(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    private final CalendarMonth getMonth(Calendar calendar) {
        int dayInISO8601 = dayInISO8601(calendar.get(7)) - getFirstDayOfWeek();
        if (dayInISO8601 < 0) {
            dayInISO8601 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), dayInISO8601, calendar.getTimeInMillis());
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        return calendar;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long j, String str, Locale locale) {
        return Companion.formatWithPattern(j, str, locale, getFormatterCache$material3());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long j) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat getDateInputFormat(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate calendarDate) {
        return dayInISO8601(toCalendar(calendarDate, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public List<xe0> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i) {
        if (i <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, -i);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(parse);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i) {
        if (i <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, i);
        return getMonth(calendar);
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String str, Locale locale, Map<String, Object> map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        public final String formatWithPattern(long j, String str, Locale locale, Map<String, Object> map) {
            SimpleDateFormat cachedSimpleDateFormat = getCachedSimpleDateFormat(str, locale, map);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3());
            calendar.setTimeInMillis(j);
            return cachedSimpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone getUtcTimeZone$material3() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }

        private Companion() {
        }
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate calendarDate) {
        return getMonth(calendarDate.getYear(), calendarDate.getMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int i, int i2) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long j) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return getMonth(calendar);
    }
}
