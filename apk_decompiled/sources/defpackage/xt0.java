package defpackage;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xt0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldDecoratorModifierNode e;

    public /* synthetic */ xt0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.d = i;
        this.e = textFieldDecoratorModifierNode;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 focusableNode$lambda$0;
        w01 dragAndDropNode$lambda$2;
        w01 dragAndDropNode$lambda$3;
        w01 dragAndDropNode$lambda$4;
        w01 dragAndDropNode$lambda$5;
        w01 dragAndDropNode$lambda$6;
        w01 clipboardKeyCommandsHandler$lambda$0;
        boolean applySemantics$lambda$2;
        int i = this.d;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.e;
        switch (i) {
            case 0:
                focusableNode$lambda$0 = TextFieldDecoratorModifierNode.focusableNode$lambda$0(textFieldDecoratorModifierNode, ((Boolean) obj).booleanValue());
                return focusableNode$lambda$0;
            case 1:
                dragAndDropNode$lambda$2 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$2(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$2;
            case 2:
                dragAndDropNode$lambda$3 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$3(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$3;
            case 3:
                dragAndDropNode$lambda$4 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$4(textFieldDecoratorModifierNode, (Offset) obj);
                return dragAndDropNode$lambda$4;
            case 4:
                dragAndDropNode$lambda$5 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$5(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$5;
            case 5:
                dragAndDropNode$lambda$6 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$6(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$6;
            case 6:
                clipboardKeyCommandsHandler$lambda$0 = TextFieldDecoratorModifierNode.clipboardKeyCommandsHandler$lambda$0(textFieldDecoratorModifierNode, (KeyCommand) obj);
                return clipboardKeyCommandsHandler$lambda$0;
            default:
                applySemantics$lambda$2 = TextFieldDecoratorModifierNode.applySemantics$lambda$2(textFieldDecoratorModifierNode, (List) obj);
                return Boolean.valueOf(applySemantics$lambda$2);
        }
    }
}
