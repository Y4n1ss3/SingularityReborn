package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pn0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ iy f;

    public /* synthetic */ pn0(iy iyVar, iy iyVar2, int i) {
        this.d = i;
        this.e = iyVar;
        this.f = iyVar2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0;
        switch (this.d) {
            case 0:
                addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0(this.e, this.f, (TextContextMenuSession) obj);
                return addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0;
            default:
                addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(this.e, this.f, (TextContextMenuSession) obj);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0;
        }
    }
}
