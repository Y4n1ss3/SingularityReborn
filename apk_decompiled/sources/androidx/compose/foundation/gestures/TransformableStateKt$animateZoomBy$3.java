package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", l = {142}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$animateZoomBy$3 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ gi0 $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$3(gi0 gi0Var, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.$previous = gi0Var;
        this.$zoomFactor = f;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, TransformScope transformScope, AnimationScope animationScope) {
        TransformScope.m570transformByd4ec7I$default(transformScope, gi0Var.d == 0.0f ? 1.0f : ((Number) animationScope.getValue()).floatValue() / gi0Var.d, 0L, 0.0f, 6, null);
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.$previous, this.$zoomFactor, this.$animationSpec, hmVar);
        transformableStateKt$animateZoomBy$3.L$0 = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.d, 0.0f, 0L, 0L, false, 30, null);
            Float f = new Float(this.$zoomFactor);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            q qVar = new q(this.$previous, transformScope, i2);
            this.label = 1;
            Object animateTo$default = SuspendAnimationKt.animateTo$default(AnimationState$default, f, animationSpec, false, qVar, this, 4, null);
            vn vnVar = vn.d;
            if (animateTo$default == vnVar) {
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
