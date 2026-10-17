package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
/* loaded from: classes.dex */
public final class SnackbarHostState$showSnackbar$2 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnackbarHostState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, hm hmVar) {
        super(hmVar);
        this.this$0 = snackbarHostState;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showSnackbar(null, this);
    }
}
