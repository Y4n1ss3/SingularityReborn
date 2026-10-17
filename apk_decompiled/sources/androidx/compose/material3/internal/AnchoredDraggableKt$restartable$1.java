package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {706}, m = "restartable")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends im {
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$restartable$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restartable = AnchoredDraggableKt.restartable(null, null, this);
        return restartable;
    }
}
