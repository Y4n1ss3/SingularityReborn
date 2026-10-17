package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {145, 186}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends im {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
