package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.er;
import defpackage.my;
import defpackage.yn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    default PointerInputEventHandler getPointerInputEventHandler() {
        throw new yn("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    my getPointerInputHandler();

    void resetPointerInputHandler();

    default void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        throw new yn("An operation is not implemented: ".concat("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }

    void setPointerInputHandler(my myVar);

    @er
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }
}
