package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$1$1 extends us0 implements my {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ LazyListState $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$1(LazyListState lazyListState, int i, hm hmVar) {
        super(2, hmVar);
        this.$monthsListState = lazyListState;
        this.$monthIndex = i;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DatePickerKt$DatePickerContent$1$1(this.$monthsListState, this.$monthIndex, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DatePickerKt$DatePickerContent$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            if (!this.$monthsListState.isScrollInProgress()) {
                int firstVisibleItemIndex = this.$monthsListState.getFirstVisibleItemIndex();
                int i2 = this.$monthIndex;
                if (firstVisibleItemIndex != i2) {
                    LazyListState lazyListState = this.$monthsListState;
                    this.label = 1;
                    Object scrollToItem$default = LazyListState.scrollToItem$default(lazyListState, i2, 0, this, 2, null);
                    vn vnVar = vn.d;
                    if (scrollToItem$default == vnVar) {
                        return vnVar;
                    }
                }
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
