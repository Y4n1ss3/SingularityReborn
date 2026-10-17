package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fw implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ FloatingActionButtonElevation j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ ty l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ fw(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = shape;
        this.h = j;
        this.i = j2;
        this.j = floatingActionButtonElevation;
        this.k = mutableInteractionSource;
        this.l = tyVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LargeFloatingActionButton_X_z6DiA$lambda$6;
        w01 SmallFloatingActionButton_X_z6DiA$lambda$5;
        w01 FloatingActionButton_X_z6DiA$lambda$0;
        w01 ExtendedFloatingActionButton_X_z6DiA$lambda$7;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LargeFloatingActionButton_X_z6DiA$lambda$6 = FloatingActionButtonKt.LargeFloatingActionButton_X_z6DiA$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (my) this.l, this.m, this.n, (Composer) obj, intValue);
                return LargeFloatingActionButton_X_z6DiA$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                SmallFloatingActionButton_X_z6DiA$lambda$5 = FloatingActionButtonKt.SmallFloatingActionButton_X_z6DiA$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (my) this.l, this.m, this.n, (Composer) obj, intValue2);
                return SmallFloatingActionButton_X_z6DiA$lambda$5;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                FloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.FloatingActionButton_X_z6DiA$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (my) this.l, this.m, this.n, (Composer) obj, intValue3);
                return FloatingActionButton_X_z6DiA$lambda$0;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                ExtendedFloatingActionButton_X_z6DiA$lambda$7 = FloatingActionButtonKt.ExtendedFloatingActionButton_X_z6DiA$lambda$7(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ny) this.l, this.m, this.n, (Composer) obj, intValue4);
                return ExtendedFloatingActionButton_X_z6DiA$lambda$7;
        }
    }
}
