package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        Offset performScrollForOverscroll$lambda$0;
        boolean updatedCanPan$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = Scrollable2DNode$drag$2$1.invokeSuspend$lambda$0((NestedScrollScope) obj2, (DragEvent.DragDelta) obj);
                return invokeSuspend$lambda$0;
            case 1:
                performScrollForOverscroll$lambda$0 = ScrollingLogic2D.performScrollForOverscroll$lambda$0((ScrollingLogic2D) obj2, (Offset) obj);
                return performScrollForOverscroll$lambda$0;
            default:
                updatedCanPan$lambda$0 = TransformableNode.updatedCanPan$lambda$0((TransformableNode) obj2, (Offset) obj);
                return Boolean.valueOf(updatedCanPan$lambda$0);
        }
    }
}
