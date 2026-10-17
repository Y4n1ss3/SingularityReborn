package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Transition$animateTo$1$1$1 extends us0 implements my {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(Transition<S> transition, hm hmVar) {
        super(2, hmVar);
        this.this$0 = transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(Transition transition, float f, long j) {
        if (!transition.isSeeking()) {
            transition.onFrame$animation_core(j, f);
        }
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, hmVar);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((Transition$animateTo$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        final float durationScale;
        un unVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar2 = (un) this.L$0;
            durationScale = SuspendAnimationKt.getDurationScale(unVar2.getCoroutineContext());
            unVar = unVar2;
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            durationScale = this.F$0;
            unVar = (un) this.L$0;
            p10.Q(obj);
        }
        while (p10.x(unVar)) {
            final Transition<S> transition = this.this$0;
            ky kyVar = new ky() { // from class: androidx.compose.animation.core.c
                @Override // defpackage.ky
                public final Object invoke(Object obj2) {
                    w01 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = Transition$animateTo$1$1$1.invokeSuspend$lambda$0(Transition.this, durationScale, ((Long) obj2).longValue());
                    return invokeSuspend$lambda$0;
                }
            };
            this.L$0 = unVar;
            this.F$0 = durationScale;
            this.label = 1;
            Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(kyVar, this);
            vn vnVar = vn.d;
            if (withFrameNanos == vnVar) {
                return vnVar;
            }
        }
        return w01.a;
    }
}
