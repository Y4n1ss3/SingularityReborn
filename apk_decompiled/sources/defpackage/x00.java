package defpackage;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.layout.InsetsPaddingModifierNode;
import androidx.compose.material3.MinimumInteractiveModifierNode;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x00 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Placeable f;
    public final /* synthetic */ int g;

    public /* synthetic */ x00(int i, int i2, Placeable placeable) {
        this.d = 1;
        this.e = i;
        this.f = placeable;
        this.g = i2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$0;
        w01 measure_3p2s80s$lambda$02;
        w01 measure_3p2s80s$lambda$0$0;
        int i = this.d;
        int i2 = this.g;
        int i3 = this.e;
        Placeable placeable = this.f;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$0 = InsetsPaddingModifierNode.measure_3p2s80s$lambda$0(placeable, i3, i2, placementScope);
                return measure_3p2s80s$lambda$0;
            case 1:
                measure_3p2s80s$lambda$02 = MinimumInteractiveModifierNode.measure_3p2s80s$lambda$0(i3, placeable, i2, placementScope);
                return measure_3p2s80s$lambda$02;
            default:
                measure_3p2s80s$lambda$0$0 = ScrollNode.measure_3p2s80s$lambda$0$0(placeable, i3, i2, placementScope);
                return measure_3p2s80s$lambda$0$0;
        }
    }

    public /* synthetic */ x00(Placeable placeable, int i, int i2, int i3) {
        this.d = i3;
        this.f = placeable;
        this.e = i;
        this.g = i2;
    }
}
