package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ac0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ WindowInsets j;
    public final /* synthetic */ ny k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ ac0(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, ny nyVar, int i, int i2) {
        this.d = 3;
        this.e = modifier;
        this.g = j;
        this.h = j2;
        this.i = f;
        this.f = paddingValues;
        this.j = windowInsets;
        this.k = nyVar;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DismissibleDrawerSheet_afqeVBk$lambda$45;
        w01 ModalDrawerSheet_afqeVBk$lambda$43;
        w01 PermanentDrawerSheet_afqeVBk$lambda$49;
        w01 BottomAppBar_1oL4kX8$lambda$14;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DismissibleDrawerSheet_afqeVBk$lambda$45 = NavigationDrawerKt.DismissibleDrawerSheet_afqeVBk$lambda$45(this.e, (Shape) this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue);
                return DismissibleDrawerSheet_afqeVBk$lambda$45;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ModalDrawerSheet_afqeVBk$lambda$43 = NavigationDrawerKt.ModalDrawerSheet_afqeVBk$lambda$43(this.e, (Shape) this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue2);
                return ModalDrawerSheet_afqeVBk$lambda$43;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                PermanentDrawerSheet_afqeVBk$lambda$49 = NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$49(this.e, (Shape) this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue3);
                return PermanentDrawerSheet_afqeVBk$lambda$49;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                BottomAppBar_1oL4kX8$lambda$14 = AppBarKt.BottomAppBar_1oL4kX8$lambda$14(this.e, this.g, this.h, this.i, (PaddingValues) this.f, this.j, this.k, this.l, this.m, (Composer) obj, intValue4);
                return BottomAppBar_1oL4kX8$lambda$14;
        }
    }

    public /* synthetic */ ac0(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = shape;
        this.g = j;
        this.h = j2;
        this.i = f;
        this.j = windowInsets;
        this.k = nyVar;
        this.l = i;
        this.m = i2;
    }
}
