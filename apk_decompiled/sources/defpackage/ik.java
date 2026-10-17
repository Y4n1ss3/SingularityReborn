package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ik(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.l = obj7;
        this.m = obj8;
        this.n = obj9;
        this.o = obj10;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$8;
        w01 VerticalMonthsList$lambda$15;
        int i = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                invoke$lambda$8 = ComposableLambdaImpl.invoke$lambda$8((ComposableLambdaImpl) obj3, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.e, (Composer) obj, intValue);
                return invoke$lambda$8;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                VerticalMonthsList$lambda$15 = DateRangePickerKt.VerticalMonthsList$lambda$15((LazyListState) obj3, (Long) this.g, (Long) this.h, (my) this.i, (ky) this.j, (CalendarModel) this.k, (k10) this.l, (DatePickerFormatter) this.m, (SelectableDates) this.n, (DatePickerColors) this.o, this.e, (Composer) obj, intValue2);
                return VerticalMonthsList$lambda$15;
        }
    }
}
