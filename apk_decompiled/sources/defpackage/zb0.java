package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zb0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ DrawerState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ WindowInsets k;
    public final /* synthetic */ ny l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ zb0(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = drawerState;
        this.f = modifier;
        this.g = shape;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.k = windowInsets;
        this.l = nyVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ModalDrawerSheet_Snr_uVM$lambda$44;
        w01 DismissibleDrawerSheet_Snr_uVM$lambda$46;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ModalDrawerSheet_Snr_uVM$lambda$44 = NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$44(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue);
                return ModalDrawerSheet_Snr_uVM$lambda$44;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                DismissibleDrawerSheet_Snr_uVM$lambda$46 = NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$46(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return DismissibleDrawerSheet_Snr_uVM$lambda$46;
        }
    }
}
