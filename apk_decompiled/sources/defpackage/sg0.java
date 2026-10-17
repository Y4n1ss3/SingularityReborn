package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sg0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ float e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ sg0(float f, Modifier modifier, long j, long j2, int i, int i2, int i3) {
        this.e = f;
        this.f = modifier;
        this.g = j;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LinearProgressIndicator_rIrjwxo$lambda$14;
        w01 LinearProgressIndicator__5eSR_E$lambda$17;
        w01 CircularProgressIndicator_LxG7B9w$lambda$30;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                float f = this.e;
                LinearProgressIndicator_rIrjwxo$lambda$14 = ProgressIndicatorKt.LinearProgressIndicator_rIrjwxo$lambda$14(this.f, this.g, this.h, this.i, f, this.j, this.k, (Composer) obj, intValue);
                return LinearProgressIndicator_rIrjwxo$lambda$14;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                LinearProgressIndicator__5eSR_E$lambda$17 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$17(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue2);
                return LinearProgressIndicator__5eSR_E$lambda$17;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                float f2 = this.e;
                CircularProgressIndicator_LxG7B9w$lambda$30 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$30(this.f, this.g, f2, this.h, this.i, this.j, this.k, (Composer) obj, intValue3);
                return CircularProgressIndicator_LxG7B9w$lambda$30;
        }
    }

    public /* synthetic */ sg0(Modifier modifier, long j, float f, long j2, int i, int i2, int i3) {
        this.f = modifier;
        this.g = j;
        this.e = f;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public /* synthetic */ sg0(Modifier modifier, long j, long j2, int i, float f, int i2, int i3) {
        this.f = modifier;
        this.g = j;
        this.h = j2;
        this.i = i;
        this.e = f;
        this.j = i2;
        this.k = i3;
    }
}
