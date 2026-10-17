package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fv0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ TimePickerState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ TimePickerColors g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ fv0(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, int i3) {
        this.e = timePickerState;
        this.f = modifier;
        this.g = timePickerColors;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TimeSelector_SAnMeKU$lambda$59;
        w01 TimePicker_mT9BvqQ$lambda$4;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TimePickerState timePickerState = this.e;
                Modifier modifier = this.f;
                TimePickerColors timePickerColors = this.g;
                TimeSelector_SAnMeKU$lambda$59 = TimePickerKt.TimeSelector_SAnMeKU$lambda$59(modifier, this.h, timePickerState, this.i, timePickerColors, this.j, (Composer) obj, intValue);
                return TimeSelector_SAnMeKU$lambda$59;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TimePicker_mT9BvqQ$lambda$4 = TimePickerKt.TimePicker_mT9BvqQ$lambda$4(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue2);
                return TimePicker_mT9BvqQ$lambda$4;
        }
    }

    public /* synthetic */ fv0(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, int i3) {
        this.f = modifier;
        this.h = i;
        this.e = timePickerState;
        this.i = i2;
        this.g = timePickerColors;
        this.j = i3;
    }
}
