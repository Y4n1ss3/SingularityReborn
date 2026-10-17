package androidx.compose.material3;

import androidx.compose.ui.node.Ref;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TimePickerKt$TimePicker$1$1 extends us0 implements my {
    final /* synthetic */ AnalogTimePickerState $analogState;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ Ref<Boolean> $userOverride;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePicker$1$1(Ref<Boolean> ref, AnalogTimePickerState analogTimePickerState, TimePickerState timePickerState, hm hmVar) {
        super(2, hmVar);
        this.$userOverride = ref;
        this.$analogState = analogTimePickerState;
        this.$state = timePickerState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TimePickerKt$TimePicker$1$1(this.$userOverride, this.$analogState, this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TimePickerKt$TimePicker$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        Boolean value = this.$userOverride.getValue();
        Boolean bool = Boolean.TRUE;
        if (q10.b(value, bool)) {
            this.$analogState.setHour(this.$state.getHour());
            this.$analogState.setMinute(this.$state.getMinute());
        }
        this.$userOverride.setValue(bool);
        return w01.a;
    }
}
