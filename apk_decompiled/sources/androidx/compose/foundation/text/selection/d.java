package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 invokeSuspend$lambda$0$0;
        w01 invokeSuspend$lambda$0$1;
        w01 invokeSuspend$lambda$0$2;
        w01 invokeSuspend$lambda$0$3;
        w01 invokeSuspend$lambda$0$4;
        Offset invokeSuspend$lambda$0;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0$0 = TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.invokeSuspend$lambda$0$0((TextFieldSelectionManager) obj);
                return invokeSuspend$lambda$0$0;
            case 1:
                invokeSuspend$lambda$0$1 = TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.invokeSuspend$lambda$0$1((TextFieldSelectionManager) obj);
                return invokeSuspend$lambda$0$1;
            case 2:
                invokeSuspend$lambda$0$2 = TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.invokeSuspend$lambda$0$2((TextFieldSelectionManager) obj);
                return invokeSuspend$lambda$0$2;
            case 3:
                invokeSuspend$lambda$0$3 = TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.invokeSuspend$lambda$0$3((TextFieldSelectionManager) obj);
                return invokeSuspend$lambda$0$3;
            case 4:
                invokeSuspend$lambda$0$4 = TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.invokeSuspend$lambda$0$4((TextFieldSelectionManager) obj);
                return invokeSuspend$lambda$0$4;
            default:
                invokeSuspend$lambda$0 = SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.invokeSuspend$lambda$0((State) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
