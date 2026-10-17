package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ float i;
    public final /* synthetic */ WindowInsets j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ny l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ z6(ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i, int i2) {
        this.l = nyVar;
        this.e = modifier;
        this.o = myVar;
        this.f = j;
        this.g = j2;
        this.i = f;
        this.h = paddingValues;
        this.j = windowInsets;
        this.k = bottomAppBarScrollBehavior;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BottomAppBar_qhFBPw4$lambda$13;
        w01 FlexibleBottomAppBar_wBhsO_E$lambda$16;
        w01 DrawerSheet_cm3T3N0$lambda$53;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BottomAppBar_qhFBPw4$lambda$13 = AppBarKt.BottomAppBar_qhFBPw4$lambda$13(this.l, this.e, (my) this.o, this.f, this.g, this.i, (PaddingValues) this.h, this.j, (BottomAppBarScrollBehavior) this.k, this.m, this.n, (Composer) obj, intValue);
                return BottomAppBar_qhFBPw4$lambda$13;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                FlexibleBottomAppBar_wBhsO_E$lambda$16 = AppBarKt.FlexibleBottomAppBar_wBhsO_E$lambda$16(this.e, this.f, this.g, (PaddingValues) this.h, (Arrangement.Horizontal) this.o, this.i, this.j, (BottomAppBarScrollBehavior) this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return FlexibleBottomAppBar_wBhsO_E$lambda$16;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                DrawerSheet_cm3T3N0$lambda$53 = NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$53((DrawerPredictiveBackState) this.o, this.j, this.e, (Shape) this.h, this.f, this.g, this.i, (FloatProducer) this.k, this.l, this.m, this.n, (Composer) obj, intValue3);
                return DrawerSheet_cm3T3N0$lambda$53;
        }
    }

    public /* synthetic */ z6(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, ny nyVar, int i, int i2) {
        this.o = drawerPredictiveBackState;
        this.j = windowInsets;
        this.e = modifier;
        this.h = shape;
        this.f = j;
        this.g = j2;
        this.i = f;
        this.k = floatProducer;
        this.l = nyVar;
        this.m = i;
        this.n = i2;
    }

    public /* synthetic */ z6(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, int i, int i2) {
        this.e = modifier;
        this.f = j;
        this.g = j2;
        this.h = paddingValues;
        this.o = horizontal;
        this.i = f;
        this.j = windowInsets;
        this.k = bottomAppBarScrollBehavior;
        this.l = nyVar;
        this.m = i;
        this.n = i2;
    }
}
