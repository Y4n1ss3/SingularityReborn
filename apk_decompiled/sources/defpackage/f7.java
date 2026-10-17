package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ PaddingValues i;
    public final /* synthetic */ WindowInsets j;
    public final /* synthetic */ ny k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ f7(ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, int i, int i2) {
        this.k = nyVar;
        this.e = modifier;
        this.n = myVar;
        this.f = j;
        this.g = j2;
        this.h = f;
        this.i = paddingValues;
        this.j = windowInsets;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BottomAppBar_Snr_uVM$lambda$12;
        w01 BottomAppBar_e_3WI5M$lambda$15;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BottomAppBar_Snr_uVM$lambda$12 = AppBarKt.BottomAppBar_Snr_uVM$lambda$12(this.k, this.e, (my) this.n, this.f, this.g, this.h, this.i, this.j, this.l, this.m, (Composer) obj, intValue);
                return BottomAppBar_Snr_uVM$lambda$12;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BottomAppBar_e_3WI5M$lambda$15 = AppBarKt.BottomAppBar_e_3WI5M$lambda$15(this.e, this.f, this.g, this.h, this.i, this.j, (BottomAppBarScrollBehavior) this.n, this.k, this.l, this.m, (Composer) obj, intValue2);
                return BottomAppBar_e_3WI5M$lambda$15;
        }
    }

    public /* synthetic */ f7(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, int i, int i2) {
        this.e = modifier;
        this.f = j;
        this.g = j2;
        this.h = f;
        this.i = paddingValues;
        this.j = windowInsets;
        this.n = bottomAppBarScrollBehavior;
        this.k = nyVar;
        this.l = i;
        this.m = i2;
    }
}
