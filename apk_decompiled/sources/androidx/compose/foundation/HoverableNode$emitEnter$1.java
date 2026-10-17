package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter", v = 1)
/* loaded from: classes.dex */
public final class HoverableNode$emitEnter$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, hm hmVar) {
        super(hmVar);
        this.this$0 = hoverableNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object emitEnter;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        emitEnter = this.this$0.emitEnter(this);
        return emitEnter;
    }
}
