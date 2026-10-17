package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RootMeasurePolicy$measure$3 extends f30 implements ky {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RootMeasurePolicy$measure$3(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list.get(i), 0, 0, 0.0f, (ky) null, 12, (Object) null);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
