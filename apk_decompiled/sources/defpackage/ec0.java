package defpackage;

import androidx.compose.material3.NavigationItemKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ec0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Placeable h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Placeable k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Placeable n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ec0(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, int i9) {
        this.d = i9;
        this.e = placeable;
        this.f = i;
        this.g = i2;
        this.h = placeable2;
        this.i = i3;
        this.j = i4;
        this.k = placeable3;
        this.l = i5;
        this.m = i6;
        this.n = placeable4;
        this.o = i7;
        this.p = i8;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 placeLabelAndTopIcon_qoqLrGI$lambda$37;
        w01 placeLabelAndStartIcon_nru01g4$lambda$38;
        switch (this.d) {
            case 0:
                placeLabelAndTopIcon_qoqLrGI$lambda$37 = NavigationItemKt.placeLabelAndTopIcon_qoqLrGI$lambda$37(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Placeable.PlacementScope) obj);
                return placeLabelAndTopIcon_qoqLrGI$lambda$37;
            default:
                placeLabelAndStartIcon_nru01g4$lambda$38 = NavigationItemKt.placeLabelAndStartIcon_nru01g4$lambda$38(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Placeable.PlacementScope) obj);
                return placeLabelAndStartIcon_nru01g4$lambda$38;
        }
    }
}
