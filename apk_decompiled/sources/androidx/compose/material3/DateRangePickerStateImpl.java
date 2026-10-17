package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.k10;
import defpackage.vp;
import defpackage.y80;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedEndDate;
    private MutableState<CalendarDate> _selectedStartDate;

    private DateRangePickerStateImpl(Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        super(l3, k10Var, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l, l2);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1923boximpl(i), null, 2, null);
    }

    private final CalendarDate getDate(Long l) {
        if (l != null) {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l.longValue());
            if (getYearRange().a(canonicalDate.getYear())) {
                return canonicalDate;
            }
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo1909getDisplayModejFl4v0() {
        return this._displayMode.getValue().m1929unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo1910setDisplayModevCnGnXg(int i) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m1923boximpl(i));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(Long l, Long l2) {
        CalendarDate date = getDate(l);
        CalendarDate date2 = getDate(l2);
        if (date == null || (date2 != null && date.getUtcTimeMillis() > date2.getUtcTimeMillis())) {
            this._selectedStartDate.setValue(null);
            this._selectedEndDate.setValue(null);
        } else {
            this._selectedStartDate.setValue(date);
            this._selectedEndDate.setValue(date2);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, DateRangePickerStateImpl dateRangePickerStateImpl) {
            return y80.E(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().d), Integer.valueOf(dateRangePickerStateImpl.getYearRange().e), Integer.valueOf(dateRangePickerStateImpl.mo1909getDisplayModejFl4v0()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DateRangePickerStateImpl Saver$lambda$1(SelectableDates selectableDates, Locale locale, List list) {
            Long l = (Long) list.get(0);
            Long l2 = (Long) list.get(1);
            Long l3 = (Long) list.get(2);
            Object obj = list.get(3);
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(4);
            obj2.getClass();
            k10 k10Var = new k10(intValue, ((Integer) obj2).intValue(), 1);
            Object obj3 = list.get(5);
            obj3.getClass();
            return new DateRangePickerStateImpl(l, l2, l3, k10Var, DisplayMode.m1924constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
        }

        public final Saver<DateRangePickerStateImpl, Object> Saver(SelectableDates selectableDates, Locale locale) {
            return ListSaverKt.listSaver(new c(2), new vp(selectableDates, locale, 1));
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateRangePickerStateImpl(Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, Locale locale, dq dqVar) {
        this(l, l2, l3, k10Var, i, selectableDates, locale);
    }
}
