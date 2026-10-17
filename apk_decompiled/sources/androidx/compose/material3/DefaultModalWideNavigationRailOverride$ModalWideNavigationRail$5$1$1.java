package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1", f = "WideNavigationRail.kt", l = {594}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1 extends us0 implements my {
    final /* synthetic */ float $backEvent;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1(Animatable<Float, AnimationVector1D> animatable, float f, hm hmVar) {
        super(2, hmVar);
        this.$predictiveBackProgress = animatable;
        this.$backEvent = f;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1(this.$predictiveBackProgress, this.$backEvent, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
            Float f = new Float(this.$backEvent);
            this.label = 1;
            Object snapTo = animatable.snapTo(f, this);
            vn vnVar = vn.d;
            if (snapTo == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
