package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class lm0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ my g;
    public final /* synthetic */ ny h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ lm0(my myVar, boolean z, ky kyVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, ny nyVar, int i, int i2) {
        this.d = 0;
        this.g = myVar;
        this.f = z;
        this.m = kyVar;
        this.e = modifier;
        this.n = shape;
        this.o = searchBarColors;
        this.i = f;
        this.j = f2;
        this.h = nyVar;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DockedSearchBar_EQC0FA8$lambda$25;
        w01 Track_4EFweAY$lambda$37;
        w01 Track_4EFweAY$lambda$17;
        int i = this.d;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DockedSearchBar_EQC0FA8$lambda$25 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$25(this.g, this.f, (ky) obj5, this.e, (Shape) obj4, (SearchBarColors) obj3, this.i, this.j, this.h, this.k, this.l, (Composer) obj, intValue);
                return DockedSearchBar_EQC0FA8$lambda$25;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Track_4EFweAY$lambda$37 = SliderDefaults.Track_4EFweAY$lambda$37((SliderDefaults) obj5, (RangeSliderState) obj4, this.e, this.f, (SliderColors) obj3, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue2);
                return Track_4EFweAY$lambda$37;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Track_4EFweAY$lambda$17 = SliderDefaults.Track_4EFweAY$lambda$17((SliderDefaults) obj5, (SliderState) obj4, this.e, this.f, (SliderColors) obj3, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue3);
                return Track_4EFweAY$lambda$17;
        }
    }

    public /* synthetic */ lm0(SliderDefaults sliderDefaults, Object obj, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, int i, int i2, int i3) {
        this.d = i3;
        this.m = sliderDefaults;
        this.n = obj;
        this.e = modifier;
        this.f = z;
        this.o = sliderColors;
        this.g = myVar;
        this.h = nyVar;
        this.i = f;
        this.j = f2;
        this.k = i;
        this.l = i2;
    }
}
