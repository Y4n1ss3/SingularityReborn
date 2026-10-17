package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {340}, m = "awaitDown", v = 1)
/* loaded from: classes.dex */
public final class SelectionGesturesKt$awaitDown$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SelectionGesturesKt$awaitDown$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object awaitDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDown = SelectionGesturesKt.awaitDown(null, this);
        return awaitDown;
    }
}
