package androidx.compose.material3.internal;

import defpackage.j50;
import defpackage.k10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.year = i;
        this.month = i2;
        this.numberOfDays = i3;
        this.daysFromStartOfWeekToFirstOfMonth = i4;
        this.startUtcTimeMillis = j;
        this.endUtcTimeMillis = ((i3 * CalendarModelKt.MillisecondsIn24Hours) + j) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i, int i2, int i3, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = calendarMonth.year;
        }
        if ((i5 & 2) != 0) {
            i2 = calendarMonth.month;
        }
        if ((i5 & 4) != 0) {
            i3 = calendarMonth.numberOfDays;
        }
        if ((i5 & 8) != 0) {
            i4 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        if ((i5 & 16) != 0) {
            j = calendarMonth.startUtcTimeMillis;
        }
        long j2 = j;
        return calendarMonth.copy(i, i2, i3, i4, j2);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.numberOfDays;
    }

    public final int component4() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long component5() {
        return this.startUtcTimeMillis;
    }

    public final CalendarMonth copy(int i, int i2, int i3, int i4, long j) {
        return new CalendarMonth(i, i2, i3, i4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Long.hashCode(this.startUtcTimeMillis) + j50.b(this.daysFromStartOfWeekToFirstOfMonth, j50.b(this.numberOfDays, j50.b(this.month, Integer.hashCode(this.year) * 31, 31), 31), 31);
    }

    public final int indexIn(k10 k10Var) {
        return (((this.year - k10Var.d) * 12) + this.month) - 1;
    }

    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }
}
