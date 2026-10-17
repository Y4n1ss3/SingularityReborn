package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit", v = 1)
/* loaded from: classes.dex */
public final class HoverableNode$emitExit$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, hm hmVar) {
        super(hmVar);
        this.this$0 = hoverableNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object emitExit;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        emitExit = this.this$0.emitExit(this);
        return emitExit;
    }
}
