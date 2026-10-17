package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1116, 1161}, m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 extends im {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m423awaitHorizontalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}
