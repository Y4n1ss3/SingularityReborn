package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import defpackage.bq;
import defpackage.f30;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends us0 implements my {
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ PlatformTextInputMethodRequest $request;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
            super(0);
            this.this$0 = chainedPlatformTextInputInterceptor;
        }

        @Override // defpackage.iy
        public final PlatformTextInputInterceptor invoke() {
            PlatformTextInputInterceptor interceptor;
            interceptor = this.this$0.getInterceptor();
            return interceptor;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ PlatformTextInputSessionScope $parentSession;
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, hm hmVar) {
            super(2, hmVar);
            this.$request = platformTextInputMethodRequest;
            this.$parentSession = platformTextInputSessionScope;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(PlatformTextInputInterceptor platformTextInputInterceptor, hm hmVar) {
            return ((AnonymousClass2) create(platformTextInputInterceptor, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                PlatformTextInputInterceptor platformTextInputInterceptor = (PlatformTextInputInterceptor) this.L$0;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = this.$request;
                PlatformTextInputSessionScope platformTextInputSessionScope = this.$parentSession;
                this.label = 1;
                Object interceptStartInputMethod = platformTextInputInterceptor.interceptStartInputMethod(platformTextInputMethodRequest, platformTextInputSessionScope, this);
                vn vnVar = vn.d;
                if (interceptStartInputMethod == vnVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, hm hmVar) {
        super(2, hmVar);
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$request = platformTextInputMethodRequest;
        this.$parentSession = platformTextInputSessionScope;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(w01 w01Var, hm hmVar) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(w01Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            Object k = y80.k(snapshotFlow, anonymousClass2, this);
            vn vnVar = vn.d;
            if (k == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.f("Interceptors flow should never terminate.");
        return null;
    }
}
