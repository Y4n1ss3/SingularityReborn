package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.rr0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {198}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2 extends us0 implements my {
    final /* synthetic */ zg $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$busyReceive$2(zg zgVar, hm hmVar) {
        super(2, hmVar);
        this.$this_busyReceive = zgVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.$this_busyReceive, hmVar);
        mouseWheelScrollingLogic$busyReceive$2.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MouseWheelScrollingLogic$busyReceive$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        z10 z10Var;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            rr0 t = p01.t((un) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3);
            try {
                zg zgVar = this.$this_busyReceive;
                this.L$0 = t;
                this.label = 1;
                Object i2 = zgVar.i(this);
                vn vnVar = vn.d;
                if (i2 == vnVar) {
                    return vnVar;
                }
                obj = i2;
                z10Var = t;
            } catch (Throwable th2) {
                th = th2;
                z10Var = t;
                z10Var.cancel(null);
                throw th;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z10Var = (z10) this.L$0;
            try {
                p10.Q(obj);
            } catch (Throwable th3) {
                th = th3;
                z10Var.cancel(null);
                throw th;
            }
        }
        MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
        z10Var.cancel(null);
        return mouseWheelScrollDelta;
    }
}
