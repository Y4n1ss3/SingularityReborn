package androidx.compose.foundation.gestures.snapping;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {349}, m = "animateWithTarget", v = 1)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateWithTarget$1 extends im {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateWithTarget$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateWithTarget;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateWithTarget = SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        return animateWithTarget;
    }
}
