package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.k10;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ x(k10 k10Var, CalendarModel calendarModel, int i, int i2, ky kyVar, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.g = k10Var;
        this.h = calendarModel;
        this.e = i;
        this.f = i2;
        this.i = kyVar;
        this.j = selectableDates;
        this.k = datePickerColors;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 measure_3p2s80s$lambda$4;
        int i = this.d;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = DatePickerKt$YearPicker$1.invoke$lambda$1$lambda$0((k10) obj6, (CalendarModel) obj5, this.e, this.f, (ky) obj4, (SelectableDates) obj3, (DatePickerColors) obj2, (LazyGridScope) obj);
                return invoke$lambda$1$lambda$0;
            default:
                measure_3p2s80s$lambda$4 = TabKt$TabBaselineLayout$2$1.measure_3p2s80s$lambda$4((Placeable) obj6, (Placeable) obj5, (MeasureScope) obj4, this.e, this.f, (Integer) obj3, (Integer) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$4;
        }
    }

    public /* synthetic */ x(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i, int i2, Integer num, Integer num2) {
        this.g = placeable;
        this.h = placeable2;
        this.i = measureScope;
        this.e = i;
        this.f = i2;
        this.j = num;
        this.k = num2;
    }
}
