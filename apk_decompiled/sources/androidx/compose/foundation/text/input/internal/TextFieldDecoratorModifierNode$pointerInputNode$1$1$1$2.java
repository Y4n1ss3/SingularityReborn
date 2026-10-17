package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {ProgressIndicatorKt.FirstLineTailDelay}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends us0 implements my {
    final /* synthetic */ iy $requestFocus;
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, iy iyVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$requestFocus = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        z10 z10Var;
        SoftwareKeyboardController requireKeyboardController;
        z10Var = textFieldDecoratorModifierNode.inputSessionJob;
        if (z10Var != null) {
            requireKeyboardController = textFieldDecoratorModifierNode.requireKeyboardController();
            requireKeyboardController.show();
        } else {
            textFieldDecoratorModifierNode.startInputSession(true);
        }
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.this$0, this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableInteractionSource interactionSource = this.this$0.getInteractionSource();
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            iy iyVar = this.$requestFocus;
            g gVar = new g(this.this$0, 0);
            this.label = 1;
            Object detectTextFieldTapGestures = textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, interactionSource, iyVar, gVar, this);
            vn vnVar = vn.d;
            if (detectTextFieldTapGestures == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
