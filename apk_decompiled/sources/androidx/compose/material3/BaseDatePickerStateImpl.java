package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.k10;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;
    private final MutableState<CalendarMonth> _displayedMonth;
    private final CalendarModel calendarModel;
    private final Locale locale;
    private final MutableState selectableDates$delegate;
    private final k10 yearRange;

    public BaseDatePickerStateImpl(Long l, k10 k10Var, SelectableDates selectableDates, Locale locale) {
        CalendarMonth month;
        this.yearRange = k10Var;
        this.locale = locale;
        CalendarModel createCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = createCalendarModel;
        this.selectableDates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l != null) {
            month = createCalendarModel.getMonth(l.longValue());
            if (!k10Var.a(month.getYear())) {
                month = createCalendarModel.getMonth(createCalendarModel.getToday());
            }
        } else {
            month = createCalendarModel.getMonth(createCalendarModel.getToday());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final SelectableDates getSelectableDates() {
        return (SelectableDates) this.selectableDates$delegate.getValue();
    }

    public final k10 getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayedMonthMillis(long j) {
        CalendarMonth month = this.calendarModel.getMonth(j);
        if (this.yearRange.a(month.getYear())) {
            this._displayedMonth.setValue(month);
        }
    }

    public final void setSelectableDates(SelectableDates selectableDates) {
        this.selectableDates$delegate.setValue(selectableDates);
    }
}
