package defpackage;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b6 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b6(Object obj, boolean z, boolean z2, int i) {
        this.d = i;
        this.g = obj;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 SelectionHandle_wLIcFTc$lambda$0$0;
        w01 SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8;
        switch (this.d) {
            case 0:
                SelectionHandle_wLIcFTc$lambda$0$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$0$0((OffsetProvider) this.g, this.e, this.f, (SemanticsPropertyReceiver) obj);
                return SelectionHandle_wLIcFTc$lambda$0$0;
            default:
                SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8((IntSize) this.g, this.e, this.f, (DraggableAnchorsConfig) obj);
                return SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8;
        }
    }
}
