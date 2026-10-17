package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ai implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iy f;
    public final /* synthetic */ my g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ my j;
    public final /* synthetic */ my k;
    public final /* synthetic */ Shape l;
    public final /* synthetic */ SelectableChipColors m;
    public final /* synthetic */ SelectableChipElevation n;
    public final /* synthetic */ BorderStroke o;
    public final /* synthetic */ MutableInteractionSource p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    public /* synthetic */ ai(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.e = z;
        this.f = iyVar;
        this.g = myVar;
        this.h = modifier;
        this.i = z2;
        this.j = myVar2;
        this.k = myVar3;
        this.l = shape;
        this.m = selectableChipColors;
        this.n = selectableChipElevation;
        this.o = borderStroke;
        this.p = mutableInteractionSource;
        this.q = i;
        this.r = i2;
        this.s = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 FilterChip$lambda$6;
        w01 ElevatedFilterChip$lambda$7;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                FilterChip$lambda$6 = ChipKt.FilterChip$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue);
                return FilterChip$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ElevatedFilterChip$lambda$7 = ChipKt.ElevatedFilterChip$lambda$7(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue2);
                return ElevatedFilterChip$lambda$7;
        }
    }
}
