package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.my;
import defpackage.ut;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(ut.d);
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    @er
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(my myVar) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, myVar);
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    @er
    public static final Modifier pointerInput(Modifier modifier, my myVar) {
        throw new IllegalStateException(PointerInputModifierNoParamError);
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }
}
