package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ my g;
    public final /* synthetic */ ny h;
    public final /* synthetic */ float i;
    public final /* synthetic */ WindowInsets j;
    public final /* synthetic */ TopAppBarColors k;
    public final /* synthetic */ TopAppBarScrollBehavior l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ c7(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.d = i3;
        this.e = myVar;
        this.f = modifier;
        this.g = myVar2;
        this.h = nyVar;
        this.i = f;
        this.j = windowInsets;
        this.k = topAppBarColors;
        this.l = topAppBarScrollBehavior;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TopAppBar_GHTll3U$lambda$1;
        w01 CenterAlignedTopAppBar_GHTll3U$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TopAppBar_GHTll3U$lambda$1 = AppBarKt.TopAppBar_GHTll3U$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue);
                return TopAppBar_GHTll3U$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                CenterAlignedTopAppBar_GHTll3U$lambda$3 = AppBarKt.CenterAlignedTopAppBar_GHTll3U$lambda$3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return CenterAlignedTopAppBar_GHTll3U$lambda$3;
        }
    }
}
