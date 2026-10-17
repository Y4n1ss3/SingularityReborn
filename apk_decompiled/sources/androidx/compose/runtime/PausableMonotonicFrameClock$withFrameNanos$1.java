package androidx.compose.runtime;

import androidx.compose.ui.spatial.RectListKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {RectListKt.BitOffsetForFocusable, RectListKt.BitOffsetForGesturable}, m = "withFrameNanos", v = 1)
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, hm hmVar) {
        super(hmVar);
        this.this$0 = pausableMonotonicFrameClock;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withFrameNanos(null, this);
    }
}
