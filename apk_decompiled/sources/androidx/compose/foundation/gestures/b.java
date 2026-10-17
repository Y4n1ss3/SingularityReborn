package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnchoredDraggableNode e;
    public final /* synthetic */ AnchoredDragScope f;

    public /* synthetic */ b(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope, int i) {
        this.d = i;
        this.e = anchoredDraggableNode;
        this.f = anchoredDragScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        Offset invokeSuspend$lambda$0$0;
        w01 invokeSuspend$lambda$0;
        switch (this.d) {
            case 0:
                invokeSuspend$lambda$0$0 = AnchoredDraggableNode$drag$2.invokeSuspend$lambda$0$0(this.e, this.f, (Offset) obj);
                return invokeSuspend$lambda$0$0;
            default:
                invokeSuspend$lambda$0 = AnchoredDraggableNode$drag$2.invokeSuspend$lambda$0(this.e, this.f, (DragEvent.DragDelta) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
