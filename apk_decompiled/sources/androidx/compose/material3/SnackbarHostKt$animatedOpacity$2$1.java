package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {409}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnackbarHostKt$animatedOpacity$2$1 extends us0 implements my {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ iy $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2$1(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, iy iyVar, hm hmVar) {
        super(2, hmVar);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = animationSpec;
        this.$onAnimationFinish = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : 0.0f);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            snackbarHostKt$animatedOpacity$2$1 = this;
            Object animateTo$default = Animatable.animateTo$default(animatable, f, animationSpec, null, null, snackbarHostKt$animatedOpacity$2$1, 12, null);
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
            snackbarHostKt$animatedOpacity$2$1 = this;
        }
        snackbarHostKt$animatedOpacity$2$1.$onAnimationFinish.invoke();
        return w01.a;
    }
}
