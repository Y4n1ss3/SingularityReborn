package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1 extends us0 implements my {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        TextFieldSelectionManager.copy$foundation$default(this.this$0, false, 1, null);
        return w01.a;
    }
}
