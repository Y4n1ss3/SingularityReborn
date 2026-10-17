package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import defpackage.bq;
import defpackage.hm;
import defpackage.k10;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatePickerKt$HorizontalMonthsList$2$1 extends us0 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ ky $onDisplayedMonthChange;
    final /* synthetic */ k10 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(LazyListState lazyListState, ky kyVar, CalendarModel calendarModel, k10 k10Var, hm hmVar) {
        super(2, hmVar);
        this.$lazyListState = lazyListState;
        this.$onDisplayedMonthChange = kyVar;
        this.$calendarModel = calendarModel;
        this.$yearRange = k10Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyListState lazyListState = this.$lazyListState;
            ky kyVar = this.$onDisplayedMonthChange;
            CalendarModel calendarModel = this.$calendarModel;
            k10 k10Var = this.$yearRange;
            this.label = 1;
            Object updateDisplayedMonth = DatePickerKt.updateDisplayedMonth(lazyListState, kyVar, calendarModel, k10Var, this);
            vn vnVar = vn.d;
            if (updateDisplayedMonth == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
