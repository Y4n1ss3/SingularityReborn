package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends us0 implements my {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(LazyLayoutItemAnimation lazyLayoutItemAnimation, long j, Animatable animatable) {
        iy iyVar;
        lazyLayoutItemAnimation.m913setPlacementDeltagyyYBs(IntOffset.m7742minusqkQi6aY(((IntOffset) animatable.getValue()).m7748unboximpl(), j));
        iyVar = lazyLayoutItemAnimation.onLayerPropertyChanged;
        iyVar.invoke();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14, r6, r7, null, r9, r10, 4, null) != r4) goto L30;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        FiniteAnimationSpec finiteAnimationSpec;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        LazyLayoutItemAnimation$animatePlacementDelta$1 lazyLayoutItemAnimation$animatePlacementDelta$1;
        iy iyVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.placementDeltaAnimation;
            boolean isRunning = animatable.isRunning();
            finiteAnimationSpec = this.$spec;
            if (isRunning) {
                finiteAnimationSpec = finiteAnimationSpec instanceof SpringSpec ? (SpringSpec) finiteAnimationSpec : LazyLayoutItemAnimationKt.InterruptionSpec;
            }
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                IntOffset m7730boximpl = IntOffset.m7730boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable3.snapTo(m7730boximpl, this) == vnVar) {
                    return vnVar;
                }
            }
            FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
            animatable4 = this.this$0.placementDeltaAnimation;
            final long m7742minusqkQi6aY = IntOffset.m7742minusqkQi6aY(((IntOffset) animatable4.getValue()).m7748unboximpl(), this.$totalDelta);
            animatable5 = this.this$0.placementDeltaAnimation;
            IntOffset m7730boximpl2 = IntOffset.m7730boximpl(m7742minusqkQi6aY);
            final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
            ky kyVar = new ky() { // from class: androidx.compose.foundation.lazy.layout.b
                @Override // defpackage.ky
                public final Object invoke(Object obj2) {
                    w01 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend$lambda$0(LazyLayoutItemAnimation.this, m7742minusqkQi6aY, (Animatable) obj2);
                    return invokeSuspend$lambda$0;
                }
            };
            this.L$0 = null;
            this.label = 2;
            lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
                lazyLayoutItemAnimation$animatePlacementDelta$1.this$0.setPlacementAnimationInProgress(false);
                lazyLayoutItemAnimation$animatePlacementDelta$1.this$0.isRunningMovingAwayAnimation = false;
                return w01.a;
            }
            finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
            p10.Q(obj);
        }
        iyVar = this.this$0.onLayerPropertyChanged;
        iyVar.invoke();
        FiniteAnimationSpec finiteAnimationSpec22 = finiteAnimationSpec;
        animatable4 = this.this$0.placementDeltaAnimation;
        final long m7742minusqkQi6aY2 = IntOffset.m7742minusqkQi6aY(((IntOffset) animatable4.getValue()).m7748unboximpl(), this.$totalDelta);
        animatable5 = this.this$0.placementDeltaAnimation;
        IntOffset m7730boximpl22 = IntOffset.m7730boximpl(m7742minusqkQi6aY2);
        final LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.this$0;
        ky kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.layout.b
            @Override // defpackage.ky
            public final Object invoke(Object obj2) {
                w01 invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend$lambda$0(LazyLayoutItemAnimation.this, m7742minusqkQi6aY2, (Animatable) obj2);
                return invokeSuspend$lambda$0;
            }
        };
        this.L$0 = null;
        this.label = 2;
        lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
    }
}
