package defpackage;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zq0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ my f;
    public final /* synthetic */ my g;
    public final /* synthetic */ TextStyle h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;

    public /* synthetic */ zq0(my myVar, my myVar2, my myVar3, TextStyle textStyle, long j, long j2, int i, int i2) {
        this.d = i2;
        this.e = myVar;
        this.f = myVar2;
        this.g = myVar3;
        this.h = textStyle;
        this.i = j;
        this.j = j2;
        this.k = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OneRowSnackbar_kKq0p4A$lambda$12;
        w01 NewLineButtonSnackbar_kKq0p4A$lambda$6;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OneRowSnackbar_kKq0p4A$lambda$12 = SnackbarKt.OneRowSnackbar_kKq0p4A$lambda$12(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue);
                return OneRowSnackbar_kKq0p4A$lambda$12;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                NewLineButtonSnackbar_kKq0p4A$lambda$6 = SnackbarKt.NewLineButtonSnackbar_kKq0p4A$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue2);
                return NewLineButtonSnackbar_kKq0p4A$lambda$6;
        }
    }
}
