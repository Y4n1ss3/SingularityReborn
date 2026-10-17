package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1 extends f30 implements ky {
    final /* synthetic */ CancellationSignal $signal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(CancellationSignal cancellationSignal) {
        super(1);
        this.$signal = cancellationSignal;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w01.a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            this.$signal.cancel();
        }
    }
}
