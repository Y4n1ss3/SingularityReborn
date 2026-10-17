package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ ButtonColors i;
    public final /* synthetic */ ButtonElevation j;
    public final /* synthetic */ BorderStroke k;
    public final /* synthetic */ PaddingValues l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ ny n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ rf(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = z;
        this.h = shape;
        this.i = buttonColors;
        this.j = buttonElevation;
        this.k = borderStroke;
        this.l = paddingValues;
        this.m = mutableInteractionSource;
        this.n = nyVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedButton$lambda$6;
        w01 Button$lambda$3;
        w01 ElevatedButton$lambda$4;
        w01 TextButton$lambda$7;
        w01 FilledTonalButton$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedButton$lambda$6 = ButtonKt.OutlinedButton$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return OutlinedButton$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Button$lambda$3 = ButtonKt.Button$lambda$3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return Button$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                ElevatedButton$lambda$4 = ButtonKt.ElevatedButton$lambda$4(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue3);
                return ElevatedButton$lambda$4;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                TextButton$lambda$7 = ButtonKt.TextButton$lambda$7(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue4);
                return TextButton$lambda$7;
            default:
                int intValue5 = ((Integer) obj2).intValue();
                FilledTonalButton$lambda$5 = ButtonKt.FilledTonalButton$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue5);
                return FilledTonalButton$lambda$5;
        }
    }
}
