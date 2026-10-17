package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$contextMenuAreaModifier$3 extends us0 implements ky {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$3(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(1, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$3(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.this$0.setTextToolbarShownViaProvider$foundation(false);
        return w01.a;
    }
}
