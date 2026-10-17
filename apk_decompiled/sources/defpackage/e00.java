package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e00 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ MutableInteractionSource g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ ty m;

    public /* synthetic */ e00(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i) {
        this.i = iyVar;
        this.e = modifier;
        this.f = z;
        this.j = shape;
        this.k = iconButtonColors;
        this.l = borderStroke;
        this.g = mutableInteractionSource;
        this.m = myVar;
        this.h = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SurfaceIconButton$lambda$24;
        w01 RangeSliderImpl$lambda$46;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SurfaceIconButton$lambda$24 = IconButtonKt.SurfaceIconButton$lambda$24((iy) this.i, this.e, this.f, (Shape) this.j, (IconButtonColors) this.k, (BorderStroke) this.l, this.g, (my) this.m, this.h, (Composer) obj, intValue);
                return SurfaceIconButton$lambda$24;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                RangeSliderImpl$lambda$46 = SliderKt.RangeSliderImpl$lambda$46(this.e, (RangeSliderState) this.i, this.f, this.g, (MutableInteractionSource) this.j, (ny) this.k, (ny) this.l, (ny) this.m, this.h, (Composer) obj, intValue2);
                return RangeSliderImpl$lambda$46;
        }
    }

    public /* synthetic */ e00(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i) {
        this.e = modifier;
        this.i = rangeSliderState;
        this.f = z;
        this.g = mutableInteractionSource;
        this.j = mutableInteractionSource2;
        this.k = nyVar;
        this.l = nyVar2;
        this.m = nyVar3;
        this.h = i;
    }
}
