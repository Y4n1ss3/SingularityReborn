package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", l = {442}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SegmentedButtonContentMeasurePolicy$measure$1 extends us0 implements my {
    final /* synthetic */ Animatable<Integer, AnimationVector1D> $anim;
    final /* synthetic */ int $offsetX;
    int label;
    final /* synthetic */ SegmentedButtonContentMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonContentMeasurePolicy$measure$1(Animatable<Integer, AnimationVector1D> animatable, int i, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, hm hmVar) {
        super(2, hmVar);
        this.$anim = animatable;
        this.$offsetX = i;
        this.this$0 = segmentedButtonContentMeasurePolicy;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SegmentedButtonContentMeasurePolicy$measure$1(this.$anim, this.$offsetX, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SegmentedButtonContentMeasurePolicy$measure$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Integer, AnimationVector1D> animatable = this.$anim;
            Integer num = new Integer(this.$offsetX);
            AnimationSpec<Integer> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, num, animationSpec, null, null, this, 12, null);
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
