package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ CardColors i;
    public final /* synthetic */ CardElevation j;
    public final /* synthetic */ BorderStroke k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ ny m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ ig(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = z;
        this.h = shape;
        this.i = cardColors;
        this.j = cardElevation;
        this.k = borderStroke;
        this.l = mutableInteractionSource;
        this.m = nyVar;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Card$lambda$2;
        w01 OutlinedCard$lambda$6;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Card$lambda$2 = CardKt.Card$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue);
                return Card$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                OutlinedCard$lambda$6 = CardKt.OutlinedCard$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return OutlinedCard$lambda$6;
        }
    }
}
