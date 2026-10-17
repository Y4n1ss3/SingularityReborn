package androidx.compose.foundation.gestures.snapping;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {308}, m = "animateDecay", v = 1)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$1 extends im {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateDecay$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateDecay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateDecay = SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        return animateDecay;
    }
}
