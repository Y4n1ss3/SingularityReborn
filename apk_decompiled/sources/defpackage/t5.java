package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.NavigationDrawerItemColors;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ty g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ t5(my myVar, iy iyVar, Modifier modifier, my myVar2, my myVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = myVar;
        this.g = iyVar;
        this.h = modifier;
        this.i = myVar2;
        this.j = myVar3;
        this.f = z;
        this.n = menuItemColors;
        this.o = paddingValues;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DropdownMenuItem$lambda$7;
        w01 NavigationDrawerItem$lambda$65;
        w01 RangeSlider$lambda$23;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DropdownMenuItem$lambda$7 = AndroidMenu_androidKt.DropdownMenuItem$lambda$7((my) this.e, (iy) this.g, this.h, (my) this.i, (my) this.j, this.f, (MenuItemColors) this.n, (PaddingValues) this.o, this.k, this.l, this.m, (Composer) obj, intValue);
                return DropdownMenuItem$lambda$7;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                NavigationDrawerItem$lambda$65 = NavigationDrawerKt.NavigationDrawerItem$lambda$65((my) this.e, this.f, (iy) this.g, this.h, (my) this.i, (my) this.j, (Shape) this.n, (NavigationDrawerItemColors) this.o, this.k, this.l, this.m, (Composer) obj, intValue2);
                return NavigationDrawerItem$lambda$65;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                RangeSlider$lambda$23 = SliderKt.RangeSlider$lambda$23((RangeSliderState) this.e, this.h, this.f, (SliderColors) this.i, this.k, (MutableInteractionSource) this.j, (ny) this.g, (ny) this.n, (ny) this.o, this.l, this.m, (Composer) obj, intValue3);
                return RangeSlider$lambda$23;
        }
    }

    public /* synthetic */ t5(my myVar, boolean z, iy iyVar, Modifier modifier, my myVar2, my myVar3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = myVar;
        this.f = z;
        this.g = iyVar;
        this.h = modifier;
        this.i = myVar2;
        this.j = myVar3;
        this.n = shape;
        this.o = navigationDrawerItemColors;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }

    public /* synthetic */ t5(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i, int i2) {
        this.e = rangeSliderState;
        this.h = modifier;
        this.f = z;
        this.i = sliderColors;
        this.k = mutableInteractionSource;
        this.j = mutableInteractionSource2;
        this.g = nyVar;
        this.n = nyVar2;
        this.o = nyVar3;
        this.l = i;
        this.m = i2;
    }
}
