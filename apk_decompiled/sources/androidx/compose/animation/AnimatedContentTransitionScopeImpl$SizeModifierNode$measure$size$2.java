package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2 extends f30 implements ky {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m7774boximpl(m34invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m34invokeYEO4UFw(S s) {
        long m32lastContinuousSizeOrDefaultmzRDjE0;
        boolean b = q10.b(s, this.this$0.getScope().getInitialState());
        AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
        if (b) {
            m32lastContinuousSizeOrDefaultmzRDjE0 = sizeModifierNode.m32lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
            return m32lastContinuousSizeOrDefaultmzRDjE0;
        }
        State state = (State) sizeModifierNode.getScope().getTargetSizeMap$animation().d(s);
        return state != null ? ((IntSize) state.getValue()).m7786unboximpl() : IntSize.Companion.m7787getZeroYbymL2g();
    }
}
