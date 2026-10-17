package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.iy;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$Scrim$dismissSheet$1$1 implements PointerInputEventHandler {
    final /* synthetic */ iy $onDismissRequest;

    public ModalBottomSheetKt$Scrim$dismissSheet$1$1(iy iyVar) {
        this.$onDismissRequest = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(iy iyVar, Offset offset) {
        iyVar.invoke();
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new m0(0, this.$onDismissRequest), hmVar, 7, null);
        return detectTapGestures$default == vn.d ? detectTapGestures$default : w01.a;
    }
}
