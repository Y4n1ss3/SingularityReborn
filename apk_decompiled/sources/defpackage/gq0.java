package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class gq0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SliderDefaults e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SliderColors i;
    public final /* synthetic */ my j;
    public final /* synthetic */ ny k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ gq0(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, float f3, int i, int i2) {
        this.d = 1;
        this.e = sliderDefaults;
        this.f = sliderState;
        this.g = modifier;
        this.h = z;
        this.i = sliderColors;
        this.j = myVar;
        this.k = nyVar;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Track_mnvyFg4$lambda$21;
        w01 CenteredTrack_7LSsfP0$lambda$25;
        w01 Track_mnvyFg4$lambda$41;
        int i = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Track_mnvyFg4$lambda$21 = SliderDefaults.Track_mnvyFg4$lambda$21(this.e, (SliderState) obj3, this.l, this.g, this.h, this.i, this.j, this.k, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return Track_mnvyFg4$lambda$21;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                SliderDefaults sliderDefaults = this.e;
                float f = this.l;
                CenteredTrack_7LSsfP0$lambda$25 = SliderDefaults.CenteredTrack_7LSsfP0$lambda$25(sliderDefaults, (SliderState) obj3, this.g, this.h, this.i, this.j, this.k, f, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return CenteredTrack_7LSsfP0$lambda$25;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Track_mnvyFg4$lambda$41 = SliderDefaults.Track_mnvyFg4$lambda$41(this.e, (RangeSliderState) obj3, this.l, this.g, this.h, this.i, this.j, this.k, this.m, this.n, this.o, this.p, (Composer) obj, intValue3);
                return Track_mnvyFg4$lambda$41;
        }
    }

    public /* synthetic */ gq0(SliderDefaults sliderDefaults, Object obj, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, int i, int i2, int i3) {
        this.d = i3;
        this.e = sliderDefaults;
        this.f = obj;
        this.l = f;
        this.g = modifier;
        this.h = z;
        this.i = sliderColors;
        this.j = myVar;
        this.k = nyVar;
        this.m = f2;
        this.n = f3;
        this.o = i;
        this.p = i2;
    }
}
