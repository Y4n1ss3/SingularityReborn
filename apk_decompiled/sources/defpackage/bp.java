package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bp implements iy {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bp(int i, un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.e = i;
        this.g = sharedPreferences;
        this.h = unVar;
        this.j = mutableState;
        this.i = context;
        this.f = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        MutableState DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8;
        DatePickerStateImpl rememberDatePickerState_EU0dCGE$lambda$5$lambda$4;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.i;
        Object obj3 = this.j;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8 = DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8((DateInputValidator) obj5, (CalendarModel) obj4, (DateInputFormat) obj2, (Locale) obj, this.e, (MutableState) obj3);
                return DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8;
            case 1:
                rememberDatePickerState_EU0dCGE$lambda$5$lambda$4 = DatePickerKt.rememberDatePickerState_EU0dCGE$lambda$5$lambda$4((Long) obj5, (Long) obj4, (k10) obj2, this.e, (SelectableDates) obj3, (Locale) obj);
                return rememberDatePickerState_EU0dCGE$lambda$5$lambda$4;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                MutableState mutableState = (MutableState) obj3;
                int intValue = ((Number) mutableState.getValue()).intValue();
                int i2 = this.e;
                mutableState.setValue(Integer.valueOf(i2));
                sharedPreferences.edit().putInt("fps_target", i2).apply();
                nq nqVar = nr.a;
                p01.t((un) obj4, hq.d, null, new hz0((Context) obj2, i2, (ky) obj, intValue, sharedPreferences, mutableState, null), 2);
                return w01.a;
        }
    }

    public /* synthetic */ bp(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i, MutableState mutableState) {
        this.g = dateInputValidator;
        this.h = calendarModel;
        this.i = dateInputFormat;
        this.f = locale;
        this.e = i;
        this.j = mutableState;
    }

    public /* synthetic */ bp(Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        this.g = l;
        this.h = l2;
        this.i = k10Var;
        this.e = i;
        this.j = selectableDates;
        this.f = locale;
    }
}
