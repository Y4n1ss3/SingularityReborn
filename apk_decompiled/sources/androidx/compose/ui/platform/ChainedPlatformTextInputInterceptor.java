package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.node.Owner;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor {
    private final MutableState interceptor$delegate;
    private final ChainedPlatformTextInputInterceptor parent;

    public ChainedPlatformTextInputInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.parent = chainedPlatformTextInputInterceptor;
        this.interceptor$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlatformTextInputInterceptor getInterceptor() {
        return (PlatformTextInputInterceptor) this.interceptor$delegate.getValue();
    }

    private final void setInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.interceptor$delegate.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object textInputSession(Owner owner, my myVar, hm hmVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        int i;
        Object interceptedTextInputSession;
        if (hmVar instanceof ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (ChainedPlatformTextInputInterceptor$textInputSession$1) hmVar;
            int i2 = chainedPlatformTextInputInterceptor$textInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.result;
                i = chainedPlatformTextInputInterceptor$textInputSession$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.parent;
                    ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(myVar, this, null);
                    chainedPlatformTextInputInterceptor$textInputSession$1.label = 1;
                    interceptedTextInputSession = PlatformTextInputModifierNodeKt.interceptedTextInputSession(owner, chainedPlatformTextInputInterceptor, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1);
                    vn vnVar = vn.d;
                    if (interceptedTextInputSession == vnVar) {
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
        chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, hmVar);
        Object obj2 = chainedPlatformTextInputInterceptor$textInputSession$1.result;
        i = chainedPlatformTextInputInterceptor$textInputSession$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }

    public final void updateInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        setInterceptor(platformTextInputInterceptor);
    }
}
