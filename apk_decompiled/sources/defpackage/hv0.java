package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hv0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TimePickerState e;

    public /* synthetic */ hv0(int i, TimePickerState timePickerState) {
        this.d = i;
        this.e = timePickerState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        MutableState TimeInputImpl$lambda$17$lambda$16;
        w01 PeriodToggleImpl$lambda$46$lambda$43$lambda$42;
        MutableState TimeInputImpl$lambda$21$lambda$20;
        w01 PeriodToggleImpl$lambda$46$lambda$45$lambda$44;
        int i = this.d;
        TimePickerState timePickerState = this.e;
        switch (i) {
            case 0:
                TimeInputImpl$lambda$17$lambda$16 = TimePickerKt.TimeInputImpl$lambda$17$lambda$16(timePickerState);
                return TimeInputImpl$lambda$17$lambda$16;
            case 1:
                PeriodToggleImpl$lambda$46$lambda$43$lambda$42 = TimePickerKt.PeriodToggleImpl$lambda$46$lambda$43$lambda$42(timePickerState);
                return PeriodToggleImpl$lambda$46$lambda$43$lambda$42;
            case 2:
                TimeInputImpl$lambda$21$lambda$20 = TimePickerKt.TimeInputImpl$lambda$21$lambda$20(timePickerState);
                return TimeInputImpl$lambda$21$lambda$20;
            default:
                PeriodToggleImpl$lambda$46$lambda$45$lambda$44 = TimePickerKt.PeriodToggleImpl$lambda$46$lambda$45$lambda$44(timePickerState);
                return PeriodToggleImpl$lambda$46$lambda$45$lambda$44;
        }
    }
}
