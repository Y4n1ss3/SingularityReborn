package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.SharedElement$momentumAnimationOffset$1$2$1", f = "SharedElement.kt", l = {102}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedElement$momentumAnimationOffset$1$2$1 extends us0 implements my {
    final /* synthetic */ SpringSpec<Offset> $spring;
    int label;
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$momentumAnimationOffset$1$2$1(SharedElement sharedElement, SpringSpec<Offset> springSpec, hm hmVar) {
        super(2, hmVar);
        this.this$0 = sharedElement;
        this.$spring = springSpec;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SharedElement$momentumAnimationOffset$1$2$1(this.this$0, this.$spring, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SharedElement$momentumAnimationOffset$1$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.momentumAnimation;
            Offset m4505boximpl = Offset.m4505boximpl(Offset.Companion.m4532getZeroF1C5BW0());
            SpringSpec<Offset> springSpec = this.$spring;
            this.label = 1;
            Object animateTo$default = Animatable.animateTo$default(animatable, m4505boximpl, springSpec, null, null, this, 12, null);
            vn vnVar = vn.d;
            if (animateTo$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
