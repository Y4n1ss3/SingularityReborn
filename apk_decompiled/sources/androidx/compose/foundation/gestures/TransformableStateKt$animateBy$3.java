package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.ji0;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", l = {230}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends us0 implements my {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ ji0 $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(ji0 ji0Var, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, hm hmVar) {
        super(2, hmVar);
        this.$previousState = ji0Var;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(ji0 ji0Var, TransformScope transformScope, AnimationScope animationScope) {
        transformScope.mo408transformByd4ec7I(((AnimationData) ji0Var.d).getZoom() == 0.0f ? 1.0f : ((AnimationData) animationScope.getValue()).getZoom() / ((AnimationData) ji0Var.d).getZoom(), Offset.m4520minusMKHz9U(((AnimationData) animationScope.getValue()).m391getOffsetF1C5BW0(), ((AnimationData) ji0Var.d).m391getOffsetF1C5BW0()), ((AnimationData) animationScope.getValue()).getDegrees() - ((AnimationData) ji0Var.d).getDegrees());
        ji0Var.d = animationScope.getValue();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, hmVar);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AnimationData animationData;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationDataConverter animationDataConverter = AnimationDataConverter.INSTANCE;
            Object obj2 = this.$previousState.d;
            animationData = TransformableStateKt.ZeroAnimationVelocity;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(animationDataConverter, obj2, animationData, 0L, 0L, false, 56, null);
            AnimationData animationData2 = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            m mVar = new m(3, this.$previousState, transformScope);
            this.label = 1;
            Object animateTo$default = SuspendAnimationKt.animateTo$default(AnimationState$default, animationData2, delegatingAnimationSpec, false, mVar, this, 4, null);
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
