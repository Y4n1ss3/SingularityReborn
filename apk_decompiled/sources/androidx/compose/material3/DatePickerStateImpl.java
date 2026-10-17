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
public final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedDate;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r5.a(r3.getYear()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DatePickerStateImpl(Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        super(l2, k10Var, selectableDates, locale);
        CalendarDate calendarDate;
        if (l != null) {
            calendarDate = getCalendarModel().getCanonicalDate(l.longValue());
        }
        calendarDate = null;
        this._selectedDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calendarDate, null, 2, null);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1923boximpl(i), null, 2, null);
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo1891getDisplayModejFl4v0() {
        return this._displayMode.getValue().m1929unboximpl();
    }

    @Override // androidx.compose.material3.DatePickerState
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo1892setDisplayModevCnGnXg(int i) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m1923boximpl(i));
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(Long l) {
        if (l == null) {
            this._selectedDate.setValue(null);
        } else {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l.longValue());
            this._selectedDate.setValue(getYearRange().a(canonicalDate.getYear()) ? canonicalDate : null);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, DatePickerStateImpl datePickerStateImpl) {
            return y80.E(datePickerStateImpl.getSelectedDateMillis(), Long.valueOf(datePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(datePickerStateImpl.getYearRange().d), Integer.valueOf(datePickerStateImpl.getYearRange().e), Integer.valueOf(datePickerStateImpl.mo1891getDisplayModejFl4v0()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatePickerStateImpl Saver$lambda$1(SelectableDates selectableDates, Locale locale, List list) {
            Long l = (Long) list.get(0);
            Long l2 = (Long) list.get(1);
            Object obj = list.get(2);
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(3);
            obj2.getClass();
            k10 k10Var = new k10(intValue, ((Integer) obj2).intValue(), 1);
            Object obj3 = list.get(4);
            obj3.getClass();
            return new DatePickerStateImpl(l, l2, k10Var, DisplayMode.m1924constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
        }

        public final Saver<DatePickerStateImpl, Object> Saver(SelectableDates selectableDates, Locale locale) {
            return ListSaverKt.listSaver(new c(1), new vp(selectableDates, locale, 0));
        }

        private Companion() {
        }
    }

    public /* synthetic */ DatePickerStateImpl(Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, Locale locale, dq dqVar) {
        this(l, l2, k10Var, i, selectableDates, locale);
    }
}
