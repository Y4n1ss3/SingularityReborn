package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionState e;
    public final /* synthetic */ int f;

    public /* synthetic */ hd(TextFieldSelectionState textFieldSelectionState, int i, int i2) {
        this.d = i2;
        this.e = textFieldSelectionState;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TextFieldCursorHandle$lambda$4;
        w01 TextFieldSelectionHandles$lambda$8;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                TextFieldCursorHandle$lambda$4 = BasicTextFieldKt.TextFieldCursorHandle$lambda$4(this.e, this.f, composer, intValue);
                return TextFieldCursorHandle$lambda$4;
            default:
                TextFieldSelectionHandles$lambda$8 = BasicTextFieldKt.TextFieldSelectionHandles$lambda$8(this.e, this.f, composer, intValue);
                return TextFieldSelectionHandles$lambda$8;
        }
    }
}
