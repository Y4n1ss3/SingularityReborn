package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class uh implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ uh(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i, int i2) {
        this.k = sliderState;
        this.e = modifier;
        this.f = z;
        this.g = z2;
        this.l = sliderColors;
        this.h = mutableInteractionSource;
        this.m = nyVar;
        this.n = nyVar2;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Checkbox$lambda$6;
        w01 VerticalSlider$lambda$10;
        w01 TooltipBox$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Checkbox$lambda$6 = CheckboxKt.Checkbox$lambda$6(this.f, (ky) this.k, (Stroke) this.l, (Stroke) this.m, this.e, this.g, (CheckboxColors) this.n, (MutableInteractionSource) this.h, this.i, this.j, (Composer) obj, intValue);
                return Checkbox$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VerticalSlider$lambda$10 = SliderKt.VerticalSlider$lambda$10((SliderState) this.k, this.e, this.f, this.g, (SliderColors) this.l, (MutableInteractionSource) this.h, (ny) this.m, (ny) this.n, this.i, this.j, (Composer) obj, intValue2);
                return VerticalSlider$lambda$10;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                TooltipBox$lambda$1 = TooltipKt.TooltipBox$lambda$1((PopupPositionProvider) this.k, (ny) this.l, (TooltipState) this.m, this.e, (iy) this.n, this.f, this.g, (my) this.h, this.i, this.j, (Composer) obj, intValue3);
                return TooltipBox$lambda$1;
        }
    }

    public /* synthetic */ uh(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, my myVar, int i, int i2) {
        this.k = popupPositionProvider;
        this.l = nyVar;
        this.m = tooltipState;
        this.e = modifier;
        this.n = iyVar;
        this.f = z;
        this.g = z2;
        this.h = myVar;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ uh(boolean z, ky kyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.f = z;
        this.k = kyVar;
        this.l = stroke;
        this.m = stroke2;
        this.e = modifier;
        this.g = z2;
        this.n = checkboxColors;
        this.h = mutableInteractionSource;
        this.i = i;
        this.j = i2;
    }
}
