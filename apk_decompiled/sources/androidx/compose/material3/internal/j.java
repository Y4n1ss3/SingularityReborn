package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    public /* synthetic */ j(Placeable placeable, float f, float f2, int i) {
        this.d = i;
        this.e = placeable;
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$1$lambda$0;
        w01 measure_3p2s80s$lambda$1$lambda$02;
        switch (this.d) {
            case 0:
                measure_3p2s80s$lambda$1$lambda$0 = DraggableAnchorsNode.measure_3p2s80s$lambda$1$lambda$0(this.e, this.f, this.g, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1$lambda$0;
            default:
                measure_3p2s80s$lambda$1$lambda$02 = DraggableAnchorsNodeV2.measure_3p2s80s$lambda$1$lambda$0(this.e, this.f, this.g, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1$lambda$02;
        }
    }
}
