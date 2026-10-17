package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import defpackage.h;
import defpackage.hm;
import defpackage.ky;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuGesturesKt {
    public static final Modifier contextMenuGestures(Modifier modifier, ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, new h(contextMenuState, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuGestures$lambda$0(ContextMenuState contextMenuState, Offset offset) {
        contextMenuState.setStatus(new ContextMenuState.Status.Open(offset.m4526unboximpl(), null));
        return w01.a;
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final ky kyVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ContextMenuKey.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGesturesKt$contextMenuGestures$2
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object onRightClickDown = RightClickGesturesKt.onRightClickDown(pointerInputScope, ky.this, hmVar);
                return onRightClickDown == vn.d ? onRightClickDown : w01.a;
            }
        });
    }
}
