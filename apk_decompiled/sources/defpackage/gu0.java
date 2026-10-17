package defpackage;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class gu0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionManager e;

    public /* synthetic */ gu0(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.d = i;
        this.e = textFieldSelectionManager;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 contextMenuBuilder$lambda$0$0;
        w01 contextMenuBuilder$lambda$0$1;
        w01 contextMenuBuilder$lambda$0$2;
        w01 contextMenuBuilder$lambda$0$3;
        w01 contextMenuBuilder$lambda$0$4;
        boolean addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2;
        int i = this.d;
        TextFieldSelectionManager textFieldSelectionManager = this.e;
        switch (i) {
            case 0:
                contextMenuBuilder$lambda$0$0 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$0(textFieldSelectionManager);
                return contextMenuBuilder$lambda$0$0;
            case 1:
                contextMenuBuilder$lambda$0$1 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$1(textFieldSelectionManager);
                return contextMenuBuilder$lambda$0$1;
            case 2:
                contextMenuBuilder$lambda$0$2 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$2(textFieldSelectionManager);
                return contextMenuBuilder$lambda$0$2;
            case 3:
                contextMenuBuilder$lambda$0$3 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$3(textFieldSelectionManager);
                return contextMenuBuilder$lambda$0$3;
            case 4:
                contextMenuBuilder$lambda$0$4 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$4(textFieldSelectionManager);
                return contextMenuBuilder$lambda$0$4;
            case 5:
                addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0(textFieldSelectionManager);
                return Boolean.valueOf(addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0);
            case 6:
                addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1(textFieldSelectionManager);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1;
            default:
                addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2(textFieldSelectionManager);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2;
        }
    }
}
