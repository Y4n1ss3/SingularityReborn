package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ IconButtonColors i;
    public final /* synthetic */ MutableInteractionSource j;
    public final /* synthetic */ my k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ f00(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, int i, int i2) {
        this.d = 0;
        this.e = iyVar;
        this.f = modifier;
        this.g = z;
        this.i = iconButtonColors;
        this.j = mutableInteractionSource;
        this.h = shape;
        this.k = myVar;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 IconButton$lambda$1;
        w01 FilledIconButton$lambda$10;
        w01 FilledTonalIconButton$lambda$14;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                IconButton$lambda$1 = IconButtonKt.IconButton$lambda$1(this.e, this.f, this.g, this.i, this.j, this.h, this.k, this.l, this.m, (Composer) obj, intValue);
                return IconButton$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                iy iyVar = this.e;
                Modifier modifier = this.f;
                boolean z = this.g;
                IconButtonColors iconButtonColors = this.i;
                MutableInteractionSource mutableInteractionSource = this.j;
                FilledIconButton$lambda$10 = IconButtonKt.FilledIconButton$lambda$10(iyVar, modifier, z, this.h, iconButtonColors, mutableInteractionSource, this.k, this.l, this.m, (Composer) obj, intValue2);
                return FilledIconButton$lambda$10;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                iy iyVar2 = this.e;
                Modifier modifier2 = this.f;
                boolean z2 = this.g;
                IconButtonColors iconButtonColors2 = this.i;
                MutableInteractionSource mutableInteractionSource2 = this.j;
                FilledTonalIconButton$lambda$14 = IconButtonKt.FilledTonalIconButton$lambda$14(iyVar2, modifier2, z2, this.h, iconButtonColors2, mutableInteractionSource2, this.k, this.l, this.m, (Composer) obj, intValue3);
                return FilledTonalIconButton$lambda$14;
        }
    }

    public /* synthetic */ f00(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = z;
        this.h = shape;
        this.i = iconButtonColors;
        this.j = mutableInteractionSource;
        this.k = myVar;
        this.l = i;
        this.m = i2;
    }
}
