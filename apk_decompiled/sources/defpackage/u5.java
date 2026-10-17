package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ u5(my myVar, Modifier modifier, DrawerState drawerState, boolean z, long j, my myVar2, int i, int i2) {
        this.j = myVar;
        this.e = modifier;
        this.k = drawerState;
        this.f = z;
        this.g = j;
        this.l = myVar2;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DropdownMenu_ILWXrKs$lambda$6;
        w01 ModalNavigationDrawer_FHprtrg$lambda$25;
        w01 Thumb_9LiSoMs$lambda$3;
        int i = this.d;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DropdownMenu_ILWXrKs$lambda$6 = AndroidMenu_androidKt.DropdownMenu_ILWXrKs$lambda$6(this.f, (iy) obj5, this.e, this.g, (PopupProperties) obj4, (ny) obj3, this.h, this.i, (Composer) obj, intValue);
                return DropdownMenu_ILWXrKs$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ModalNavigationDrawer_FHprtrg$lambda$25 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$25((my) obj5, this.e, (DrawerState) obj4, this.f, this.g, (my) obj3, this.h, this.i, (Composer) obj, intValue2);
                return ModalNavigationDrawer_FHprtrg$lambda$25;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Thumb_9LiSoMs$lambda$3 = SliderDefaults.Thumb_9LiSoMs$lambda$3((SliderDefaults) obj5, (MutableInteractionSource) obj4, this.e, (SliderColors) obj3, this.f, this.g, this.h, this.i, (Composer) obj, intValue3);
                return Thumb_9LiSoMs$lambda$3;
        }
    }

    public /* synthetic */ u5(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.j = sliderDefaults;
        this.k = mutableInteractionSource;
        this.e = modifier;
        this.l = sliderColors;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ u5(boolean z, iy iyVar, Modifier modifier, long j, PopupProperties popupProperties, ny nyVar, int i, int i2) {
        this.f = z;
        this.j = iyVar;
        this.e = modifier;
        this.g = j;
        this.k = popupProperties;
        this.l = nyVar;
        this.h = i;
        this.i = i2;
    }
}
