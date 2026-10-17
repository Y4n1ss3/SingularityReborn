package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bi implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ long g;
    public final /* synthetic */ my h;
    public final /* synthetic */ my i;
    public final /* synthetic */ my j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ float m;
    public final /* synthetic */ PaddingValues n;
    public final /* synthetic */ int o;

    public /* synthetic */ bi(my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, my myVar4, long j2, long j3, float f, PaddingValues paddingValues, int i, int i2) {
        this.d = i2;
        this.e = myVar;
        this.f = textStyle;
        this.g = j;
        this.h = myVar2;
        this.i = myVar3;
        this.j = myVar4;
        this.k = j2;
        this.l = j3;
        this.m = f;
        this.n = paddingValues;
        this.o = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ChipContent_fe0OD_I$lambda$23;
        w01 AnimatingChipContent_fe0OD_I$lambda$24;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ChipContent_fe0OD_I$lambda$23 = ChipKt.ChipContent_fe0OD_I$lambda$23(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue);
                return ChipContent_fe0OD_I$lambda$23;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                AnimatingChipContent_fe0OD_I$lambda$24 = ChipKt.AnimatingChipContent_fe0OD_I$lambda$24(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return AnimatingChipContent_fe0OD_I$lambda$24;
        }
    }
}
