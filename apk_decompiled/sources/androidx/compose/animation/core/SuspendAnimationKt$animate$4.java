package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate", v = 1)
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public SuspendAnimationKt$animate$4(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SuspendAnimationKt.animate(null, null, 0L, null, this);
    }
}
