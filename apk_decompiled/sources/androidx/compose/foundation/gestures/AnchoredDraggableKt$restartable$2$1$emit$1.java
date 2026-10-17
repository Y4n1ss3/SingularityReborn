package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2;
import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1552}, m = "emit", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends im {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1<? super T> anonymousClass1, hm hmVar) {
        super(hmVar);
        this.this$0 = anonymousClass1;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
