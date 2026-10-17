package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RootMeasurePolicy$measure$2 extends f30 implements ky {
    final /* synthetic */ Placeable $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$2(Placeable placeable) {
        super(1);
        this.$placeable = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, (ky) null, 12, (Object) null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
