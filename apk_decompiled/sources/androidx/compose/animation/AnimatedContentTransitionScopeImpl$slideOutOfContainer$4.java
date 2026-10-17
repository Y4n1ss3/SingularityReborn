package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$4 extends f30 implements ky {
    final /* synthetic */ ky $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, ky kyVar) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = kyVar;
    }

    public final Integer invoke(int i) {
        long m25calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation().d(this.this$0.getTransition$animation().getTargetState());
        long m7786unboximpl = state != null ? ((IntSize) state.getValue()).m7786unboximpl() : IntSize.Companion.m7787getZeroYbymL2g();
        ky kyVar = this.$targetOffset;
        long j = i;
        m25calculateOffsetemnUabE = this.this$0.m25calculateOffsetemnUabE(IntSize.m7777constructorimpl((j & 4294967295L) | (j << 32)), m7786unboximpl);
        return (Integer) kyVar.invoke(Integer.valueOf((-IntOffset.m7740getYimpl(m25calculateOffsetemnUabE)) + ((int) (m7786unboximpl & 4294967295L))));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
