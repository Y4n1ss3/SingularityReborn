package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wb0 implements ky {
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

    public /* synthetic */ wb0(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        this.d = 1;
        this.e = placeable;
        this.f = i;
        this.g = i2;
        this.h = placeable2;
        this.i = i3;
        this.j = i4;
        this.k = placeable3;
        this.l = i5;
        this.m = i6;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 placeIcon_X9ElhV4$lambda$25;
        w01 placeIcon_X9ElhV4$lambda$36;
        w01 placeIcon_X9ElhV4$lambda$20;
        switch (this.d) {
            case 0:
                Placeable placeable = this.e;
                int i = this.f;
                int i2 = this.g;
                Placeable placeable2 = this.h;
                int i3 = this.i;
                int i4 = this.j;
                placeIcon_X9ElhV4$lambda$25 = NavigationBarKt.placeIcon_X9ElhV4$lambda$25(placeable, placeable2, i, i2, this.k, i3, i4, this.l, this.m, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$25;
            case 1:
                placeIcon_X9ElhV4$lambda$36 = NavigationItemKt.placeIcon_X9ElhV4$lambda$36(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$36;
            default:
                Placeable placeable3 = this.e;
                int i5 = this.f;
                int i6 = this.g;
                Placeable placeable4 = this.h;
                int i7 = this.i;
                int i8 = this.j;
                placeIcon_X9ElhV4$lambda$20 = NavigationRailKt.placeIcon_X9ElhV4$lambda$20(placeable3, placeable4, i5, i6, this.k, i7, i8, this.l, this.m, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$20;
        }
    }

    public /* synthetic */ wb0(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, int i7) {
        this.d = i7;
        this.e = placeable;
        this.h = placeable2;
        this.f = i;
        this.g = i2;
        this.k = placeable3;
        this.i = i3;
        this.j = i4;
        this.l = i5;
        this.m = i6;
    }
}
