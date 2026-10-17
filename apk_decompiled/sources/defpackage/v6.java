package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ my g;
    public final /* synthetic */ ny h;
    public final /* synthetic */ WindowInsets i;
    public final /* synthetic */ TopAppBarColors j;
    public final /* synthetic */ TopAppBarScrollBehavior k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ v6(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.d = i3;
        this.e = myVar;
        this.f = modifier;
        this.g = myVar2;
        this.h = nyVar;
        this.i = windowInsets;
        this.j = topAppBarColors;
        this.k = topAppBarScrollBehavior;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CenterAlignedTopAppBar$lambda$2;
        w01 LargeTopAppBar$lambda$8;
        w01 TopAppBar$lambda$0;
        w01 MediumTopAppBar$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CenterAlignedTopAppBar$lambda$2 = AppBarKt.CenterAlignedTopAppBar$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue);
                return CenterAlignedTopAppBar$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                LargeTopAppBar$lambda$8 = AppBarKt.LargeTopAppBar$lambda$8(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue2);
                return LargeTopAppBar$lambda$8;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                TopAppBar$lambda$0 = AppBarKt.TopAppBar$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue3);
                return TopAppBar$lambda$0;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                MediumTopAppBar$lambda$5 = AppBarKt.MediumTopAppBar$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue4);
                return MediumTopAppBar$lambda$5;
        }
    }
}
