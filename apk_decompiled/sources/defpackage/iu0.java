package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class iu0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ii0 e;
    public final /* synthetic */ ii0 f;
    public final /* synthetic */ TextFieldSelectionState g;

    public /* synthetic */ iu0(ii0 ii0Var, ii0 ii0Var2, TextFieldSelectionState textFieldSelectionState, int i) {
        this.d = i;
        this.e = ii0Var;
        this.f = ii0Var2;
        this.g = textFieldSelectionState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 detectSelectionHandleDragGestures$lambda$2;
        w01 detectCursorHandleDragGestures$lambda$1;
        w01 detectCursorHandleDragGestures$lambda$2;
        w01 detectSelectionHandleDragGestures$lambda$1;
        int i = this.d;
        ii0 ii0Var = this.f;
        TextFieldSelectionState textFieldSelectionState = this.g;
        ii0 ii0Var2 = this.e;
        switch (i) {
            case 0:
                detectSelectionHandleDragGestures$lambda$2 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$2(ii0Var2, textFieldSelectionState, ii0Var);
                return detectSelectionHandleDragGestures$lambda$2;
            case 1:
                detectCursorHandleDragGestures$lambda$1 = TextFieldSelectionState.detectCursorHandleDragGestures$lambda$1(ii0Var2, ii0Var, textFieldSelectionState);
                return detectCursorHandleDragGestures$lambda$1;
            case 2:
                detectCursorHandleDragGestures$lambda$2 = TextFieldSelectionState.detectCursorHandleDragGestures$lambda$2(ii0Var2, ii0Var, textFieldSelectionState);
                return detectCursorHandleDragGestures$lambda$2;
            default:
                detectSelectionHandleDragGestures$lambda$1 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$1(ii0Var2, textFieldSelectionState, ii0Var);
                return detectSelectionHandleDragGestures$lambda$1;
        }
    }

    public /* synthetic */ iu0(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2, int i) {
        this.d = i;
        this.e = ii0Var;
        this.g = textFieldSelectionState;
        this.f = ii0Var2;
    }
}
