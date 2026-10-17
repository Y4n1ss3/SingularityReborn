package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock$withFrameNanos$2$2 extends f30 implements ky {
    final /* synthetic */ Choreographer.FrameCallback $callback;
    final /* synthetic */ AndroidUiFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.this$0 = androidUiFrameClock;
        this.$callback = frameCallback;
    }

    public final void invoke(Throwable th) {
        this.this$0.getChoreographer().removeFrameCallback(this.$callback);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w01.a;
    }
}
