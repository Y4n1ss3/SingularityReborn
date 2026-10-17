package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitFirstDown$2 extends im {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$awaitFirstDown$2(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
    }
}
