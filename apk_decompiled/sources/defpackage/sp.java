package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Long e;
    public final /* synthetic */ Long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ DatePickerFormatter i;
    public final /* synthetic */ SelectableDates j;
    public final /* synthetic */ DatePickerColors k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ sp(CalendarMonth calendarMonth, ky kyVar, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i) {
        this.m = calendarMonth;
        this.h = kyVar;
        this.g = j;
        this.e = l;
        this.f = l2;
        this.n = selectedRangeInfo;
        this.i = datePickerFormatter;
        this.j = selectableDates;
        this.k = datePickerColors;
        this.o = locale;
        this.l = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Month$lambda$59;
        w01 DateRangePickerContent$lambda$12;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Month$lambda$59 = DatePickerKt.Month$lambda$59((CalendarMonth) this.m, this.h, this.g, this.e, this.f, (SelectedRangeInfo) this.n, this.i, this.j, this.k, (Locale) this.o, this.l, (Composer) obj, intValue);
                return Month$lambda$59;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                DateRangePickerContent$lambda$12 = DateRangePickerKt.DateRangePickerContent$lambda$12(this.e, this.f, this.g, (my) this.m, this.h, (CalendarModel) this.n, (k10) this.o, this.i, this.j, this.k, this.l, (Composer) obj, intValue2);
                return DateRangePickerContent$lambda$12;
        }
    }

    public /* synthetic */ sp(Long l, Long l2, long j, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i) {
        this.e = l;
        this.f = l2;
        this.g = j;
        this.m = myVar;
        this.h = kyVar;
        this.n = calendarModel;
        this.o = k10Var;
        this.i = datePickerFormatter;
        this.j = selectableDates;
        this.k = datePickerColors;
        this.l = i;
    }
}
