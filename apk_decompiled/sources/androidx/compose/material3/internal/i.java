package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MeasureScope e;
    public final /* synthetic */ Placeable f;
    public final /* synthetic */ Modifier.Node g;

    public /* synthetic */ i(MeasureScope measureScope, Modifier.Node node, Placeable placeable, int i) {
        this.d = i;
        this.e = measureScope;
        this.g = node;
        this.f = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$1;
        w01 measure_3p2s80s$lambda$12;
        int i = this.d;
        Placeable placeable = this.f;
        Modifier.Node node = this.g;
        MeasureScope measureScope = this.e;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$1 = DraggableAnchorsNode.measure_3p2s80s$lambda$1(measureScope, (DraggableAnchorsNode) node, placeable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            default:
                measure_3p2s80s$lambda$12 = DraggableAnchorsNodeV2.measure_3p2s80s$lambda$1(measureScope, (DraggableAnchorsNodeV2) node, placeable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$12;
        }
    }
}
