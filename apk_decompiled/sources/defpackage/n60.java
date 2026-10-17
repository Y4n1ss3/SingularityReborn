package defpackage;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class n60 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextDragObserver e;

    public /* synthetic */ n60(TextDragObserver textDragObserver, int i) {
        this.d = i;
        this.e = textDragObserver;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 detectDragGesturesWithObserver$lambda$0;
        w01 w01Var;
        w01 w01Var2;
        int i = this.d;
        TextDragObserver textDragObserver = this.e;
        switch (i) {
            case 0:
                detectDragGesturesWithObserver$lambda$0 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$0(textDragObserver, (Offset) obj);
                return detectDragGesturesWithObserver$lambda$0;
            case 1:
                w01Var = SelectionGesturesKt.touchSelectionFirstPress$lambda$0(textDragObserver, (PointerInputChange) obj);
                return w01Var;
            default:
                w01Var2 = SelectionGesturesKt.touchSelectionSubsequentPress$lambda$0(textDragObserver, (PointerInputChange) obj);
                return w01Var2;
        }
    }
}
