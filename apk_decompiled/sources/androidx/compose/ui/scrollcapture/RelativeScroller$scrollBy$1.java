package androidx.compose.ui.scrollcapture;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy", v = 1)
/* loaded from: classes2.dex */
public final class RelativeScroller$scrollBy$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RelativeScroller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, hm hmVar) {
        super(hmVar);
        this.this$0 = relativeScroller;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object scrollBy;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scrollBy = this.this$0.scrollBy(0.0f, this);
        return scrollBy;
    }
}
