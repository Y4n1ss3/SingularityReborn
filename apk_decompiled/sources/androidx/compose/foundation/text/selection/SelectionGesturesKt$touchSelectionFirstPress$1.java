package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {141, 145}, m = "touchSelectionFirstPress", v = 1)
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionFirstPress$1 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public SelectionGesturesKt$touchSelectionFirstPress$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
    }
}
