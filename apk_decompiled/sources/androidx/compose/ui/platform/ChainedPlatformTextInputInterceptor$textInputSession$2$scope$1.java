package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.SessionMutex;
import defpackage.hm;
import defpackage.kn;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {
    private final /* synthetic */ PlatformTextInputSessionScope $$delegate_0;
    final /* synthetic */ AtomicReference<SessionMutex.Session<w01>> $inputMethodMutex;
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference<SessionMutex.Session<w01>> atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.$parentSession = platformTextInputSessionScope;
        this.$inputMethodMutex = atomicReference;
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$$delegate_0 = platformTextInputSessionScope;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, defpackage.un
    public kn getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.$$delegate_0.getView();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, hm hmVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1;
        int i;
        if (hmVar instanceof ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) {
            chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = (ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) hmVar;
            int i2 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.result;
                i = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    AtomicReference<SessionMutex.Session<w01>> atomicReference = this.$inputMethodMutex;
                    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 = ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.INSTANCE;
                    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, platformTextInputMethodRequest, this.$parentSession, null);
                    chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = 1;
                    Object m4199withSessionCancellingPreviousimpl = SessionMutex.m4199withSessionCancellingPreviousimpl(atomicReference, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1);
                    vn vnVar = vn.d;
                    if (m4199withSessionCancellingPreviousimpl == vnVar) {
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
        chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, hmVar);
        Object obj2 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.result;
        i = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }
}
