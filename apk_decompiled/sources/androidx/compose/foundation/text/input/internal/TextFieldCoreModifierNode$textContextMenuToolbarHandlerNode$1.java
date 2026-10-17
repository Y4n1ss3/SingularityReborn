package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1", f = "TextFieldCoreModifier.kt", l = {209, 210}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1 extends us0 implements ky {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(TextFieldCoreModifierNode textFieldCoreModifierNode, hm hmVar) {
        super(1, hmVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r7.mo1490onShowSelectionToolbarSbBc2M(r0, r4, r6) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r7.updateClipboardEntry(r6) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TextFieldSelectionState textFieldSelectionState;
        PlatformSelectionBehaviors platformSelectionBehaviors;
        TextFieldSelectionState textFieldSelectionState2;
        TextFieldSelectionState textFieldSelectionState3;
        TextFieldSelectionState textFieldSelectionState4;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            textFieldSelectionState = this.this$0.textFieldSelectionState;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                textFieldSelectionState4 = this.this$0.textFieldSelectionState;
                textFieldSelectionState4.setTextToolbarShown$foundation(true);
                return w01.a;
            }
            p10.Q(obj);
        }
        platformSelectionBehaviors = this.this$0.platformSelectionBehaviors;
        if (platformSelectionBehaviors != null) {
            textFieldSelectionState2 = this.this$0.textFieldSelectionState;
            CharSequence text = textFieldSelectionState2.getTextFieldState$foundation().getVisualText().getText();
            textFieldSelectionState3 = this.this$0.textFieldSelectionState;
            long m1239getSelectiond9O1mEE = textFieldSelectionState3.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE();
            this.label = 2;
        }
        textFieldSelectionState4 = this.this$0.textFieldSelectionState;
        textFieldSelectionState4.setTextToolbarShown$foundation(true);
        return w01.a;
    }
}
