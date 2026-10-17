package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.FocusRequester;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements my {
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

    public /* synthetic */ mk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.l = obj7;
        this.m = obj8;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$6;
        w01 DateInputContent$lambda$3;
        int i = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                invoke$lambda$6 = ComposableLambdaImpl.invoke$lambda$6((ComposableLambdaImpl) obj3, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.e, (Composer) obj, intValue);
                return invoke$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                DateInputContent$lambda$3 = DateInputKt.DateInputContent$lambda$3((Long) obj3, (ky) this.g, (CalendarModel) this.h, (k10) this.i, (DatePickerFormatter) this.j, (SelectableDates) this.k, (DatePickerColors) this.l, (FocusRequester) this.m, this.e, (Composer) obj, intValue2);
                return DateInputContent$lambda$3;
        }
    }
}
