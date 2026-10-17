package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$panBy$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f20$$v$c$androidxcomposeuigeometryOffset$offset$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$panBy$2(long j, hm hmVar) {
        super(2, hmVar);
        this.f20$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$panBy$2 transformableStateKt$panBy$2 = new TransformableStateKt$panBy$2(this.f20$$v$c$androidxcomposeuigeometryOffset$offset$0, hmVar);
        transformableStateKt$panBy$2.L$0 = obj;
        return transformableStateKt$panBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$panBy$2) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        ((TransformScope) this.L$0).mo408transformByd4ec7I(1.0f, this.f20$$v$c$androidxcomposeuigeometryOffset$offset$0, 0.0f);
        return w01.a;
    }
}
