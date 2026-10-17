package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ my g;
    public final /* synthetic */ ny h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ WindowInsets k;
    public final /* synthetic */ TopAppBarColors l;
    public final /* synthetic */ TopAppBarScrollBehavior m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ b7(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.d = i3;
        this.e = myVar;
        this.f = modifier;
        this.g = myVar2;
        this.h = nyVar;
        this.i = f;
        this.j = f2;
        this.k = windowInsets;
        this.l = topAppBarColors;
        this.m = topAppBarScrollBehavior;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 MediumTopAppBar_oKE7A98$lambda$6;
        w01 LargeTopAppBar_oKE7A98$lambda$9;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MediumTopAppBar_oKE7A98$lambda$6 = AppBarKt.MediumTopAppBar_oKE7A98$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue);
                return MediumTopAppBar_oKE7A98$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LargeTopAppBar_oKE7A98$lambda$9 = AppBarKt.LargeTopAppBar_oKE7A98$lambda$9(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return LargeTopAppBar_oKE7A98$lambda$9;
        }
    }
}
