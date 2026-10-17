package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
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
@bq(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", l = {715}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TabIndicatorOffsetNode$measure$2 extends us0 implements my {
    final /* synthetic */ float $currentTabWidth;
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $widthAnim;
    int label;
    final /* synthetic */ TabIndicatorOffsetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$2(Animatable<Dp, AnimationVector1D> animatable, float f, TabIndicatorOffsetNode tabIndicatorOffsetNode, hm hmVar) {
        super(2, hmVar);
        this.$widthAnim = animatable;
        this.$currentTabWidth = f;
        this.this$0 = tabIndicatorOffsetNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TabIndicatorOffsetNode$measure$2(this.$widthAnim, this.$currentTabWidth, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TabIndicatorOffsetNode$measure$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Dp, AnimationVector1D> animatable = this.$widthAnim;
            Dp m7609boximpl = Dp.m7609boximpl(this.$currentTabWidth);
            FiniteAnimationSpec<Dp> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, m7609boximpl, animationSpec, null, null, this, 12, null);
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
