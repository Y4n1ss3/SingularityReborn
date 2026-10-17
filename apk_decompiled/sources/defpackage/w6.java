package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ ty g;
    public final /* synthetic */ ty h;
    public final /* synthetic */ ny i;
    public final /* synthetic */ Alignment.Horizontal j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ WindowInsets m;
    public final /* synthetic */ TopAppBarColors n;
    public final /* synthetic */ TopAppBarScrollBehavior o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ w6(my myVar, Modifier modifier, my myVar2, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.e = myVar;
        this.f = modifier;
        this.g = myVar2;
        this.h = myVar3;
        this.i = nyVar;
        this.j = horizontal;
        this.k = f;
        this.l = f2;
        this.m = windowInsets;
        this.n = topAppBarColors;
        this.o = topAppBarScrollBehavior;
        this.p = i;
        this.q = i2;
        this.r = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10;
        w01 MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7;
        w01 TwoRowsTopAppBar_eXZ4JBQ$lambda$11;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10 = AppBarKt.LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10(this.e, this.f, (my) this.g, (my) this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue);
                return LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7 = AppBarKt.MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7(this.e, this.f, (my) this.g, (my) this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue2);
                return MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                TwoRowsTopAppBar_eXZ4JBQ$lambda$11 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$11(this.i, this.f, (ny) this.g, this.e, (ny) this.h, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue3);
                return TwoRowsTopAppBar_eXZ4JBQ$lambda$11;
        }
    }

    public /* synthetic */ w6(ny nyVar, Modifier modifier, ny nyVar2, my myVar, ny nyVar3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.d = 2;
        this.i = nyVar;
        this.f = modifier;
        this.g = nyVar2;
        this.e = myVar;
        this.h = nyVar3;
        this.j = horizontal;
        this.k = f;
        this.l = f2;
        this.m = windowInsets;
        this.n = topAppBarColors;
        this.o = topAppBarScrollBehavior;
        this.p = i;
        this.q = i2;
        this.r = i3;
    }
}
