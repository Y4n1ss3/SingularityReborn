package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ nc(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i, boolean z, int i2) {
        this.d = 2;
        this.h = modifier;
        this.i = analogTimePickerState;
        this.f = i;
        this.e = z;
        this.g = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 PredictiveBackStateHandler$lambda$3;
        w01 TrailingIcon$lambda$0;
        w01 ClockText$lambda$84;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PredictiveBackStateHandler$lambda$3 = BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$3((PredictiveBackState) obj4, this.e, (iy) obj3, this.f, this.g, (Composer) obj, intValue);
                return PredictiveBackStateHandler$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                TrailingIcon$lambda$0 = ExposedDropdownMenuDefaults.TrailingIcon$lambda$0((ExposedDropdownMenuDefaults) obj4, this.e, (Modifier) obj3, this.f, this.g, (Composer) obj, intValue2);
                return TrailingIcon$lambda$0;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ClockText$lambda$84 = TimePickerKt.ClockText$lambda$84((Modifier) obj4, (AnalogTimePickerState) obj3, this.f, this.e, this.g, (Composer) obj, intValue3);
                return ClockText$lambda$84;
        }
    }

    public /* synthetic */ nc(Object obj, boolean z, Object obj2, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.e = z;
        this.i = obj2;
        this.f = i;
        this.g = i2;
    }
}
