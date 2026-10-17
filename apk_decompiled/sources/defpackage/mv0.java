package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mv0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ TimePickerColors f;
    public final /* synthetic */ TimePickerState g;
    public final /* synthetic */ int h;

    public /* synthetic */ mv0(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, int i) {
        this.d = 1;
        this.e = modifier;
        this.f = timePickerColors;
        this.g = timePickerState;
        this.h = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 VerticalPeriodToggle$lambda$39;
        w01 TimeInputImpl$lambda$28;
        w01 HorizontalPeriodToggle$lambda$37;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TimePickerState timePickerState = this.g;
                VerticalPeriodToggle$lambda$39 = TimePickerKt.VerticalPeriodToggle$lambda$39(this.e, timePickerState, this.f, this.h, (Composer) obj, intValue);
                return VerticalPeriodToggle$lambda$39;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                TimePickerState timePickerState2 = this.g;
                TimeInputImpl$lambda$28 = TimePickerKt.TimeInputImpl$lambda$28(this.e, this.f, timePickerState2, this.h, (Composer) obj, intValue2);
                return TimeInputImpl$lambda$28;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                TimePickerState timePickerState3 = this.g;
                HorizontalPeriodToggle$lambda$37 = TimePickerKt.HorizontalPeriodToggle$lambda$37(this.e, timePickerState3, this.f, this.h, (Composer) obj, intValue3);
                return HorizontalPeriodToggle$lambda$37;
        }
    }

    public /* synthetic */ mv0(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.g = timePickerState;
        this.f = timePickerColors;
        this.h = i;
    }
}
