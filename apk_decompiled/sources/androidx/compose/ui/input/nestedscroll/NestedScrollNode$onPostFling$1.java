package androidx.compose.ui.input.nestedscroll;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {113, 118}, m = "onPostFling-RZ2iAVY", v = 1)
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPostFling$1 extends im {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, hm hmVar) {
        super(hmVar);
        this.this$0 = nestedScrollNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo533onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
