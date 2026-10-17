package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1383}, m = "animateToWithDecay", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateToWithDecay$1<T> extends im {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$animateToWithDecay$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
    }
}
