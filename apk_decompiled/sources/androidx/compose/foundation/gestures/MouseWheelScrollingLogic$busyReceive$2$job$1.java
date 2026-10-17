package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {194}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;

    public MouseWheelScrollingLogic$busyReceive$2$job$1(hm hmVar) {
        super(2, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(long j) {
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(hmVar);
        mouseWheelScrollingLogic$busyReceive$2$job$1.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        un unVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            unVar = (un) this.L$0;
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            unVar = (un) this.L$0;
            p10.Q(obj);
        }
        while (cq.x(unVar.getCoroutineContext())) {
            d dVar = new d(2);
            this.L$0 = unVar;
            this.label = 1;
            Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(dVar, this);
            vn vnVar = vn.d;
            if (withFrameNanos == vnVar) {
                return vnVar;
            }
        }
        return w01.a;
    }
}
