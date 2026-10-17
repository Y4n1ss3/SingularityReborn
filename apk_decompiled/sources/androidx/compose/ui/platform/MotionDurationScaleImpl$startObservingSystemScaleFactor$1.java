package androidx.compose.ui.platform;

import defpackage.bq;
import defpackage.hm;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.ur0;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class MotionDurationScaleImpl$startObservingSystemScaleFactor$1 extends us0 implements my {
    final /* synthetic */ ur0 $durationScaleStateFlow;
    int label;
    final /* synthetic */ MotionDurationScaleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDurationScaleImpl$startObservingSystemScaleFactor$1(ur0 ur0Var, MotionDurationScaleImpl motionDurationScaleImpl, hm hmVar) {
        super(2, hmVar);
        this.$durationScaleStateFlow = ur0Var;
        this.this$0 = motionDurationScaleImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(this.$durationScaleStateFlow, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MotionDurationScaleImpl$startObservingSystemScaleFactor$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ur0 ur0Var = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.this$0;
            jw jwVar = new jw() { // from class: androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1.1
                @Override // defpackage.jw
                public /* bridge */ /* synthetic */ Object emit(Object obj2, hm hmVar) {
                    return emit(((Number) obj2).floatValue(), hmVar);
                }

                public final Object emit(float f, hm hmVar) {
                    MotionDurationScaleImpl.this.set_scaleFactor(f);
                    return w01.a;
                }
            };
            this.label = 1;
            Object collect = ur0Var.collect(jwVar, this);
            vn vnVar = vn.d;
            if (collect == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
