package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1 extends f30 implements ky {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
        long m7786unboximpl;
        FiniteAnimationSpec<IntSize> mo109createAnimationSpecTemP2vQ;
        boolean b = q10.b(segment.getInitialState(), this.this$0.getScope().getInitialState());
        AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
        if (b) {
            m7786unboximpl = sizeModifierNode.m32lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
        } else {
            State state = (State) sizeModifierNode.getScope().getTargetSizeMap$animation().d(segment.getInitialState());
            m7786unboximpl = state != null ? ((IntSize) state.getValue()).m7786unboximpl() : IntSize.Companion.m7787getZeroYbymL2g();
        }
        State state2 = (State) this.this$0.getScope().getTargetSizeMap$animation().d(segment.getTargetState());
        long m7786unboximpl2 = state2 != null ? ((IntSize) state2.getValue()).m7786unboximpl() : IntSize.Companion.m7787getZeroYbymL2g();
        SizeTransform value = this.this$0.getSizeTransform().getValue();
        return (value == null || (mo109createAnimationSpecTemP2vQ = value.mo109createAnimationSpecTemP2vQ(m7786unboximpl, m7786unboximpl2)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : mo109createAnimationSpecTemP2vQ;
    }
}
