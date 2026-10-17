package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", l = {510}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Scrollable2DKt$semanticsScrollBy$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f13$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ ii0 $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DKt$semanticsScrollBy$2(long j, ii0 ii0Var, hm hmVar) {
        super(2, hmVar);
        this.f13$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$previousValue = ii0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(ii0 ii0Var, NestedScrollScope nestedScrollScope, Offset offset, Offset offset2) {
        ii0Var.d = Offset.m4521plusMKHz9U(ii0Var.d, nestedScrollScope.mo491scrollByOzD1aCk(Offset.m4520minusMKHz9U(offset.m4526unboximpl(), ii0Var.d), NestedScrollSource.Companion.m5969getUserInputWNlRxjI()));
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.f13$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$previousValue, hmVar);
        scrollable2DKt$semanticsScrollBy$2.L$0 = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            Offset.Companion companion = Offset.Companion;
            TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
            Offset m4505boximpl = Offset.m4505boximpl(companion.m4532getZeroF1C5BW0());
            Offset m4505boximpl2 = Offset.m4505boximpl(this.f13$$v$c$androidxcomposeuigeometryOffset$offset$0);
            o oVar = new o(2, this.$previousValue, nestedScrollScope);
            this.label = 1;
            Object animate$default = SuspendAnimationKt.animate$default(vectorConverter, m4505boximpl, m4505boximpl2, null, null, oVar, this, 24, null);
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
