package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThumbNode$measure$1 extends us0 implements my {
    final /* synthetic */ float $size;
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$1(ThumbNode thumbNode, float f, hm hmVar) {
        super(2, hmVar);
        this.this$0 = thumbNode;
        this.$size = f;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ThumbNode$measure$1(this.this$0, this.$size, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ThumbNode$measure$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        boolean z;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.sizeAnim;
            if (animatable != null) {
                Float f = new Float(this.$size);
                z = this.this$0.isPressed;
                FiniteAnimationSpec<Float> animationSpec = z ? SwitchKt.SnapSpec : this.this$0.getAnimationSpec();
                this.label = 1;
                obj = Animatable.animateTo$default(animatable, f, animationSpec, null, null, this, 12, null);
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
