package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.iy;
import defpackage.n60;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, hm hmVar) {
        Object n = p10.n(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, hm hmVar) {
        final int i = 0;
        n60 n60Var = new n60(textDragObserver, i);
        iy iyVar = new iy() { // from class: o60
            @Override // defpackage.iy
            public final Object invoke() {
                w01 detectDragGesturesWithObserver$lambda$1;
                w01 detectDragGesturesWithObserver$lambda$2;
                int i2 = i;
                TextDragObserver textDragObserver2 = textDragObserver;
                switch (i2) {
                    case 0:
                        detectDragGesturesWithObserver$lambda$1 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$1(textDragObserver2);
                        return detectDragGesturesWithObserver$lambda$1;
                    default:
                        detectDragGesturesWithObserver$lambda$2 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$2(textDragObserver2);
                        return detectDragGesturesWithObserver$lambda$2;
                }
            }
        };
        final int i2 = 1;
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, n60Var, iyVar, new iy() { // from class: o60
            @Override // defpackage.iy
            public final Object invoke() {
                w01 detectDragGesturesWithObserver$lambda$1;
                w01 detectDragGesturesWithObserver$lambda$2;
                int i22 = i2;
                TextDragObserver textDragObserver2 = textDragObserver;
                switch (i22) {
                    case 0:
                        detectDragGesturesWithObserver$lambda$1 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$1(textDragObserver2);
                        return detectDragGesturesWithObserver$lambda$1;
                    default:
                        detectDragGesturesWithObserver$lambda$2 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$2(textDragObserver2);
                        return detectDragGesturesWithObserver$lambda$2;
                }
            }
        }, new w5(textDragObserver, 6), hmVar);
        return detectDragGestures == vn.d ? detectDragGestures : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGesturesWithObserver$lambda$0(TextDragObserver textDragObserver, Offset offset) {
        textDragObserver.mo1172onStart3MmeM6k(offset.m4526unboximpl(), SelectionAdjustment.Companion.getNone());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGesturesWithObserver$lambda$1(TextDragObserver textDragObserver) {
        textDragObserver.onStop();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGesturesWithObserver$lambda$2(TextDragObserver textDragObserver) {
        textDragObserver.onCancel();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGesturesWithObserver$lambda$3(TextDragObserver textDragObserver, PointerInputChange pointerInputChange, Offset offset) {
        textDragObserver.mo1171onDragk4lQ0M(offset.m4526unboximpl());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }
}
