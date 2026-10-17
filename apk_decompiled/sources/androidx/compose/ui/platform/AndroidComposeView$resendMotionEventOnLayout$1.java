package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends f30 implements iy {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6696invoke() {
        MotionEvent motionEvent;
        AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
        motionEvent = this.this$0.previousMotionEvent;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView$resendMotionEventRunnable$1 = androidComposeView.resendMotionEventRunnable;
                androidComposeView.post(androidComposeView$resendMotionEventRunnable$1);
            }
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6696invoke();
        return w01.a;
    }
}
