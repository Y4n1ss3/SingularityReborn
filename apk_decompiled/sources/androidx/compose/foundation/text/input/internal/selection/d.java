package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionState e;

    public /* synthetic */ d(TextFieldSelectionState textFieldSelectionState, int i) {
        this.d = i;
        this.e = textFieldSelectionState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        int i = this.d;
        TextFieldSelectionState textFieldSelectionState = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = TextFieldSelectionState$cursorHandleGestures$2.AnonymousClass3.invokeSuspend$lambda$0(textFieldSelectionState, (Offset) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = TextFieldSelectionState$selectionHandleGestures$2.invokeSuspend$lambda$0(textFieldSelectionState, (Throwable) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
