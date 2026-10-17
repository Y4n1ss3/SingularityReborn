package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
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
@bq(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {141}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance$addRipple$2 extends us0 implements my {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, hm hmVar) {
        super(2, hmVar);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleIndicationInstance;
        this.$interaction = press;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, w01] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SnapshotStateMap snapshotStateMap;
        SnapshotStateMap snapshotStateMap2;
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                RippleAnimation rippleAnimation = this.$rippleAnimation;
                this.label = 1;
                Object animate = rippleAnimation.animate(this);
                vn vnVar = vn.d;
                if (animate == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            snapshotStateMap2 = this.this$0.ripples;
            snapshotStateMap2.remove(this.$interaction);
            this = w01.a;
            return this;
        } catch (Throwable th) {
            snapshotStateMap = this.this$0.ripples;
            snapshotStateMap.remove(this.$interaction);
            throw th;
        }
    }
}
