package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {182}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$animatePanBy$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f19$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ ii0 $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(ii0 ii0Var, long j, AnimationSpec<Offset> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.$previous = ii0Var;
        this.f19$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(ii0 ii0Var, TransformScope transformScope, AnimationScope animationScope) {
        TransformScope.m570transformByd4ec7I$default(transformScope, 0.0f, Offset.m4520minusMKHz9U(((Offset) animationScope.getValue()).m4526unboximpl(), ii0Var.d), 0.0f, 5, null);
        ii0Var.d = ((Offset) animationScope.getValue()).m4526unboximpl();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.f19$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$animationSpec, hmVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m4505boximpl(this.$previous.d), null, 0L, 0L, false, 60, null);
            Offset m4505boximpl = Offset.m4505boximpl(this.f19$$v$c$androidxcomposeuigeometryOffset$offset$0);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            m mVar = new m(4, this.$previous, transformScope);
            this.label = 1;
            Object animateTo$default = SuspendAnimationKt.animateTo$default(animationState, m4505boximpl, animationSpec, false, mVar, this, 4, null);
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
