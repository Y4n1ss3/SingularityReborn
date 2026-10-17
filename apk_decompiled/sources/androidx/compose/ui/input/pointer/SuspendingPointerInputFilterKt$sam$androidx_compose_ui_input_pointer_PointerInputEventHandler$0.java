package androidx.compose.ui.input.pointer;

import defpackage.hm;
import defpackage.my;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, uy {
    private final /* synthetic */ my function;

    public SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(my myVar) {
        this.function = myVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof uy)) {
            return q10.b(getFunctionDelegate(), ((uy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.uy
    public final ty getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        return this.function.invoke(pointerInputScope, hmVar);
    }
}
