package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {84}, m = "awaitAllPointersUp", v = 1)
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$3 extends im {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$awaitAllPointersUp$3(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.awaitAllPointersUp(null, null, this);
    }
}
