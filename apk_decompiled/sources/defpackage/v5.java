package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ v5(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.j = sliderDefaults;
        this.k = mutableInteractionSource;
        this.l = sliderState;
        this.e = modifier;
        this.m = sliderColors;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DropdownMenu_4kj__NE$lambda$5;
        w01 Thumb_HwbPF3A$lambda$6;
        int i = this.d;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DropdownMenu_4kj__NE$lambda$5 = AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$5(this.f, (iy) obj6, this.e, this.g, (ScrollState) obj5, (PopupProperties) obj4, (ny) obj3, this.h, this.i, (Composer) obj, intValue);
                return DropdownMenu_4kj__NE$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Thumb_HwbPF3A$lambda$6 = SliderDefaults.Thumb_HwbPF3A$lambda$6((SliderDefaults) obj6, (MutableInteractionSource) obj5, (SliderState) obj4, this.e, (SliderColors) obj3, this.f, this.g, this.h, this.i, (Composer) obj, intValue2);
                return Thumb_HwbPF3A$lambda$6;
        }
    }

    public /* synthetic */ v5(boolean z, iy iyVar, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, ny nyVar, int i, int i2) {
        this.f = z;
        this.j = iyVar;
        this.e = modifier;
        this.g = j;
        this.k = scrollState;
        this.l = popupProperties;
        this.m = nyVar;
        this.h = i;
        this.i = i2;
    }
}
