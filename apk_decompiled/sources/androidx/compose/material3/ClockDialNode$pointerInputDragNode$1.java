package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputDragNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode this$0;

    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode) {
        this.this$0 = clockDialNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(ClockDialNode clockDialNode) {
        p01.t(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputDragNode$1$1$1(clockDialNode, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1(ClockDialNode clockDialNode, PointerInputChange pointerInputChange, Offset offset) {
        p01.t(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputDragNode$1$2$1(clockDialNode, offset, null), 3);
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        ClockDialNode clockDialNode = this.this$0;
        Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, new f(clockDialNode, 1), null, new n(clockDialNode, 0), hmVar, 5, null);
        return detectDragGestures$default == vn.d ? detectDragGestures$default : w01.a;
    }
}
