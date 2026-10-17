package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {193, 232}, m = "touchSelectionSubsequentPress", v = 1)
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends im {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public SelectionGesturesKt$touchSelectionSubsequentPress$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, 0, this);
        return obj2;
    }
}
