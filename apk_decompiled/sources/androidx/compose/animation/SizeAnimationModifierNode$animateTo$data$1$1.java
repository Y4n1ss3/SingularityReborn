package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
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
@bq(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-unit-IntSize$-targetSize$0, reason: not valid java name */
    final /* synthetic */ long f1$$v$c$androidxcomposeuiunitIntSize$targetSize$0;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j, SizeAnimationModifierNode sizeAnimationModifierNode, hm hmVar) {
        super(2, hmVar);
        this.$this_apply = animData;
        this.f1$$v$c$androidxcomposeuiunitIntSize$targetSize$0 = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.f1$$v$c$androidxcomposeuiunitIntSize$targetSize$0, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SizeAnimationModifierNode$animateTo$data$1$1 sizeAnimationModifierNode$animateTo$data$1$1;
        my listener;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize m7774boximpl = IntSize.m7774boximpl(this.f1$$v$c$androidxcomposeuiunitIntSize$targetSize$0);
            AnimationSpec<IntSize> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = Animatable.animateTo$default(anim, m7774boximpl, animationSpec, null, null, sizeAnimationModifierNode$animateTo$data$1$1, 12, null);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = sizeAnimationModifierNode$animateTo$data$1$1.this$0.getListener()) != null) {
            listener.invoke(IntSize.m7774boximpl(sizeAnimationModifierNode$animateTo$data$1$1.$this_apply.m107getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return w01.a;
    }
}
