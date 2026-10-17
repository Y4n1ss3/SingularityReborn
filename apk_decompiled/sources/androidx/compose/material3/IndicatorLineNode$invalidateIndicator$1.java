package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", l = {1599}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IndicatorLineNode$invalidateIndicator$1 extends us0 implements my {
    int label;
    final /* synthetic */ IndicatorLineNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$1(IndicatorLineNode indicatorLineNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = indicatorLineNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new IndicatorLineNode$invalidateIndicator$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((IndicatorLineNode$invalidateIndicator$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        TextFieldColors colors;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.colorAnimatable;
            if (animatable != null) {
                colors = this.this$0.getColors();
                z = this.this$0.enabled;
                z2 = this.this$0.isError;
                z3 = this.this$0.focused;
                Color m4751boximpl = Color.m4751boximpl(colors.m2567indicatorColorXeAY9LY$material3(z, z2, z3));
                z4 = this.this$0.enabled;
                AnimationSpec fromToken = z4 ? MotionSchemeKt.fromToken((MotionScheme) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMotionScheme$material3()), MotionSchemeKeyTokens.FastEffects) : AnimationSpecKt.snap$default(0, 1, null);
                this.label = 1;
                obj = Animatable.animateTo$default(animatable, m4751boximpl, fromToken, null, null, this, 12, null);
                vn vnVar = vn.d;
                if (obj == vnVar) {
                    return vnVar;
                }
            }
            return w01.a;
        }
        if (i != 1) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        return w01.a;
    }
}
