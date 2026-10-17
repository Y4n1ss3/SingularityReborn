package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sh implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ sh(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i) {
        this.e = modifier;
        this.h = sliderState;
        this.f = z;
        this.i = mutableInteractionSource;
        this.j = nyVar;
        this.k = nyVar2;
        this.g = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CheckboxImpl$lambda$15;
        w01 SliderImpl$lambda$31;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CheckboxImpl$lambda$15 = CheckboxKt.CheckboxImpl$lambda$15(this.f, (ToggleableState) this.h, this.e, (CheckboxColors) this.i, (Stroke) this.j, (Stroke) this.k, this.g, (Composer) obj, intValue);
                return CheckboxImpl$lambda$15;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SliderImpl$lambda$31 = SliderKt.SliderImpl$lambda$31(this.e, (SliderState) this.h, this.f, (MutableInteractionSource) this.i, (ny) this.j, (ny) this.k, this.g, (Composer) obj, intValue2);
                return SliderImpl$lambda$31;
        }
    }

    public /* synthetic */ sh(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Stroke stroke, Stroke stroke2, int i) {
        this.f = z;
        this.h = toggleableState;
        this.e = modifier;
        this.i = checkboxColors;
        this.j = stroke;
        this.k = stroke2;
        this.g = i;
    }
}
