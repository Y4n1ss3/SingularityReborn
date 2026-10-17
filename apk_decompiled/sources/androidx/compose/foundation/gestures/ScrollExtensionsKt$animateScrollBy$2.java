package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ gi0 $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f, AnimationSpec<Float> animationSpec, gi0 gi0Var, hm hmVar) {
        super(2, hmVar);
        this.$value = f;
        this.$animationSpec = animationSpec;
        this.$previousValue = gi0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, ScrollScope scrollScope, float f, float f2) {
        float f3 = gi0Var.d;
        gi0Var.d = scrollScope.scrollBy(f - f3) + f3;
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, hmVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            o oVar = new o(0, this.$previousValue, scrollScope);
            this.label = 1;
            Object animate$default = SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, oVar, this, 4, null);
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
