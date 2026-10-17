package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.NavigationRailItemColors;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iy f;
    public final /* synthetic */ my g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ty j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ yd(PopupPositionProvider popupPositionProvider, my myVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar2, int i, int i2) {
        this.n = popupPositionProvider;
        this.g = myVar;
        this.o = tooltipState;
        this.h = modifier;
        this.f = iyVar;
        this.e = z;
        this.i = z2;
        this.k = z3;
        this.j = myVar2;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicTooltipBox$lambda$5;
        w01 NavigationRailItem$lambda$11;
        w01 TooltipBox$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicTooltipBox$lambda$5 = BasicTooltipKt.BasicTooltipBox$lambda$5((PopupPositionProvider) this.n, this.g, (TooltipState) this.o, this.h, this.f, this.e, this.i, this.k, (my) this.j, this.l, this.m, (Composer) obj, intValue);
                return BasicTooltipBox$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                NavigationRailItem$lambda$11 = NavigationRailKt.NavigationRailItem$lambda$11(this.e, this.f, this.g, this.h, this.i, (my) this.j, this.k, (NavigationRailItemColors) this.n, (MutableInteractionSource) this.o, this.l, this.m, (Composer) obj, intValue2);
                return NavigationRailItem$lambda$11;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                TooltipBox$lambda$5 = TooltipKt.TooltipBox$lambda$5((PopupPositionProvider) this.n, (ny) this.j, (TooltipState) this.o, this.h, this.f, this.e, this.i, this.k, this.g, this.l, this.m, (Composer) obj, intValue3);
                return TooltipBox$lambda$5;
        }
    }

    public /* synthetic */ yd(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar, int i, int i2) {
        this.n = popupPositionProvider;
        this.j = nyVar;
        this.o = tooltipState;
        this.h = modifier;
        this.f = iyVar;
        this.e = z;
        this.i = z2;
        this.k = z3;
        this.g = myVar;
        this.l = i;
        this.m = i2;
    }

    public /* synthetic */ yd(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = z;
        this.f = iyVar;
        this.g = myVar;
        this.h = modifier;
        this.i = z2;
        this.j = myVar2;
        this.k = z3;
        this.n = navigationRailItemColors;
        this.o = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }
}
