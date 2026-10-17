package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", l = {264}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 extends us0 implements my {
    final /* synthetic */ iy $requestFocus;
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, iy iyVar, hm hmVar) {
        super(2, hmVar);
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$requestFocus = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            iy iyVar = this.$requestFocus;
            this.label = 1;
            Object textFieldSelectionGestures = textFieldSelectionState.textFieldSelectionGestures(pointerInputScope, iyVar, this);
            vn vnVar = vn.d;
            if (textFieldSelectionGestures == vnVar) {
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
