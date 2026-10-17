package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;

    public /* synthetic */ s4(Density density, int i) {
        this.d = i;
        this.e = density;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float anchoredDraggableFlingBehavior$lambda$0;
        int i = this.d;
        Density density = this.e;
        switch (i) {
            case 0:
                anchoredDraggableFlingBehavior$lambda$0 = AnchoredDraggableKt.anchoredDraggableFlingBehavior$lambda$0(density);
                break;
            case 1:
                anchoredDraggableFlingBehavior$lambda$0 = ModalWideNavigationRailState.anchoredDraggableState$lambda$2(density);
                break;
            case 2:
                anchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$9(density);
                break;
            case 3:
                anchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$11(density);
                break;
            case 4:
                anchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$3(density);
                break;
            case 5:
                anchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$5(density);
                break;
            default:
                anchoredDraggableFlingBehavior$lambda$0 = SwipeToDismissBoxState._init_$lambda$2(density);
                break;
        }
        return Float.valueOf(anchoredDraggableFlingBehavior$lambda$0);
    }
}
