package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class HoverableNode$onPointerEvent$1 extends us0 implements my {
    int label;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$1(HoverableNode hoverableNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = hoverableNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new HoverableNode$onPointerEvent$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((HoverableNode$onPointerEvent$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object emitEnter;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            HoverableNode hoverableNode = this.this$0;
            this.label = 1;
            emitEnter = hoverableNode.emitEnter(this);
            vn vnVar = vn.d;
            if (emitEnter == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
