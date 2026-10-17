package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ny j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ jg(int i, my myVar, ny nyVar, my myVar2, my myVar3, WindowInsets windowInsets, my myVar4, int i2) {
        this.d = 2;
        this.k = i;
        this.e = myVar;
        this.j = nyVar;
        this.f = myVar2;
        this.g = myVar3;
        this.h = windowInsets;
        this.i = myVar4;
        this.l = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedCard$lambda$5;
        w01 Card$lambda$0;
        w01 ScaffoldLayout_FMILGgc$lambda$16;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedCard$lambda$5 = CardKt.OutlinedCard$lambda$5((Modifier) this.e, (Shape) this.f, (CardColors) this.g, (CardElevation) this.h, (BorderStroke) this.i, this.j, this.k, this.l, (Composer) obj, intValue);
                return OutlinedCard$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Card$lambda$0 = CardKt.Card$lambda$0((Modifier) this.e, (Shape) this.f, (CardColors) this.g, (CardElevation) this.h, (BorderStroke) this.i, this.j, this.k, this.l, (Composer) obj, intValue2);
                return Card$lambda$0;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ScaffoldLayout_FMILGgc$lambda$16 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$16(this.k, (my) this.e, this.j, (my) this.f, (my) this.g, (WindowInsets) this.h, (my) this.i, this.l, (Composer) obj, intValue3);
                return ScaffoldLayout_FMILGgc$lambda$16;
        }
    }

    public /* synthetic */ jg(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, ny nyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = shape;
        this.g = cardColors;
        this.h = cardElevation;
        this.i = borderStroke;
        this.j = nyVar;
        this.k = i;
        this.l = i2;
    }
}
