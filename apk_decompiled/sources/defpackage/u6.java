package defpackage;

import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.material3.TimePickerDialogDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ty h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ u6(TimePickerDialogDefaults timePickerDialogDefaults, iy iyVar, int i, Modifier modifier, int i2, int i3) {
        this.d = 2;
        this.e = timePickerDialogDefaults;
        this.h = iyVar;
        this.g = i;
        this.f = modifier;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 AppBarColumn$lambda$5;
        w01 AppBarRow$lambda$5;
        w01 DisplayModeToggle_S7Bxtbk$lambda$0;
        int i = this.d;
        ty tyVar = this.h;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AppBarColumn$lambda$5 = AppBarColumnKt.AppBarColumn$lambda$5((ny) obj3, this.f, this.g, (ky) tyVar, this.i, this.j, (Composer) obj, intValue);
                return AppBarColumn$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AppBarRow$lambda$5 = AppBarRowKt.AppBarRow$lambda$5((ny) obj3, this.f, this.g, (ky) tyVar, this.i, this.j, (Composer) obj, intValue2);
                return AppBarRow$lambda$5;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                DisplayModeToggle_S7Bxtbk$lambda$0 = TimePickerDialogDefaults.DisplayModeToggle_S7Bxtbk$lambda$0((TimePickerDialogDefaults) obj3, (iy) tyVar, this.g, this.f, this.i, this.j, (Composer) obj, intValue3);
                return DisplayModeToggle_S7Bxtbk$lambda$0;
        }
    }

    public /* synthetic */ u6(ny nyVar, Modifier modifier, int i, ky kyVar, int i2, int i3, int i4) {
        this.d = i4;
        this.e = nyVar;
        this.f = modifier;
        this.g = i;
        this.h = kyVar;
        this.i = i2;
        this.j = i3;
    }
}
