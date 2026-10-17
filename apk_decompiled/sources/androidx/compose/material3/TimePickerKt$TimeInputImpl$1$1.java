package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TimePickerKt$TimeInputImpl$1$1 extends us0 implements my {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ Ref<Boolean> $userOverride;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1(Ref<Boolean> ref, TimePickerState timePickerState, MutableState<TextFieldValue> mutableState, MutableState<TextFieldValue> mutableState2, hm hmVar) {
        super(2, hmVar);
        this.$userOverride = ref;
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
        this.$minuteValue$delegate = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TimePickerKt$TimeInputImpl$1$1(this.$userOverride, this.$state, this.$hourValue$delegate, this.$minuteValue$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TimePickerKt$TimeInputImpl$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        TextFieldValue TimeInputImpl$hourTextValue;
        TextFieldValue TimeInputImpl$minuteTextValue;
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        Boolean value = this.$userOverride.getValue();
        Boolean bool = Boolean.TRUE;
        if (q10.b(value, bool)) {
            MutableState<TextFieldValue> mutableState = this.$hourValue$delegate;
            TimeInputImpl$hourTextValue = TimePickerKt.TimeInputImpl$hourTextValue(this.$state);
            mutableState.setValue(TimeInputImpl$hourTextValue);
            MutableState<TextFieldValue> mutableState2 = this.$minuteValue$delegate;
            TimeInputImpl$minuteTextValue = TimePickerKt.TimeInputImpl$minuteTextValue(this.$state);
            mutableState2.setValue(TimeInputImpl$minuteTextValue);
        }
        this.$userOverride.setValue(bool);
        return w01.a;
    }
}
