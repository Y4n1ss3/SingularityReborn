package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends us0 implements my {
    final /* synthetic */ Runnable $onReady;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Runnable runnable, hm hmVar) {
        super(2, hmVar);
        this.this$0 = composeScrollCaptureCallback;
        this.$onReady = runnable;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.this$0, this.$onReady, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        RelativeScroller relativeScroller;
        ComposeScrollCaptureCallback.ScrollCaptureSessionListener scrollCaptureSessionListener;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            relativeScroller = this.this$0.scrollTracker;
            this.label = 1;
            Object scrollTo = relativeScroller.scrollTo(0.0f, this);
            vn vnVar = vn.d;
            if (scrollTo == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        scrollCaptureSessionListener = this.this$0.listener;
        scrollCaptureSessionListener.onSessionEnded();
        this.$onReady.run();
        return w01.a;
    }
}
