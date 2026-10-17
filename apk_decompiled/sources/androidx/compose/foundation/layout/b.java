package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$0;
        w01 measure_3p2s80s$lambda$02;
        w01 measure_3p2s80s$lambda$03;
        w01 measure_3p2s80s$lambda$04;
        w01 measure_0kLqBqw$lambda$0;
        w01 measure_3p2s80s$lambda$05;
        w01 measure_3p2s80s$lambda$1;
        w01 measure_3p2s80s$lambda$0$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (this.d) {
            case 0:
                measure_3p2s80s$lambda$0 = BoxKt$EmptyBoxMeasurePolicy$1.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$0;
            case 1:
                measure_3p2s80s$lambda$02 = BoxMeasurePolicy.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$02;
            case 2:
                measure_3p2s80s$lambda$03 = DerivedHeightModifierNode.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$03;
            case 3:
                measure_3p2s80s$lambda$04 = DerivedWidthModifierNode.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$04;
            case 4:
                measure_0kLqBqw$lambda$0 = FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$0(placementScope);
                return measure_0kLqBqw$lambda$0;
            case 5:
                measure_3p2s80s$lambda$05 = FlowMeasurePolicy.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$05;
            case 6:
                measure_3p2s80s$lambda$1 = FlowMeasurePolicy.measure_3p2s80s$lambda$1(placementScope);
                return measure_3p2s80s$lambda$1;
            default:
                measure_3p2s80s$lambda$0$0 = SpacerMeasurePolicy.measure_3p2s80s$lambda$0$0(placementScope);
                return measure_3p2s80s$lambda$0$0;
        }
    }
}
