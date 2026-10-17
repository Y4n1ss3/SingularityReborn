package androidx.compose.material3.internal;

import defpackage.iy;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnchoredDraggableState e;

    public /* synthetic */ d(AnchoredDraggableState anchoredDraggableState, int i) {
        this.d = i;
        this.e = anchoredDraggableState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        DraggableAnchors anchors;
        xe0 invokeSuspend$lambda$0;
        int i = this.d;
        AnchoredDraggableState anchoredDraggableState = this.e;
        switch (i) {
            case 0:
                anchors = anchoredDraggableState.getAnchors();
                return anchors;
            default:
                invokeSuspend$lambda$0 = AnchoredDraggableState$anchoredDrag$4.invokeSuspend$lambda$0(anchoredDraggableState);
                return invokeSuspend$lambda$0;
        }
    }
}
