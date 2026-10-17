package defpackage;

import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fp implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ fp(Object obj, int i, Modifier modifier, long j, int i2, int i3, int i4) {
        this.d = i4;
        this.j = obj;
        this.e = i;
        this.f = modifier;
        this.g = j;
        this.h = i2;
        this.i = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DatePickerTitle_FNtVw6o$lambda$1;
        w01 DateRangePickerTitle_FNtVw6o$lambda$0;
        int i = this.d;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DatePickerTitle_FNtVw6o$lambda$1 = DatePickerDefaults.DatePickerTitle_FNtVw6o$lambda$1((DatePickerDefaults) obj3, this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue);
                return DatePickerTitle_FNtVw6o$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                DateRangePickerTitle_FNtVw6o$lambda$0 = DateRangePickerDefaults.DateRangePickerTitle_FNtVw6o$lambda$0((DateRangePickerDefaults) obj3, this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue2);
                return DateRangePickerTitle_FNtVw6o$lambda$0;
        }
    }
}
