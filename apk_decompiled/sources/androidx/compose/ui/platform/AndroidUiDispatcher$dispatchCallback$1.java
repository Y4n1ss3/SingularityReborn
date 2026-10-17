package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ AndroidUiDispatcher this$0;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.this$0 = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Handler handler;
        handler = this.this$0.handler;
        handler.removeCallbacks(this);
        this.this$0.performTrampolineDispatch();
        this.this$0.performFrameDispatch(j);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        List list;
        this.this$0.performTrampolineDispatch();
        obj = this.this$0.lock;
        AndroidUiDispatcher androidUiDispatcher = this.this$0;
        synchronized (obj) {
            list = androidUiDispatcher.toRunOnFrame;
            if (list.isEmpty()) {
                androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                androidUiDispatcher.scheduledFrameDispatch = false;
            }
        }
    }
}
