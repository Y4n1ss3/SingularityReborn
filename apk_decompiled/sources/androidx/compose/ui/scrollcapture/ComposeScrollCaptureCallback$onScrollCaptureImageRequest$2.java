package androidx.compose.ui.scrollcapture;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {134, 137}, m = "onScrollCaptureImageRequest", v = 1)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends im {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ComposeScrollCaptureCallback composeScrollCaptureCallback, hm hmVar) {
        super(hmVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object onScrollCaptureImageRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onScrollCaptureImageRequest = this.this$0.onScrollCaptureImageRequest(null, null, this);
        return onScrollCaptureImageRequest;
    }
}
