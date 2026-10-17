package androidx.compose.ui.platform;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession", v = 1)
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, hm hmVar) {
        super(hmVar);
        this.this$0 = chainedPlatformTextInputInterceptor;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputSession(null, null, this);
    }
}
