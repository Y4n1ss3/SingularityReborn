package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
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
@bq(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class StateLayer$handleInteraction$1 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $incomingAnimationSpec;
    final /* synthetic */ float $targetAlpha;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(StateLayer stateLayer, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.this$0 = stateLayer;
        this.$targetAlpha = f;
        this.$incomingAnimationSpec = animationSpec;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new StateLayer$handleInteraction$1(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((StateLayer$handleInteraction$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.animatedAlpha;
            Float f = new Float(this.$targetAlpha);
            AnimationSpec<Float> animationSpec = this.$incomingAnimationSpec;
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, f, animationSpec, null, null, this, 12, null);
            vn vnVar = vn.d;
            if (animateTo$default == vnVar) {
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
