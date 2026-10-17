package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jv0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnalogTimePickerState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ TimePickerColors g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ jv0(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = analogTimePickerState;
        this.f = modifier;
        this.g = timePickerColors;
        this.h = z;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 VerticalTimePicker$lambda$11;
        w01 HorizontalTimePicker$lambda$15;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VerticalTimePicker$lambda$11 = TimePickerKt.VerticalTimePicker$lambda$11(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue);
                return VerticalTimePicker$lambda$11;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                HorizontalTimePicker$lambda$15 = TimePickerKt.HorizontalTimePicker$lambda$15(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue2);
                return HorizontalTimePicker$lambda$15;
        }
    }
}
