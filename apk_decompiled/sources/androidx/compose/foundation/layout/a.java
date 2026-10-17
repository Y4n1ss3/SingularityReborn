package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;

    public /* synthetic */ a(int i, Placeable placeable) {
        this.d = i;
        this.e = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$0;
        w01 measure_3p2s80s$lambda$1;
        w01 measure_3p2s80s$lambda$12;
        w01 measure_3p2s80s$lambda$02;
        w01 measure_3p2s80s$lambda$03;
        w01 measure_3p2s80s$lambda$04;
        w01 measure_3p2s80s$lambda$13;
        w01 measure_3p2s80s$lambda$05;
        int i = this.d;
        Placeable placeable = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$0 = AspectRatioNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$0;
            case 1:
                measure_3p2s80s$lambda$1 = DerivedHeightModifierNode.measure_3p2s80s$lambda$1(placeable, placementScope);
                return measure_3p2s80s$lambda$1;
            case 2:
                measure_3p2s80s$lambda$12 = DerivedWidthModifierNode.measure_3p2s80s$lambda$1(placeable, placementScope);
                return measure_3p2s80s$lambda$12;
            case 3:
                measure_3p2s80s$lambda$02 = FillNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$02;
            case 4:
                measure_3p2s80s$lambda$03 = IntrinsicSizeModifier.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$03;
            case 5:
                measure_3p2s80s$lambda$04 = RecalculateWindowInsetsModifierNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$04;
            case 6:
                measure_3p2s80s$lambda$13 = SizeNode.measure_3p2s80s$lambda$1(placeable, placementScope);
                return measure_3p2s80s$lambda$13;
            default:
                measure_3p2s80s$lambda$05 = UnspecifiedConstraintsNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$05;
        }
    }
}
