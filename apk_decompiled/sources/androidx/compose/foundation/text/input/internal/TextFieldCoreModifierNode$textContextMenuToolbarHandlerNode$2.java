package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2", f = "TextFieldCoreModifier.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2 extends us0 implements ky {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(TextFieldCoreModifierNode textFieldCoreModifierNode, hm hmVar) {
        super(1, hmVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        TextFieldSelectionState textFieldSelectionState;
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        textFieldSelectionState = this.this$0.textFieldSelectionState;
        textFieldSelectionState.setTextToolbarShown$foundation(false);
        return w01.a;
    }
}
