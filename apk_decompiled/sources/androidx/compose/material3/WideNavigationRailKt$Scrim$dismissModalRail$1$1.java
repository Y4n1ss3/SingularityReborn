package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailKt$Scrim$dismissModalRail$1$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableState<Boolean> $dismiss$delegate;

    public WideNavigationRailKt$Scrim$dismissModalRail$1$1(MutableState<Boolean> mutableState) {
        this.$dismiss$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(MutableState mutableState, Offset offset) {
        WideNavigationRailKt.Scrim_3J_VO9M$lambda$29(mutableState, true);
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new r1(this.$dismiss$delegate, 3), hmVar, 7, null);
        return detectTapGestures$default == vn.d ? detectTapGestures$default : w01.a;
    }
}
