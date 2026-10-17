package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;

    public /* synthetic */ g(int i, my myVar) {
        this.d = i;
        this.e = myVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$1;
        w01 invokeSuspend$lambda$12;
        int i = this.d;
        my myVar = this.e;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend$lambda$0(myVar, pointerInputChange);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$1 = DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$1(myVar, pointerInputChange);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$12 = DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$1(myVar, pointerInputChange);
                return invokeSuspend$lambda$12;
        }
    }
}
