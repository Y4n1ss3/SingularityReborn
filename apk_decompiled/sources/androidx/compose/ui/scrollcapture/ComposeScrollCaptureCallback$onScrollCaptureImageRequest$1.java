package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.function.Consumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends us0 implements my {
    final /* synthetic */ Rect $captureArea;
    final /* synthetic */ Consumer<Rect> $onComplete;
    final /* synthetic */ ScrollCaptureSession $session;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, hm hmVar) {
        super(2, hmVar);
        this.this$0 = composeScrollCaptureCallback;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.this$0, this.$session, this.$captureArea, this.$onComplete, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            IntRect composeIntRect = RectHelper_androidKt.toComposeIntRect(this.$captureArea);
            this.label = 1;
            obj = composeScrollCaptureCallback.onScrollCaptureImageRequest(scrollCaptureSession, composeIntRect, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.$onComplete.accept(RectHelper_androidKt.toAndroidRect((IntRect) obj));
        return w01.a;
    }
}
