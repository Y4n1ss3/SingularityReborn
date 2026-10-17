package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c00 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ IconToggleButtonColors j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ my l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ c00(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = z;
        this.f = kyVar;
        this.g = modifier;
        this.h = z2;
        this.j = iconToggleButtonColors;
        this.k = mutableInteractionSource;
        this.i = shape;
        this.l = myVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 IconToggleButton$lambda$6;
        w01 FilledIconToggleButton$lambda$13;
        w01 FilledTonalIconToggleButton$lambda$17;
        w01 IconToggleButtonImpl$lambda$9;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                IconToggleButton$lambda$6 = IconButtonKt.IconToggleButton$lambda$6(this.e, this.f, this.g, this.h, this.j, this.k, this.i, this.l, this.m, this.n, (Composer) obj, intValue);
                return IconToggleButton$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                boolean z = this.e;
                ky kyVar = this.f;
                Modifier modifier = this.g;
                boolean z2 = this.h;
                IconToggleButtonColors iconToggleButtonColors = this.j;
                MutableInteractionSource mutableInteractionSource = this.k;
                FilledIconToggleButton$lambda$13 = IconButtonKt.FilledIconToggleButton$lambda$13(z, kyVar, modifier, z2, this.i, iconToggleButtonColors, mutableInteractionSource, this.l, this.m, this.n, (Composer) obj, intValue2);
                return FilledIconToggleButton$lambda$13;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                boolean z3 = this.e;
                ky kyVar2 = this.f;
                Modifier modifier2 = this.g;
                boolean z4 = this.h;
                IconToggleButtonColors iconToggleButtonColors2 = this.j;
                MutableInteractionSource mutableInteractionSource2 = this.k;
                FilledTonalIconToggleButton$lambda$17 = IconButtonKt.FilledTonalIconToggleButton$lambda$17(z3, kyVar2, modifier2, z4, this.i, iconToggleButtonColors2, mutableInteractionSource2, this.l, this.m, this.n, (Composer) obj, intValue3);
                return FilledTonalIconToggleButton$lambda$17;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                IconToggleButtonImpl$lambda$9 = IconButtonKt.IconToggleButtonImpl$lambda$9(this.e, this.f, this.g, this.h, this.j, this.k, this.i, this.l, this.m, this.n, (Composer) obj, intValue4);
                return IconToggleButtonImpl$lambda$9;
        }
    }

    public /* synthetic */ c00(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = z;
        this.f = kyVar;
        this.g = modifier;
        this.h = z2;
        this.i = shape;
        this.j = iconToggleButtonColors;
        this.k = mutableInteractionSource;
        this.l = myVar;
        this.m = i;
        this.n = i2;
    }
}
