package defpackage;

import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qn0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ qn0(Density density, MutableState mutableState, int i) {
        this.d = i;
        this.e = density;
        this.f = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 selectionMagnifier$lambda$0$4$0$1;
        Modifier selectionMagnifier$lambda$0$4$0;
        Modifier textFieldMagnifier$lambda$0$4$0;
        w01 textFieldMagnifier$lambda$0$4$0$1;
        switch (this.d) {
            case 0:
                selectionMagnifier$lambda$0$4$0$1 = SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$1(this.e, this.f, (DpSize) obj);
                return selectionMagnifier$lambda$0$4$0$1;
            case 1:
                selectionMagnifier$lambda$0$4$0 = SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0(this.e, this.f, (iy) obj);
                return selectionMagnifier$lambda$0$4$0;
            case 2:
                textFieldMagnifier$lambda$0$4$0 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0(this.e, this.f, (iy) obj);
                return textFieldMagnifier$lambda$0$4$0;
            default:
                textFieldMagnifier$lambda$0$4$0$1 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$1(this.e, this.f, (DpSize) obj);
                return textFieldMagnifier$lambda$0$4$0$1;
        }
    }
}
