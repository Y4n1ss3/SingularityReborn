package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.iy;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PressDownGestureKt {
    public static final Object detectPressDownGesture(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, iy iyVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, iyVar, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, iy iyVar, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            iyVar = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, iyVar, hmVar);
    }
}
