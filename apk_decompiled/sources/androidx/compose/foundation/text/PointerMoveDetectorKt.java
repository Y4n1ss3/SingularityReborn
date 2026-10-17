package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.ky;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {
    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, ky kyVar, hm hmVar) {
        Object n = p10.n(new PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, kyVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, ky kyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, kyVar, hmVar);
    }
}
