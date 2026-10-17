package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TimePickerKt$TimePickerTextField$2$1 extends us0 implements my {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i, FocusRequester focusRequester, hm hmVar) {
        super(2, hmVar);
        this.$state = timePickerState;
        this.$selection = i;
        this.$focusRequester = focusRequester;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TimePickerKt$TimePickerTextField$2$1(this.$state, this.$selection, this.$focusRequester, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TimePickerKt$TimePickerTextField$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (TimePickerSelectionMode.m2673equalsimpl0(this.$state.mo1597getSelectionyecRtBI(), this.$selection)) {
            FocusRequester.m4419requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        }
        return w01.a;
    }
}
