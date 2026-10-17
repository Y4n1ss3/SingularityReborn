package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zt0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldDecoratorModifierNode e;
    public final /* synthetic */ int f;

    public /* synthetic */ zt0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2) {
        this.d = i2;
        this.e = textFieldDecoratorModifierNode;
        this.f = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 onImeActionPerformed_KlQnJC8$lambda$0;
        boolean applySemantics$lambda$6;
        int i = this.d;
        int i2 = this.f;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.e;
        switch (i) {
            case 0:
                onImeActionPerformed_KlQnJC8$lambda$0 = TextFieldDecoratorModifierNode.onImeActionPerformed_KlQnJC8$lambda$0(textFieldDecoratorModifierNode, i2);
                return onImeActionPerformed_KlQnJC8$lambda$0;
            default:
                applySemantics$lambda$6 = TextFieldDecoratorModifierNode.applySemantics$lambda$6(textFieldDecoratorModifierNode, i2);
                return Boolean.valueOf(applySemantics$lambda$6);
        }
    }
}
