package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IndicatorLineNode$invalidateIndicator$2 extends us0 implements my {
    int label;
    final /* synthetic */ IndicatorLineNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$2(IndicatorLineNode indicatorLineNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = indicatorLineNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new IndicatorLineNode$invalidateIndicator$2(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((IndicatorLineNode$invalidateIndicator$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        boolean z;
        float f;
        boolean z2;
        Object animateTo$default;
        vn vnVar;
        boolean z3;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.widthAnimatable;
            z = this.this$0.focused;
            if (z) {
                z3 = this.this$0.enabled;
                if (z3) {
                    f = this.this$0.focusedIndicatorWidth;
                    Dp m7609boximpl = Dp.m7609boximpl(f);
                    z2 = this.this$0.enabled;
                    AnimationSpec fromToken = !z2 ? MotionSchemeKt.fromToken((MotionScheme) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMotionScheme$material3()), MotionSchemeKeyTokens.FastSpatial) : AnimationSpecKt.snap$default(0, 1, null);
                    this.label = 1;
                    animateTo$default = Animatable.animateTo$default(animatable, m7609boximpl, fromToken, null, null, this, 12, null);
                    vnVar = vn.d;
                    if (animateTo$default == vnVar) {
                        return vnVar;
                    }
                }
            }
            f = this.this$0.unfocusedIndicatorWidth;
            Dp m7609boximpl2 = Dp.m7609boximpl(f);
            z2 = this.this$0.enabled;
            AnimationSpec fromToken2 = !z2 ? MotionSchemeKt.fromToken((MotionScheme) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMotionScheme$material3()), MotionSchemeKeyTokens.FastSpatial) : AnimationSpecKt.snap$default(0, 1, null);
            this.label = 1;
            animateTo$default = Animatable.animateTo$default(animatable, m7609boximpl2, fromToken2, null, null, this, 12, null);
            vnVar = vn.d;
            if (animateTo$default == vnVar) {
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
