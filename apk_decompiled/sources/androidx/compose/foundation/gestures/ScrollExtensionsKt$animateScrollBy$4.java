package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
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
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", f = "ScrollExtensions.kt", l = {63}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$4 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-value$0, reason: not valid java name */
    final /* synthetic */ long f11$$v$c$androidxcomposeuigeometryOffset$value$0;
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ ii0 $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$4(long j, AnimationSpec<Offset> animationSpec, ii0 ii0Var, hm hmVar) {
        super(2, hmVar);
        this.f11$$v$c$androidxcomposeuigeometryOffset$value$0 = j;
        this.$animationSpec = animationSpec;
        this.$previousValue = ii0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(ii0 ii0Var, Scroll2DScope scroll2DScope, Offset offset, Offset offset2) {
        ii0Var.d = Offset.m4521plusMKHz9U(ii0Var.d, scroll2DScope.mo407scrollByMKHz9U(Offset.m4520minusMKHz9U(offset.m4526unboximpl(), ii0Var.d)));
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(this.f11$$v$c$androidxcomposeuigeometryOffset$value$0, this.$animationSpec, this.$previousValue, hmVar);
        scrollExtensionsKt$animateScrollBy$4.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$4;
    }

    @Override // defpackage.my
    public final Object invoke(Scroll2DScope scroll2DScope, hm hmVar) {
        return ((ScrollExtensionsKt$animateScrollBy$4) create(scroll2DScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            Scroll2DScope scroll2DScope = (Scroll2DScope) this.L$0;
            Offset.Companion companion = Offset.Companion;
            TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
            Offset m4505boximpl = Offset.m4505boximpl(companion.m4532getZeroF1C5BW0());
            Offset m4505boximpl2 = Offset.m4505boximpl(this.f11$$v$c$androidxcomposeuigeometryOffset$value$0);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            o oVar = new o(i2, this.$previousValue, scroll2DScope);
            this.label = 1;
            Object animate$default = SuspendAnimationKt.animate$default(vectorConverter, m4505boximpl, m4505boximpl2, null, animationSpec, oVar, this, 8, null);
            vn vnVar = vn.d;
            if (animate$default == vnVar) {
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
