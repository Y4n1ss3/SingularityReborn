package androidx.compose.foundation.text;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", f = "BasicSecureTextField.kt", l = {251}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SecureTextFieldController$observeHideEvents$2 extends us0 implements my {
    int label;
    final /* synthetic */ SecureTextFieldController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$observeHideEvents$2(SecureTextFieldController secureTextFieldController, hm hmVar) {
        super(2, hmVar);
        this.this$0 = secureTextFieldController;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SecureTextFieldController$observeHideEvents$2(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(w01 w01Var, hm hmVar) {
        return ((SecureTextFieldController$observeHideEvents$2) create(w01Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            this.label = 1;
            Object p = y80.p(1500L, this);
            vn vnVar = vn.d;
            if (p == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.this$0.getPasswordInputTransformation().hide();
        return w01.a;
    }
}
