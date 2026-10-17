package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;

    public /* synthetic */ h0(int i, Placeable placeable) {
        this.d = i;
        this.e = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$4$lambda$3$lambda$2;
        w01 measure_3p2s80s$lambda$1;
        int i = this.d;
        Placeable placeable = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                invoke$lambda$4$lambda$3$lambda$2 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$4$lambda$3$lambda$2(placeable, placementScope);
                return invoke$lambda$4$lambda$3$lambda$2;
            default:
                measure_3p2s80s$lambda$1 = VisibleModifier.measure_3p2s80s$lambda$1(placeable, placementScope);
                return measure_3p2s80s$lambda$1;
        }
    }
}
