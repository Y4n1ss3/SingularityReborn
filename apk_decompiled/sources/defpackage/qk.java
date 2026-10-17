package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangeInputKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements my {
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

    public /* synthetic */ qk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
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
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$7;
        w01 HorizontalMonthsList$lambda$42;
        w01 DateRangeInputContent$lambda$8;
        w01 SearchBarLayout$lambda$49;
        int i = this.d;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.g;
        Object obj11 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                invoke$lambda$7 = ComposableLambdaImpl.invoke$lambda$7((ComposableLambdaImpl) obj11, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.e, (Composer) obj, intValue);
                return invoke$lambda$7;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HorizontalMonthsList$lambda$42 = DatePickerKt.HorizontalMonthsList$lambda$42((LazyListState) obj11, (Long) obj10, (ky) obj9, (ky) obj8, (CalendarModel) obj7, (k10) obj6, (DatePickerFormatter) obj5, (SelectableDates) obj4, (DatePickerColors) obj3, this.e, (Composer) obj, intValue2);
                return HorizontalMonthsList$lambda$42;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                DateRangeInputContent$lambda$8 = DateRangeInputKt.DateRangeInputContent$lambda$8((Long) obj11, (Long) obj10, (my) obj9, (CalendarModel) obj8, (k10) obj7, (DatePickerFormatter) obj6, (SelectableDates) obj5, (DatePickerColors) obj4, (FocusRequester) obj3, this.e, (Composer) obj, intValue3);
                return DateRangeInputContent$lambda$8;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                SearchBarLayout$lambda$49 = SearchBarKt.SearchBarLayout$lambda$49((Animatable) obj11, (MutableFloatState) obj10, (MutableState) obj9, (MutableState) obj8, (Modifier) obj7, (WindowInsets) obj6, (my) obj5, (my) obj4, (my) obj3, this.e, (Composer) obj, intValue4);
                return SearchBarLayout$lambda$49;
        }
    }
}
