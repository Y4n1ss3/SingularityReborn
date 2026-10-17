package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionState e;

    public /* synthetic */ gd(TextFieldSelectionState textFieldSelectionState, int i) {
        this.d = i;
        this.e = textFieldSelectionState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        TextFieldHandleState TextFieldCursorHandle$lambda$0$0;
        TextFieldHandleState TextFieldSelectionHandles$lambda$0$0;
        TextFieldHandleState TextFieldSelectionHandles$lambda$4$0;
        Rect derivedVisibleContentBounds$foundation;
        Rect derivedVisibleContentBounds_delegate$lambda$0;
        TextFieldCharSequence observeTextChanges$lambda$0;
        boolean addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2;
        int i = this.d;
        TextFieldSelectionState textFieldSelectionState = this.e;
        switch (i) {
            case 0:
                TextFieldCursorHandle$lambda$0$0 = BasicTextFieldKt.TextFieldCursorHandle$lambda$0$0(textFieldSelectionState);
                return TextFieldCursorHandle$lambda$0$0;
            case 1:
                TextFieldSelectionHandles$lambda$0$0 = BasicTextFieldKt.TextFieldSelectionHandles$lambda$0$0(textFieldSelectionState);
                return TextFieldSelectionHandles$lambda$0$0;
            case 2:
                TextFieldSelectionHandles$lambda$4$0 = BasicTextFieldKt.TextFieldSelectionHandles$lambda$4$0(textFieldSelectionState);
                return TextFieldSelectionHandles$lambda$4$0;
            case 3:
                derivedVisibleContentBounds$foundation = textFieldSelectionState.getDerivedVisibleContentBounds$foundation();
                return derivedVisibleContentBounds$foundation;
            case 4:
                derivedVisibleContentBounds_delegate$lambda$0 = TextFieldSelectionState.derivedVisibleContentBounds_delegate$lambda$0(textFieldSelectionState);
                return derivedVisibleContentBounds_delegate$lambda$0;
            case 5:
                observeTextChanges$lambda$0 = TextFieldSelectionState.observeTextChanges$lambda$0(textFieldSelectionState);
                return observeTextChanges$lambda$0;
            case 6:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(textFieldSelectionState);
                return Boolean.valueOf(addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0);
            case 7:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(textFieldSelectionState);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1;
            default:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(textFieldSelectionState);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2;
        }
    }
}
