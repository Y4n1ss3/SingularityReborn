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
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {162}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$animateRotateBy$2 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $degrees;
    final /* synthetic */ gi0 $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateRotateBy$2(gi0 gi0Var, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.$previous = gi0Var;
        this.$degrees = f;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, TransformScope transformScope, AnimationScope animationScope) {
        TransformScope.m570transformByd4ec7I$default(transformScope, 0.0f, 0L, ((Number) animationScope.getValue()).floatValue() - gi0Var.d, 3, null);
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.$previous, this.$degrees, this.$animationSpec, hmVar);
        transformableStateKt$animateRotateBy$2.L$0 = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$animateRotateBy$2) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.d, 0.0f, 0L, 0L, false, 30, null);
            Float f = new Float(this.$degrees);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            q qVar = new q(this.$previous, transformScope, 0);
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
