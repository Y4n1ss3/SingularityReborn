package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.hm;
import defpackage.ky;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClickableTextKt$ClickableText$pressIndicator$1$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ ky $onClick;

    public ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, ky kyVar) {
        this.$layoutResult = mutableState;
        this.$onClick = kyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(MutableState mutableState, ky kyVar, Offset offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult != null) {
            kyVar.invoke(Integer.valueOf(textLayoutResult.m7030getOffsetForPositionk4lQ0M(offset.m4526unboximpl())));
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new c(0, this.$layoutResult, this.$onClick), hmVar, 7, null);
        return detectTapGestures$default == vn.d ? detectTapGestures$default : w01.a;
    }
}
