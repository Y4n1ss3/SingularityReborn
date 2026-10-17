package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Placeable f;

    public /* synthetic */ q1(ArrayList arrayList, Placeable placeable, int i) {
        this.d = i;
        this.e = arrayList;
        this.f = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$3;
        w01 measure_3p2s80s$lambda$32;
        int i = this.d;
        Placeable placeable = this.f;
        ArrayList arrayList = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$3 = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.measure_3p2s80s$lambda$3(arrayList, placeable, placementScope);
                return measure_3p2s80s$lambda$3;
            default:
                measure_3p2s80s$lambda$32 = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.measure_3p2s80s$lambda$3(arrayList, placeable, placementScope);
                return measure_3p2s80s$lambda$32;
        }
    }
}
