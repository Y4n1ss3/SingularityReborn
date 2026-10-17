package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hu0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ ky f;

    public /* synthetic */ hu0(un unVar, ky kyVar, int i) {
        this.d = i;
        this.e = unVar;
        this.f = kyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$12;
        int i = this.d;
        ky kyVar = this.f;
        un unVar = this.e;
        switch (i) {
            case 0:
                addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(unVar, kyVar);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1;
            case 1:
                addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$12 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(unVar, kyVar);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$12;
            default:
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new lz0(kyVar, null), 2);
                return w01.a;
        }
    }
}
