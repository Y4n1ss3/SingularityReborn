package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", f = "HandwritingHandler.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class HandwritingHandlerNode$onFocusEvent$1 extends us0 implements my {
    int label;
    final /* synthetic */ HandwritingHandlerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingHandlerNode$onFocusEvent$1(HandwritingHandlerNode handwritingHandlerNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = handwritingHandlerNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new HandwritingHandlerNode$onFocusEvent$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((HandwritingHandlerNode$onFocusEvent$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ComposeInputMethodManager composeImm;
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        composeImm = this.this$0.getComposeImm();
        composeImm.acceptStylusHandwritingDelegation();
        return w01.a;
    }
}
