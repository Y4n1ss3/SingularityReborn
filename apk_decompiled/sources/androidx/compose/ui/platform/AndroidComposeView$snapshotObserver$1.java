package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.node.RootForTest;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1 extends f30 implements ky {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public final void invoke(final iy iyVar) {
        RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler$ui = this.this$0.getUncaughtExceptionHandler$ui();
        if (uncaughtExceptionHandler$ui != null) {
            iyVar = new AndroidComposeView$snapshotObserver$1$command$1(iyVar, uncaughtExceptionHandler$ui);
        }
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            iyVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.a
                @Override // java.lang.Runnable
                public final void run() {
                    iy.this.invoke();
                }
            });
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((iy) obj);
        return w01.a;
    }
}
