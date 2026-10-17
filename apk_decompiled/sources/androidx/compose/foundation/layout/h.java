package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ Modifier.Node f;

    public /* synthetic */ h(Modifier.Node node, Placeable placeable, int i) {
        this.d = i;
        this.f = node;
        this.e = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$0;
        w01 measure_3p2s80s$lambda$02;
        w01 measure_3p2s80s$lambda$03;
        int i = this.d;
        Placeable placeable = this.e;
        Modifier.Node node = this.f;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$0 = OffsetNode.measure_3p2s80s$lambda$0((OffsetNode) node, placeable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            case 1:
                measure_3p2s80s$lambda$02 = OffsetPxNode.measure_3p2s80s$lambda$0((OffsetPxNode) node, placeable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$02;
            default:
                measure_3p2s80s$lambda$03 = PaddingNode.measure_3p2s80s$lambda$0((PaddingNode) node, placeable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$03;
        }
    }
}
