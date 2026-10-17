package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$rotateBy$2 extends us0 implements my {
    final /* synthetic */ float $degrees;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$rotateBy$2(float f, hm hmVar) {
        super(2, hmVar);
        this.$degrees = f;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableStateKt$rotateBy$2 transformableStateKt$rotateBy$2 = new TransformableStateKt$rotateBy$2(this.$degrees, hmVar);
        transformableStateKt$rotateBy$2.L$0 = obj;
        return transformableStateKt$rotateBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$rotateBy$2) create(transformScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        ((TransformScope) this.L$0).mo408transformByd4ec7I(1.0f, Offset.Companion.m4532getZeroF1C5BW0(), this.$degrees);
        return w01.a;
    }
}
