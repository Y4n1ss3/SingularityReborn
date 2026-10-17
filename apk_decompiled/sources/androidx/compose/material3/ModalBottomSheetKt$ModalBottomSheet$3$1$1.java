package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
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
@bq(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1", f = "ModalBottomSheet.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$3$1$1 extends us0 implements my {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$3$1$1(Animatable<Float, AnimationVector1D> animatable, hm hmVar) {
        super(2, hmVar);
        this.$predictiveBackProgress = animatable;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.$predictiveBackProgress, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
            Float f = new Float(0.0f);
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, f, null, null, null, this, 14, null);
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
