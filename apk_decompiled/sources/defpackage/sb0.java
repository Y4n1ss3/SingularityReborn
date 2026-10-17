package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sb0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Placeable h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Placeable l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ Placeable o;
    public final /* synthetic */ int p;
    public final /* synthetic */ float q;
    public final /* synthetic */ int r;
    public final /* synthetic */ MeasureScope s;

    public /* synthetic */ sb0(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, MeasureScope measureScope, int i5) {
        this.d = i5;
        this.e = placeable;
        this.f = z;
        this.g = f;
        this.h = placeable2;
        this.i = i;
        this.j = f2;
        this.k = f3;
        this.l = placeable3;
        this.m = i2;
        this.n = f4;
        this.o = placeable4;
        this.p = i3;
        this.q = f5;
        this.r = i4;
        this.s = measureScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 placeLabelAndIcon_zUg2_y0$lambda$27;
        w01 placeLabelAndIcon_zUg2_y0$lambda$22;
        switch (this.d) {
            case 0:
                placeLabelAndIcon_zUg2_y0$lambda$27 = NavigationBarKt.placeLabelAndIcon_zUg2_y0$lambda$27(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Placeable.PlacementScope) obj);
                return placeLabelAndIcon_zUg2_y0$lambda$27;
            default:
                placeLabelAndIcon_zUg2_y0$lambda$22 = NavigationRailKt.placeLabelAndIcon_zUg2_y0$lambda$22(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Placeable.PlacementScope) obj);
                return placeLabelAndIcon_zUg2_y0$lambda$22;
        }
    }
}
