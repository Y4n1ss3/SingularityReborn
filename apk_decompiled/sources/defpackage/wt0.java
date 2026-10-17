package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wt0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldDecoratorModifierNode e;

    public /* synthetic */ wt0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.d = i;
        this.e = textFieldDecoratorModifierNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        String observeUntransformedTextChanges$lambda$0;
        boolean applySemantics$lambda$9;
        w01 updateWindowFocus$lambda$0;
        w01 updateNode$lambda$0;
        w01 _init_$lambda$0;
        ReceiveContentConfiguration receiveContentConfiguration;
        Set dragAndDropNode$lambda$0;
        int i = this.d;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.e;
        switch (i) {
            case 0:
                observeUntransformedTextChanges$lambda$0 = TextFieldDecoratorModifierNode.observeUntransformedTextChanges$lambda$0(textFieldDecoratorModifierNode);
                return observeUntransformedTextChanges$lambda$0;
            case 1:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$9(textFieldDecoratorModifierNode);
                break;
            case 2:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$10(textFieldDecoratorModifierNode);
                break;
            case 3:
                updateWindowFocus$lambda$0 = TextFieldDecoratorModifierNode.updateWindowFocus$lambda$0(textFieldDecoratorModifierNode);
                return updateWindowFocus$lambda$0;
            case 4:
                updateNode$lambda$0 = TextFieldDecoratorModifierNode.updateNode$lambda$0(textFieldDecoratorModifierNode);
                return updateNode$lambda$0;
            case 5:
                _init_$lambda$0 = TextFieldDecoratorModifierNode._init_$lambda$0(textFieldDecoratorModifierNode);
                return _init_$lambda$0;
            case 6:
                receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                return receiveContentConfiguration;
            case 7:
                dragAndDropNode$lambda$0 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$0(textFieldDecoratorModifierNode);
                return dragAndDropNode$lambda$0;
            case 8:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.onKeyEvent_ZmokQxo$lambda$0(textFieldDecoratorModifierNode);
                break;
            case 9:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$11(textFieldDecoratorModifierNode);
                break;
            case 10:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$7(textFieldDecoratorModifierNode);
                break;
            default:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$8(textFieldDecoratorModifierNode);
                break;
        }
        return Boolean.valueOf(applySemantics$lambda$9);
    }
}
