package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ LegacyTextFieldState e;

    public /* synthetic */ xm(LegacyTextFieldState legacyTextFieldState, int i) {
        this.d = i;
        this.e = legacyTextFieldState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 CoreTextField$lambda$16$0;
        w01 CoreTextField$lambda$25;
        w01 onValueChange$lambda$0;
        w01 onImeActionPerformed$lambda$0;
        boolean onImeActionPerformedWithResult$lambda$0;
        int i = this.d;
        LegacyTextFieldState legacyTextFieldState = this.e;
        switch (i) {
            case 0:
                CoreTextField$lambda$16$0 = CoreTextFieldKt.CoreTextField$lambda$16$0(legacyTextFieldState, ((Boolean) obj).booleanValue());
                return CoreTextField$lambda$16$0;
            case 1:
                CoreTextField$lambda$25 = CoreTextFieldKt.CoreTextField$lambda$25(legacyTextFieldState, (LayoutCoordinates) obj);
                return CoreTextField$lambda$25;
            case 2:
                onValueChange$lambda$0 = LegacyTextFieldState.onValueChange$lambda$0(legacyTextFieldState, (TextFieldValue) obj);
                return onValueChange$lambda$0;
            case 3:
                onImeActionPerformed$lambda$0 = LegacyTextFieldState.onImeActionPerformed$lambda$0(legacyTextFieldState, (ImeAction) obj);
                return onImeActionPerformed$lambda$0;
            default:
                onImeActionPerformedWithResult$lambda$0 = LegacyTextFieldState.onImeActionPerformedWithResult$lambda$0(legacyTextFieldState, (ImeAction) obj);
                return Boolean.valueOf(onImeActionPerformedWithResult$lambda$0);
        }
    }
}
