package androidx.compose.foundation.text;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", l = {333}, m = "showTextToolbar", v = 1)
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, hm hmVar) {
        super(hmVar);
        this.this$0 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showTextToolbar(null, null, this);
    }
}
