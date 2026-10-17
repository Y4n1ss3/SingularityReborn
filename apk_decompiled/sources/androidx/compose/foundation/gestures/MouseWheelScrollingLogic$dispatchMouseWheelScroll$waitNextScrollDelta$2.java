package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {266}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 extends us0 implements my {
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(MouseWheelScrollingLogic mouseWheelScrollingLogic, hm hmVar) {
        super(2, hmVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        zg zgVar;
        Object busyReceive;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
        zgVar = mouseWheelScrollingLogic.channel;
        this.label = 1;
        busyReceive = mouseWheelScrollingLogic.busyReceive(zgVar, this);
        vn vnVar = vn.d;
        return busyReceive == vnVar ? vnVar : busyReceive;
    }
}
