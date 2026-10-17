package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.gi0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ gi0 e;

    public /* synthetic */ h(gi0 gi0Var, int i) {
        this.d = i;
        this.e = gi0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        int i = this.d;
        gi0 gi0Var = this.e;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$0(gi0Var, pointerInputChange, floatValue);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$0(gi0Var, pointerInputChange, floatValue);
                return invokeSuspend$lambda$02;
        }
    }
}
