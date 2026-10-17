package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldDecoratorModifierNode e;

    public /* synthetic */ g(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.d = i;
        this.e = textFieldDecoratorModifierNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        int i = this.d;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2.invokeSuspend$lambda$0(textFieldDecoratorModifierNode);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.invokeSuspend$lambda$0(textFieldDecoratorModifierNode);
                return invokeSuspend$lambda$02;
        }
    }
}
