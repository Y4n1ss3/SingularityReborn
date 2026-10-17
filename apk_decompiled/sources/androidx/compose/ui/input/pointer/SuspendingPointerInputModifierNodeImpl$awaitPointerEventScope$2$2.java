package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2 extends f30 implements ky {
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> $handlerCoroutine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine) {
        super(1);
        this.$handlerCoroutine = pointerEventHandlerCoroutine;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w01.a;
    }

    public final void invoke(Throwable th) {
        this.$handlerCoroutine.cancel(th);
    }
}
