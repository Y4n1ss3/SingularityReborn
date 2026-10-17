package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
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
@bq(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", l = {434}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation$animate$1 extends us0 implements my {
    final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
    final /* synthetic */ BoundsTransform $boundsTransform;
    final /* synthetic */ Rect $target;
    int label;
    final /* synthetic */ BoundsTransformDeferredAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsTransformDeferredAnimation$animate$1(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, hm hmVar) {
        super(2, hmVar);
        this.$anim = animatable;
        this.$target = rect;
        this.$boundsTransform = boundsTransform;
        this.this$0 = boundsTransformDeferredAnimation;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new BoundsTransformDeferredAnimation$animate$1(this.$anim, this.$target, this.$boundsTransform, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BoundsTransformDeferredAnimation$animate$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Rect, AnimationVector4D> animatable = this.$anim;
            Rect rect = this.$target;
            BoundsTransform boundsTransform = this.$boundsTransform;
            Rect currentBounds = this.this$0.getCurrentBounds();
            currentBounds.getClass();
            FiniteAnimationSpec<Rect> createAnimationSpec = boundsTransform.createAnimationSpec(currentBounds, this.$target);
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, rect, createAnimationSpec, null, null, this, 12, null);
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
