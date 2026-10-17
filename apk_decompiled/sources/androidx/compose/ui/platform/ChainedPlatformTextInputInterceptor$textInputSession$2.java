package androidx.compose.ui.platform;

import androidx.compose.ui.SessionMutex;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends us0 implements my {
    final /* synthetic */ my $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(my myVar, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, hm hmVar) {
        super(2, hmVar);
        this.$session = myVar;
        this.this$0 = chainedPlatformTextInputInterceptor;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, hmVar);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // defpackage.my
    public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, hm hmVar) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2) create(platformTextInputSessionScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.L$0, SessionMutex.m4192constructorimpl(), this.this$0);
            my myVar = this.$session;
            this.label = 1;
            Object invoke = myVar.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
