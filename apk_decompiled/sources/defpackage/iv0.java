package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class iv0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TimePickerState e;
    public final /* synthetic */ TimePickerColors f;
    public final /* synthetic */ int g;

    public /* synthetic */ iv0(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.d = i2;
        this.e = timePickerState;
        this.f = timePickerColors;
        this.g = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 VerticalClockDisplay$lambda$34;
        w01 HorizontalClockDisplay$lambda$31;
        w01 ClockDisplayNumbers$lambda$35;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                VerticalClockDisplay$lambda$34 = TimePickerKt.VerticalClockDisplay$lambda$34(this.e, this.f, this.g, composer, intValue);
                return VerticalClockDisplay$lambda$34;
            case 1:
                HorizontalClockDisplay$lambda$31 = TimePickerKt.HorizontalClockDisplay$lambda$31(this.e, this.f, this.g, composer, intValue);
                return HorizontalClockDisplay$lambda$31;
            default:
                ClockDisplayNumbers$lambda$35 = TimePickerKt.ClockDisplayNumbers$lambda$35(this.e, this.f, this.g, composer, intValue);
                return ClockDisplayNumbers$lambda$35;
        }
    }
}
