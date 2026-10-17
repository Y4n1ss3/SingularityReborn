package defpackage;

import android.content.SharedPreferences;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import androidx.compose.runtime.MutableState;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class aq implements iy {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ aq(int i, SharedPreferences sharedPreferences, un unVar, MutableState mutableState, MutableState mutableState2, rw0 rw0Var, ky kyVar) {
        this.e = i;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = rw0Var;
        this.k = kyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        DateRangePickerStateImpl rememberDateRangePickerState_IlFM19s$lambda$5$lambda$4;
        int i = this.d;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                rememberDateRangePickerState_IlFM19s$lambda$5$lambda$4 = DateRangePickerKt.rememberDateRangePickerState_IlFM19s$lambda$5$lambda$4((Long) obj6, (Long) obj5, (Long) obj4, (k10) obj3, this.e, (SelectableDates) obj2, (Locale) obj);
                return rememberDateRangePickerState_IlFM19s$lambda$5$lambda$4;
            default:
                int i2 = this.e;
                ((MutableState) obj4).setValue(Integer.valueOf(i2));
                ((SharedPreferences) obj6).edit().putInt("charge_limit_target", i2).apply();
                ((MutableState) obj3).setValue(Boolean.FALSE);
                nq nqVar = nr.a;
                p01.t((un) obj5, hq.d, null, new mo((rw0) obj2, (ky) obj, i2, null), 2);
                return w01.a;
        }
    }

    public /* synthetic */ aq(Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = k10Var;
        this.e = i;
        this.j = selectableDates;
        this.k = locale;
    }
}
