package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import android.view.View;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import defpackage.b0;
import defpackage.b5;
import defpackage.hm;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.sc0;
import defpackage.un;
import defpackage.vn;
import defpackage.xh0;
import defpackage.y80;
import defpackage.zl;
import java.util.function.Consumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;
    private final View composeView;
    private final un coroutineScope;
    private final ScrollCaptureSessionListener listener;
    private final SemanticsNode node;
    private int requestCount;
    private final RelativeScroller scrollTracker;
    private final IntRect viewportBoundsInWindow;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, un unVar, ScrollCaptureSessionListener scrollCaptureSessionListener, View view) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.composeView = view;
        this.coroutineScope = new zl(unVar.getCoroutineContext().plus(DisableAnimationMotionDurationScale.INSTANCE));
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    private final void drawDebugBackground(Canvas canvas) {
        Color.Companion companion = Color.Companion;
        b0 b0Var = xh0.d;
        canvas.drawColor(ColorKt.m4815toArgb8_81llA(Color.Companion.m4785hslJlNiLsg$default(companion, 360.0f * xh0.d.a().nextFloat(), 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r5.scrollRangeToCenter(r10, r1, r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, IntRect intRect, hm hmVar) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        int i;
        vn vnVar;
        int top;
        int bottom;
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3 composeScrollCaptureCallback$onScrollCaptureImageRequest$3;
        IntRect intRect2;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        int mapOffsetToViewport;
        int mapOffsetToViewport2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (hmVar instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) hmVar;
            int i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = i4 - Integer.MIN_VALUE;
                Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
                i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    top = intRect.getTop();
                    bottom = intRect.getBottom();
                    RelativeScroller relativeScroller = this.scrollTracker;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                        i2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                        IntRect intRect3 = (IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                        ScrollCaptureSession h = b5.h(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
                        p10.Q(obj);
                        scrollCaptureSession2 = h;
                        intRect2 = intRect3;
                        mapOffsetToViewport = this.scrollTracker.mapOffsetToViewport(i2);
                        mapOffsetToViewport2 = this.scrollTracker.mapOffsetToViewport(i3);
                        IntRect copy$default = IntRect.copy$default(intRect2, 0, mapOffsetToViewport, 0, mapOffsetToViewport2, 5, null);
                        if (mapOffsetToViewport != mapOffsetToViewport2) {
                            return IntRect.Companion.getZero();
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-copy$default.getLeft(), -copy$default.getTop());
                            lockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
                            this.composeView.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            return copy$default.translate(0, y80.P(this.scrollTracker.getScrollAmount()));
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i5 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                    int i6 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                    IntRect intRect4 = (IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                    ScrollCaptureSession h2 = b5.h(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
                    p10.Q(obj);
                    top = i6;
                    intRect = intRect4;
                    bottom = i5;
                    scrollCaptureSession = h2;
                }
                composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.INSTANCE;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
                if (MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != vnVar) {
                    intRect2 = intRect;
                    i2 = top;
                    scrollCaptureSession2 = scrollCaptureSession;
                    i3 = bottom;
                    mapOffsetToViewport = this.scrollTracker.mapOffsetToViewport(i2);
                    mapOffsetToViewport2 = this.scrollTracker.mapOffsetToViewport(i3);
                    IntRect copy$default2 = IntRect.copy$default(intRect2, 0, mapOffsetToViewport, 0, mapOffsetToViewport2, 5, null);
                    if (mapOffsetToViewport != mapOffsetToViewport2) {
                    }
                }
                return vnVar;
            }
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(this, hmVar);
        Object obj2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
        i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
        vnVar = vn.d;
        if (i != 0) {
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.INSTANCE;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
        if (MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != vnVar) {
        }
        return vnVar;
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        p01.t(this.coroutineScope, sc0.d, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(RectHelper_androidKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        runnable.run();
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal(this.coroutineScope, cancellationSignal, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null));
    }
}
