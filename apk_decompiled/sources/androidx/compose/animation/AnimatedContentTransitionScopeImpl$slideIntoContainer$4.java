package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$slideIntoContainer$4 extends f30 implements ky {
    final /* synthetic */ ky $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$4(ky kyVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = kyVar;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    public final Integer invoke(int i) {
        long m26getCurrentSizeYbymL2g;
        long m25calculateOffsetemnUabE;
        ky kyVar = this.$initialOffset;
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        long j = i;
        long m7777constructorimpl = IntSize.m7777constructorimpl((j & 4294967295L) | (j << 32));
        m26getCurrentSizeYbymL2g = this.this$0.m26getCurrentSizeYbymL2g();
        m25calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m25calculateOffsetemnUabE(m7777constructorimpl, m26getCurrentSizeYbymL2g);
        return (Integer) kyVar.invoke(Integer.valueOf((-IntOffset.m7740getYimpl(m25calculateOffsetemnUabE)) - i));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
