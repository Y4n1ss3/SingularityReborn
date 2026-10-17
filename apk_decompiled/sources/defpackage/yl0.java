package defpackage;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SearchBarDefaults;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yl0 implements KeyboardActionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ky b;
    public final /* synthetic */ TextFieldState c;

    public /* synthetic */ yl0(ky kyVar, TextFieldState textFieldState, int i) {
        this.a = i;
        this.b = kyVar;
        this.c = textFieldState;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(iy iyVar) {
        switch (this.a) {
            case 0:
                SearchBarDefaults.InputField$lambda$13$lambda$12(this.b, this.c, iyVar);
                break;
            default:
                SearchBarDefaults.InputField$lambda$29$lambda$28(this.b, this.c, iyVar);
                break;
        }
    }
}
